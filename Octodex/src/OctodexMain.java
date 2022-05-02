public class OctodexMain {
    public static void main(String[] args) {
        Octodex cineasta, ejemplo, bombero, dj, superheroe;

        ejemplo = new Octodex("Maestro");
        cineasta = new Cineasta("Octodex", "Cineasta");
        bombero = new Bombero("Octodex", "Bombero");
        dj = new DJ("Octodex", "DJ");
        superheroe = new SuperHeroe("Octodex", "SuperHeroe");

        ejemplo.printMensaje();
        cineasta.printMensaje();
        bombero.printMensaje();
        dj.printMensaje();
        superheroe.printMensaje();
    }
}
