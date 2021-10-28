package primerparcial.primerproblema;

public class Actor {

    //ATRIBUTOS

    String nombre;
    String apellido;
    String pais;
    int anioNacimiento;

    //CONSTRUCTORES

    public Actor(String nombre, String apellido, String pais, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
    }

    //METODOS
    public int calcularEdad(int anioActual){
        int edadActual;
        edadActual= anioActual - this.anioNacimiento;
        return edadActual;
    }

    @Override
    public String toString() {
        return "El actor se llama: " + this.nombre + ", su apellido es: " + this.apellido + " y proviene del pais:" + this.pais;
    }
}
