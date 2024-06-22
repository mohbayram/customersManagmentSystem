package com.example.customermanagmentsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomeController implements Initializable {

    @FXML
    private Button add_btn;

    @FXML
    private TextField customer_no;

    @FXML
    private TableColumn<CustomersData, String> customer_no_column;

    @FXML
    private Button delete_btn;

    @FXML
    private TextField first_name;

    @FXML
    private TableColumn<CustomersData, String> fist_name_column;

    @FXML
    private TextField last_name;

    @FXML
    private TableColumn<CustomersData, String> last_name_column;

    @FXML
    private Button search_btn;

    @FXML
    private Button update_btn;

    @FXML
    private Button logout_btn;

    @FXML
    private Button home_btn;

    @FXML
    private TableView<CustomersData> table_view;

    @FXML
    private TextField zip;

    @FXML
    private TableColumn<CustomersData, String> zip_column;

    public void switchForm(ActionEvent event) {

        if (event.getSource() == search_btn) {
            /*search_btn.setVisible(true);
            add_btn.setVisible(false);
            delete_btn.setVisible(false);
            update_btn.setVisible(false);*/

            search_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            add_btn.setStyle("-fx-background-color:white");
            delete_btn.setStyle("-fx-background-color:white");
            update_btn.setStyle("-fx-background-color:white");

            //homeTotalEmployees();
            //homeEmployeeTotalPresent();
            //homeTotalInactive();
            //homeChart();

        } else if (event.getSource() == add_btn) {
            /*search_btn.setVisible(false);
            add_btn.setVisible(true);
            delete_btn.setVisible(false);
            update_btn.setVisible(false);*/

            add_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            search_btn.setStyle("-fx-background-color:white");//transparent
            delete_btn.setStyle("-fx-background-color:white");
            update_btn.setStyle("-fx-background-color:white");

            //addEmployeeGendernList();
            //addEmployeePositionList();
            //addEmployeeSearch();

        } else if (event.getSource() == delete_btn) {
            /*search_btn.setVisible(false);
            add_btn.setVisible(false);
            delete_btn.setVisible(true);
            update_btn.setVisible(false);*/

            delete_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            search_btn.setStyle("-fx-background-color:white");
            add_btn.setStyle("-fx-background-color:white");
            update_btn.setStyle("-fx-background-color:white");

            //salaryShowListData();

        } else if (event.getSource() == update_btn) {
            /*search_btn.setVisible(false);
            add_btn.setVisible(false);
            delete_btn.setVisible(false);
            update_btn.setVisible(true);*/

            update_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            search_btn.setStyle("-fx-background-color:white");
            delete_btn.setStyle("-fx-background-color:white");
            add_btn.setStyle("-fx-background-color:white");

        }

    }



    public void logout(){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to logout?");
        Optional<ButtonType> option = alert.showAndWait();
        try {
            if (option.get().equals(ButtonType.OK)) {

                logout_btn.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("log_in.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
