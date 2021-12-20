package com.example.assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

    public class Vote_Cast {
        private Stage stage;
        private Scene scene;
        private Parent root;

        @FXML
        private Button confirmtocastvote;

        // --------------------------------- Taking Inputs From the Vote Casting Menu --------------------------------------
        @FXML
        private TextField CNICofVoter;
        @FXML
        private TextField NameofVoter;
        @FXML
        private ComboBox voterSelectedElectoralSymbol;

        // -------------------------------- Event Handling of Vote Casting Menu --------------------------------------------
        @FXML
        public void confirmtocastvote(ActionEvent event) throws Exception
        {
            root = FXMLLoader.load(getClass().getResource("Voters_Main_Menu.fxml"));
            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }


