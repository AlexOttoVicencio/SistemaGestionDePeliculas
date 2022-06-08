package controlador;
import java.io.*;
import modelo.Pelicula;
import modelo.Cine;

/**
 *
 * @author OS
 */
//funcion main
public class PruebaDatos {
    
      public static void main(String arg[])throws IOException{
    
          //arreglos de clases para almacenar datos
          Pelicula[] peliculas = new Pelicula[3]; 
          Cine cine1 = new Cine();
          
          //inicializo las variables de los array de clases
          
          for(int i =0;i<peliculas.length;i++){
              peliculas[i] = new Pelicula();
          }
          //lleno los array y los imprimo para verificar
          
          cine1.setDireccionCine("av pedro montt");
          cine1.setNombreCine("Hoyts Valparaiso");
          
          peliculas[0].setClasificacion("terror");
          peliculas[0].setNombrePelicula("2012");
          peliculas[0].setDirector("jaun perez");
          peliculas[0].setAnio(2012);
          peliculas[0].setDuracion(99);
          peliculas[0].setEdad(16);
          
          cine1.getMap().put(peliculas[0].getNombrePelicula(),peliculas[0]);
          
          peliculas[1].setClasificacion("fantasia");
          peliculas[1].setNombrePelicula("poltergeist");
          peliculas[1].setDirector("kubrick");
          peliculas[1].setAnio(1987);
          peliculas[1].setDuracion(70);
          peliculas[1].setEdad(14);
          
          cine1.getMap().put(peliculas[1].getNombrePelicula(),peliculas[1]);
          
          
          peliculas[2].setClasificacion("anime");
          peliculas[2].setNombrePelicula("Goku vs minions");
          peliculas[2].setDirector("Takeshi yamamoto");
          peliculas[2].setAnio(2021);
          peliculas[2].setDuracion(140);
          peliculas[2].setEdad(0);
          
          cine1.getMap().put(peliculas[2].getNombrePelicula(), peliculas[2]);
          
          //ahora los muestro con los getters
          
          for(int i=0;i<peliculas.length;i++){
              
              System.out.println("Pelicula: " + peliculas[i].getNombrePelicula() + " Director: "+ peliculas[i].getDirector() + " Genero: " + peliculas[i].getClasificacion());
              System.out.println("Ano: " + peliculas[i].getAnio() + " Duracion: "+ peliculas[i].getDuracion()+ " Edad: " + peliculas[i].getEdad());

          }
          System.out.println("\n");
          cine1.mostrarPeliculasEnCine();
          
}
    
}
