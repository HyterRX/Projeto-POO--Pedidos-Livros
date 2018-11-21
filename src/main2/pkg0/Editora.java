
package main2.pkg0;


public class Editora extends PessoaOuEditora{
    
    //Atributos
    private String cnpj;

    //Metodos acessores
    public Editora(String cnpj, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    public Editora() {
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
