package ed.masanz.ut6.ArrayList.dto;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {

    private static int contador = 1;
    private int num;
    private String tipo;

    public Tarjeta() {
        this("SIN_TIPO");
    }

    public Tarjeta(String tipo) {
        this.num = contador++;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return num + ". " + tipo;
    }

    public static void main(String[] args) {
        List<Tarjeta> tar = new ArrayList<>();
        tar.add(new Tarjeta("Infanteria"));
        tar.add(new Tarjeta("Caballeria"));
        tar.add(new Tarjeta("Artilleria"));

        System.out.println(tar);
    }
}
