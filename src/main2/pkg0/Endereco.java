package main2.pkg0;

public  class Endereco {
    
    private String bairro;
    private String rua;
    private String numero;

    public Endereco(String bairro, String rua, String numero) {
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    
}
