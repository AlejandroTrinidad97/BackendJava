public class Casas extends Mago implements CasasActionCallbacks{
    public Casas(String nombre, String casa, String genero, String boggart, String patronus) {
        super(nombre, casa, genero, boggart, patronus);
    }

    @Override
    public void  Gryffindor(Screen s, String img) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28,Colors.FussionRed);
        s.showImage(img);
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void Hufflepuff(Screen s, String img) {
        //s.cls();
        //s.repaint();
        s.out(showMessage(),"Helvetica", 28,Colors.orange);
        s.showImage(img);
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void Ravenclaw(Screen s, String img) {
       //s.cls();
        //s.repaint();
        s.out(showMessage(),"Helvetica", 28,Colors.BlueHorizon);
        s.showImage(img);
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void Slytherin(Screen s, String img) {
        //s.cls();
        //s.repaint();
        s.out(showMessage(),"Helvetica", 28,Colors.ReptileGreen);
        s.showImage(img);
        s.setBounds(200,100,1100,900);
    }
}
