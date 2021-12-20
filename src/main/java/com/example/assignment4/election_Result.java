package com.example.assignment4;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

    public class election_Result {
        private Stage stage;
        private Scene scene;
        private Parent root;

        @FXML
        private Button makeTXTFile_Btn;
        @FXML
        private Button showResult_Btn;
        @FXML
        private Button MainMenu_Btn;
        @FXML
        private Button quitElectronicVotingMachine;

        //--------------------- Event Handling Starts From Here ------------------------------------------------------------
        public void MainMenu(ActionEvent event) throws Exception
        {
            root = FXMLLoader.load(getClass().getResource("EVM_Main_Screen.fxml"));
            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        public void makeATXTFile(ActionEvent event) throws Exception
        {
            root = FXMLLoader.load(getClass().getResource("EVM_Main_Screen.fxml"));
            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        public void showResult(ActionEvent event) throws Exception
        {
            root = FXMLLoader.load(getClass().getResource("EVM_Main_Screen.fxml"));
            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        public void setquitElectronicVotingMachine(ActionEvent event) throws Exception
        {
            root = FXMLLoader.load(getClass().getResource("EVM_Main_Screen.fxml"));
            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }


