package com.ieschabas;

/**Clase que muestra informacion sobre titulo,autor y paginas de un libro
 * @Author Alejandro Pérez
 * version 1.0
 */
public class Libro {


    //Atributos

    public String titulo;
    public String autor;
    public int paginas;

    //Constructor
    /**
     * Constructor por defecto para la clase Libro que crea instancia de titulo, autor y numero paginas
     */

    public Libro(String titulo, String autor, int paginas){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }

    //Getters
    /**
     * Devuelve el titulo sobre objeto libro
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Devuelve el autor sobre objeto libro
     * @return autor
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Devuelve paginas sobre objeto libro
     * @return paginas
     */
    public int getPaginas(){
        return paginas;
    }

    //Setters
    /**
     * Inserta el titulo sobre el objeto libro
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Inserta el autor sobre el objeto libro
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Inserta paginas sobre el objeto libro
     * @param paginas
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    //Metoo que imprime tutulo, autor y paginas

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}

