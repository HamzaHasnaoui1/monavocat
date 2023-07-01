package ma.monavocat.Entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DossierClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    @JoinColumn(name = "dossier_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dossier dossier ;
}
