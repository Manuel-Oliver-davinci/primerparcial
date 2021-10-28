package primerparcial.primerproblema;

public class Main {
    public static void main(String[] args) {
        Actor primerActor = new Actor("Manuel","Oliver","Argentina",1980);
        Actor segundoActor= new Actor("Oliver","Nacher","Argentina",1980);
        Actor tercerActor= new Actor("Manuel","Nacher","Argentina",1980);
        Actor cuartoActor= new Actor("Nacher","Oliver","Argentina",1980);

        Pelicula primerPelicula = new Pelicula("Titanic",120,2000,"Romance");
        Pelicula segundaPelicula = new Pelicula("Rey Leon",120,2000,"Romance");

        Cine nuevoCine= new Cine("Nuevo Cine","Buenos Aires");

        primerPelicula.agegarActores(primerActor);
        primerPelicula.agegarActores(segundoActor);
        primerPelicula.mostrarActores();

        segundaPelicula.agegarActores(tercerActor);
        segundaPelicula.agegarActores(cuartoActor);
        segundaPelicula.mostrarActores();


        nuevoCine.agregarPelicula(primerPelicula);
        nuevoCine.agregarPelicula(segundaPelicula);

        nuevoCine.mostrarPelicula();



}
}
