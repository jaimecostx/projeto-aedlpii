package ufp.projetolp;
import java.util.*;


public class Nodes {

  private Long id;
  private Coordinate point;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Coordinate getPoint() {
    return point;
  }
  public void setPoint(Coordinate point) {
    this.point = point;
  }

  public Nodes(Coordinate point){
      setPoint(point);
  }

  public Coordinate coordinate;
  public ArrayList<PointOfInterest> pointOfInterestsList;


  @Override
  public String toString() {
    return "Nodes{" +
            "id=" + id +
            ", point=" + point +
            '}';
  }
}