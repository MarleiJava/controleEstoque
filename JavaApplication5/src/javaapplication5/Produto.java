
package javaapplication5;
import javaapplication5.Menu;
import java.util.ArrayList;
import java.util.Scanner;
import static javaapplication5.Menu.ContPro;
import static javaapplication5.Menu.MENU_PRINCIPAL;
import static javaapplication5.Menu.produto;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Produto {
    public  Scanner scan = new Scanner(System.in);
    private String nome;
    private Integer preço;
    private Integer unidade;
    private Integer quantEstoque;
    
    
    //Construtores
    public Produto(String nome, Integer preco, Integer unidade, Integer quantEstoque){
    this.nome = nome;
    this.preço = preco;
    this.unidade = unidade;
    this.quantEstoque = quantEstoque;
        
    }
    
    public Produto(){
        
    }
    
    //Setter e Getters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(Integer preco){
        this.preço = preco;
    }

   public void setUnidade(Integer unidade){
       this.unidade = unidade;
   }
   
   public void setQuantEstoque(Integer quantEstoque){
       this.quantEstoque = quantEstoque;
   }
   
   public String getNome(){
       return nome;
   }
   
   public Integer getPreco(){
       return preço;
   }
   
   public Integer getUnidade(){
       return unidade;
   }
   
   public Integer getEstoque(){
       return quantEstoque;
   }
    
   
   public void cadastrarProd(){
       System.out.println("");
       System.out.println("*** CADASTRANDO PRODUTO*** ");
       System.out.println("DIGITE O NOME: ");
       this.setNome (scan.next());
       //validaNome();
       System.out.println("DIGITE O PREÇO: ");
       this.setPreco (scan.nextInt());
       System.out.println("DIGITE A UNIDADE: ");
       this.setUnidade(scan.nextInt());
       this.setQuantEstoque(this.getUnidade());
   }
   
   public void relatorio(){
       System.out.println("");
       System.out.println("Nome:" + getNome());
       System.out.println("Preço:" + getPreco());
       System.out.println("Unidade:" + getUnidade());
       System.out.println("Quantidade:" + getEstoque());
       System.out.println("------------");
   }
   
   
   public void reajustePre(){
       System.out.println("Digite o novo preço:");
       this.setPreco(scan.nextInt());
       
   }
    
   public void excluir(){
       this.setNome("");
       this.setPreco(0);
       this.setQuantEstoque(0);
       this.setUnidade(0);
   }
   
   public void validaNome(){
      String op = null;
      int valor = 0;
      for (int i =0; i<ContPro;i++){
        if(this.getNome().equals(produto[i].getNome())){
            System.out.println("Produto já cadastrado");
            System.out.println("Digite a quantidade adicional:");
            this.setUnidade(scan.nextInt());
            System.out.println("passou");
            
        }else{
       
       }
      }
    }

    public void setPreco(JTextPane CampPreco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
}
         
   

