

public class UniteCentrale {

    private VGA VGA;



    public void Afficher(String message) {
        VGA.print(message);
    }


    public void setVGA(VGA VGA) {
        this.VGA = VGA;
    }
}
