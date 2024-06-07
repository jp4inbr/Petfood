package petfood;

/**
 *
 * @author Douglas
 */

public class Venda {
    
    private String data, vendedor;
    private double valor;
    
    //Construtora para criar relatorios de venda
    public Venda (String d, String u, double v){
        this.data = d;
        this.valor = v;
        this.vendedor = u;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
