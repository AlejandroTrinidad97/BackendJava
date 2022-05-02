public class Hogwarts {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Casas harry = new Casas(
                "Harry Potter",
                "Griffindor",
                "Hombre",
                "Dementor",
                "Ciervo"
        );
        Casas hermione = new Casas(
                "Hermione Granger",
                "Griffindor",
                "Mujer",
                "La profesora McGonagall diciéndole que reprobó todo",
                "Nutria"
        );
        Casas luna = new Casas(
                "Luna Lovegood",
                "Ravenclaw",
                "Mujer",
                "Desconocido...",
                "Liebre"
        );
        Casas newt = new Casas(
                "Newton Scamander",
                "Hufflepuff",
                "Hombre",
                "Tener que trabajar en una oficina",
                "Desconocido..."
        );
        Casas draco = new Casas(
                "Draco Malfoyr",
                "Slytherin",
                "Hombre",
                "Desconocido...",
                "Desconocido..."
        );

        harry.Gryffindor(screen, "img1.gif");
        hermione.Gryffindor(screen, "img2.gif");
        luna.Ravenclaw(screen, "img3.gif");
        newt.Hufflepuff(screen, "img4.gif");
        draco.Slytherin(screen, "img5.gif");
    }
}
