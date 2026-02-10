package ed.masanz.ut6.ArrayList.dto;


public class Mision {

    private static int contador = 1;
    private int num;
    private String tipo;

    public Mision() {
        this("SIN_TIPO");
    }

    public Mision(String tipo) {
        this.num = contador++;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return num + ". " + tipo;
    }

}
