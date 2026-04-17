package modelos;
import org.apache.log4j.Logger;
public abstract class MaterialAudiovisual extends Material
{
    protected String genero;
    protected int duracion_minutos;
    //inicializacion del logger
    static final Logger log = Logger.getLogger(MaterialAudiovisual.class);

    //constructor
    public MaterialAudiovisual(String codigo, String titulo, int unidades, String genero, int duracion)
    {
        super(codigo, titulo, unidades);
        this.genero = genero;
        this.duracion_minutos = duracion;
    }
    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public int getDuracion_minutos()
    {
        return duracion_minutos;
    }

    public void setDuracion_minutos(int duracion_minutos)
    {
        this.duracion_minutos = duracion_minutos;
    }
}