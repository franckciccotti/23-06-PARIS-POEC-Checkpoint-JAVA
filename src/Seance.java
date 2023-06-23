
import java.sql.Time;
import java.util.Date;

public class Seance {
    private Date seanceDate;
    private Time seanceTime;

    private Film film;
    private Salle salle;

    public Seance(Film film, Date seanceDate, Time seanceTime, Salle salle) {
        this.film = film;
        this.seanceDate = seanceDate;
        this.seanceTime = seanceTime;
        this.salle = salle;
    }

    public Date getSeanceDate() {
        return seanceDate;
    }

    public void setSeanceDate(Date seanceDate) {
        this.seanceDate = seanceDate;
    }

    public Time getSeanceTime() {
        return seanceTime;
    }

    public void setSeanceTime(Time seanceTime) {
        this.seanceTime = seanceTime;
    }


}
