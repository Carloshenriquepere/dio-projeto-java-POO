package services;

import repositories.AparelhoTelefonico;
import repositories.NavegadorInternet;
import repositories.ReprodutorMusical;

import static java.lang.System.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        out.println("Página atualizada.");
    }

    @Override
    public void tocar() {
        out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        out.println("Música selecionada: " + musica);
    }
}
