package ma.monavocat.Controllers;

import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.Tribunal;
import ma.monavocat.Services.TribunalServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tribunal")
public class TribunalController {
    private final static Logger LOGGER= LoggerFactory.getLogger(TribunalController.class);
    private final TribunalServiceImpl tribunalServiceImpl;

    public TribunalController(TribunalServiceImpl tribunalServiceImpl) {
        this.tribunalServiceImpl = tribunalServiceImpl;
    }

    @PostMapping()
    public Tribunal creerTribunal(@RequestBody TribunalDto tribunalDto) {
        return tribunalServiceImpl.creerTribunal(tribunalDto);
    }

    @GetMapping()
    public List<Tribunal> afficherLesTribunaux() {
        return tribunalServiceImpl.afficherListTribunal();
    }
    @PutMapping
    public TribunalDto updateTribunal(@RequestBody TribunalDto tribunalDto) {
        return tribunalServiceImpl.updateTribunal(tribunalDto);
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") long id) {
        LOGGER.debug("start method select by id {}",id);
        TribunalDto idcomp =new TribunalDto(id);
        return tribunalServiceImpl.delete(idcomp);
    }


}
