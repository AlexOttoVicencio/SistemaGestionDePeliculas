package controlador;
import java.io.*;
import modelo.Cine;
import modelo.Pelicula;

/**
 *
 * @author OS
 */
//funcion main
public class PruebaDatos {
    
      public static void main(String arg[])throws IOException{
    
          //arreglos de clases para almacenar datos
          Pelicula[] peliculas = new Pelicula[3]; 
          Cine[] cines = new Cine[3];
          
          //inicializo las variables de los array de clases
          
          for(int i =0;i<peliculas.length;i++){
              peliculas[i] = new Pelicula();
              cines[i] = new Cine();
          }
          //lleno los array y los imprimo para verificar
          
          cines[0].setDireccionCine("av pedro montt");
          cines[0].setNombreCine("Hoyts");
          
          peliculas[0].setClasificacion("terror");
          peliculas[0].setNombrePelicula("2012");
          peliculas[0].setDirector("jaun perez");
          peliculas[0].setAnio(2012);
          peliculas[0].setDuracion(99);
          peliculas[0].setEdad(16);
          
          cines[1].setDireccionCine("15 norete 112");
          cines[1].setNombreCine("Cinemark");
          
          peliculas[1].setClasificacion("fantasia");
          peliculas[1].setNombrePelicula("poltergeist");
          peliculas[1].setDirector("kubrick");
          peliculas[1].setAnio(1987);
          peliculas[1].setDuracion(70);
          peliculas[1].setEdad(14);
          
          cines[2].setDireccionCine("av condell 5678");
          cines[2].setNombreCine("condell");
          
          peliculas[2].setClasificacion("anime");
          peliculas[2].setNombrePelicula("Goku vs minions");
          peliculas[2].setDirector("Takeshi yamamoto");
          peliculas[2].setAnio(2021);
          peliculas[2].setDuracion(140);
          peliculas[2].setEdad(0);
          
          
          //ahora los muestro con los getters
          
          for(int i=0;i<peliculas.length;i++){
              System.out.println("Cine: " + cines[i].getNombreCine() + " Direccion: " + cines[i].getDireccionCine());
              System.out.println("Pelicula: " + peliculas[i].getNombrePelicula() + " Director: "+ peliculas[i].getDirector() + " Genero: " + peliculas[i].getClasificacion());
              System.out.println("Año: " + peliculas[i].getAnio() + " Duracion: "+ peliculas[i].getDuracion()+ " Edad: " + peliculas[i].getEdad());

          }
}
    
}
