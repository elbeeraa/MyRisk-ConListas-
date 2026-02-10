package ed.masanz.ut6.ArrayList.dto;

import java.util.ArrayList;
import java.util.List;

public class Territorio {

    private String nombre;
    private Jugador propietario;
    private int ejercitos;
    private List<String> vecinos;

    public Territorio(String nombre) {
        this.nombre = nombre;
        this.propietario = null;
        this.ejercitos = 0;
        this.vecinos = new ArrayList<>();
    }

    public void meterVecino(String vecino){
        this.vecinos.add(vecino);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    public int getEjercitos() {
        return ejercitos;
    }

    public void setEjercitos(int ejercitos) {
        this.ejercitos = ejercitos;
    }

    public List<String> getVecinos() {
        return vecinos;
    }


    @Override
    public String toString() {
        if(propietario != null){
            return nombre + " (" + propietario.getNombre() + " )" + " , "+ ejercitos;
        } else {
            return nombre + " sin propietario.";
        }
    }


}
