import java.util.Date;

public class Film {
    private String nom;
    private String synopsis;
    private Date outDate;

    public Film(String nom, String synopsis, Date outDate) {
        this.nom = nom;
        this.synopsis = synopsis;
        this.outDate = outDate;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public Date getOutDate() {
        return outDate;
    }
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }


}
