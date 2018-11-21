package main2.pkg0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SistemaAdm extends PessoaOuEditora implements PermissaoAdm {
    
    
    private String login;
    private String senha;

    public SistemaAdm(String login, String senha, String nome, String telefone) {
        super(nome, telefone);
        this.login = login;
        this.senha = senha;
    }

    public SistemaAdm(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    Cliente c = new Cliente();
    Editora e = new Editora();
    Pedido p = new Pedido();
    
    ArrayList cliente = new ArrayList();
    ArrayList editora = new ArrayList();
    ArrayList pedido = new ArrayList();
    
    Scanner teclado = new Scanner(System.in);
    
    int op;

    @Override
    public void CadastrarCliente() {
        
        System.out.println("\tCADASTRO CLIENTES\n");
        
        do{
            c = new Cliente();
            System.out.print("Nome: ");
            c.setNome(new Scanner(System.in).nextLine());
            System.out.print("Telefone: ");
            c.setTelefone(new Scanner(System.in).nextLine());
            System.out.print("CPF: ");
            c.setCpf(new Scanner(System.in).nextLine());
            cliente.add(c);
            
            System.out.print("\nDeseja Continuar? S = 1/N = 0: ");
            op = teclado.nextInt();
        }while(op!=0);
        
    }

    @Override
    public void ExcluirCliente() {
        Iterator x = cliente.iterator();
        String cpf;
        Cliente cl = null;
        if(cliente.isEmpty()){
            System.out.println("\nNenhum Cliente foi Cadastrado !");
        }else{
        System.out.print("Insira o CPF Cliente: ");
        cpf = new Scanner(System.in).nextLine();
        while(x.hasNext()){
            c = (Cliente)x.next();
            if(c.getCpf().equals(cpf)){
                cl = c;
                break;
            }
            }if(cl == null){
                System.out.println("Cliente não encontrado !");
            }else{
                cliente.remove(cl);
                System.out.println("Cliente Excluído");
            }
        }
    }

    @Override
    public void CadastrarEditora() {
        do{
            e = new Editora();
            System.out.print("Editora: ");
            e.setNome(new Scanner(System.in).nextLine());
            System.out.print("Telefone: ");
            e.setTelefone(new Scanner(System.in).nextLine());
            editora.add(e);
            
            System.out.print("\nDeseja Continuar? S = 1/N = 0: ");
            op = teclado.nextInt();
        }while(op!=0);
    }

    @Override
    public void ExcluirEditora() {
        
    }

    @Override
    public void RealizarPedido() {
    }

    @Override
    public void ExcluirPedido() {
    }
    
    
}
