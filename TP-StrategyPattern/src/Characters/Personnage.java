package Characters;

import Armes.ComportementArme;

public abstract class Personnage  {
    private ComportementArme arme;

    public Personnage(ComportementArme arme) {
        this.arme = arme;
    }

    public void utiliserArme() {
        arme.utiliserArme();
    }

    public void setArme(ComportementArme a) {
        this.arme = a;
    }
}