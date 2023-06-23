import java.util.ArrayList;
import java.util.List;

public class Salle {
    private int capacity;
    public List<String> places = new ArrayList<>();

    public Salle(int capacity, List<String> places) {
        this.capacity = capacity;
        this.places = places;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
