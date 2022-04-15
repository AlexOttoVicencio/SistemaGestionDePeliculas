
package modelo;


public class Cine {
    
    private String nombreCine;//nombre del cine
    private String direccionCine;//lugar donde esta el cine 

   
// constructor por defecto
    public Cine() {
    }

//este constructor instasncia la variable
    public Cine(Cine cine) {
        this.nombreCine = cine.nombreCine;
        this.direccionCine = cine.direccionCine;
    }
    //constructor con parametros
    public Cine(String nombreCine, String direccionCine){
        this.nombreCine=nombreCine;
        this.direccionCine=direccionCine;
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
    
    
    
   
    
    
}
