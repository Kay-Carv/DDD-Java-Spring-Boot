//Criando Objeto amigo para requisição POST

package br.com.fiap2espa.aula01.amigo;

public class Amigo {
    private String nome;
    private String telefone;
    private String email;
    private String dataNascimento;

    public Amigo() {
    }

    public Amigo(String nome, String telefone, String email, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Amigo " + nome + " " + telefone + " " + email + " " + dataNascimento;
    }
}