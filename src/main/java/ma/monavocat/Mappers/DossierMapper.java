package ma.monavocat.Mappers;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.Dossier;
import org.mapstruct.Mapper;

@Mapper
public interface DossierMapper {
    Dossier dossierDtotoDossier(DossierDto dossierDto);
    DossierDto dossiertoDossierDto (Dossier dossier);

}
