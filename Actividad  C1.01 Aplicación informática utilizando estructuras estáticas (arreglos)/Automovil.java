public class Automovil {

    private String placas;
    private String modelo;
    private String numeroTaxi;
    private int ganancias = 0;
    private int index_taxista = 0;
    private  Taxista[] taxista = new Taxista[10];

    Automovil(String placas, String modelo, String numeroTaxi) {
        this.placas = placas;
        this.modelo = modelo;
        this.numeroTaxi = numeroTaxi;
    }

    public int getIndex_taxista(){
        return index_taxista;
    }

    public String getPlacas() {
        return placas;
    }
    
    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public Taxista[] getTaxista() {
        return taxista;
    }

    public void setTaxista(Taxista taxista2) {
        this.taxista[index_taxista] = taxista2;
        index_taxista++;
    }

    public String getModelo() {
        return modelo;
    }	

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }	

    public String getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(String numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    @Override
    public String toString() {
        String taxistas = "";
        for(int i = 0; i<taxista.length; i++){
            if(taxista[i] != null){
                taxistas = taxistas + taxista[i] + ", ";
            }
        }
        return "Placa: " + placas + " | " + "Modelo: " + modelo + " | " + "Numero Taxi: " + numeroTaxi + " "
                + "Chofer(es): " + taxistas;
    }

}
