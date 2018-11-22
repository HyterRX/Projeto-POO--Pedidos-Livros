package main2.pkg0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main20 {
    
    public static void menu() throws Exception{
        int op,op1;
        String login,senha;
        Scanner teclado = new Scanner(System.in);
        
        
            try{
            SistemaAdm s = new SistemaAdm("ADM","ADM","Gabriel Santos","82.98102-9294");
        
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
            System.out.println("\n********************************************************************************\n");
            
            switch(op1){
                case 1:
                    s.CadastrarCliente();
                    break;
                case 2:
                    s.CadastrarEditora();
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
                case 7:
                    
                    break;
                case 8:
                    System.out.println("Para excluir o Cliente voce precisa da permissão do ADM");
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
                }
            
                System.out.print("\nDeseja Encerrar o Programa? S = 1/N = 0: ");
                op = teclado.nextInt();
                }while(op!=0);
            }catch(InputMismatchException e){
                throw new Exception(e); 
            }
            
    }
    

    public static void main(String[] args) throws Exception  {
        
       
        try
        {
            menu();
        }
        catch(Exception e)
        {
            System.out.println("Ocorreu uma exceção");
            System.out.println("Ao executar o método Menu()"+e);
            System.out.println("Tente novamente: ");
            menu();
            
        }
        
    }   
}
