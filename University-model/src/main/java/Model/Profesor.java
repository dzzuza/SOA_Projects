package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Profesor {
    private Integer profesorid;
    private String name;

    public Profesor() {
    }

    public Profesor(Integer profesorid, String name) {
        this.profesorid = profesorid;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(Integer profesorid) {
        this.profesorid = profesorid;
    }
}
