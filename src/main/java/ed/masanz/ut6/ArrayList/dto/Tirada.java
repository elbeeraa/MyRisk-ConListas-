package ed.masanz.ut6.ArrayList.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tirada {

    private List<Integer> valores;
    Dado dado;

    public Tirada() {
        this.dado = new Dado();
        this.valores = new ArrayList<>();
    }

    public List<Integer> tirarDados(int veces){
        valores.clear();
        for (int i = 0; i < veces; i++) {
            valores.add(Dado.getValor());
        }
        Collections.sort(valores, Collections.reverseOrder());
        return valores;
    }

    public DosValores perdidas(Tirada otra){
        int perdidasAtacante = 0;
        int perdidasDefensor = 0;
        int tamMin = Math.min(valores.size(), otra.valores.size());
        for (int i = 0; i < tamMin; i++) {
            int v1 = valores.get(i);
            int v2 = otra.valores.get(i);
            if(v1 <= v2){
                perdidasAtacante++;
            } else {
                perdidasDefensor++;
            }
        }

        return new DosValores(perdidasAtacante,perdidasDefensor);
    }

    public static void main(String[] args) {
        testTirada(2,3);
    }


    public static void testTirada(int n, int m){
        Tirada t1 = new Tirada();
        List<Integer> valores1 = t1.tirarDados(n);
        System.out.println(valores1);
        Tirada t2 = new Tirada();
        List<Integer> valores2 = t1.tirarDados(m);
        System.out.println(valores2);


        DosValores dv = t1.perdidas(t2);
        System.out.println(dv);
    }
}
