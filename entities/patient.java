public class Main {
    public static void main(String[] args) {

    }
}

class Patient {
    private int id;
    private String nomComplet;
    private String tel;
    private Rv[] rvList; // Tableau de rendez-vous
    private int nbreRv; // Nombre de rendez-vous

    public Patient() {
        // Constructeur par défaut
        rvList = new Rv[10]; // Initialisez la taille du tableau selon vos besoins
        nbreRv = 0;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        if (newId > 0) {
            id = newId;
        }
    }

    public String getNom() {
        return nomComplet;
    }

    public void setNom(String newNom) {
        if (!newNom.isEmpty()) {
            nomComplet = newNom;
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String newTel) {
        tel = newTel;
    }

    // Méthode pour ajouter un rendez-vous à la liste
    public void addRv(Rv newRv) {
        if (nbreRv < rvList.length) {
            rvList[nbreRv] = newRv;
            nbreRv++;
        } else {
            System.out.println("La liste des rendez-vous est pleine.");
        }
    }

    // Méthode pour afficher les informations du patient
    public String affiche() {
        return "ID: " + getId() + ", Nom: " + getNom() + ", Tel: " + getTel();
    }
}


