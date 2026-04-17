package modelos;
import org.apache.log4j.Logger;

public class CD_Audio extends MaterialAudiovisual
{
    //atributos
    private String artista;
    private int num_canciones;

    static final Logger log = Logger.getLogger(CD_Audio.class);

    //constructor
    public CD_Audio(String codigo, String titulo, int unidades, String genero, int minutos, String artista, int num_canciones)
    {
        super(codigo, titulo, unidades, genero, minutos);
        this.artista = artista;
        this.num_canciones = num_canciones;
    }
    //metodos
    @Override
    public void ingresarDatos()
    {
        log.info("Preparando subida de CD: " + titulo);
    }

    @Override
    public void mostrarDatos()
    {
        System.out.println("CD audio: " + titulo + " | Artista: " + artista + " | Canciones: " + num_canciones);
    }
    //Getters y setters
    public String getArtista()
    {
        return artista;
    }

    public void setArtista(String artista)
    {
        this.artista = artista;
    }

    public int getNum_canciones()
    {
        return num_canciones;
    }

    public void setNum_canciones(int num_canciones)
    {
        this.num_canciones = num_canciones;
    }
}
