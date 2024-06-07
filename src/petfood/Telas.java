package petfood;

import java.util.ArrayList;
import static petfood.PetFood.ler;
import static petfood.PetFood.listFunc;

/**
 *
 * @author Douglas
 */

public class Telas {
    
    ArrayList<Produto> listProd = new ArrayList();    
    ArrayList<Venda> listVenda = new ArrayList();
  
    int codFunc =1;                                                                             //Contador do codigo dos funcionários
    int codProd =1;                                                                             //Contador do codigo dos produtos
    double y=0;                                                                                 //Contador do valor total da compra
    int c,x;
    String n, d, l, s, g;
    double p, pc;
    
    public int gerente(String login, boolean r){                                                          //Tela principal gerente

        System.out.println("Bem vindo: "+login);
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
                               8- Cadastrar novo funcionario
                               0- Voltar para tela inicial""");
            x = ler.nextInt();
            
            switch (x){
                                
                case 1: {                                                                             //Cadastar novo produto
                    
                      System.out.println("Digite o nome do produto");
                      n = ler.next();
                      System.out.println("Digite a descricao do produto");
                      d = ler.next();
                      System.out.println("Digite o preco de custo do produto");
                      pc = ler.nextDouble();
                      System.out.println("Digite o preco de venda do produto");
                      p = ler.nextDouble();
                      
                      Produto prod = new Produto(n, d, codProd, p, pc);
                      listProd.add(prod);
                      System.out.println("Produto cadastrado com sucesso");
                      codProd++;
                      break;
                }
                                
                case 2: {                                                                              //Ir para tela de vendas

                    venda(login, r);
                    break;
                }               
                
                case 3: {                                                                            //Alterar quantidade no estoque
                    
                    if (verListProd())                                                   
                        break;                                                                 
                        
                        else {
                            System.out.println("Digite o codigo do produto que deseja alterar");
                            c = ler.nextInt();
                                if (buscarProd(c)){                               
                                    for (Produto i: listProd){
                                        
                                        if (c == i.getCod()){
                                            System.out.println("Digite a nova quantidade em estoque");
                                            i.setQtd(ler.nextInt());
                                            System.out.println("Estoque alterado");
                                            break;           
                                        }
                                    }                                  
                                }                                                                  
                        }                                                                        
                    
                    break;
                }
                                
                case 4: {                                                                                //Listar produtos em estoque
                    
                    if (verListProd())
                        break;                        
                    
                    else {
                        for (Produto i : listProd){

                            System.out.println("Codigo: " +i.getCod()+"\nProduto: " +i.getNome()+"\nDescricao: "+i.getDesc()+"\nQuantidade: "
                                    +i.getQtd()+"\nPreco de custo: "+i.getPreco_custo()+"\nPreco de venda: "+i.getPreco()+"\n");                           
                        }
                    }                                           
                
                    break;
                }
                                        
                case 5: {                                                                                 //Alterar preço de venda
                    
                    if (verListProd())
                        break;                  
                    
                    else {                        
                        System.out.println("Digite o codigo do produto que deseja alterar");
                        c = ler.nextInt();
                            
                            if (buscarProd(c)){
                                
                               for (Produto i : listProd){  
                            
                                    if (c == i.getCod()){
                                    System.out.println("Digite o novo valor de venda");
                                    i.setPreco(ler.nextDouble());
                                    System.out.println("Preco alterado");
                                    break;
                                    }              
                                }  
                            }
                    }
                        
                    break;
                }
                                
                case 6: {                                                                                 //Excluir o produto
                        
                    if (verListProd())
                        break;
                    
                    else{
                        System.out.println("Digite o codigo do produto que deseja excluir");
                        c = ler.nextInt();
                            
                            if (buscarProd(c)){                               
                                for (Produto i : listProd){

                                    if (c == i.getCod()){
                                        
                                        System.out.println("Deseja realmente excluir "+ i.getNome() +"? (s/n)");
                                        n = ler.next();
                                        
                                            if (confirmar(n))                                               
                                                break;

                                            else if ("s".equals(n)){
                                            listProd.remove(i);
                                            System.out.println("Produto removido");
                                            break;
                                            }

                                            else {
                                                System.out.println("Exclusao cancelada");
                                                break;
                                            }
                                    }
                                }   
                            }
                    }
                    
                    break;
                }
                                
                case 7: {                                                                                  //Exibir historico de vendas
                    
                    hist_ven();
                    break;
                }
                
                case 8: {                                                                                     //Efetuando cadastro                                                                                         
                    
                    System.out.println("Digite o novo login para cadastro");
                    l = ler.next();
                    System.out.println("Digite a senha do novo login");
                    s = ler.next();
                    System.out.println("Funcionario e um gerente? s/n");
                    g = ler.next();

                      if (confirmar(g))                                                                      //Validação do texto digitado                                                                  
                          break;

                      else if ("s".equals(g)){                                                         //Cadastro de Gerente
                          Funcionario func = new Funcionario (l, s, true, codFunc);
                          listFunc.add(func);
                          codFunc++;
                          System.out.println("Gerente cadastrado com sucesso");
                          break;
                      }

                      else {                                                                             //Cadastro de Funcionário
                          Funcionario func = new Funcionario(l,s,false,codFunc);
                          listFunc.add(func);
                          codFunc++;
                          System.out.println("Funcionario cadastrado com sucesso");
                          break;
                      }    
                }
                                
                case 0: {                                                                                 //Voltar para o login
                    
                    System.out.println("Logout efetuado");
                    r=false;
                    break;
                }
                
                default:
                    System.out.println("Opcao invalida");
            }
            
        }while(r);
        
        return 1;
}
        
    public int venda(String login, boolean r){                                                            //Tela principal funcionario
        
    System.out.println("Bem vindo: "+login);    
    do{                   
        System.out.println("""
                            Escolha uma opcao:
                            1- Consultar produtos
                            2- Adicionar produto ao carrinho
                            3- Verificar carrinho
                            4- Limpar lista de compras 
                            5- Finalizar compra
                            0- Sair do programa""");
            x = ler.nextInt();
            
        switch (x){
                       
            case 1: {                                                                           //Listar produtos
                    
                if (verListProd())
                break; 
                    
                else{
                    for (Produto i : listProd){
   
                            System.out.println("Codigo: " +i.getCod()+"\nProduto: " +i.getNome()+"\nQuantidade: "
                                +i.getQtd()+"\nPreco de venda: "+i.getPreco()+"\n");
                        }
                    }
                
                break;
            }
                       
            case 2: {                                                                          //Adicionar ao carrinho
                
                if (verListProd())
                    break;
                
                else {
                    System.out.println("Digite o codigo do produto para adicionar ao carrinho");
                    c = ler.nextInt();
                        
                        if (buscarProd(c)){
                            for (Produto i : listProd){

                                if (c == i.getCod()){
                                    
                                    System.out.println("Digite a quantidade que deseja vender");
                                    c = ler.nextInt();

                                        if (c > i.getQtd()){
                                            System.out.println("Quantidade no estoque insuficiente");
                                            break;
                                        }

                                        else {
                                            i.setVenda(c);                                        
                                            System.out.println("Quantidade adicionada ao carrinho");
                                            break;
                                        }                                                                                
                                }                       
                            }
                        }
                }
                    
                break;
            }
                       
            case 3: {                                                                              //Verificar produtos no carrinho
                
                if (verListProd())
                    break;
                
                else{
                    for (Produto i : listProd){
                        
                        if (i.getVenda()>0){
                            
                            System.out.println("Codigo: " +i.getCod()+"\nProduto: " +i.getNome()+"\nDescricao: "+i.getDesc()+"\nQuantidade no carrinho: "
                                    +i.getVenda()+"\nValor total: "+i.getPreco() * i.getVenda());
                            y+= i.getPreco() * i.getVenda();
                        }
                    }
                
                    System.out.println("\nValor total do itens: "+y);
                }
                
                y=0;
                break;   
            }
                        
            case 4: {                                                                               //Limpar a lista de compras
                
                System.out.println("Tem certeza que deseja limpar o carrinho? (s/n)");
                n = ler.next();
                
                  if (confirmar(n))
                      break;
                  
                  else if (n.equals("s")){
                      
                      System.out.println("Carrinho foi limpo");
                      clearList();                     
                      break;
                  }
                  
                  else 
                      System.out.println("Produtos nao foram removidos do carrinho");
                  
                break;                  
            }
                        
            case 5: {                                                                              //Finalizar compra
                
                if (verListProd())
                    break;
                
                else {
                    System.out.println("Tem certeza que deseja finalizar a compra? (s/n)");
                    n = ler.next();

                        if (confirmar(n))
                            break;

                        else if ("s".equals(n)){

                            System.out.println("Insira a data da compra");
                            n = ler.next();

                            for (Produto i : listProd){                      

                                if (i.getVenda()>0){

                                    y+= i.getPreco() * i.getVenda();                                                                           
                                    i.setQtd((i.getQtd())-(i.getVenda()));                                                    //reduzindo a quantidade de vendas no estoque total                                                                           
                                    Venda venda = new Venda(n, login, y);
                                    listVenda.add(venda);
                                    System.out.println("Compra finalizada com sucesso");                                    
                                }                         
                            }

                            clearList();
                            y=0;
                        }

                        else{
                            System.out.println("Compra nao finalizada");
                            break;
                        }
                }
                
                break;
            }
            
            case 0: {
                clearList();
                y=0;
                System.out.println("Logout efetuado");
                r=false;
                break;
            }
            
            default: 
                System.out.println("Opcao invalida");
        }
    }while(r);
    
    return 1;
}
    
    //Exibir historico de vendas
    public void hist_ven(){
        
        if (listVenda.isEmpty())
            System.out.println("Nao foi feita nenhuma venda");        
        
        else{
            for (Venda i: listVenda){
                System.out.println("Vendedor: "+i.getVendedor()+"\nData da venda: "+i.getData()+"\nValor da venda: "+i.getValor());
            }
        }
    }
            
    //Limpar lista de compras
    public void clearList(){
        
//        listComp.clear();                                                             adicionar confirmação APAGAR
        for (Produto i: listProd){
            i.setVenda(0);
        }
        System.out.println("Lista de compras limpa");
    }
    
    //Verifica se lista de produtos está vazia
    public boolean verListProd(){
               
        if (listProd.isEmpty()){
            System.out.println("Nao exite produto cadastrado");
            return true;
        }          
            return false;                    
    }    
    
    //Confirmar digitação s/n
    public boolean confirmar(String s){        
        
        if (!"s".equals(s) && !"n".equals(s)){
            System.out.println("Opcao invalida");
            return true;
        }        
            return false;                      
    }
    
    //Buscar produto pelo codigo dentro da lista
    public boolean buscarProd(int c){
        
        for (Produto i : listProd){
            if (c == i.getCod()){
                return true;
            }
        }
            System.out.println("Codigo nao encontrado");  
            return false;
    }    
    
    
}
