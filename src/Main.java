import services.Iphone;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        Iphone iphone = new Iphone();

        out.println("Adicione uma musica!");
        String musica = sc.next();

        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();

        out.println("Insira um número!");
        String numero = sc.next();

        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        out.println("Insira uma URL!");
        String url = sc.next();

        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();






    }
}