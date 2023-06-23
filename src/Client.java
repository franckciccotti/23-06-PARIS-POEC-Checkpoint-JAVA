import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String email;
    private List<String> reservationsList = new ArrayList<>();

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(List<String> reservationsList) {
        this.reservationsList = reservationsList;
    }

    public void reserve(Seance seance, Salle salle, String place){

    }

}
