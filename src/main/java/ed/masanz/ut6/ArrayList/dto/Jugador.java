package ed.masanz.ut6.ArrayList.dto;

public class Jugador {
    private String id;
    private String nombre;
    private Mazo<Tarjeta> mazo;

    public Jugador(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        mazo = new Mazo<>();
    }

    public Jugador() {
        this("SIN_ID","SIN_NOMBRE");
    }

    public void setMazo(Mazo<Tarjeta> mazo) {
        this.mazo = mazo;
    }

    public void meterTarjeta(Tarjeta tar){
        mazo.meter(tar);
    }

    public int getNumeroTarjetas(){
        return mazo.tamanio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int cambiarTarjetas(){
        //TODO
        return 0;
    }
}
