package ma.monavocat.Controllers;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.Dossier;
import ma.monavocat.Services.DossierServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dossier")
public class DossierController {
    private final static Logger LOGGER = LoggerFactory.getLogger(DossierController.class);
    private final DossierServiceImpl dossierServiceImpl;

    public DossierController(DossierServiceImpl dossierServiceImpl) {
        this.dossierServiceImpl = dossierServiceImpl;
    }

    @PostMapping
    public DossierDto save(@RequestBody DossierDto dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        return dossierServiceImpl.save(dto);
    }

    @PutMapping
    public DossierDto update(@RequestBody DossierDto dto) {
        return dossierServiceImpl.update(dto);
    }
    @GetMapping()
    public List<Dossier> afficherLesDossier() {
        return dossierServiceImpl.afficherListDossier();
    }
    @DeleteMapping
    public DossierDto delete(@RequestBody DossierDto dossierDto){
        return dossierServiceImpl.delete(dossierDto);
    }
}
