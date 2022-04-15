/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Pelicula {
    
    private String nombrePelicula;//nombre de la pelicula
    private String director;//director del cine
    private String clasificacion;//que tipo de peli es
    private int anio;//año de estreno de la pelicula
    private int duracion;//duracion de la pelicula en min (se aproxima si necesario)
    private int edad;//edad minima para verl al pelicula
    
    
//constructores
    public Pelicula(){
        
    }
    
    //este constructor instasncia la variable
    public Pelicula(Pelicula pelicula) {
        this.nombrePelicula = pelicula.nombrePelicula;
        this.director = pelicula.director;
        this.clasificacion = pelicula.clasificacion;
        this.anio = pelicula.anio;
        this.duracion = pelicula.duracion;
        this.edad = pelicula.edad;
    }
   
    //constructor con parametros
    public Pelicula(String nombrePelicula, String director, String clasificacion, int anio, int duracion, int edad) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.clasificacion = clasificacion;
        this.anio = anio;
        this.duracion = duracion;
        this.edad = edad;
    }
    
    

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
            
    
    
}
