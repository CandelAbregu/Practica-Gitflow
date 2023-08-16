package Vehiculos;

public class Avion extends Vehiculo {


        private final int max_altitud = 800;

       private int cantTurbinas;

       public Avion(){}

    public Avion(String patente, String chasis) {
        super(patente, chasis);
        this.cantTurbinas= cantTurbinas;

    }

    public int getMax_altitud() {
        return max_altitud;
    }

    public int getCantTurbinas() {
        return cantTurbinas;
    }

    public void setCantTurbinas(int cantTurbinas) {
        this.cantTurbinas = cantTurbinas;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "max_altitud=" + max_altitud +
                ", cantTurbinas=" + cantTurbinas +
                ", patente='" + patente + '\'' +
                ", chasis='" + chasis + '\'' +
                ", km=" + km +
                '}';
    }
}


