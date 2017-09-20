package sample.DBWrapper;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jakub on 19.09.2017.
 */
public class MovieWrapper
{
    private static final String TABLE = "movies";
    private static MovieWrapper thisWrapper;
    Connection conn = null;

    private MovieWrapper()
    {
    }


    public ObservableList<Movie> getAllMovies() {

        ObservableList<Movie> moviesOL = FXCollections.observableArrayList();
        String sql = "SELECT * FROM movies";

        try {

            DBConn dbConn = new DBConn();
            conn = dbConn.getConn();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                Movie movie = new Movie(resultSet.getInt);
//                moviesOL.add(movie);
//            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return moviesOL;
    }
//    public Movie getMovie(int id) {
//
//        conn = DB.getConn();
//
//        String sqlTxt = "SELECT * FROM " + TABLE +
//                " WHERE `id` = '" + id + "';";
//
//        try
//        {
//            PreparedStatement prepStmt =
//                    conn.prepareStatement(sqlTxt);
//
//            ResultSet rs = prepStmt.executeQuery();
//
//            if (!rs.next())
//            {
//                return null;
//            }
//
//            String title = rs.getString("title");
//            String description = rs.getString("description");
//            int age = rs.getInt("age_restriction");
//            String actors = rs.getString("actors");
//            int duration = rs.getInt("duration");
//
//            prepStmt.close();
//
//            return new Movie(
//                    title, description, age, actors, duration);
//        }
//        catch (SQLException e)
//        {
//            e.printStackTrace();
//            return null;
//        }
//
//
//    }

}
