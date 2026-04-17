package modelos;
import org.apache.log4j.Logger;

public abstract class Material
{
    //Atributos
    protected String codigo_identificacion;
    protected String titulo;
    protected int unidades_disponibles;

    static final Logger log = Logger.getLogger(Material.class);
    //Constructor
    public Material (String codigo, String titulo, int unidades)
    {
        this.codigo_identificacion = codigo;
        this.titulo = titulo;
        this.unidades_disponibles = unidades;
    }
    //Metodos
    public abstract void ingresarDatos();
    public abstract void mostrarDatos();

    //Getter y setters
    public String getCodigo_identificacion()
    {
        return codigo_identificacion;
    }

    public void setCodigo_identificacion(String codigo)
    {
        this.codigo_identificacion = codigo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getUnidades_disponibles()
    {
        return unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades) {
        this.unidades_disponibles = unidades;
    }
}
