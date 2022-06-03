public class Chofer {
    //Almacenar caracteres o atributos del objeto a crear
    private StringBuilder nombre;
    private StringBuilder apellido;
    private int edad;
    private char genero;
    private int id;
    Chofer(){}
    Chofer(int id, StringBuilder nombre, StringBuilder apellido, int edad, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public StringBuilder getNombre() {
        return nombre;
    }
    public void setNombre(StringBuilder nombre) {
        this.nombre = nombre;
    }
    public StringBuilder getApellido() {
        return apellido;
    }
    public void setApellido(StringBuilder apellido) {
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
        return "id: " + id + " " + "Nombre: " + nombre + " | " + "Apellido: " + apellido + " | " + "Edad: " + edad
                + " | " + "Genero: " + genero;
    }
}
