package br.com.janderson.BuscaGitHub.Modelo;

import br.com.janderson.BuscaGitHub.Servico.LeitorDados;

public class Perfil {

    private String nome;
    private String id;
    private String url;
    private String biografia;

    public Perfil( LeitorDados conversor) {
        this.nome = conversor.login();
        this.id = conversor.id();
        this.url = conversor.html_url();
        this.biografia = conversor.bio();
    }

    @Override
    public String toString() {
        return "Perfil: " +
                "\n   Id: " + id +
                "\n   Nome: " + nome +
                "\n   Biografia: " + biografia +
                "\n   Url: " + url;

    }
}
