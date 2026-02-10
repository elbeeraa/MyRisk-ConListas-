package ed.masanz.ut6.ArrayList.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo<T> {
    private List<T> mazo;

    public Mazo() {
        mazo = new ArrayList<>();
    }

    public void meter(T tarjeta){
        mazo.add(tarjeta);
    }

    public T sacar(){
        if(mazo.isEmpty()){
            return null;
        }
        return mazo.remove(0);
    }

    public void barajar(){
        Collections.shuffle(mazo);
    }

    public int tamanio(){
        return mazo.size();
    }
}
