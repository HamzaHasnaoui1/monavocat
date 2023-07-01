package ma.monavocat.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DossierAvocat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "dossier_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dossier dossier;

    @JoinColumn(name = "avocat_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Avocat avocat;
}
