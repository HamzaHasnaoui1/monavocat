package ma.monavocat.Repository;

import ma.monavocat.Entities.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DossierRepository extends JpaRepository <Dossier, Long> {

    Optional<Dossier> findByNumeroDossier(String numeroDossier);
}
