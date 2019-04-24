package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Window;
import org.openjfx.model.JobbSøker;
import org.openjfx.model.vo.Jobberfaring;
import org.openjfx.model.vo.Saving;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class JobbsøkerController {


    boolean correctFornavn = false;
    boolean correctEpost = false;
    boolean correctErfaring = false;
    boolean correctUtdannelse = false;
    boolean correctelefone = false;


    Saving f = new Saving();

    @FXML
    private TextField telefonField;
    @FXML
    private TextField epostField;

    @FXML
    private TextField fornavnField;

    @FXML
    private TextField etternavnField;

    @FXML

    private Label ContacTelefoneLabel;
    @FXML
    private Label contaktforNavnLabel;

    @FXML
    private Label epostLabel;
    @FXML
    private Label erfaringLabel;


    @FXML
    private
    DatePicker datecalander = new DatePicker();

    @FXML
    private TextField ErfaringFiled;

    @FXML
    private TextField UtdannelseFiled;

    @FXML
    private TextField ReferanserFild;

    @FXML
    private Label UtdannelseLabel;


    @FXML
    private Button Registere;


//    public JobbSøker getNewJobbesøkere(){
//
//        String telefone = telefonField.getText();
//        String epost= epostField.getText();
//        String fornavn = fornavnField.getText();
//        String EtterNavn = ErfaringFiled.getText();
//        String Erfaring = ErfaringFiled.getText();
//        String Utdannelse= UtdannelseFiled.getText();
//        String Referanser = ReferanserFild.getText();
//        LocalDate d = datecalander.getValue();
//
//        JobbSøker newJobbsøkere  = new JobbSøker(fornavn,EtterNavn,d,epost,Erfaring,Utdannelse,Referanser);
//
//        return newJobbsøkere;


    public void OppdateronAction(ActionEvent event) throws IOException {


    }

    public void SlettonAction(ActionEvent event) throws IOException {
    }


    @FXML
    protected void registere(ActionEvent event) throws IOException {

        List<Object> obj = new ArrayList<>();
        JobbSøker jobbSøker;


        jobbSøker = new JobbSøker(fornavnField.getText(), etternavnField.getText(), datecalander.getValue(), epostField.getText(),
                telefonField.getText(), ErfaringFiled.getText(), UtdannelseFiled.getText(), ReferanserFild.getText());

        obj.add(jobbSøker);

        f.lagre_csv(obj);


    }


    public void EpostValidation() {
        epostField.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (epostField.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                    epostLabel.setText("");
                    correctEpost = true;
                } else {
                    if (epostField.getText().length() == 0) {
                        telefonField.setStyle("-fx-border-color: red");
                        //ContactEmailLabel.setText("Email address field is empty");
                    } else {
                        epostField.setStyle("-fx-border-color: red");
                        epostLabel.setText("error");
                    }
                }
            } else {
                epostField.setStyle("border:red;");
                epostLabel.setText("Email address is required");
            }
        });
    }

    @FXML
    public void FonavnValidattion() {
        fornavnField.focusedProperty().addListener((arg0, oldValue, newValue) ->{
            if(!newValue){
                if(fornavnField.getText().matches("^[a-zA-Z\\s]{2,50}$")){
                    contaktforNavnLabel.setText("");
                    correctFornavn = true;
                }else{
                    if (fornavnField.getText().length() == 0){
                        fornavnField.setStyle("-fx-border-color: red");
                    }else {
                        fornavnField.setStyle("-fx-border-color: red");
                        contaktforNavnLabel.setText("error");
                    }
                }
            }else {
                fornavnField.setStyle("border:red;");
                contaktforNavnLabel.setText("Contact name is required");
            }
        });
    }



    @FXML
    public void Erfaringvalidation() {
        ErfaringFiled.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (ErfaringFiled.getText().matches("^[a-zA-Z\\s]{2,400}$")) {
                    erfaringLabel.setText("");
                    correctErfaring = true;
                } else {
                    if (ErfaringFiled.getText().length() == 0) {
                        ErfaringFiled.setStyle("-fx-border-color: red");
                        //kontactNameLabel.setText("Contact name field is empty");
                    } else {
                        ErfaringFiled.setStyle("-fx-border-color: red");
                        erfaringLabel.setText("error");
                    }
                }
            } else {
                ErfaringFiled.setStyle("border:red;");
                erfaringLabel.setText("Contact name is required");
            }
        });
    }

    @FXML
    public void Utdannelsevalidation() {
        UtdannelseFiled.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (UtdannelseFiled.getText().matches("^[a-zA-Z\\s]{2,400}$")) {
                    UtdannelseLabel.setText("");
                    correctUtdannelse = true;
                } else {
                    if (UtdannelseFiled.getText().length() == 0) {
                        UtdannelseFiled.setStyle("-fx-border-color: red");
                        //kontactNameLabel.setText("Contact name field is empty");
                    } else {
                        UtdannelseFiled.setStyle("-fx-border-color: red");
                        UtdannelseLabel.setText("error");
                    }
                }
            } else {
                UtdannelseFiled.setStyle("border:red;");
                UtdannelseLabel.setText("Contact name is required");
            }
        });


    }}

   /* public static class AlertHelper {

        public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
            Alert alert = new Alert(alertType);
            alert.setTitle(title);
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.initOwner(owner);
            alert.show();
        }
    }

    Window owner = Registere.getScene().getWindow();


      if (telefonField.getText().isEmpty()) {

        AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                   "Skriv nummer ditt");
           return;
       }



       if (epostField.getText().isEmpty()) {
          AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Skriv epost");
           return;
        }
       if (etternavnField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Skriv Etternavn ditt ");
            return;
      }

       if (ErfaringFiled.getText().isEmpty()) {
           AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Legge til Erfaring ");
            return;
        }

        if (ReferanserFild.getText().isEmpty()) {
           AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                   "Legge til Referanser ");
           return; }

       AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome " + telefonField.getText());
      AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
     "Welcome " + epostField.getText());

     AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
             "Welcome " + etternavnField.getText());


     AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
             "Welcome " + ErfaringFiled.getText());



        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
               "Welcome " + ReferanserFild.getText());





       if (epostField.getText().isEmpty()) {
          AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                  "Please enter your email id");
           return;
      }
     if (fornavnField.getText().isEmpty()) {
         AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                 "Skriv passordet ");
          return;

       }
       if (etternavnField.getText().isEmpty()) {AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                  "Skriv passordet ");
          return;
      }

       if (datecalander.getValue().isEmpty()) {
         AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                   "Skriv passordet ");
           return;
       }
       if (Erfaring.getText().isEmpty()) {
           AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                   "Skriv passordet ");return; }
      if (Utdannelse.getText().isEmpty()) {
          AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                   "Skriv passordet ");
           return;
      }

      if (Referanser.getText().isEmpty()) {
          AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Skriv passordet ");

             AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
           "Welcome " + telefonField.getText()); }
  return;
*/