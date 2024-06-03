package petfood;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Douglas
 */

public class PetFood {
    
    public static Scanner ler = new Scanner(System.in);
    public static Telas tela = new Telas ();
    

    public static void main(String[] args) {
        
        ArrayList<Funcionario> listFunc = new ArrayList();
        Funcionario func = new Funcionario();
        
        String s,l,g;
        boolean r = true;
                              
        //repetição tela inicial
        do{     
            System.out.println("""
                               Escolha uma opcao:
                               1- Fazer login
                               2- Cadastrar
                               0- Sair do programa""");
            int x = ler.nextInt();
        
            switch (x) {
                case 1:
                {                                                                              //Efetuando login
                    System.out.println("Digite seu login");
                    l = ler.next();
                    System.out.println("Digite sua senha");
                    s = ler.next();
                    
                    for (Funcionario i : listFunc){                                             //verificando lista de funcionarios para validar acesso
                        
                        System.out.println(i);
                        if (l.equals(i.getLogin()) && s.equals(i.getSenha())){
                                                        
                            if (i.isGerente()){
                                tela.gerente(l);
                                break;
                            }    
                            
                            else{
                                tela.venda(l);
                                break;
                            }    
                        }                                                                                                                                                  
                    }
                    
                System.out.println("Usuario ou senha invalidos");
                break;
                
                }

                case 2:                                                                         //Efetuando cadastro
                { 
                      System.out.println("Digite o novo login para cadastro");
                      func.setLogin(ler.next());
                      System.out.println("Digite a senha do novo login");
                      func.setSenha(ler.next());
                      System.out.println("Funcionario é um gerente? s/n");
                      g = ler.next();
                                           
                      if ("s".equals(g)){
                          func.setGerente(true);
                          System.out.println("Gerente cadastrado com sucesso");
                          listFunc.add(func);
                          break;
                      }

                      else if ("n".equals(g)){
                          func.setGerente(false);
                          System.out.println("Funcionario cadastrado com sucesso");
                          listFunc.add(func);
                          break;
                      }

                      else{
                          System.out.println("Opcao invalida");
                          break;
                      }
                }
                  
                case 0:                                                                         //Encerrar o programa
                    r = false;
                    break;
                                   
                default:
                    System.out.println("Opcao invalida");

            }
        }while(r);                                                                              
    }
        
}
