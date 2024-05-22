/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petfood;

/**
 *
 * @author 32416402
 */
public class Funcionario {
    
    private String login, senha, s, l;
    private boolean gerente = false;

       
    public void Funcionario(String l, String s, boolean x){
        this.login = l;
        this.senha = s;
        this.gerente = x;
    }
}