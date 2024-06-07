package petfood;

/**
 *
 * @author Douglas
 */

public class Produto {
        
    private String nome, desc;
    private int cod, qtd, venda;
    private double preco, preco_custo;
    
    //Cronstutora para cadastrar novo produto
    public Produto (String n, String d, int c, double p, double pc){        
        this.nome = n;
        this.desc = d;
        this.cod = c;
        this.preco = p;
        this.preco_custo = pc;
        this.qtd = 0;
        this.venda = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }
    
    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

        public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
}
