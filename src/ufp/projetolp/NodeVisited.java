package ufp.projetolp;

import java.util.*;
import java.util.List;

public class NodeVisited {

  private Long nodeId;
  private Integer pointOfInterestId;
  private Date dateVisited;

  public Long getNodeId() {
    return nodeId;
  }
  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }
  public Integer getPointOfInterestId() {
    return pointOfInterestId;
  }
  public void setPointOfInterestId(Integer pointOfInterestId) {
    this.pointOfInterestId = pointOfInterestId;
  }
  public Date getDateVisited() {
    return dateVisited;
  }
  public void setDateVisited(Date dateVisited) {
    this.dateVisited = dateVisited;
  }

  /**
   * NodeVisited Constructor
   * @param nodeId
   * @param pointOfInterestId
   * @param dateVisited
   */
  public NodeVisited(Long nodeId, Integer pointOfInterestId, Date dateVisited){
    setNodeId(nodeId);
    setPointOfInterestId(pointOfInterestId);
    setDateVisited(dateVisited);
  }

  public ArrayList<PointOfInterest> pointOfInterestList;
  
}