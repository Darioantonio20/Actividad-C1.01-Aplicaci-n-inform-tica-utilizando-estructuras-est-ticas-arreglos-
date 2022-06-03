import java.util.ArrayList;

public class Vehiculo {
    private StringBuilder placas;
    private StringBuilder modelo;
    private StringBuilder numeroTaxi;
    private int ganancias = 0;
    private ArrayList<Chofer> choferes = new ArrayList<>();
    Vehiculo(StringBuilder placas, StringBuilder modelo, StringBuilder numeroTaxi) {
        this.placas = placas;
        this.modelo = modelo;
        this.numeroTaxi = numeroTaxi;
    }
    public StringBuilder getPlacas() {
        return placas;
    }
    public void setPlacas(StringBuilder placas) {
        this.placas = placas;
    }
    public StringBuilder getModelo() {
        return modelo;
    }
    public void setModelo(StringBuilder modelo) {
        this.modelo = modelo;
    }
    public StringBuilder getNumeroTaxi() {
        return numeroTaxi;
    }
    public void setNumeroTaxi(StringBuilder numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }
    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }
    public void setChoferes(Chofer chofer) {
        this.choferes.add(chofer);
    }
    public int getGanancias() {
        return ganancias;
    }
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
    @Override
    public String toString() {
        return "Placa: " + placas + " | " + "Modelo: " + modelo + " | " + "Numero Taxi: " + numeroTaxi + " "
                + "Chofer: " + getChoferes();
    }
}
