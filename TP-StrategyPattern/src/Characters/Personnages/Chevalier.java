package Characters.Personnages;

import Armes.ComportementArme;
import Armes.Comportements.ComportementArcEtFleche;
import Armes.Comportements.ComportementPoignard;

public class Chevalier extends Characters.Personnage {
    public Chevalier() {
        super(new ComportementArcEtFleche());
    }
}
