
package main2.pkg0;

public  class Adm extends Pessoa {
    
    private String login;
    private String senha;

    public Adm(String login, String senha, String nome, String telefone) {
        super(nome, telefone);
        this.login = login;
        this.senha = senha;
    }

    public Adm(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Adm() {
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
    
    
    
}
