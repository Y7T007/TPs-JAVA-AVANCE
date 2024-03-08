import java.util.ArrayList;
import java.util.List;

public class GPS implements Observable {

    int position;
    String precision;
    List<Observer> observers= new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setPosition(int position) {
        this.position = position;
        notifyObservers();
    }

    public void setPrecision(String precision) {
        this.precision = precision;
        notifyObservers();
    }

    public int getPosition() {
        return position;
    }

    public String getPrecision() {
        return precision;
    }

    public void setMesure(int position, String precision) {
        this.position = position;
        this.precision = precision;
        notifyObservers();
    }

}
