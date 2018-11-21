package main2.pkg0;

import java.util.Scanner;

public class Main20 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int op,op1;
        String login,senha;
        
        //alterado da web
        SistemaAdm s = new SistemaAdm("ADM","ADM");
        
            do{
                
            
            System.out.println("**********************************MENU INICIAL**********************************\n");
            System.out.print("\t(1) -------- Cadastrar Cliente");
            System.out.println("  \t(2) -------- Cadastrar Editora");
            System.out.print("\t(3) -------- Fazer Pedido");
            System.out.println("            \t(4) -------- Pedidos em Andamento");
            System.out.print("\t(5) -------- Listar Pedidos");
            System.out.println("            \t(6) -------- Excluir Cliente");
            System.out.print("\t(7) -------- Excluir Pedido");
            System.out.println("            \t(8) -------- Excluir Editora");
            System.out.println("\n\t(0) -------- Encerrar Programa");
            System.out.print("\nOPÇÃO: ");
            op1 = teclado.nextInt();
            System.out.println("\n********************************************************************************");
            
            switch(op1){
                case 1:
                    s.CadastrarCliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
            }
            
            System.out.print("\nDeseja Encerrar o Programa? S = 1/N = 0: ");
            op = teclado.nextInt();
            }while(op!=0);
    }   
}
