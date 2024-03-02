public class Main {
    public static void main(String[] args) {

        Characters.Personnage roi = new Characters.Personnages.Roi();
        Characters.Personnage reine = new Characters.Personnages.Reine();
        Characters.Personnage troll = new Characters.Personnages.Troll();
        Characters.Personnage chevalier = new Characters.Personnages.Chevalier();


        roi.utiliserArme();
        reine.utiliserArme();
        troll.utiliserArme();
        chevalier.utiliserArme();
    }
}