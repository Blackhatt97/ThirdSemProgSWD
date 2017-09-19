package sample.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by blackhatt on 19/09/2017.
 */
public class MovieData {


    private ObservableList<Movie> movieList = FXCollections.observableArrayList();

    public ObservableList<Movie> getMovieList() {
        return movieList;
    }

    public void loadList() {
        DBConn dbConn = new DBConn();
        movieList = dbConn.getAllMovies();
        dbConn = null;
    }
}
