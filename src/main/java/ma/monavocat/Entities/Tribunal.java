package ma.monavocat.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tribunal  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String adresse ;
    private String nom ;
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tribunal")
    private List<Dossier> dossiers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Dossier> getDossiers() {
        return dossiers;
    }

    public void setDossiers(List<Dossier> dossiers) {
        this.dossiers = dossiers;
    }

    public Tribunal() {
    }

    public Tribunal(Long id, String adresse, String nom, String type, List<Dossier> dossiers) {
        this.id = id;
        this.adresse = adresse;
        this.nom = nom;
        this.type = type;
        this.dossiers = dossiers;
    }
}
