package main2.pkg0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main20 {
    
    public static void limparTela(){
       for (int i = 0; i < 50; ++i)
        System.out.println ();
    }
    
    public static void Menu() throws java.util.InputMismatchException{
        
       Scanner teclado = new Scanner(System.in);
            
       int op,op1,op2;
       Sistema s = new Sistema("gabriel","1111");
        
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
                        s.CadastrarCliente();
                        break;
                    case 2:
                        s.CadastrarEditora();
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                    break;
                case 2:
                    s.RealizarPedido();
                    break;
                case 3:
                    s.ListarPedidos();
                    break;
                case 4:
                    System.out.println("\n\tNECESSITA DO LOGIN E SENHA DO SUPER ADM\n");
                    
                    System.out.print("\nLogin: ");
                    String login = new Scanner(System.in).nextLine();
                    System.out.print("Senha: ");
                    String senha = new Scanner(System.in).nextLine();
                    System.out.println("");
                    
                    if(s.getLogin().equals(login) && s.getSenha().equals(senha)){
                    System.out.println("\n(1) ---Excluir Cliente");
                    System.out.println("(2) ---Excluir Pedido");
                    System.out.println("(3) ---Excluir Editora");
                    System.out.print("Opção: ");
                    op = teclado.nextInt();
                    switch(op){
                    case 1:
                        s.ExcluirCliente();
                        break;
                    case 2:
                        s.ExcluirPedido();
                        break;
                    case 3:
                        s.ExcluirEditora();
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                    }
                    break;
                    }else{
                        System.out.println("\n\tConta Inválida !\n");
                    }
                        
                }
            
                System.out.println("\n(0) ----Encerrar Programa Completo\n(1) ----Continuar Executando");
                System.out.print("Opção: ");
                op = teclado.nextInt();
                }while(op!=0);
    }
    
    
    public static void main(String[] args) throws Exception {
        
        try{
            Menu();
        }catch(InputMismatchException e){
            limparTela();
            System.out.println("\t\nSÓ PODERÁ SER INSERIDO NUMEROS INTEIROS NA SELEÇÃO DE MENU");
            System.out.println("\t\nPOR FAVOR, TENTE NOVAMENTE !");
            Menu();
            
        }
       
    }   
}
