import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static int id_auxiliar = 1;
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();
        ArrayList<Chofer> listaChofer = new ArrayList<>();
        menu(listaVehiculo, listaChofer);
    }
    static void menu(ArrayList<Vehiculo> listaVehiculo, ArrayList<Chofer> listaChofer) {
        Scanner entrada = new Scanner(System.in);
        boolean status = false;

        do{
            System.out.println("\nMenu de opciones");
            System.out.println("1. Alta de vehiculo");
            System.out.println("2. Alta de choferes");
            System.out.println("3. Asignacion de choferes a vehiculos");
            System.out.println("4. Ver ganancias generadas por cada unidad vehicular.");
            System.out.println("5. ver lista de unidades con los choferes asignados al momento del registro");
            System.out.println("6. salir del programa");
            System.out.println("Por favor seleccione un opcion: \n");
            String value = entrada.next();

            if (value.equals("6")) {
                status = true;
            } else if (value.equals("1")) {
                altaVehiculo(listaVehiculo);
            } else if (value.equals("2")) {
                altaChofer(listaChofer);
            } else if (value.equals("3")) {
                asignacion(listaVehiculo, listaChofer);
            } else if (value.equals("4")) {
                mostrarGanancias(listaVehiculo);
            } else if (value.equals("5")) {
                listaVehiculo(listaVehiculo);
            }
        } while (!status);
    }
    static void listaVehiculo(ArrayList<Vehiculo> lista) {
        System.out.println("Listando vehiculos con choferes");
        lista.forEach((v) -> {
            System.out.println(v.toString());
        });
    }
    static void asignacion(ArrayList<Vehiculo> listaVehiculo, ArrayList<Chofer> listaChofer) {
        AtomicInteger count = new AtomicInteger();

        Scanner entrada = new Scanner(System.in);
        int posicionVehiculo = 0;
        int posicionChofer = 0;
        //Recorrer los datos del array de la clase
        listaVehiculo.forEach((value) -> {
            System.out.println(count + " " + value.toString());
            count.incrementAndGet();
        });
        System.out.println("selecion la posicion del vehiculo");
        posicionVehiculo = entrada.nextInt();
        count.set(0);
        listaChofer.forEach((value) -> {
            System.out.println(count + " " + value.toString());
            count.incrementAndGet();
        });
        System.out.println("selecione la posicion del chofercito");
        posicionChofer = entrada.nextInt();
        Chofer c = listaChofer.get(posicionChofer);
        Vehiculo ve = listaVehiculo.get(posicionVehiculo);
        Random random = new Random();
        ve.setChoferes(c);
        ve.setGanancias(ve.getGanancias() + (random.nextInt(100 + 10) + 10));
    }
    static void altaVehiculo(ArrayList<Vehiculo> listaVehiculo) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese sus placaquitas");
        StringBuilder placas = new StringBuilder();
        placas.append(entrada.next());

        System.out.println("Ingrese su modelo del cochecito");
        StringBuilder modelo = new StringBuilder();
        modelo.append(entrada.next());

        System.out.println("Ingrese el numero de taxicisisito");
        StringBuilder numeroTaxi = new StringBuilder();
        numeroTaxi.append(entrada.next());
        listaVehiculo.add(new Vehiculo(placas, modelo, numeroTaxi));
    }
    static void altaChofer(ArrayList<Chofer> listaChofer) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombrecito: ");
        StringBuilder nombre = new StringBuilder();
        nombre.append(entrada.nextLine());
        System.out.print("Ingrese el apellido: ");
        StringBuilder apellido = new StringBuilder();
        apellido.append(entrada.nextLine());
        System.out.print("Ingrese la edad: ");
        String edadS = entrada.nextLine();
        System.out.print("Ingrese el genero M(masculino) ó F(femenino): ");
        char genero = entrada.next().charAt(0);
        int edad = entrada.nextInt();

        listaChofer.add(new Chofer(id_auxiliar, nombre, apellido, edad, genero));
        id_auxiliar++;
    }
    static void mostrarGanancias(ArrayList<Vehiculo> listaVehiculos) {
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("Plaquita: " + vehiculo.getPlacas() + " | Numero de taxicicito: " + vehiculo.getNumeroTaxi()
                    + " | Ganacias: " + vehiculo.getGanancias());
        }
    }
}