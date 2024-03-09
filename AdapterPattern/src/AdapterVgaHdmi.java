public class AdapterVgaHdmi implements VGA {
    private HDMI hdmi;
    public AdapterVgaHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
    @Override
    public void print(String message) {
        byte[] data = message.getBytes();
        System.out.println("------ADAPTEEER----------------");
        hdmi.view(data);
        System.out.println("------ADAPTEEER----------------");

    }
}
