package Appareils;

public class TV implements HDMI {
    @Override
    public void view(byte[] data) {
        System.out.println("++++++Appareils.TV++++++");
        System.out.println(new String(data));
        System.out.println("++++++Appareils.TV++++++");
    }
}
