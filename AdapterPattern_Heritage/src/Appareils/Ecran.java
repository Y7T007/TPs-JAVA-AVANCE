package Appareils;

public class Ecran implements VGA{
    @Override
    public void print(String message) {
        System.out.println("++++++ECRAN++++++");
        System.out.println( message);
        System.out.println("++++++ECRAN++++++");
    }


}
