package ufp.projetolp;

import java.util.*;


public class Graph {

  private Ways edges;
  private Nodes vertex;

  public Ways getEdges() {
    return edges;
  }
  public void setEdges(Ways edges) {
    this.edges = edges;
  }
  public Nodes getVertex() {
    return vertex;
  }
  public void setVertex(Nodes vertex) {
    this.vertex = vertex;
  }

  public ArrayList<Nodes> getNodesArrayList() {
    return nodesArrayList;
  }
  public void setNodesArrayList(ArrayList<Nodes> nodesArrayList) {
    this.nodesArrayList = nodesArrayList;
  }
  public ArrayList<Ways> getWaysArrayList() {
    return waysArrayList;
  }
  public void setWaysArrayList(ArrayList<Ways> waysArrayList) {
    this.waysArrayList = waysArrayList;
  }

  public ArrayList<Nodes> nodesArrayList = new ArrayList<Nodes>();
  public ArrayList<Ways> waysArrayList = new ArrayList<Ways>();

  @Override
  public String toString() {
    return "Graph{" +
            "edges=" + edges +
            ", vertex=" + vertex +
            '}';
  }
}