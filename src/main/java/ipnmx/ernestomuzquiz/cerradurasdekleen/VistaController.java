package ipnmx.ernestomuzquiz.cerradurasdekleen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistaController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}