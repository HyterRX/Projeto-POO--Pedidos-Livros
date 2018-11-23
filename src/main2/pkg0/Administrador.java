/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2.pkg0;

/**
 *
 * @author gabri
 */
public abstract class Administrador extends Pessoa {
    
    private String login;
    private String senha;

    public Administrador(String login, String senha, String nome, String telefone) {
        super(nome, telefone);
        this.login = login;
        this.senha = senha;
    }

    public Administrador(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Administrador() {
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
