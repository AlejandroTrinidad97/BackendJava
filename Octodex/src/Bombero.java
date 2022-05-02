public class Bombero extends Octodex {

    private String nombre, profesion;

    public Bombero(String nombre, String profesion){
        super(nombre);
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public void printMensaje(){
        //super.printMensaje();
        System.out.println("Soy "+ nombre + " " + getProfesion() +" que apaga el fuego");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
