
package javaapplication5;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Connection.Cadastro;
import javaapplication5.Produto;

public class Menu extends Produto {
    
public static int ContPro =0;
public static  Produto [] produto = new Produto[10];
public static Scanner scan = new Scanner(System.in);
public static ArrayList <Produto> proList = new ArrayList<Produto>();
    
    public static void main(String[] args) throws SQLException  {
        
    Scanner scan = new Scanner(System.in);
    int op = 0;
        
        System.out.println("ESCOLHA A OPÇÃO DESEJADA: ");
        MENU_PRINCIPAL();
        op = opcao(op);
        while(op!=0){
            if(op ==1){
                
                System.out.println(" ");
                System.out.println(" ");
                TELA_10();  
                
             }else
           if(op ==2){  
               
               System.out.println(" ");
               System.out.println(" ");
               TELA_12(); 
               
             }else
           if(op==3){
               
               System.out.println(" ");
               System.out.println(" ");
               TELA_13();
               
             }else 
           if(op ==4){
               
               System.out.println(" ");
               System.out.println(" ");
               TELA_14();
                       
             }else if(op >7){
                 
                 System.out.println(" ");
                 System.out.println(" ");
                 System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE");   
              
            }else if(op ==6){
                alocar();
            }
            MENU_PRINCIPAL();
            op = opcao(op);
        }
            System.out.println("*** FINALIZANDO PROGRAMA ***");
            System.exit(0);
        
    }

    
     public static void MENU_PRINCIPAL() {
         System.out.println("");
       System.out.println("Valçor Cont: " + ContPro);
       System.out.println("Menu Principal");         
       System.out.println("1 - CADASTRO DE PRODUTOS");
       System.out.println("2 - MOVIMENTAÇÃO");
       System.out.println("3 - REAJUSTE DE PREÇOS");
       System.out.println("4 - RELATÓRIOS");
       System.out.println("0 - FINALIZAR");  
       System.out.println(" 6 - ALOCAR (FASE DE TESTE)");
         System.out.println("");
         
    }
     
    //************************************MENU CADASTRO*******************************
    static void TELA_10() throws SQLException{
        int op =0;
        System.out.println("CADASTRO DE PRODUTOS");     
        System.out.println("1 - INCLUSÃO");
        System.out.println("2 - ALTERAÇÃO");
        System.out.println("3 - CONSULTA");
        System.out.println("4 - EXCLUSÃO");
        System.out.println("0 - RETORNAR");
        op = opcao(op);
        if(op ==1){
            TELA_111();
        }else 
          if(op == 2){
            TELA_112();
        }else
          if(op==3){
            TELA_113();
          }else
              if(op ==4){
                  TELA_114();
              }else
                  if(op>4){
                      System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
                      TELA_10();
                  }

    }
    
    //***********************************************INCLUSÃO***************************************************************
    static void TELA_111() throws SQLException{
 
        String op = null;
        System.out.println("INCLUSÃO DE PRODUTO");
        produto[ContPro] = new Produto();     
        produto[ContPro].cadastrarProd();
        proList.add(produto[ContPro]);
        System.out.println("CONFIRMA INCLUSÃO (S/N)?");
        op = scan.next();
        if( op.equals("N") ||op.equals("n")){
            MENU_PRINCIPAL();
        }else if(op.equals("s") || op.equals("S")){
           System.out.println("PRODUTO CADASTRADO COM SUCESSO !");
          Cadastro cadastro = new Cadastro();
          cadastro.adicionarProduto(produto[ContPro]);
        }
       
       ContPro++;
       
        System.out.println("REPETIR OPERAÇÃO (S/N)");
        op = scan.next();
        if(op.equals("s") || op.equals("S")){
           TELA_111();
        }   
       
               
        
    }
    
    //***********************************************************ALTERAÇÃO PRODUTO*****************************************************
    static void TELA_112(){
        
        int op =0;
        System.out.println("ALTERAÇÃO DE PRODUTO");
        System.out.println("NOME:");
        System.out.println("PREÇO:");
        System.out.println("UNIDADE");
        System.out.println("QUANTIDADE:");
        System.out.println("CONFIRMAR ALTERAÇÃO (S/N)?");
        System.out.println("REPETIR OPERAÇÃO (S/N)?");
        op = opcao(op);
    }
    
    //*******************************************************************CONSULTA********************************************
    static void TELA_113(){     
        int op =0;
        System.out.println("CONSULTA DE PRODUTO");
       System.out.println("NOME: ");
       System.out.println("PREÇO:");
       System.out.println("UNIDADE");
       System.out.println("QUANTIDADE");
       System.out.println("REPETIR OPERAÇÃO (S/N)?");
       op = opcao(op);
    }
    
    //************************************************************* EXCLUSÃO *****************************************************************
   static void TELA_114(){
    
        String pro;
        int op =0;
        System.out.println("EXCLUSÃO DE PRODUTO");
        System.out.println("DIGITE O NOME DO PRODUTO: ");
        pro = scan.next();
        for(int i =0; i<ContPro; i++){
       if(produto[i].getNome().equals(pro)){
        System.out.println("------INFORMAÇÕES-----");
        System.out.println("NOME:" + produto[i].getNome());
        System.out.println("PREÇO:" + produto[i].getPreco());
        System.out.println("UNIDADE:" + produto [i].getUnidade());
        System.out.println("QUANTIDADE:" + produto[i].getEstoque());
        System.out.println("");
        
        String op1;
        System.out.println("CONFIRMAR A EXCLUSÃO (S/N)?");
        op1 = scan.next();
        if(op1.equals("N") ||op1.equals("n")){
            MENU_PRINCIPAL();
        }else if(op1.equals("s") || op1.equals("S")){
           
           System.out.println("PRODUTO EXCLUIDO COM SUCESSO !");
        }
        
        System.out.println("REPETIR OPERAÇÃO (S/N)?");
        }
            
            }  
        System.out.println("NOME:");
        System.out.println("PREÇO:");
        System.out.println("UNIDADE:");
        System.out.println("QUANTIDADE:");
        System.out.println("CONFIRMAR OPERAÇÃO (S/N)?");
        System.out.println("REPETIR OPERAÇÃO (S/N)?");
        op = opcao(op);
    }
    
   //****************************************** MENU MOVIMENTAÇÃO************************************************************
    static void TELA_12(){
       // Selecionando-se a opção 2 na tela 1.0 passa-se para a tela 1.2
        //Selecionando-se a opção 0 (retornar), na tela 1.2 deve-se retornar para a tela 1.0
        System.out.println("MOVIMENTAÇÃO");
        int op =0;
        System.out.println("MOVIMENTAÇÃO - ENTRADA DE PRODUTO");
        System.out.println("PRODUTO");
        System.out.println("QTDE ATUAL: ");
        System.out.println("QTDE ENTRADA: ");
        System.out.println("QTDE FINAL");
        System.out.println("CONFIRMAR ENTRADA (S/N)?");
        System.out.println("REPETIR OPERAÇÃO (S/N)?");
        op = opcao(op);
    }
    
    static void TELA_121(){
       // Selecionando-se a opção 2 na tela 1.2 passa-se para a tela 1.2.1
       //Deve-se ler o nome do produto e verificar se ele já está cadastrado. Se estiver, então deve-se exibir os seus dados e ler a quantidade da entrada.
        //Caso algum dos critérios de validação não seja atendido, deve-se exibir mensagens de erro e solicitar a redigitação da informação errada.
        //Deve-se pedir a confirmação da operação antes de efetuá-la.
        //Ao final da operação deve-se retornar à tela 1.2
    }
    
    
    static void TELA_13(){
        String op;
        System.out.println("REAJUSTE DE PREÇOS");
        System.out.println("Digite o nome do produto que deseja altera:");
        for(int i =0; i<ContPro; i++){
            System.out.println(produto[i].getNome());
        }
        op = scan.next();
        for(int i =0; i<ContPro; i++){
            System.out.println(produto[i].getNome());
            if(op.equals(produto[i].getNome())){
                
                System.out.println("Reajustando preço de " + produto[i].getNome());
                produto[i].reajustePre();
                System.out.println("Preço reajustado!");
                
            }else{
                int op1 = 0;
                System.out.println("Produto não encontrado:");
                System.out.println("1) Tentar novamente");
                System.out.println("2) Voltar ao menu principal");
                op1= scan.nextInt();
                while(op1 >2){
                if(op1==1){
                    TELA_13();
                }else 
                if(op1 ==2){
                    MENU_PRINCIPAL();
                }else{
                    System.out.println("Opção inválida!");
                }
            }
            }}   
    }
        
    static void TELA_14(){
        System.out.println("RELATÓRIOS");
        for(int i =0; i<ContPro; i++){
        produto[i].relatorio();
        }
    }
    
    static int opcao(int opV){
         Scanner scan = new Scanner(System.in);
         opV = scan.nextInt();
         return opV;
    }
    
    public static void alocar(){
        for(int i =0; i<ContPro;i++){
            if(produto[i].getNome().equals("")){
                produto[i].setNome(produto[i+1].getNome());
                produto[i].setPreco(produto[i+1].getPreco());
                produto[i].setQuantEstoque(produto[i+1].getEstoque());
                produto[i].setUnidade(produto[i+1].getUnidade());
            }
        }
    }
    
 
    

    
    
}
