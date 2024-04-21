import Appareils.TV;
import Appareils.VGA;

public class AdapterVgaHdmi extends TV implements  VGA  {

    @Override
    public void print(String message) {
        byte[] data = message.getBytes();
        System.out.println("------ADAPTEEER----------------");
        view(data);
        System.out.println("------ADAPTEEER----------------");
    }

}