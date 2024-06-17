package com.example.customermanagmentsystem;

import java.sql.DriverManager;
import java.sql.Connection;

public class Database {

    public static Connection connectDb(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/customersmanagmentsystem", "username", "password");
            return connection;
        }catch (Exception e){e.printStackTrace();}
        return connection;
    }

}
