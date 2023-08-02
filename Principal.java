import br.com.gabriel.audios.Musica;
import br.com.gabriel.audios.Podcast;

public class Principal  {
    public static void main(String[] args) {

       //PODCAST
        Podcast podcast = new Podcast();
        podcast.setHost("Podpah");
        podcast.setDescricao("""
               Nosso podpah é apenas um bate papo construtivo de opinioes. 
               Seja muito bem vindo! """);
        podcast.setTitulo("Tudo junto e misturado!!");
        podcast.setDuracao(180);


        for (int i = 0; i < 50; i++) {
            podcast.TotalCurtidas();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.getTotalReproducoes();
        }

        System.out.println(podcast.getHost());
        System.out.println(podcast.getTitulo());
        System.out.println(podcast.getDescricao());
        System.out.println("A classificação do podcast é : " +podcast.getClassificacao());
        System.out.println("Nosso podcast tem a duração em minutos de : " +podcast.getDuracao());
        System.out.println("Curtidas: " +podcast.TotalCurtidas());
        System.out.println("Reproduções:" +podcast.getTotalReproducoes());

        MinhaPreferida novo1= new MinhaPreferida();

        novo1.preferida(podcast);


        //MUSICA

        Musica alone = new Musica();
        alone.setTitulo("Set Fire on the Dark");
        alone.setAlbum("Album: Adele,21");
        alone.setArtista("Adele");
        alone.setGenero("Pop Hit");
        alone.setDuracao(4);
        for (int i = 0; i <1000; i++) {
            alone.TotalCurtidas();
        }
        for (int i = 0; i < 5000; i++) {
            alone.getTotalReproducoes();
        }
        System.out.println("Musica: " +alone.getTitulo());
        System.out.println("Artista:" +alone.getArtista());
        System.out.println("Gênero:" +alone.getGenero());
        System.out.println(alone.getAlbum());
        System.out.println("A classificação da musica em minutos é de: " +alone.getClassificacao());
        System.out.println("Duração da musica de:  : " +alone.getDuracao());
        System.out.println("Curtidas: " +alone.TotalCurtidas());
        System.out.println("Reproduções:" +alone.getTotalReproducoes());

        novo1.preferida(alone);





    }
}

