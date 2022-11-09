package ufp.projetolp;

public class Vehicle {

  private String type;

  public void setType(String type){
    this.type = type;
  }
  public String getType(){
    return type;
  }

  /**
   * Vehicle Constructor
   * @param type
   */
  public Vehicle(String type){
    setType(type);
  }

  @Override
  public String toString(){
    return this.getType();
  }
}