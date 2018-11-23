package main2.pkg0;

public class Pedido {
    
    //Atributos
    private String nomeLivro;
    private int qtdLivro;
    private int codigoPedido;
    private String cliente;
    private String editora;
    
    //Metodos acessores
    public Pedido(String nomeLivro, int qtdLivro, int codigoPedido, String cliente, String editora) {
        this.nomeLivro = nomeLivro;
        this.qtdLivro = qtdLivro;
        this.codigoPedido = codigoPedido;
        this.cliente = cliente;
        this.editora = editora;
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
