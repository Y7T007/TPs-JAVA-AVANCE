package Characters.Personnages;

import Armes.ComportementArme;
import Armes.Comportements.ComportementPoignard;

public class Reine extends Characters.Personnage{
    public Reine() {
        super(new ComportementPoignard());
    }
}
