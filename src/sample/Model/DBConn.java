
package sample.Model;
import sample.Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.util.Pair;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class DBConn {

    private final String URL = "jdbc:mysql://kinoxp.cezz2j7x3idi.eu-west-2.rds.amazonaws.com:3306";
    private final String DB_NAME = "kinoXP";
    private final String USER = "anthelopes";
    private final String PASS = "anthelopes123";


    public Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    this.URL + this.DB_NAME,
                    this.USER,
                    this.PASS);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public ObservableList<Movie> getAllMovies() {

        ObservableList<Movie> moviesOL = FXCollections.observableArrayList();
        String sql = "SELECT * FROM movies";

        try {
            Connection connection = getConn();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                Movie movie = new Movie(resultSet.getInt);
//                moviesOL.add(movie);
//            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return moviesOL;
    }
}