package ma.monavocat.Dtos;

public class TribunalDto {
    private String adresse ;
    private String nom ;
    private String type;

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

    public TribunalDto(String adresse, String nom, String type) {
        this.adresse = adresse;
        this.nom = nom;
        this.type = type;
    }

    public TribunalDto(long id) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TribunalDto{" +
                "adresse='" + adresse + '\'' +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
