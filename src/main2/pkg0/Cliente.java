package main2.pkg0;



public class Cliente extends Pessoa {
    
    Endereco e = new Endereco();
    
    //Atributos
    private String cpf;
    
    //Metodos Acessores
    public Cliente(String cpf, String nome, String telefone) {
       super(nome, telefone);
       this.cpf = cpf;
    }

    public Cliente() {
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
   
    
}
