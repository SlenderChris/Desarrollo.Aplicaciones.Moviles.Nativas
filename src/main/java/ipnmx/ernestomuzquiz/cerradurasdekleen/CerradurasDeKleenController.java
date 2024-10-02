package ipnmx.ernestomuzquiz.cerradurasdekleen;

import ipnmx.ernestomuzquiz.modelo.CerraduraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cerradura", method = RequestMethod.GET)
public class CerradurasDeKleenController {

    private final CerraduraService cerraduraService = new CerraduraService();

    @PutMapping("/estrella/{n}")
    public ResponseEntity<List<String>> cerrEst(@PathVariable int n) {
        List<String> res = cerraduraService.cerrKleene(n);
        return ResponseEntity.ok(res);
    }

    
    @PutMapping("/positiva/{n}")
    public ResponseEntity<List<String>> cerrPos(@PathVariable int n) {
        List<String> res = cerraduraService.cerrPos(n);
        return ResponseEntity.ok(res);
    }
}