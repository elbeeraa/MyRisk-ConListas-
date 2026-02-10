package ed.masanz.ut6.ArrayList.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Mundo {

    private static List<Jugador> jugadores = new ArrayList<>();
    private static TreeMap<String,Territorio> mapaTerritorios = new TreeMap<>();

    public static void loadMundo(){
        jugadores.add(new Jugador("A","Elvira"));
        jugadores.add(new Jugador("B","Juan"));
        jugadores.add(new Jugador("C","Pedro"));

        mapaTerritorios.put("España", new Territorio("España"));
        mapaTerritorios.get("España").meterVecino("Francia");
        mapaTerritorios.get("España").meterVecino("Alemania");
        mapaTerritorios.get("España").setPropietario(jugadores.get(0));
        mapaTerritorios.get("España").setEjercitos(3);

        mapaTerritorios.put("Francia", new Territorio("Francia"));
        mapaTerritorios.get("Francia").meterVecino("España");
        mapaTerritorios.get("Francia").meterVecino("Alemania");
        mapaTerritorios.get("Francia").setPropietario(jugadores.get(1));
        mapaTerritorios.get("Francia").setEjercitos(3);

        mapaTerritorios.put("Alemania", new Territorio("Alemania"));
        mapaTerritorios.get("Alemania").meterVecino("Francia");
        mapaTerritorios.get("Alemania").meterVecino("España");
        mapaTerritorios.get("Alemania").setPropietario(jugadores.get(2));
        mapaTerritorios.get("Alemania").setEjercitos(3);


    }

    public static int getNumeroTerritorios(){
        return mapaTerritorios.size();
    }

    public static Territorio getTerritorio(String nombre){
       return mapaTerritorios.get(nombre);
    }
}
