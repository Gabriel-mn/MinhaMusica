import br.com.gabriel.audios.Audio;

public class MinhaPreferida {
    public void  preferida(Audio audio){
        if(audio.getClassificacao()>=9){
            System.out.println("Está bombando entre todos");
        }
        else
            System.out.println("Para ouvir daqui a pouco");
    }
}
