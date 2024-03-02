package Characters.Personnages;

import Armes.ComportementArme;
import Armes.Comportements.ComportementPoignard;

public class Roi extends Characters.Personnage{



    public Roi() {
        super(new ComportementPoignard());
    }


}