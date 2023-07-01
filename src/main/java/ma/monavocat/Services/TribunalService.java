package ma.monavocat.Services;

import ma.monavocat.Dtos.TribunalDto;

import java.util.List;

public interface TribunalService {
    TribunalDto save(TribunalDto tribunalDto);

    TribunalDto update(TribunalDto s);

    TribunalDto updateTribunal(TribunalDto s);

    Boolean delete(TribunalDto s );

    List<TribunalDto> selectAll();
}
