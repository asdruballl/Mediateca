package modelos;
import org.apache.log4j.Logger;

public class Revista extends MaterialEscrito
{
    //Atributos unicos
    private String periodicidad;
    private String fecha_publicacion;

    static final Logger log = Logger.getLogger(Revista.class);

    //constructor
    public Revista(String codigo, String titulo, int unidades, String editorial, String periodicidad, String fecha)
    {
        super(codigo, titulo, unidades, editorial);
        this.periodicidad = periodicidad;
        this.fecha_publicacion = fecha;
    }
    //Metodos
    @Override
    public void ingresarDatos()
    {
        log.info("Subiendo datos a registro de revistas: " + titulo);
    }
    @Override
    public void mostrarDatos()
    {
        System.out.println("Revista: " + titulo + " | Editorial: " + editorial + " | Fecha: " + fecha_publicacion);
    }

    //Getters y setters
    public String getPeriodicidad()
    {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad)
    {
        this.periodicidad = periodicidad;
    }

    public String getFecha_publicacion()
    {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion)
    {
        this.fecha_publicacion = fecha_publicacion;
    }
}
