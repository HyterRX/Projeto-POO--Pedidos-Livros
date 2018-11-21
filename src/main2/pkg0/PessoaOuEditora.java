package main2.pkg0;

public abstract class PessoaOuEditora {
    
    //Atributtos
    private String nome;
    private String telefone;
    
    //Metodos Acessores 
    public PessoaOuEditora(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public PessoaOuEditora() {
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
