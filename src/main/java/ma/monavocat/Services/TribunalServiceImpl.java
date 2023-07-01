package ma.monavocat.Services;

import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.Tribunal;
import ma.monavocat.Mappers.TribunalMapper;
import ma.monavocat.Repository.TribunalRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TribunalServiceImpl implements TribunalService {

    private final TribunalRepository tribunalRepository;
    private final TribunalMapper tribunalMapper = Mappers.getMapper(TribunalMapper.class);

    public TribunalServiceImpl(TribunalRepository tribunalRepository) {
        this.tribunalRepository = tribunalRepository;
    }


    public Tribunal creerTribunal ( TribunalDto tribunalDto){
        Tribunal tribunal = tribunalMapper.tribunalDtoToTribunal(tribunalDto);
        return tribunalRepository.save(tribunal) ;
    }

    public List<Tribunal> afficherListTribunal () {
        return  tribunalRepository.findAll();
    }


    @Override
    public TribunalDto save(TribunalDto tribunalDto) {
        return null;
    }

    @Override
    public TribunalDto update(TribunalDto s) {
        return null;
    }


    @Override
    public TribunalDto updateTribunal(TribunalDto s) {
        return null;
    }

    @Override
    public Boolean delete(TribunalDto s) {
        return null;
    }

    @Override
    public List<TribunalDto> selectAll() {
        return null;
    }
}
