package hw;

import java.util.Arrays;

public class Main {

  public static void main(final String[] args) {
   Countries countries = new Countries();
   final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
   myMap.addVertex(countries.getHU());
   myMap.addVertex(countries.getSK());
   myMap.addVertex(countries.getRO());
   myMap.addVertex(countries.getRS());
   myMap.addVertex(countries.getHR());
   myMap.addVertex(countries.getSI());
   myMap.addVertex(countries.getAT());
   myMap.addEdge(countries.getHU(), countries.getSK());
   myMap.addEdge(countries.getHU(), countries.getRO());
   myMap.addEdge(countries.getHU(), countries.getRS());
   myMap.addEdge(countries.getHU(), countries.getHR());
   myMap.addEdge(countries.getHU(), countries.getSI());
   myMap.addEdge(countries.getHU(), countries.getAT());
   myMap.addEdge(countries.getRO(), countries.getRS());
   myMap.addEdge(countries.getRS(), countries.getHR());
   myMap.addEdge(countries.getHR(), countries.getSI());
   myMap.addEdge(countries.getSI(), countries.getAT());
   myMap.addEdge(countries.getAT(), countries.getSK());
   System.out.println(myMap);
   final Iterator<String> bf = new BreadthFirstIterator<>(myMap, countries.getHU());
   while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println(country);
   }
   final Iterator<String> bt = new BreadthFirstIterator<>(myMap, countries.getSK());
   while (bf.hasNext()) {
    final String country = bf.next();
    System.out.println(country);
 }
  final Iterator<String> cf = new ClosestFirstIterator<>(myMap, countries.getHU());
 while (cf.hasNext()) {
   final String country = cf.next();
    System.out.println(country);
 }
   final Iterator<String> ct = new ClosestFirstIterator<>(myMap, countries.getSK());
 while (bf.hasNext()) {
   final String country = bf.next();
   System.out.println(country);
 }
 final Iterator<String> df = new DepthFirstIterator<>(myMap, countries.getHU());
 while (cf.hasNext()) {
   final String country = cf.next();
    System.out.println(country);
 }
   final Iterator<String> dt = new DepthFirstIterator<>(myMap, countries.getSK());
 while (bf.hasNext()) {
   final String country = bf.next();
   System.out.println(country);
 }
 final Iterator<String> rf = new RandomWalkIterator<>(myMap, countries.getHU());
 while (cf.hasNext()) {
   final String country = cf.next();
    System.out.println(country);
 }
   final Iterator<String> rt = new RandomWalkIterator<>(myMap, countries.getSK());
 while (bf.hasNext()) {
   final String country = bf.next();
   System.out.println(country);
 }
  }
  int cnum = findGreedyChromaticNumber(myMap);
  System.out.println("The min Number of colors is: " + cnum);
}
