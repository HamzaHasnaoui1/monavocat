package ma.monavocat.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String numeroDossier;
    private String numeroDossierTribunal;
    private String observation ;
    private String etat ;
    private String type;
    private String description ;

    @JoinColumn(name = "tribunal_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tribunal tribunal;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dossier")
    private List<DossierAvocat> dossierAvocats;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dossier")
    private List<DossierAdversaire> dossierAdversaires;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dossier")
    private List<DossierClient> dossierClients;

}
