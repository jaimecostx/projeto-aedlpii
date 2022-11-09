package ufp.projetolp;

import java.util.*;

public class Ways {

  private Long v;
  private Long w;
  private Double rank;
  private Long id;
  private String name;
  private String address;
  private String postcode;

  /**
   * All getters and setters needed for Ways constructor
   */
  public Long getV() {
    return v;
  }
  public void setV(Long v) {
    this.v = v;
  }
  public Long getW() {
    return w;
  }
  public void setW(Long w) {
    this.w = w;
  }
  public Double setRank() {
    return rank;
  }
  public void setRank(Double rank) {
    this.rank = rank;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   * Ways Constructor
   * @param v starting point graph
   * @param w ending point graph
   * @param rank way
   * @param name way name
   * @param address way address
   * @param postcode ways postcode
   */
  public Ways(Long v, Long w, Double rank, String name, String address, String postcode){
    setV(v);
    setW(w);
    setRank(rank);
    // setId(id);
    setName(name);
    setAddress(address);
    setPostcode(postcode);
  }
}