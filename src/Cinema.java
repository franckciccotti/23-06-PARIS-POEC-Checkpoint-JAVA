import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {
    private String name;
    private String address;

    private List<Film> films = new ArrayList<>();
    private List<Seance> seancesList = new ArrayList<>();
    private List<Salle> sallesList = new ArrayList<>();

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = adress;
    }

    public List<Film> getFilms() {
        return films;
    }
    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film){
        films.add(film);
    }
    public void removeFilm(Film film){

    }

    public void scheduleSeance(Film film, Date seanceDate, Time seanceTime, Salle salle){

    }
    public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date) {

        return null;
    }
    public void addSalle(Salle salle) {
    }
}
