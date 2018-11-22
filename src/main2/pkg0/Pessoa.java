package main2.pkg0;

public abstract class Pessoa {
    
    //Atributtos
    private String nome;
    private String telefone;
    
    //Metodos Acessores 
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
        
    
    
    
    
}
