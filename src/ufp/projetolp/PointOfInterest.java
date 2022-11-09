package ufp.projetolp;


public class PointOfInterest {

  private Vehicle type;
  private String name;
  private Coordinate location;
  private Integer id;

  public Vehicle getType() {
    return type;
  }
  public void setType(Vehicle type) {
    this.type = type;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Coordinate getLocation() {
    return location;
  }
  public void setLocation(Coordinate location) {
    this.location = location;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Point of Interest Constructor
   * @param name String Point of Interest name
   * @param location Coordinate of Point of interest
   * @param id Point of Interest id
   */
  public PointOfInterest(String name, Coordinate location, Integer id){
    setName(name);
    setLocation(location);
  }

  public Date date;
  
  public Integer compareTo(PointOfInterest o) {
  return null;
  }

}