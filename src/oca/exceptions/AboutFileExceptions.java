package oca.exceptions;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AboutFileExceptions {

    void readFile(String path, String fileName) {

        try {

            File file = new File(path);
            file.createNewFile();

            DriverManager.getConnection("jdbc://...");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        AboutFileExceptions ex = new AboutFileExceptions();
        ex.readFile("./", "test.txt");
    }


}
