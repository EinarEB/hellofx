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
    public void NyArbeidsgiverAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/NyArbeidgiver.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("Ny Arbeidsgiver");
        stage.setScene(scene);
        stage.show();

    }
     public void NyVikariatAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/nyVikariat.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("Ny Vikariat");
        stage.setScene(scene);
        stage.show();

    }
    public void visVikariateronAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/VisVikariater.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("VisVikariater");
        stage.setScene(scene);
        stage.show();

    }
    public void SlettJobbsøkereonAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/SlettJobbsøkere.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("SlettJobbsøkere");
        stage.setScene(scene);
        stage.show();

    }






    public void visJobbsøkereAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/visJobbesøkere.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("/vis Jobbsøkere");
        stage.setScene(scene);
        stage.show();

    }


    public void SlettArbeidsgiveronAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/SlettArbeidsgiver.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("SlettArbeidsgiver");
        stage.setScene(scene);
        stage.show();

    }
    public void SlettVikariatonAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/SlettVikariat.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("SlettVikariat");
        stage.setScene(scene);
        stage.show();

    }

    public void visArbeidsgivereAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/visArbeidsgivere.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("visArbeidsgivere");
        stage.setScene(scene);
        stage.show();

    }

    public void OppdaterJobbsøkeronAction(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/OppdaterJobbsøker.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("OppdaterJobbsøker");
        stage.setScene(scene);
        stage.show();

    }

    public void OpprettArbeidsforholdonAction(ActionEvent event) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/Arbeidsforhold.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("OpprettArbeidsforhold");
        stage.setScene(scene);
        stage.show();


    }


    public void OppdaterArbeidsgiveronAction(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/OppdaterArbedisgiver.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("OppdaterArbedisgiver");
        stage.setScene(scene);
        stage.show();

    }

    public void VisArbeidsforholdeneonAction(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/VisArbeidsforholdene.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("OVisArbeidsforholdene");
        stage.setScene(scene);
        stage.show();


    }

    public void OppdaterVikariatonAction(ActionEvent event) throws IOException
    {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/org/openjfx/OppdaterVikariat.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root, 800, 700);
        stage.setTitle("OppdaterVikariat");
        stage.setScene(scene);
        stage.show();


    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
