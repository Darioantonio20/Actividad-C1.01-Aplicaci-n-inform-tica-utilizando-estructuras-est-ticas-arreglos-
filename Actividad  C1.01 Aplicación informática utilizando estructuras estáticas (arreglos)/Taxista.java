public class Taxista {

    private String nombre;
    private String apellido;
    private int edad;
    private char genero;

    Taxista() {

    }

    Taxista( String nombre, String apellido, int edad, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +  " | Apellido: " + apellido  + " | Edad: " + edad + " | Genero: " +  genero;
    }
    
}
