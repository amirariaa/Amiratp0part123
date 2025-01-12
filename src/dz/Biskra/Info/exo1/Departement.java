package dz.Biskra.Info.exo1;

import java.util.ArrayList;
import java.util.List;
class Departement {
    private String specialite;
    private String adresse;
    private List<Etudiant> etudiants;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiants = new ArrayList<>();
    }

    public void inscrire(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void desinscrire(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Departement{" +
                "specialite='" + specialite + '\'' +
                ", adresse='" + adresse + '\'' +
                ", etudiants=[\n");
        for (Etudiant e : etudiants) {
            sb.append(e).append("\n");
        }
        sb.append("]}");
        return sb.toString();
    }
    
    
}
