package petfood;

/**
 *
 * @author Douglas
 */
public class Funcionario {
    
    private String login, senha;
    private boolean gerente;
    
    //Construtora para cadastro de novo usuario
    public Funcionario (String l, String s, boolean g){
        this.login = l;
        this.senha = s;
        this.gerente = g;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
        
}
