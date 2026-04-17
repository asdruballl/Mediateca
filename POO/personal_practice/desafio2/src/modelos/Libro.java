package modelos;
import org.apache.log4j.Logger;

public class Libro extends MaterialEscrito
{
    //Atributos unicos
    private String isbn;
    private String autor;
    private int num_paginas;
    private int anio_publicacion;

    static final Logger log = Logger.getLogger(Libro.class);

    //Constructor
    public Libro(String codigo, String titulo, int unidades, String editorial, String isbn, String autor, int paginas, int anio)
    {
        super(codigo, titulo, unidades, editorial);
        this.isbn = isbn;
        this.autor = autor;
        this.num_paginas = paginas;
        this.anio_publicacion = anio;
    }

    //Metodos
    @Override
    public void ingresarDatos()
    {
        log.info("Preparando datos para insertar libro: " + titulo);
    }
    @Override
    public void mostrarDatos()
    {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn);
    }

    //Getters y setters
    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
    this.autor = autor;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public int getNum_paginas()
    {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas)
    {
        this.num_paginas = num_paginas;
    }

    public int getAnio_publicacion()
    {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion)
    {
        this.anio_publicacion = anio_publicacion;
    }

}
