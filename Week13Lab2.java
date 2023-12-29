/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week13lab2;

import java.util.ArrayList;
import java.util.Collections;


class Movie implements Comparable <Movie>{
    private String name ;
    private double  rating ;
    private int year ;

    public Movie(String name ,double rating ,int year){
        this.name=name;
        this.rating=rating ;
        this.year=year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating ;
    }

    public void setLength(double rating ) {
        this.rating = rating;
    }

    public int getyear() {
        return year;
    }

    public void setData(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", rating=" + rating + ", year=" + year + '}';
    }

    @Override
    public int compareTo(Movie o) {
//        if(this.year>o.year)
//            return 1;
//        else if(this.year==o.year)
//            return 0;
//        else 
//            return -1;
        return  this.year - o.year;
         
    }

}


public class Week13Lab2 {
public static void main(String[] args){
 ArrayList<Movie> list = new ArrayList<>();
 list.add(new Movie("Force Awakens", 8.3, 2015));
 list.add(new Movie("Star Wars", 8.7, 1977)); 
 list.add(new Movie("Empire Strikes Back", 8.8, 1980));
 list.add(new Movie("Return of the Jedi", 8.4, 1983));
    Collections.sort(list);
   System.out.println("Movies after sorting: "); 
   for (Movie movie: list) {
      System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getyear());
   }
  }
}