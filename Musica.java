package br.com.gabriel.audios;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if(getTotalReproducoes()>1000){
            return 10;
        }
        else
            return 6;
    }
}
