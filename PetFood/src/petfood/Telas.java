package petfood;

import java.util.ArrayList;
import static petfood.PetFood.ler;
import static petfood.PetFood.tela;

/**
 *
 * @author Douglas
 */
public class Telas {
    
    Produto prod = new Produto();
    Venda venda = new Venda();
    ArrayList<Produto> listProd = new ArrayList();
    ArrayList<Produto> listComp = new ArrayList();
    ArrayList<Venda> listVenda = new ArrayList();
    
    int l,x;
    String v;
    double y=0;
    boolean r=true;
    
    //Limpar lista de compras
    public void clearList(){
        
        listComp.clear();
        for (Produto i: listProd){
            i.setVenda(0);
        }
    }
    
    public void gerente(String login){      //Tela principal gerente
                       
        //repetição tela do gerente
        do{     
            System.out.println("""
                               Escolha uma opcao:
                               1- Cadastrar produto
                               2- Realizar uma venda
                               3- Alterar estoque de um produto
                               4- Verificar estoque
                               5- Alterar preco do produto
                               6- excluir produto
                               7- Acessar historico de venda
                               0- Voltar para tela inicial""");
            x = ler.nextInt();
            
            switch (x){
                
                //cadastar novo produto
                case 1: {
                      System.out.println("Digite o codigo do produto");
                      prod.setCod(ler.nextInt());
                      System.out.println("Digite o nome do produto");
                      prod.setNome(ler.next());
                      System.out.println("Digite a descricao do produto");
                      prod.setDesc(ler.next());
                      System.out.println("Digite o preco de custo do produto");
                      prod.setPreco_custo(ler.nextDouble());
                      System.out.println("Digite o preco de venda do produto");
                      prod.setPreco(ler.nextDouble());
                      prod.setQtd(0);
                      
                      listProd.add(prod);
                      System.out.println("Produto cadastrado com sucesso");
                      break;
                }
                
                //ir para tela de vendas
                case 2: {
                    tela.gerente(login);            
                    break;
                }
                
                //alterar quantidade no estoque
                case 3: {
                    System.out.println("Digite o codigo do produto que deseja alterar");
                    l = ler.nextInt();
                    
                        for (Produto i : listProd){
                            
                            if (l == i.getCod()){
                                System.out.println("Digite a nova quantide em estoque");
                                i.setQtd(ler.nextInt());
                                System.out.println("Estoque alterado");
                                break;
                            }                           
                        }
                        
                        System.out.println("Codigo nao encontrado");
                        break;
                }
                
                //verificar informaçao dos produtos em estoque
                case 4: {
                    if (listProd.isEmpty()){
                            System.out.println("Nenhum produto cadastrado");
                            break;
                        }
                    
                        for (Produto i : listProd){

                            System.out.println("Codigo: " +i.getCod()+"\nProduto: " +i.getNome()+"\nDescricao: "+i.getDesc()+"\nQuantidade: "
                                    +i.getQtd()+"\nPreco de custo: "+i.getPreco_custo()+"\nPreco de venda: "+i.getPreco()+"\n");                           
                    }
                    break;
                }
                
                //alterar preço de venda
                case 5: {
                    System.out.println("Digite o codigo do produto que deseja alterar");
                    l = ler.nextInt();
                    
                        for (Produto i : listProd){
                            
                            if (l == i.getCod()){
                                System.out.println("Digite o novo valor de venda");
                                i.setPreco(ler.nextDouble());
                                System.out.println("Preco alterado");
                                break;
                            }                           
                        }
                        
                        System.out.println("Codigo nao encontrado");
                        break;
                }
                
                //excluir o produto
                case 6: {
                    System.out.println("Digite o codigo do produto que deseja excluir");
                    l = ler.nextInt();
                    
                        for (Produto i : listProd){
                            
                            if (l == i.getCod()){
                                System.out.println("Deseja realmente excluir "+ i +"? (s\n)");
                                v = ler.next();
                               
                                if (v.equals("s")){
                                listProd.remove(i);
                                System.out.println("Produto removido");
                                break;
                                }
                                
                                else if (v.equals("n")){
                                    System.out.println("Exclusao cancelada");
                                    break;
                                }
                                
                                else{
                                    System.out.println("Opcao invalida");
                                    break;
                                }
                            }
                            
                            else {
                                System.out.println("Codigo nao encontrado");
                                break;
                            }
                        }
                }
                
                //tela de historico
                case 7: {
                    tela.hist_ven();
                    break;
                }
                
                //voltar para o login
                case 0: {
                    System.out.println("Logout efetuado");
                    return;
                }
                
                default:
                    System.out.println("Opcao invalida");
            }
            
        }while(r);              
}
        
    public void venda(String login){        //Tela principal funcionario
        
    do{                   
        System.out.println("""
                            Escolha uma opcao:
                            1- Consultar produtos
                            2- Adicionar produto ao carrinho
                            3- Verificar carrinho
                            4- Limpar lista de compras 
                            5- Finalizar compra
                            0- Sair do programa""");
            int s = ler.nextInt();
            
        switch (s){
            
            //listar produtos
            case 1: {   
                for (Produto i : listProd){
                        
                        if (listProd.isEmpty()){
                            System.out.println("Nenhum produto cadastrado");
                            break;
                        }
                        
                        else{
                        System.out.println("Codigo: " +i.getCod()+"\nProduto: " +i.getNome()+"\nQuantidade: "
                                +i.getQtd()+"\nPreco de venda: "+i.getPreco()+"\n");
                        }
                }
                break;
            }
            
            //Adicionar ao carrinho
            case 2: {
                System.out.println("Digite o codigo do produto para acicionar ao carrinho");
                l = ler.nextInt();
                    
                    for (Produto i : listProd){
                        
                        if (l == i.getCod()){
                            System.out.println("Digite a quantidade que deseja vender");
                            l = ler.nextInt();
                                
                                if (l > i.getQtd()){
                                    System.out.println("Quantidade no estoque insuficiente");
                                    break;
                                }
                                
                                else {
                                    i.setVenda(l);
                                    listComp.add(i);                                   
                                    break;
                                }                                                                                
                        }
                        
                        else 
                            System.out.println("Codigo nao encontrado");                        
                    }
                    break;
            }
            
            //Verificar produtos no carrinho
            case 3: {
                if (listComp.isEmpty()){
                        System.out.println("Nenhum produto no carrinho");
                        break;
                    }
                                        
                    for (Produto i : listComp){
                        
                        if (i.getVenda()>0){
                            
                            System.out.println("Codigo: " +i.getCod()+"\nProduto: " +i.getNome()+"\nDescricao: "+i.getDesc()+"\nQuantidade no carrinho: "
                                    +i.getVenda()+"\nValor total: "+i.getPreco() * i.getVenda()+"\n");
                            y+= i.getPreco() * i.getVenda();
                        }
                    }
                
                System.out.println("\nValor total: "+y);
                break;   
            }
            
            //Limpar a lista de compras
            case 4: {
                tela.clearList();
                break;
            }
            
            //Finalizar compra
            case 5: {
                System.out.println("Tem certeza que deseja finalizar a compra? (s/n)");
                v = ler.next();
                
                if (v.equals("n")){
                            System.out.println("Compra não finalizada");
                            break;
                }
                
                else if (v.equals("s")){
                    System.out.println("Insira a data da compra");
                    venda.setData(ler.next());

                    for (Produto i : listComp){                      
                        
                        if (i.getQtd()>0){
                            
                            y+= i.getPreco() * i.getVenda();
                            for (Produto j : listProd){
                                if (i.equals(j)){
                                    int n = j.getQtd();
                                    n-=i.getVenda();
                                    j.setQtd(n);    //reduzindo a quantidade de vendas no estoque total
                                }
                            }
                            
                            venda.setValor(y);
                            venda.setVendedor(login);
                            listVenda.add(venda);
                        }                         
                    }
                    
                    tela.clearList();
                }
                
                else {
                    System.out.println("Codigo nao encontrado");
                    break;
                }
                break;
            }
            
            case 0: {
                tela.clearList();
                System.out.println("Logout efetuado");
                return;
            }
            
            default: 
                System.out.println("Opcao invalida");
        }
    }while(r);
}
    
    public void hist_ven(){
        
        for (Venda i: listVenda){
            System.out.println("Vendedor: "+i.getVendedor()+"\nData da venda: "+i.getData()+"\nValor da venda: "+i.getValor());
        }
    }
    
}
