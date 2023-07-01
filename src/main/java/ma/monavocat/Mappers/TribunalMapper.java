package ma.monavocat.Mappers;

import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.Tribunal;
import org.mapstruct.Mapper;

@Mapper
public interface TribunalMapper {
    Tribunal tribunalDtoToTribunal (TribunalDto tribunalDto);
}
