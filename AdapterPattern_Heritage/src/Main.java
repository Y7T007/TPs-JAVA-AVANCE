import Appareils.Ecran;
import Appareils.TV;
import Appareils.VP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Ecran ecran = new Ecran();
        VP vp = new VP();

        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVGA(ecran);
        uniteCentrale.Afficher("Hello world!");

        uniteCentrale.setVGA(vp);
        uniteCentrale.Afficher("Hello world!");

        AdapterVgaHdmi adapterVgaHdmi = new AdapterVgaHdmi();
        uniteCentrale.setVGA(adapterVgaHdmi);
        uniteCentrale.Afficher("Hello world!");

    }
}