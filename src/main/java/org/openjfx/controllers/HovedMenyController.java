package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HovedMenyController implements Initializable {
    @FXML
    private Button jobbSøkerButton;


    public void handleNyJobbSøkerButtonAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/org/openjfx/ny_jobbsøker.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            Scene scene = new Scene(root, 800, 700);
            stage.setTitle("Ny Jobbsøker");
            stage.setScene(scene);
            stage.show();

        }catch (IOException e){
            System.out.println("Kunne ikke laste opp ny_jobbsøker.fxml");
            e.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
