package ed.masanz.ut6.ArrayList.dto;

import java.util.ArrayList;
import java.util.List;

public class Territorio {

    private String nombre;
    private Jugador propietario;
    private int ejercitos;
    private List<Territorio> vecinos;

    public Territorio(String nombre) {
        this.nombre = nombre;
        this.propietario = null;
        this.ejercitos = 0;
        this.vecinos = new ArrayList<>();
    }

    public void meterVecino(Territorio vecino){
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

    public List<Territorio> getVecinos() {
        return vecinos;
    }

    public void setVecinos(List<Territorio> vecinos) {
        this.vecinos = vecinos;
    }

    public List<String> getNombreVecinos(){
        List<String> nombres = new ArrayList<>();
        for (Territorio vecino : vecinos) {
            nombres.add(vecino.getNombre());
        }
        return nombres;
    }

    @Override
    public String toString() {
        return nombre + " (" + propietario.getNombre() + " )" + " , "+ ejercitos;
    }

    public static void main(String[] args) {
        Territorio t1 = new Territorio("España");
        Jugador j1 = new Jugador("A","Elvira");
        t1.setPropietario(j1);
        Territorio t2 = new Territorio("Francia");
    }
}
