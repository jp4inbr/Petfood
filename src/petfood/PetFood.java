package petfood;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Douglas
 */


public class PetFood {          
    
    public static Scanner ler = new Scanner(System.in);
    public static ArrayList<Funcionario> listFunc = new ArrayList();

    public static void main(String[] args) {
        
        Telas tela = new Telas ();
        
        String s,l;
        boolean r = true;
        int y=0;
        Funcionario func = new Funcionario("adm", "456", true, 0);                              //Usuario gerente inicial
        listFunc.add(func);
                                      
        do{                                                                                             //Repetição tela inicial
            System.out.println("""
                               Escolha uma opcao:
                               1- Fazer login
                               0- Sair do programa""");
            int x = ler.nextInt();
        
            switch (x) {
                
/*                case 1: {                                                                                 //Efetuando cadastro                 
                    
                    for (Funcionario i: listFunc){
                        
                        if (i.isGerente()){
                            
                            System.out.println("Digite o novo login para cadastro");
                            l = ler.next();
                            System.out.println("Digite a senha do novo login");
                            s = ler.next();
                            System.out.println("Funcionario e um gerente? s/n");
                            g = ler.next();

                              if (tela.confirmar(g))                                                    //Validação do texto digitado                                                                  
                                  break;

                              else if ("s".equals(g)){                                             //Cadastro de Gerente
                                  Funcionario func1 = new Funcionario (l, s, true, codFunc);
                                  listFunc.add(func1);
                                  codFunc++;
                                  System.out.println("Gerente cadastrado com sucesso");
                                  break;
                              }

                              else {                                                                       //Cadastro de Funcionário
                                  Funcionario func1 = new Funcionario(l,s,false,codFunc);
                                  listFunc.add(func1);
                                  codFunc++;
                                  System.out.println("Funcionario cadastrado com sucesso");
                                  break;
                              }
                        }                                                
                    }

                          
                    System.out.println("");      
                    break;                      
                }*/
                
                case 1: {                                                                                  //Efetuando login
                                        
                        System.out.println("Digite seu login");
                        l = ler.next();
                        System.out.println("Digite sua senha");
                        s = ler.next();

                        for (Funcionario i : listFunc){                                                 //verificando lista de funcionarios para validar acesso

                            if (l.equals(i.getLogin()) && s.equals(i.getSenha())){

                                if (i.isGerente()){
                                    y = tela.gerente(l, r);
                                    break;
                                }    

                                else{
                                    y = tela.venda(l, r);
                                    break;
                                }                                                                    
                            }
                        }
                        
                            if (y==1)
                                break;

                            else{                       
                            System.out.println("Usuario ou senha invalidos");
                            break;                                                          
                        }
                }                
                
                case 0: {                                                                                    //Encerrar o programa
                    
                    r = false;
                    break;
                }
                                   
                default:
                    System.out.println("Opcao invalida");

            }
        }while(r);                                                                              
    }
        
}
