import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Taxista[] nuevosTaxista = new Taxista[10];
        Automovil[] nuevosAutomovil = new Automovil[10];
        menu(nuevosTaxista, nuevosAutomovil);
    }

    static void menu(Taxista[] nuevosTaxista,Automovil[] nuevosAutomovil) {
        
        Scanner entrada1 = new Scanner(System.in);
        boolean status = false;
        int index_chofer = 0;
        int index_vehiculo = 0;
        do {
            System.out.println("\nMenu de opciones");
            System.out.println("1. Alta de vehiculo");
            System.out.println("2. Alta de choferes");
            System.out.println("3. Asignacion de choferes a vehiculos");
            System.out.println("4. Ver ganancias generadas por cada unidad vehicular.");
            System.out.println("5. ver lista de unidades con los choferes asignados al momento del registro");
            System.out.println("6. salir del programa");
            System.out.println("Por favor seleccione un opcion: \n");
            String value = entrada1.next();

            if (value.equals("6")) {
                status = true;
            } else if (value.equals("1")) {
                altaVehiculo(nuevosAutomovil, index_vehiculo);
            } else if (value.equals("2")) {
                altaChofer(nuevosTaxista, index_chofer);
            } else if (value.equals("3")) {
                asignacion(nuevosAutomovil,nuevosTaxista);
            } else if (value.equals("4")) {
                mostrarGanancias(nuevosAutomovil);
            } else if (value.equals("5")) {
                listaVehiculo(nuevosAutomovil);
            }

        } while (!status);
    }

    static void altaVehiculo(Automovil[] nuevosAutomovil, int i) {
        if(i < nuevosAutomovil.length){
            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Ingrese sus placas");
            String placas = entrada2.nextLine();
    
            System.out.println("Ingrese su modelo");
            String modelo = entrada2.nextLine();
    
            System.out.println("Ingrese el numero de taxi");
            String numeroTaxi = entrada2.nextLine();
    
            Automovil newAutomovil = new Automovil(placas, modelo, numeroTaxi);
            nuevosAutomovil[i] = newAutomovil;
            i++;
        } else {
            System.out.println("No se pueden agregar más Automoviles");
        }
    }

    static void altaChofer(Taxista[] nuevosTaxista,int i) {
        if (i < nuevosTaxista.length){
            Scanner entrada3 = new Scanner(System.in);

            System.out.print("Ingrese el nombre: ");
            String nombre = entrada3.nextLine();
    
            System.out.print("Ingrese el apellido: ");
            String apellido = entrada3.nextLine();
    
            System.out.print("Ingrese la edad: ");
            int edad = entrada3.nextInt();
            System.out.print("Ingrese el genero (M o F): ");
            char genero = entrada3.next().charAt(0);
    
            Taxista newTaxista = new Taxista(nombre, apellido, edad, genero);
            nuevosTaxista[i] = newTaxista;
            i++;
        } else{
            System.out.println("No se pueden agregar más taxistas");
        }
    }

    static void asignacion(Automovil[] nuevosAutomovil,Taxista[] nuevosTaxista) {
        Scanner entrada4 = new Scanner(System.in);
        int posicionVehiculo = 0;
        int posicionChofer = 0;

        for (int i = 0; i < nuevosAutomovil.length; i++) {
            if(nuevosAutomovil[i] != null){
                System.out.println(i + " " + nuevosAutomovil[i]);
            }
        }

        System.out.println("selecion la posicion del vehiculo");
        posicionVehiculo = entrada4.nextInt();

        for (int i = 0; i < nuevosTaxista.length; i++) {
            if (nuevosTaxista[i] != null){
                System.out.println(i + " " + nuevosTaxista[i].toString());
            }
        }

        System.out.println("selecione la posicion del chofer");
        posicionChofer = entrada4.nextInt();

        Taxista taxista = nuevosTaxista[posicionChofer];
        Automovil automovil = nuevosAutomovil[posicionVehiculo];
        Random random = new Random();
        
        if(automovil.getIndex_taxista() < automovil.getTaxista().length){
            automovil.setTaxista(taxista);
            automovil.setGanancias(automovil.getGanancias() + (random.nextInt(100 + 10) + 10));
        } else {
            System.out.println("Este vehiculo no puede contener más choferes");
        }
        

    }

    static void mostrarGanancias(Automovil[] nuevosAutomovil) {
        for (Automovil vehiculo : nuevosAutomovil) {
            if (vehiculo != null){
                System.out.println("Placa: " + vehiculo.getPlacas() + " | Numero taxi: " + vehiculo.getNumeroTaxi()
                + " | Ganacias: " + vehiculo.getGanancias());
            }
        }
    }

    static void listaVehiculo(Automovil[] vehiculos) {
        System.out.println("Listando vehiculos con choferes");

        for (int x = 0; x < vehiculos.length; x++) {
            if(vehiculos[x] != null){
                System.out.println(vehiculos[x].toString() + "\n");
            }
		}
    }

}
