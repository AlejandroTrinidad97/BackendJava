public class Octodex {
    private String profesion;

    public Octodex(String profesion){
        this.profesion = profesion;
    }

    public void printMensaje(){
        System.out.println("Soy Octodex, pero tambien soy: " + this.getProfesion());
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) { this.profesion = profesion; }

}
