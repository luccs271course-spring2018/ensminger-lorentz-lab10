package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;

public class Main {

  static final String HU = "Hungary";
  static final String SK = "Slovakia";
  static final String RO = "Romania";
  static final String RS = "Serbia";
  static final String HR = "Croatia";
  static final String SI = "Slovenia";
  static final String AT = "Austria";

  public static void main(final String[] args) {

    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);

    myMap.addVertex(HU);
    myMap.addVertex(SK);
    myMap.addVertex(RO);
    myMap.addVertex(RS);
    myMap.addVertex(HR);
    myMap.addVertex(SI);
    myMap.addVertex(AT);

    myMap.addEdge(HU, SK);
    myMap.addEdge(HU, RO);
    myMap.addEdge(HU, RS);
    myMap.addEdge(HU, HR);
    myMap.addEdge(HU, SI);
    myMap.addEdge(HU, AT);
    myMap.addEdge(SK, AT);
    myMap.addEdge(AT, SI);
    myMap.addEdge(SI, HR);
    myMap.addEdge(HR, RS);
    myMap.addEdge(RS, RO);
    myMap.addEdge(RO, SK);

    System.out.println(myMap);

    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, HU);
    while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println("Breadth first HU start " + country);
    }
    final Iterator<String> bfS = new BreadthFirstIterator<>(myMap, SK);
    while (bfS.hasNext()) {
      final String country = bfS.next();
      System.out.println("Breadth first SK start " + country);
    }
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, HU);
    while (cf.hasNext()) {
      final String country = cf.next();
      System.out.println("Closest first HU start " + country);
    }
    final Iterator<String> cfS = new ClosestFirstIterator<>(myMap, SK);
    while (cfS.hasNext()) {
      final String country = cfS.next();
      System.out.println("Closest first SK start " + country);
    }
    final Iterator<String> df = new DepthFirstIterator<>(myMap, HU);
    while (df.hasNext()) {
      final String country = df.next();
      System.out.println("Depth first HU start " + country);
    }
    final Iterator<String> dfS = new DepthFirstIterator<>(myMap, SK);
    while (dfS.hasNext()) {
      final String country = dfS.next();
      System.out.println("Depth first SK start " + country);
    }
    final Iterator<String> rw = new RandomWalkIterator<>(myMap, HU, false, 12);
    while (rw.hasNext()) {
      final String country = rw.next();
      System.out.println("Random walk HU start " + country);
    }
    final Iterator<String> rwS = new RandomWalkIterator<>(myMap, SK, false, 12);
    while (rwS.hasNext()) {
      final String country = rwS.next();
      System.out.println("Random walk SK start " + country);
    }

    GreedyColoring greedy = new GreedyColoring(myMap);
    VertexColoringAlgorithm.Coloring coloring = greedy.getColoring();
    int cnum = coloring.getNumberColors();
    System.out.println("The min Number of colors is: " + cnum);
  }
}
