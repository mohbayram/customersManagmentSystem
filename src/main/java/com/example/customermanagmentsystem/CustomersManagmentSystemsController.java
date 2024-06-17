package com.example.customermanagmentsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CustomersManagmentSystemsController implements Initializable {


    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane login_scene;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;


    //Database
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result ;

    private double x = 0;
    private double y = 0;
    public void login(){
        String sql = "SELECT * FROM admin WHERE username = ? and password = ?";

        connect = Database.connectDb();

         try {
             prepare = connect.prepareStatement(sql);
             prepare.setString(1, username.getText());
             prepare.setString(2, password.getText());

             result = prepare.executeQuery();
             Alert alert;

             if(username.getText().isEmpty() || password.getText().isEmpty()){
                 alert = new Alert(Alert.AlertType.ERROR);
                 alert.setTitle("Error Message");
                 alert.setHeaderText(null);
                 alert.setContentText("Please fill all blank fields");
                 alert.showAndWait();
             }else {
                 if(result.next()){
                     alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("Information Message");
                     alert.setHeaderText(null);
                     alert.setContentText("Successfully Login");
                     alert.showAndWait();

                     loginBtn.getScene().getWindow().hide();
                     Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
                     Stage stage = new Stage();
                     Scene scene = new Scene(root);

                     /*root.setOnMousePressed((MouseEvent event) -> {
                         x = event.getScreenX();
                         y = event.getScreenY();
                     });

                     root.setOnMouseDragged((MouseEvent event) ->{
                         stage.setX(event.getScreenX() - x);
                         stage.setY(event.getScreenY() - y);
                     });*/


                     stage.initStyle(StageStyle.UNIFIED);
                     stage.setTitle("Customer Managment System");
                     stage.setScene(scene);
                     stage.show();
                 }else {
                     alert = new Alert(Alert.AlertType.ERROR);
                     alert.setTitle("Error Message");
                     alert.setHeaderText(null);
                     alert.setContentText("Wrong Username/Password!");
                     alert.showAndWait();
                 }
             }
         }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}