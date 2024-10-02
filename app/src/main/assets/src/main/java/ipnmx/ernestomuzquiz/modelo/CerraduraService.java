package ipnmx.ernestomuzquiz.modelo;

import java.util.ArrayList;
import java.util.List;

public class CerraduraService {

    private List<String> genCadBin(int n) {
        List<String> cads = new ArrayList<>();
        int max = (int) Math.pow(2, n);

        for (int i = 0; i < max; i++) {
            String bina = Integer.toBinaryString(i);
            while (bina.length() < n) {
                bina = "0" + bina;
            }
            cads.add(bina);
        }
        return cads;
    }

    public List<String> cerrKleene(int n) {
        List<String> res = new ArrayList<>();
        res.add("");  // Agregar la cadena vacía
        res.addAll(genCadBin(n));
        return res;
    }

    public List<String> cerrPos(int n) {
        return genCadBin(n);
    }
}