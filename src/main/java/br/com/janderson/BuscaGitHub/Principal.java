package br.com.janderson.BuscaGitHub;

import br.com.janderson.BuscaGitHub.Modelo.Perfil;
import br.com.janderson.BuscaGitHub.Servico.ConsumoApi;
import br.com.janderson.BuscaGitHub.Servico.LeitorDados;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Principal implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ConsumoApi consumo = new ConsumoApi();
        List <Perfil> perfis = new ArrayList<>();
        FileWriter escrita = new FileWriter("GitHub.txt");

        System.out.println("******* Bem vindo ao serviço de pesquisa de perfis do GitHub *******");
        while (true) {

            System.out.print("Digite o nome do perfil que deseja buscar os dados: ");
            var usuario = sc.nextLine();

            var resposta = consumo.obterDados(usuario);
            Gson gson = new Gson();
            LeitorDados conversor = gson.fromJson(resposta, LeitorDados.class);
            Perfil perfil = new Perfil(conversor);

            System.out.println("\n"+perfil.toString());
            perfis.add(perfil);

            System.out.println();
            System.out.print("Deseja encerrar sua busca? (S/N): ");
            var opcao = sc.nextLine();
            if (opcao.equalsIgnoreCase("S")) {
                break;
            }
        }
        for (Perfil p : perfis) {
            String espacador = "\n";
            escrita.write(p.toString()+espacador);
            escrita.write(espacador+" ");
        }
        escrita.close();
        System.out.println("Relatório salvo com sucesso em 'GitHub.txt'.");


    }
}
