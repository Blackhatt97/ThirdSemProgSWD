package sample.Model;

import java.util.ArrayList;

public class Movie {

    private int ageRestriction;
    private String name;
    private String info;
    private double time;
    private String actors;

    private ArrayList<Movie> movies = new ArrayList<>();

    public Movie(int ageRestriction, String name, String info, double time,String actors) {

        this.ageRestriction = ageRestriction;
        this.name = name;
        this.info = info;
        this.time = time;
        this.actors = actors;

    }

    public int getAgeRestriction() {

        return ageRestriction;

    }

    public void setAgeRestriction(int ageRestriction) {

        this.ageRestriction = ageRestriction;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getInfo() {

        return info;

    }

    public void setInfo(String info) {

        this.info = info;

    }

    public double getTime() {

        return time;

    }

    public void setTime(double time) {

        this.time = time;

    }

    public ArrayList<Movie> getMovies() {

        return movies;

    }

    public void setMovies(ArrayList<Movie> movies) {

        this.movies = movies;

    }

    public String getActors() {

        return actors;

    }

    public void setActors(String actors) {

        this.actors = actors;

    }

    /**
     * Method that find a movie, and return it if exists
     * @param name: name of the movie
     * @return movie if the movie it is found, null if the movie is not found
     */

    public Movie findMovie(String name){

        Movie find = null ;

        for (Movie movie :movies) {

            if(movie.getName().equals(name)){

                find = movie;

            }

        }

        return find;

    }


}