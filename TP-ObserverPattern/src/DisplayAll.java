public class DisplayAll implements Observer{
    public void update(Observable obs) {
        if (obs instanceof GPS) {
            GPS gps = (GPS) obs;
            System.out.println("DisplayAll: Position - " + gps.getPosition() + ", Precision - " + gps.getPrecision());
        }
    }
}