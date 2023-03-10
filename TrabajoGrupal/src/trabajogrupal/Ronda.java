package trabajogrupal;


public class Ronda {
    //Atributos
    private int nro;
    private Partido[] partidos;
    
    
    //Metodos
    
    //Constructor

    public Ronda(int nro, Partido[] partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }
    
    public Ronda() {
        this.nro = 0;
        //this.partidos = partidos;
    }
    
    //Getters and Setters

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }
    
    //toString

    @Override
    public String toString() {
        return "Ronda{" + "nro=" + nro + ", partidos=" + partidos + '}';
    }
    
}
