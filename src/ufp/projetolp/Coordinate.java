package ufp.projetolp;

import java.util.*;

public class Coordinate {

    private Double x;
    private Double y;

    public Double getX() {
        return x;
    }
    public void setX(Double x) {
        this.x = x;
    }
    public Double getY() {
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }

    public Coordinate(Double x, Double y){
        setX(x);
        setY(y);
    }


    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}