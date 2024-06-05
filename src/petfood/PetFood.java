package petfood;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Douglas
 */


public class PetFood {          
    
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList<Funcionario> listFunc = new ArrayList();
        listFunc.clear();
        Telas tela = new Telas ();        

        String s,l,g;
        boolean r = true;
                                      
        do{                                                                                        //Repetição tela inicial
            System.out.println("""
                               Escolha uma opcao:
                               1- Fazer login
                               2- Cadastrar
                               0- Sair do programa""");
            int x = ler.nextInt();
        
            switch (x) {
                case 1: {                                                                           //Efetuando login
                    
                    if (listFunc.isEmpty()){
                        System.out.println("Nenhum usuario cadastrado");
                        break;
                    }
                    
                    System.out.println("Digite seu login");
                    l = ler.next();
                    System.out.println("Digite sua senha");
                    s = ler.next();

                        for (Funcionario i : listFunc){                                             //verificando lista de funcionarios para validar acesso
                        
                        if (l.equals(i.getLogin()) && s.equals(i.getSenha())){
                                                        
                            if (i.isGerente()){
                                r = tela.gerente(l, r);
                                break;
                            }    
                            
                            else{
                                r = tela.venda(l, r);
                                break;
                            }    
                        }                                                                                                                                                  
                    }
                    
                System.out.println("Usuario ou senha invalidos");
                break;
                
                }

                case 2: {                                                                             //Efetuando cadastro                 
                      System.out.println("Digite o novo login para cadastro");
                      l = ler.next();
                      System.out.println("Digite a senha do novo login");
                      s = ler.next();
                      System.out.println("Funcionario e um gerente? s/n");
                      g = ler.next();
                                           
                        if (tela.confirmar(g))                                                   //Validação do texto digitado                                                                  
                            break;

                        else if ("s".equals(g)){                                               //Cadastro de Gerente
                            Funcionario func = new Funcionario(l,s,true);
                            listFunc.add(func);
                            System.out.println("Gerente cadastrado com sucesso");
                            break;
                        }

                        else {                                                                       //Cadastro de Funcionário
                            Funcionario func = new Funcionario(l,s,false);
                            listFunc.add(func);
                            System.out.println("Funcionario cadastrado com sucesso");
                        }                          
                          
                    break;                      
                }
                  
                case 0: {                                                                            //Encerrar o programa
                    
                    r = false;
                    break;
                }
                                   
                default:
                    System.out.println("Opcao invalida");

            }
        }while(r);                                                                              
    }
        
}
