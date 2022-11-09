package ufp.projetolp;

import edu.princeton.cs.algs4.In;

import java.util.*;

public class User {

  private String name;
  private Vehicle vehicle;
  private Date birthday;
  private Integer userId;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Vehicle getVehicle() {
    return vehicle;
  }
  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
  public Date getBirthday() {
    return birthday;
  }
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
  public Integer getUserId(){
    return userId;
  }
  public void setUserId(Integer id){
    this.userId = id;
  }

  public User(){}
  /**
   * User constructor
   * @param name User name
   */
  public User(String name){
    setName(name);
    //setVehicle(vehicle);
  }

  public ArrayList<NodeVisited> getNodeVisitedArrayList() {
    return nodeVisitedArrayList;
  }
  public void setNodeVisitedArrayList(ArrayList<NodeVisited> nodeVisitedArrayList) {
    this.nodeVisitedArrayList = nodeVisitedArrayList;
  }

  public ArrayList<NodeVisited> nodeVisitedArrayList = new ArrayList<NodeVisited>();

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", vehicle=" + vehicle +
            ", birthday=" + birthday +
            '}';
  }
}