package Armes.Comportements;

public class ComportementPoignard implements Armes.ComportementArme{
    @Override
    public void utiliserArme() {
        System.out.println("Attaque avec un poignard");
    }
}
