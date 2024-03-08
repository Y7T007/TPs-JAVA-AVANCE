public class DisplayResume implements Observer{
    public void update(Observable obs) {
        if (obs instanceof GPS) {
            GPS gps = (GPS) obs;
            System.out.println("DisplayResume: Position - " + gps.getPosition());
        }
    }
}