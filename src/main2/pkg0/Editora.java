
package main2.pkg0;


public class Editora{
    
    //Atributos
    private String nomeEditora;
    private String telefone;

    //Metodos acessores
    public Editora(String nomeEditora, String telefone) {
        this.nomeEditora = nomeEditora;
        this.telefone = telefone;
    }

    public Editora() {
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNome(String nome) {
        this.nomeEditora = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
