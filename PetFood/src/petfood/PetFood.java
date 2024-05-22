package petfood;

import java.util.Scanner;


public class PetFood {


    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escolha uma opção\n1- Fazer login\n2- Cadastrar");
        int x = ler.nextInt();
        int cont =0;
        
        switch (x) {
            case 1:
              {
                System.out.println("Digite seu login");
                String login = ler.next();
                System.out.println("Digite sua senha");
                String senha = ler.next();
                break;
              }
            
            case 2:
              { 
                  System.out.println("Digite o novo login para cadastro");
                  String login = ler.next();
                  System.out.println("Digite a senha do novo login");
                  String senha = ler.next();
                  System.out.println("Funcionário é um gerente? s/n");
                  String gerente = ler.next();
                  
                  if (gerente == "s"){
                      Funcionario func_1 = new Funcionario(login,senha,true);

                  }
                  
                  else{
                      Funcionario  = new Funcionario(login,senha,false);

                  }                       
                
                      break;
              }
              
            default:
                System.out.println("Opção inválida");
            
        }
        
    }
    
}
