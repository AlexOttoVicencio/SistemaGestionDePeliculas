
package modelo;

import java.util.*;



public class Cine {
    
    private String nombreCine;//nombre del cine
    private String direccionCine;//lugar donde esta el cine 
    private HashMap <String, Pelicula> peliculasDeCine;

   public Cine(){
       this.peliculasDeCine= new HashMap();
   }


//este constructor instasncia la variable
    public Cine(Cine cine) {
        this.nombreCine = cine.nombreCine;
        this.direccionCine = cine.direccionCine;
        this.peliculasDeCine= new HashMap();
    }
    //constructor con parametros
    public Cine(String nombreCine, String direccionCine){
        this.nombreCine=nombreCine;
        this.direccionCine=direccionCine;
        this.peliculasDeCine= new HashMap();
    }
    
    
//getters y setters

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public String getDireccionCine() {
        return direccionCine;
    }

    public void setDireccionCine(String direccionCine) {
        this.direccionCine = direccionCine;
    }
    
    //agregar peliculas al hashmap
    
    public void setMap(HashMap<String, Pelicula> peliculasDeCine) {
        this.peliculasDeCine = peliculasDeCine;
    }

    //getter mapa
    public HashMap<String, Pelicula> getMap() {
        return peliculasDeCine;
    }
    
 //metodos
public void mostrarPeliculasEnCine(){
    
    if(peliculasDeCine.isEmpty()){
        return;
    }
    
    Pelicula peli = new Pelicula();
    
    //iterar en mapa y mostrar las peliculas
    for(Map.Entry<String, Pelicula> set :peliculasDeCine.entrySet()){
        
        //imprimir todos los elementos-se los pasa a una peli y tmb se imprime
        
        peli= set.getValue();
        peli.mostrarPeli();
        System.out.println("\n");
        
    }
    
    
    
    
}
    
    
    
    
    
    
   
    
    
}
