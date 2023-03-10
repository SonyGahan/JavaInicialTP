package trabajogrupal;


public class Participante {
    //Atributos
    private String nombre;
    private Pronostico[] pronosticos;
    
    //Metodos
    
    
    //Constructor
    public Participante(String nombre, Pronostico[] pronosticos) {
        this.nombre = nombre;
        this.pronosticos = pronosticos;
    }
    
    public Participante() {
        this.nombre = "";
        //this.pronosticos = ;
    }
    
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronostico[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(Pronostico[] pronosticos) {
        this.pronosticos = pronosticos;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", pronosticos=" + pronosticos + '}';
    }
    
}
