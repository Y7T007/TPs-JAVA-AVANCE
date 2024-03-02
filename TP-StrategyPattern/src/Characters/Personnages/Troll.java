package Characters.Personnages;

import Armes.ComportementArme;
import Armes.Comportements.ComportementHache;
import Armes.Comportements.ComportementPoignard;

public class Troll extends Characters.Personnage{
    public Troll() {
        super(new ComportementHache());
    }
}
