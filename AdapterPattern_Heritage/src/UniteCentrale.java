import Appareils.VGA;

public class UniteCentrale {

    private Appareils.VGA VGA;



    public void Afficher(String message) {
        VGA.print(message);
    }


    public void setVGA(VGA VGA) {
        this.VGA = VGA;
    }
}
