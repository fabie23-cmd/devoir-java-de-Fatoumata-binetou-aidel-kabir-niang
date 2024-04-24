package entities;
public class Rv {
    private int id;
    private String date;
    private String etat;
    private Patient patient;
private static int nbreRv;
    // navigabilité ==>ManyToOne
    public Rv(){
        nbreRv++;
        id=nbreRv;
    }
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String newDate) {
        this.date = newDate;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String newEtat) {
        this.etat = newEtat;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient newPatient) {
        this.patient = newPatient;
    }
}