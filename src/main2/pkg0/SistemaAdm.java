package main2.pkg0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SistemaAdm extends Pessoa implements PermissaoAdm {
    
    
    private String login;
    private String senha;

    public SistemaAdm(String login, String senha, String nome, String telefone) {
        super(nome, telefone);
        this.login = login;
        this.senha = senha;
    }

    public SistemaAdm() {
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
    
    int op,es,x=0;

    //METODOS PERSONALIZADOS PARA CLIENTES
    @Override
    public void CadastrarCliente() {
        System.out.println("\t-------------------------");
        System.out.println("\t    CADASTRO CLIENTES");
        System.out.println("\t-------------------------\n");
        do{
            c = new Cliente();
            System.out.print("Nome: ");
            c.setNome(new Scanner(System.in).nextLine().toUpperCase());
            System.out.print("Telefone: ");
            c.setTelefone(new Scanner(System.in).nextLine());
            System.out.print("CPF: ");
            c.setCpf(new Scanner(System.in).nextLine());
            System.out.println("\n-------------------------");
            System.out.println("\tENDEREÇO");
            System.out.println("-------------------------\n");
            System.out.print("Bairro:");
            c.e.setBairro(new Scanner(System.in).nextLine());
            System.out.print("Rua: ");
            c.e.setRua(new Scanner(System.in).nextLine());
            System.out.print("Numero da Casa: ");
            c.e.setNumero(new Scanner(System.in).nextLine());
            cliente.add(c);
            
            System.out.print("\nDeseja Continuar? S = 1/N = 0: ");
            op = teclado.nextInt();
        }while(op!=0);
        
    }
    
    @Override
    public void ListarClientes(){
        Iterator x = cliente.iterator();
        System.out.println("Clientes");
        while(x.hasNext()){
            c = (Cliente)x.next();
            System.out.println("Nome: "+c.getNome()+" CPF: "+c.getCpf());
        }
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
    
    //METODOS PERSONALIZADOS PARA EDITORAS
    @Override
    public void CadastrarEditora() {
        do{
            e = new Editora();
            System.out.print("Editora: ");
            e.setNome(new Scanner(System.in).nextLine().toUpperCase());
            System.out.print("Telefone: ");
            e.setTelefone(new Scanner(System.in).nextLine());
            editora.add(e);
            
            System.out.print("\nDeseja Continuar? S = 1/N = 0: ");
            op = teclado.nextInt();
        }while(op!=0);
    }
    
    @Override
    public void ListarEditoras(){
        Iterator xy = editora.iterator();
        System.out.println("\tEditoras\n");
        while(xy.hasNext()){
            e = (Editora)xy.next();
            System.out.print("Nome: "+e.getNomeEditora());
        }
    }

    @Override
    public void ExcluirEditora() {
        String nomeEdi;
        if(editora.isEmpty()){
            System.out.println("Nenhuma Editora foi Cadastrada !");
        }else{
            System.out.print("Selecione a Editora: ");
            nomeEdi = new Scanner(System.in).nextLine();
            
            Iterator i = editora.iterator();
            Editora ed = null;
            while(i.hasNext()){
                e = (Editora)i.next();
                if(e.getNomeEditora().equals(nomeEdi)){
                    ed = e;
                    break;
                    }
                }if(ed == null){
                System.out.println("Editora não encontrada !");
                }else{
                    editora.remove(ed);
                    System.out.println("Editora Excluída com sucesso !");
                }
        }
        
    }
    
    
    //METODOS PERSONALIZADOS PARA PEDIDOS
    @Override
    public void RealizarPedido() {
        if(cliente.isEmpty() || editora.isEmpty()){
            System.out.println("Impossível Realizar Pedido pois não existe nenhum cliente ou nenhuma editora cadastrado");
        }else{
           System.out.print("\nSelecione o Cliente: ");
           String NomeCliente = new Scanner(System.in).nextLine().toUpperCase();
           System.out.print("Selecione a Editora: ");
           String NomeEditora = new Scanner(System.in).nextLine().toUpperCase();
           
           Cliente cli = null;//DECLARANDO UM OBJETO NULO
           Editora edi = null;
           
           /*ESTRUTURA ABAIXO FOI CRIADA PARA PERCORRER TODA A LISTA PUXANDO OS NOMES DOS CLIENTES CADASTRADO
            SE O NOME A SER SELECIONADO CONSTAR NA LISTA, 
            O VALOR DO OBJETO CLI É ALTERADO PARA AQUELE CLIENTE COM O NOME PROCURADO
            E DEIXA DE SER NULO.
            SE NÃO EXISTIR NENHUM CLIENTE COM O NOME PROCURADO, O OBJETO CONTINUA NULO.
            */
           Iterator i = cliente.iterator();
           while(i.hasNext()){
               c = (Cliente)i.next();
               if(c.getNome().equals(NomeCliente)){
                   cli = c;
                   break;
               }
           }
           Iterator y = editora.iterator();
           while(y.hasNext()){
               e = (Editora)y.next();
               if(e.getNomeEditora().equals(NomeEditora)){
                   edi = e;
                   break;
                }
            }
           
           if(cli == null || edi == null){
               System.out.println("Impossivel Realizar Pedido Cliente ou Editora nao estao cadastrados");
           }
           else{
               do{
                    System.out.println("\n\t\tPEDIDO DO CLIENTE "+NomeCliente+"\n");
                    
                    p = new Pedido();
                    p.setCodigoPedido(x+=1);
                    p.setEditora(NomeEditora);
                    p.setCliente(NomeCliente);
                    System.out.print("Nome do Livro: ");
                    p.setNomeLivro(new Scanner(System.in).nextLine());
                    System.out.print("Quantidade: ");
                    p.setQtdLivro(teclado.nextInt());
                    pedido.add(p);
                   
                   System.out.println("\n(0) ----FINALIZAR PEDIDO\n(1) ----NOVO PEDIDO C/ MESMO CLIENTE");
                   System.out.print("OPÇÃO: ");
                   es = teclado.nextInt();
               }while(es!=0);
           }
           
        }  
       
       
    }
    
    @Override
    public void ListarPedidos(){
        
        System.out.print("\t\t-----------------------");
        System.out.print("\n\t\t  PEDIDOS EM ANDAMENTO\n");
        System.out.println("\t\t-----------------------\n");
        
        Iterator i = pedido.iterator();
        if(pedido.isEmpty()){
            System.out.println("Nenhum pedido Está em Andamento\n");
        }else{
        while(i.hasNext()){
            p = (Pedido)i.next();
            System.out.println("Cliente: "+p.getCliente());
            System.out.println("Editora: "+p.getEditora());
            System.out.println("Livro: "+p.getNomeLivro());
            System.out.println("Código do Pedido: "+p.getCodigoPedido()+"\n");
            }
        }   
    }

    @Override
    public void ExcluirPedido() {
        if(pedido.isEmpty()){
            System.out.println("Nenhum Pedido foi Cadastrado !");
        }else{
        System.out.print("Insira o Código do Pedido que Deseja excluir: ");
        String cod = new Scanner(System.in).nextLine();
        
        Pedido ped = null;
        Iterator i = pedido.iterator();
        while(i.hasNext()){
            p = (Pedido)i.next();
            if(Integer.toString(p.getCodigoPedido()).equals(cod)){
                ped = p;
                break;
            }
        }if(ped == null){
            System.out.println("\nPedido não Encontrado !");
        }else{
            pedido.remove(ped);
            System.out.println("\n\tPedido Excluido com Sucesso");
        }
        
       }
        
        
    }
    
}
