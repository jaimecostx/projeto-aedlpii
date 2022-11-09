/**
 * @date may 8th, 2022
 * @author Jaime Costa & Joana Mendes
 */

package ufp.projetolp;

import edu.princeton.cs.algs4.BinarySearchST;
import edu.princeton.cs.algs4.ST;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class DataBase {

  public static BinarySearchST<Long, Nodes> nodesBinarySearchST = new BinarySearchST<Long, Nodes>();
  public static Hashtable<String, Graph> graphHashtable = new Hashtable<String, Graph>();
  public static ArrayList<User> usersArrayList = new ArrayList<User>();

  private static final Graph newGraph = new Graph();
  static ArrayList<Ways> waysArrayList = newGraph.getWaysArrayList();
  static ArrayList<Nodes> nodesArrayList = newGraph.getNodesArrayList();

  private static final User newUser = new User();
  ArrayList<NodeVisited> nodeVisitedArrayList = newUser.getNodeVisitedArrayList();


  /**
   * put tag in graph hashtable
   * @param tag Tag to add
   * @param edgeOrVertex Graph to add
   */
  static void addTag(String tag, Graph edgeOrVertex) {
    graphHashtable.put(tag, edgeOrVertex);
  }

  /**
   * remove tag from graph hashtable
   * @param tag Tag to remove
   */
  static void removeTag(String tag) {
    Set<String> setOfKeys = graphHashtable.keySet();
    for (String t: setOfKeys){      // goes thru all the Tags in graphHashtable
      if (t.equals(tag)){           // checks if tag is equal graphHashTable tag
        graphHashtable.remove(t);   // if true removes
        break;
      }
    }
  }

  /**
   * search tag in graph hashtable
   * @param tag Tag String to search
   * @return true (if found) and false (if not)
   */
  static boolean searchTag(String tag) {
    Set<String> setOfKeys = graphHashtable.keySet();
    for (String t: setOfKeys){    // goes thru all the Tags in graphHashtable
      if (t.equals(tag)){         // checks if tag is equal graphHashTable tag
        return true;              // if found returns true
      }
    }
    return false;                 // else returns false
  }

  /**
   * print all the values of graph hash table
   */
  static void printGraphHashtable() {
    Set<String> setOfKeys = graphHashtable.keySet();
    for (String t: setOfKeys){    // Iterates over all entries graphHashTable
      System.out.println(t);      // prints the value
    }
  }

  /**
   * add edge to waysArrayList
   * @param edge Ways to add
   */
  static void addEdge(Ways edge) {
    if(edge == null){
      return;
    }
    int size = waysArrayList.size();
    if (size == 0){             // if waysArrayList has no entry
      waysArrayList.add(edge);    // adds the edge to waysArrayList
      edge.setId((long) (size + 1));  // and sets the edge id to 1
    }else{
      Long i = waysArrayList.get(waysArrayList.size() - 1).getId(); // i = id of last entry of waysArrayList
      waysArrayList.add(edge);    // adds the edge to waysArrayList
      edge.setId(i+1);          // and sets the edge id to be one more that the last entry
    }
  }

  /**
   * Remove edge from waysArrayList
   * @param edge Edge to remove
   */
  static void removeEdge(Ways edge){
    waysArrayList.remove(edge);
  }

  /**
   * Search edge in waysArrayList
   * @param edge Edge to search
   * @return true (if found) or false (if not found)
   */
  static boolean searchEdge(Ways edge){
    if (waysArrayList.contains(edge)){
      return true;
    }
    return false;
  }

  /**
   * Prints all the ways in waysArrayList
   */
  static void printEdge(){
    for (Ways w: waysArrayList){    // iterates over all the ways in waysArrayList
      System.out.println(w.toString()); // prints the Ways one by one
    }
  }

  /**
   * Add node to node arrayList and node bst
   * @param key Key
   * @param node Node
   */
  static void addNode(Long key, Nodes node){
    int size = nodesArrayList.size();
    if (size == 0){
      node.setId((long)1);
      nodesBinarySearchST.put((long)key,node);    // adds node to nodesBinarySearchST
      nodesArrayList.add(node);                   // and nodesArrayList
    }else{
      Long i = nodesArrayList.get(nodesArrayList.size()-1).getId();
      nodesBinarySearchST.put((long)key,node);
      nodesArrayList.add(node);
      node.setId((long) i + 1);
    }
  }
  static void editNode(Long key, Nodes node){

  }

  /**
   * Removes the key and node from the nodesBinarySearchST and nodesArrayList
   * @param key to remove
   * @param node to remove
   */
  static void removeNode(Long key, Nodes node){
    nodesBinarySearchST.delete(key);
    nodesArrayList.remove(node);
  }

  /**
   * Search for the key in the nodeBinarySearchSt
   * @param key to search
   * @return the node found
   */
  public Nodes searchNode(Long key){
    return nodesBinarySearchST.get(key);
  }

  public void printNodeBinarySearchST(){

  }

  /**
   * Add user to userlist
   * @param user User to add
   */
  static void addUser(User user){
    int size = usersArrayList.size();
    if (size == 0){
      usersArrayList.add(user);   // add user to waysArrayList
      user.setUserId(size + 1);   // set id as 1
    }else{
      int i = usersArrayList.get(usersArrayList.size()-1).getUserId();
      usersArrayList.add(user);   // add user to waysArrayList
      user.setUserId(i+1);        // set id as 1 more than the id of the last entry
    }
  }

  /**
   * Edit user from userlist
   * @param user User to edit
   */
  static void editUser(User user){
    usersArrayList.set(user.getUserId(), user);   // replaces the user with the user with new information
  }

  /**
   * Delete user from userlist
   * @param userId User id to delete
   */
  static void removeUser(Integer userId){
    for (User u: usersArrayList){   // iterates over the usersArrayList
      if (u.getUserId().equals(userId)){  // finds one with the same id as the parameter
        usersArrayList.remove(u);       // removes that user
      }
    }
  }

  /**
   * Search user in userlist
   * @param userId User id to search
   * @return true (if found) or false (if not found)
   */
  static boolean searchUser(Integer userId){
    for (User u: usersArrayList){
      if (u.getUserId().equals(userId)){
        return true;
      }
    }
    return false;
  }


  /**
   * Prints all users from userlist
   */
  static void printUserList(){
    for (User u: usersArrayList){
      System.out.println(u.toString());
    }
  }

  /**
   * ArrayList of all the points of interest visited by a user
   * @param d date
   * @param u user
   * @return VisitedByUser arraylist
   *
   */
  public ArrayList<PointOfInterest> visitedByUser(Date d,  User u) throws FileNotFoundException {
    ArrayList<PointOfInterest> visitedByUser = new ArrayList<>();
    try {
      Scanner fileInput = new Scanner(new File("C:/Intellij Projects/Projeto/src/ufp/projetolp/input/users.txt"));
      int id = 0;
      while (fileInput.hasNextLine()) {         // reads file line by line until there is no more lines
        String line = fileInput.nextLine();     // reads the present line
        String[] split = line.split(";"); // splits the line using ; as a delimiter
        if (split[0].equals(u.getName())) {     // finds the line with the same user name as the user parameter
          for (int i = 1; i < split.length; i++) {
            String[] PointOfInterest = split[i].split(",");   // splits the Points of Interest

            String[] date = PointOfInterest[0].split("-");    // splits the date of the Point of Interest Visit
            Integer day = Integer.valueOf(date[0], 10);
            Integer month = Integer.valueOf(date[1], 10);
            Integer year = Integer.valueOf(date[2], 10);

            Date testDate = new Date(day, month, year);
            if (testDate.beforeDate(d)) {     // if true point of interest was visited until date
              Double coordinateX = Double.valueOf(PointOfInterest[2]);
              Double coordinateY = Double.valueOf(PointOfInterest[3]);
              visitedByUser.add(new PointOfInterest(PointOfInterest[1], new Coordinate(coordinateX, coordinateY), id));
                // adds point of interest to visited by user arrayList
              id++;
            }
          }
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred!");
      e.printStackTrace();
    }

    return visitedByUser;
  }

  /**
   * ArrayList of all the points of interest not visited by a user
   * @param d date
   * @param u user
   * @return notVisitedByUser arraylist
   *
   */
  public ArrayList<PointOfInterest> notVisitedByUser(Date d,  User u){
    ArrayList<PointOfInterest> notVisitedByUser = new ArrayList<>();
    try{
      Scanner fileInput = new Scanner(new File("C:/Intellij Projects/Projeto/src/ufp/projetolp/input/users.txt"));
      int id=0;
      while(fileInput.hasNextLine()){
        String line = fileInput.nextLine();
        String[] lines = line.split(";");
        if (lines[0].equals(u.getName())){
          for (int i = 1; i < lines.length; i++){
            String[] pointOfInterest = lines[i].split(",");

            String[] date = pointOfInterest[0].split("-");
            Integer day = Integer.valueOf(date[0], 10);
            Integer month = Integer.valueOf(date[1], 10);
            Integer year = Integer.valueOf(date[2], 10);

            Date testDate = new Date(day, month, year);
            if (testDate.afterDate(d)){
              Double coordinateX = Double.valueOf(pointOfInterest[2]);
              Double coordinateY = Double.valueOf(pointOfInterest[3]);
              notVisitedByUser.add(new PointOfInterest(pointOfInterest[1], new Coordinate(coordinateX, coordinateY), id));
              id++;
            }
          }
        }
      }
    }catch (FileNotFoundException e){
      System.out.println("An error occurred!");
      e.printStackTrace();
    }
    return notVisitedByUser;
  }

  /**
   * ArrayList of who already visited a particular point of interest until date
   * @param d date
   * @param p point of interest
   * @return whoVisitedPointOfInterest arraylist
   *
   */
  public ArrayList<User> whoVisitedPointOfInterest(Date d, PointOfInterest p){
    ArrayList<User> whoVisitedPointOfInterest = new ArrayList<User>();
    try{
      Scanner fileInput = new Scanner(new File("C:/Intellij Projects/Projeto/src/ufp/projetolp/input/users.txt"));
      while(fileInput.hasNextLine()){
        String line = fileInput.nextLine();
        String[] lines = line.split(";");
        String userName = lines[0];
        for (int i = 1; i< lines.length; i++){
          String[] pointOfInterest = lines[i].split(",");

          String[] date = pointOfInterest[0].split("-");
          Integer day = Integer.valueOf(date[0], 10);
          Integer month = Integer.valueOf(date[1], 10);
          Integer year = Integer.valueOf(date[2], 10);

          Date testDate = new Date(day, month, year);
          if (pointOfInterest[0].equals(p.getName()) && testDate.beforeDate(d)){
            whoVisitedPointOfInterest.add(new User(userName));
          }
        }
      }
    }catch (FileNotFoundException e){
      System.out.println("An error occurred!");
      e.printStackTrace();
    }

    return whoVisitedPointOfInterest;
  }

  /**
   * ArrayList of all points of interests that were not visited by users until date
   * @param d date
   * @return notVisitedPointOfInterest arraylist
   *
   */
  public ArrayList<PointOfInterest> notVisitedPointOfInterest(Date d){
    ArrayList<PointOfInterest> notVisitedPointOfInterest = new ArrayList<PointOfInterest>();

    try{
      Scanner fileInput = new Scanner(new File("C:/Intellij Projects/Projeto/src/ufp/projetolp/input/users.txt"));
      int id = 0;
      while (fileInput.hasNextLine()){
        String line = fileInput.nextLine();
        String[] lines = line.split(";");
        for (int i = 1; i<lines.length; i++){
          String[] pointOfInterest = lines[i].split(",");

          String[] date = pointOfInterest[0].split("-");
          Integer day = Integer.valueOf(date[0], 10);
          Integer month = Integer.valueOf(date[1], 10);
          Integer year = Integer.valueOf(date[2], 10);

          Date testDate = new Date(day, month, year);
          if (testDate.afterDate(d)){
            Double coordinateX = Double.valueOf(pointOfInterest[2]);
            Double coordinateY = Double.valueOf(pointOfInterest[3]);
            notVisitedPointOfInterest.add(new PointOfInterest(pointOfInterest[1], new Coordinate(coordinateX, coordinateY), id ));
            id++;
          }
        }
      }
    }catch (FileNotFoundException e){
      System.out.println("An error has occurred!");
      e.printStackTrace();
    }
    return notVisitedPointOfInterest;
  }

  /**
   * ArrayList of all top 5 users with most point of interest visited
   * @param d date
   * @return usersrankByPointOfInterestVisited arraylist
   */
  public ArrayList<User> usersRankByPointOfInterestVisited (Date d){  // top5users
    ArrayList<User> usersRankByPointOfInterestVisited = new ArrayList<User>();
    Map<User, Integer> userRank = new HashMap<User, Integer>();

    try{
      Scanner fileInput = new Scanner(new File("C:/Intellij Projects/Projeto/src/ufp/projetolp/input/users.txt"));
      while(fileInput.hasNextLine()){
        String line = fileInput.nextLine();
        String[] lineSplit = line.split(";");

        String userName = lineSplit[0];
        int count = 0;
        for (int i = 1; i<lineSplit.length; i++){
          String[] pointOfInterest = lineSplit[i].split(",");

          String[] date = pointOfInterest[0].split("-");
          Integer day = Integer.valueOf(date[0], 10);
          Integer month = Integer.valueOf(date[1], 10);
          Integer year = Integer.valueOf(date[2], 10);

          Date testDate = new Date(day, month, year);
          if (testDate.beforeDate(d)){
            count++;
          }
          if (i == lineSplit.length-1){
            userRank.put(new User(userName),count);
          }
        }
      }
      int maxValueInMap = (Collections.max(userRank.values()));
      for (int i = 0; i<=5; i++){
        for (Map.Entry<User, Integer> entry : userRank.entrySet()) {  // Itrate through hashmap
          if (entry.getValue()==maxValueInMap) {
            usersRankByPointOfInterestVisited.add(entry.getKey());
            userRank.remove(entry.getKey());
            break;
          }
        }
      }
    }catch (FileNotFoundException e){
      System.out.println("An error occurred!");
      e.printStackTrace();
    }
    return usersRankByPointOfInterestVisited;
  }

  /**
   * Counts the amount of times a point of interest was visited by users until a date and returns the arrayList with the top 5
   * @param d date - until this date
   * @return pointOfInterestRankByUsers
   * NOT FUNCTIONAL
   */
  public ArrayList<PointOfInterest> pointOfInterestsRankByUsers(Date d){ // top 5
    ArrayList<PointOfInterest> pointOfInterestsRankByUsers = new ArrayList<PointOfInterest>();
    Map<PointOfInterest, Integer> pointOfInterestList = new HashMap<PointOfInterest, Integer>();
    try{
      Scanner fileInput = new Scanner(new File("C:/Intellij Projects/Projeto/src/ufp/projetolp/input/users.txt"));
      while(fileInput.hasNextLine()){
        String line = fileInput.nextLine();
        String[] lineSplit = line.split(";");
        for (int i = 0; i< lineSplit.length; i++){

        }
      }
    }catch (FileNotFoundException e){
      System.out.printf("An error occurred!");
      e.printStackTrace();
    }

    return pointOfInterestsRankByUsers;
  }
  /*
  public ArrayList<Graph> tagFound(String tag){

  }
  */
  // not in use
  public void readPointOfInterestFile() throws FileNotFoundException {
    Scanner poiReader = new Scanner(new File("input/PointOfInterest.csv"));
    poiReader.useDelimiter(",");

    PointOfInterest[] pointOfInterests = new PointOfInterest[0];
    while(poiReader.hasNext()){
      int id = poiReader.nextInt();
      String name = poiReader.next();
      Double coordinateX = poiReader.nextDouble();
      Double coordinateY = poiReader.nextDouble();

      PointOfInterest newPointOfInterest = new PointOfInterest(name, new Coordinate(coordinateX, coordinateY), id);
      pointOfInterests = addPointOfInterest(pointOfInterests, newPointOfInterest);
    }
  }
  private static PointOfInterest[] addPointOfInterest(PointOfInterest[] pointOfInterests, PointOfInterest pointOfInterestToAdd){
    PointOfInterest[] newPointOfInterest = new PointOfInterest[pointOfInterests.length + 1];
    System.arraycopy(pointOfInterests, 0, newPointOfInterest, 0, pointOfInterests.length);
    newPointOfInterest[newPointOfInterest.length - 1] = pointOfInterestToAdd;

    return newPointOfInterest;
  }
  public static String removeLastChar(String s){
    return (s == null || s.length() == 0)
            ? null
            : (s.substring(0, s.length() - 1));
  }


  /**
   * Has read users file and create User object
   * @param args
   */
  public static void main(String[] args){
      try{
        Scanner userFileInput = new Scanner(new File("C:/Intellij Projects/Projeto/src/ufp/projetolp/input/users.txt"));
        while (userFileInput.hasNextLine()) {
          String line = userFileInput.nextLine();
          String[] lines = line.split(",");

          String userName = lines[0];
          //String[] date = lines[1].split("-|\n");
/*
          int day = Integer.valueOf(date[0], 10);
          int month = Integer.valueOf(date[1], 10);
          int year = Integer.valueOf(date[2], 10);

          System.out.println(day + "/" + month + "/" + year);
*/
          User newUser = new User(userName);
          addUser(newUser);
      }userFileInput.close();
      }catch (FileNotFoundException e){
        System.out.println("An error occurred!");
        e.printStackTrace();
      }









/*

    Date jaimeBirthday = new Date(2, 9, 2001);
    Vehicle jaimeVehicle = new Vehicle("Bicla");

    User jaime = new User ("Jaime",  jaimeBirthday);
    User maria = new User ("Maria",  jaimeBirthday);
    User celestina = new User ("Celestina", jaimeBirthday);
    User paula = new User ("Paula", jaimeBirthday);

    addUser(maria);
    addUser(jaime);
    addUser(celestina);

    System.out.println(searchUser(2));

    //celestina = new User("Celestina", jaimeVehicle, jaimeBirthday);
    //editUser(celestina);
    //System.out.println();
    //System.out.println(jaime.getUserId());

    removeUser(2);
    addUser(paula);
    System.out.println("search 2" + searchUser(2));
    System.out.println("id antes da paula" + celestina.getUserId());
    System.out.println("id da paula " + paula.getUserId());
    //searchUser(2);
*/

   printUserList();
  }
}
