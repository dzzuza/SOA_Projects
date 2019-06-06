package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Profesor {
    private int profesorid;
    private String name;

    public Profesor() {
    }

    public Profesor(int profesorid, String name) {
        this.profesorid = profesorid;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(int profesorid) {
        this.profesorid = profesorid;
    }
}
