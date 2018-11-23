package main2.pkg0;

import java.util.Scanner;

public class Main20 {
    public static void ADM(){
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("\n(1) ---Excluir Cliente");
         System.out.println("(2) ---Excluir Pedido");
          System.out.println("(3) ---Excluir Editora");
           System.out.print("Opção: ");
            int op = teclado.nextInt();
        
        String login,senha;
        SistemaAdm s = new SistemaAdm("ADM","ADM","Gabriel Santos","82.98102-9294");
        
         
        switch(op){
            case 1:
                System.out.println("Para excluir o Cliente voce precisa da permissão do ADM");
                System.out.print("\n\n\t\tLogin: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\tSenha: ");
                senha = new Scanner(System.in).nextLine();
                System.out.println("");
                if(s.getLogin().equals(login) && s.getSenha().equals(senha)){
                s.ExcluirCliente();
                }else
                    System.out.println("Você não tem permissao");
                break;
            case 2:
                System.out.println("Para excluir o Pedido voce precisa da permissão do ADM");
                System.out.print("\n\n\t\tLogin: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\tSenha: ");
                senha = new Scanner(System.in).nextLine();
                System.out.println("");
                if(s.getLogin().equals(login) && s.getSenha().equals(senha)){
                s.ExcluirPedido();
                }else
                    System.out.println("Você não tem permissao");
                 break;
            case 3:
                System.out.println("Para excluir o Editora voce precisa da permissão do ADM");
                System.out.print("\n\n\t\tLogin: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\tSenha: ");
                senha = new Scanner(System.in).nextLine();
                System.out.println("");
                if(s.getLogin().equals(login) && s.getSenha().equals(senha)){
                s.ExcluirEditora();
                }else
                    System.out.println("Você não tem permissao");
                 break;
            default:
                System.out.println("Opção Inválida");
            
        }
            
    }
    
    public static void main(String[] args) {
        
            int op,op1;
            Scanner teclado = new Scanner(System.in);
            SistemaAdm s = new SistemaAdm();
            
            do{
                System.out.println("**********************************MENU INICIAL**********************************\n");
                System.out.print("\t(1) -------- Cadastrar Cliente");
                System.out.println("  \t(2) -------- Cadastrar Editora");
                System.out.print("\t(3) -------- Fazer Pedido");
                System.out.println("            \t(4) -------- Pedidos em Andamento");
                System.out.println("            \n\t\t\t\t(5) -------- Excluir");
                System.out.println("\n\t(0) -------- Encerrar Programa");
                System.out.print("\nOPÇÃO: ");
                op1 = teclado.nextInt();
            System.out.println("\n********************************************************************************\n");
            
            switch(op1){
                case 1:
                    s.CadastrarCliente();
                    break;
                case 2:
                    s.CadastrarEditora();
                    break;
                case 3:
                    s.RealizarPedido();
                    break;
                case 4:
                    s.ListarPedidos();
                    break;
                case 5:
                    ADM();
                    break;
                }
                System.out.println("\n(0) ----Encerrar Programa\n(1) ----Continuar Executando");
                System.out.print("Opção: ");
                op = teclado.nextInt();
                }while(op!=0);
        
    }   
}
