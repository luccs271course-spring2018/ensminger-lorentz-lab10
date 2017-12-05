package hw;

import java.util.Arrays;

public class Main {

  public static void main(final String[] args) {
   final static String HU = "Hungary";
   final static String SK = "Slovakia";
   final static String RO = "Romania";
   final static String RS = "Serbia";
   final static String HR = "Croatia";
   final static String SI = "Slovenia";
   final static String AT = "Austria";
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
   myMap.addEdge(RO, RS);
   myMap.addEdge(RS, HR);
   myMap.addEdge(HR, SI);
   myMap.addEdge(SI, AT);
   myMap.addEdge(AT, SK);
  }
}
