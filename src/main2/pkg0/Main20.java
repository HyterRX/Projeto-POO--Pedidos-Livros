package main2.pkg0;

import java.util.Scanner;

public class Main20 {
    
    public static void limparTela(){
       for (int i = 0; i < 50; ++i)
        System.out.println ();
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            
       int op,op1;
       Sistema adm = new Sistema();
       
       try{
            do{
                System.out.println("**********************************MENU INICIAL**********************************\n");
                System.out.print("\t(1) -------- Cadastros");
                System.out.println("\t\t(3) -------- Pedidos em Andamento");
                System.out.print("\n\t(2) -------- Fazer Pedido");
                System.out.println("\t(4) -------- Excluir");
                System.out.println("\n\t(0) -------- Encerrar Programa");
                System.out.println("\n********************************************************************************\n");
                
                System.out.print("\nSelecione: ");
                op1 = teclado.nextInt();
           
            
                switch(op1){
                case 0:
                    System.out.println("Encerrando Programa ...........");
                    break;
                case 1:
                    System.out.println("\n(1) ---Cadastrar Cliente");
                    System.out.println("(2) ---Cadastrar Editora");
                    System.out.print("Opção: ");
                    op = teclado.nextInt();
                switch (op) {
                    case 1:
                        adm.CadastrarCliente();
                        break;
                    case 2:
                        adm.CadastrarEditora();
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                    break;
                case 2:
                    adm.RealizarPedido();
                    break;
                case 3:
                    adm.ListarPedidos();
                    break;
                case 4:
                    System.out.println("\n(1) ---Excluir Cliente");
                    System.out.println("(2) ---Excluir Pedido");
                    System.out.println("(3) ---Excluir Editora");
                    System.out.print("Opção: ");
                    op = teclado.nextInt();
                    switch(op){
                    case 1:
                        adm.ExcluirCliente();
                        break;
                    case 2:
                        adm.ExcluirPedido();
                        break;
                    case 3:
                        adm.ExcluirEditora();
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                    }
                    break;
                }
            
                System.out.println("\n(0) ----Encerrar Programa Completo\n(1) ----Continuar Executando");
                System.out.print("Opção: ");
                op = teclado.nextInt();
                
                }while(op!=0);
       }catch(java.util.InputMismatchException e){
           System.out.println("Erro no Menu");
       }
                limparTela(); 
            
            
    }   
}
