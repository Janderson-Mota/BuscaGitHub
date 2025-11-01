package br.com.janderson.BuscaGitHub.Servico;

import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public String obterDados(String nome){


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create
                ("https://api.github.com/users/"+nome)).build();
        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException | IllegalArgumentException e) {
            System.out.println("Erro ao tentar enviar os dados.");;
        }

        String json = response.body();
        return json;

    }
}
