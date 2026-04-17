package modelos;
import org.apache.log4j.Logger;

public class DVD extends MaterialAudiovisual
{
    //atributos
    private String director;

    static final Logger log = Logger.getLogger(DVD.class);

    //Constructor
    public DVD(String codigo, String titulo, int unidades, String genero, int minutos, String director)
    {
        super(codigo, titulo, unidades, genero, minutos);
        this.director = director;
    }

    //Metodos
    @Override
    public void ingresarDatos()
    {
        log.info("Preparando DVD a ingresar: " + titulo);
    }
    @Override
    public void mostrarDatos()
    {
        System.out.println("DVD: " + titulo + " | Director: " + director + " | Genero: " + genero);
    }

    //Getters y setters
    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }
}
