package ed.masanz.ut6.ArrayList.dto;

public record DosValores (int uno, int dos){

    @Override
    public String toString() {
        return uno + "--" + dos;
    }
}


