package br.com.alura.minhasmusicas.modelos.Principal;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Photograph");
        minhaMusica.setCantor("Ed Sheeran");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();

        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();

        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("Tudo sobre Programação");
        meupodcast.setApresentador("Fábio Akita");

        for (int i = 0; i < 5000; i++) {
            meupodcast.reproduzir();

        }
        for (int i = 0; i < 1000; i++) {
            meupodcast.curtir();

        }


        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.incluir(meupodcast);
        minhasPreferidas.incluir(minhaMusica);

    }
}
