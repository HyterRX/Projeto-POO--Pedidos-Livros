package main2.pkg0;

public class Pedido {
    
    //Atributos
    private String nomeLivro;
    private int qtdLivro;
    private int codigoPedido;
    private Editora nomeEditora;
    private Cliente nomeCliente;

    
    //Metodos acessores
    public Pedido(String nomeLivro, int qtdLivro, int codigoPedido, Editora nomeEditora, Cliente nomeCliente) {
        this.nomeLivro = nomeLivro;
        this.qtdLivro = qtdLivro;
        this.codigoPedido = codigoPedido;
        this.nomeEditora = nomeEditora;
        this.nomeCliente = nomeCliente;
    }

    public Pedido() {
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getQtdLivro() {
        return qtdLivro;
    }

    public void setQtdLivro(int qtdLivro) {
        this.qtdLivro = qtdLivro;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Editora getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(Editora nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    
    
    
    
    
    
}
