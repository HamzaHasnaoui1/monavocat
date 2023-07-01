package ma.monavocat.Services;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.Dossier;

import java.util.List;

public interface DossierService {
        DossierDto save(DossierDto dossierDto);

        DossierDto update(DossierDto dossierDto);

        DossierDto delete(DossierDto dossierDto );

        List<DossierDto> selectAll();

    List<Dossier> afficherListDossier();

}

