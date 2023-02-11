package br.com.ada.pablo.modelo;

public class Pessoa {
    private String nome;
    private String message;

    public String getNome() {
        return nome;
    }

    public String getMessage() {
        return message;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return nome + " received a message: -> " + message;
    }
}

