package sample.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.DBWrapper.DBConn;

/**
 * Created by blackhatt on 19/09/2017.
 */
public class MovieData {


    private ObservableList<Movie> movieList = FXCollections.observableArrayList();

    public ObservableList<Movie> getMovieList() {
        return movieList;
    }
<<<<<<< HEAD

    public void loadList() {
        DBConn dbConn = new DBConn();
        movieList = dbConn.getAllMovies();
        dbConn = null;

    }
=======
//
//    public void loadList() {
//        DBConn dbConn = new DBConn();
//        movieList = dbConn.getAllMovies();
//        dbConn = null;
//    }
>>>>>>> 098e495a919fdd58c5088c56f5292db32f96fe6b
}
