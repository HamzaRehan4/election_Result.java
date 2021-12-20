package com.example.assignment4;;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main_Menu {
    //------------------ Controller Class Main Menu --------------------------------------------------------------------
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button Presiding_Office_Menu_Btn;
    @FXML
    private Button Voters_Menu_Btn;


    //--------------------- Event Handling Starts From Here ------------------------------------------------------------
    public void openVotersMenu(ActionEvent event) throws Exception
    {
        System.out.println("HHHH");
        root = FXMLLoader.load(getClass().getResource("Voters_Main_Menu.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void openPresidingOfficeMenu(ActionEvent event) throws Exception
    {
        root = FXMLLoader.load(getClass().getResource("Presiding_Office_Login.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
