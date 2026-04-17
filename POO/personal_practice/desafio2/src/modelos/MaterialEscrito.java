package modelos;
import org.apache.log4j.Logger;
public abstract class MaterialEscrito extends Material
{
    //atributos
    protected String editorial;

    static final Logger log = Logger.getLogger(MaterialEscrito.class);

    //constructor
    public MaterialEscrito(String codigo, String titulo, int unidades, String editorial)
    {
        super(codigo, titulo, unidades);
        this.editorial = editorial;
    }
    //Getters y setters
    public String getEditorial()
    {
        return editorial;
    }
    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }
}
