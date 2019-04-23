package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Window;
import org.openjfx.model.JobbSøker;
import org.openjfx.model.vo.Saving;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class JobbsøkerController {


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
private
    final DatePicker datecalander = new DatePicker();

    @FXML
    private TextField Erfaring;

    @FXML
    private TextField Utdannelse;

    @FXML
    private TextField Referanser;


    @FXML
    private Button Registere;



   public void OppdateronAction(ActionEvent event) throws IOException{


   }
    public void SlettonAction(ActionEvent event) throws IOException{

   }





    @FXML
    protected void registere()  {

List<Object> obj=new ArrayList<>();
 JobbSøker jobbSøker;




 jobbSøker = new JobbSøker(fornavnField.getText(),etternavnField.getText(),datecalander.getValue(),epostField.getText(),
                 telefonField.getText(),
Erfaring.getText(),Utdannelse.getText(),Referanser.getText());

// String data = fornavnField.getText()+etternavnField.getText()+datecalander.getValue()+epostField.getText()+telefonField.getText()
//         +Erfaring.getText()+Utdannelse.getText()+Referanser.getText();
//

obj.add(jobbSøker);

  f.lagre_csv(obj);

    }



       /* Window owner = Registere.getScene().getWindow();
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
        if (Erfaring.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Legge til Erfaring ");
            return;
        }

        if (Referanser.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Legge til Referanser ");
            return;
        }


        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome " + telefonField.getText());

//        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
//                "Welcome " + epostField.getText());
//
//
//
//
//        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
//                "Welcome " + etternavnField.getText());
//
//
//        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
//                "Welcome " + Erfaring.getText());
//
//
//
//        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
//                "Welcome " + Referanser.getText());
//    }*/

//
//    @FXML
//    protected void AvbrytonAction(ActionEvent event) {
////        Window owner = avbryt.getScene().getWindow();
//        if (telefonField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Skriv navn ditt");
//            return;
//        }
//        if (epostField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Please enter your email id");
//            return;
//        }
//        if (fornavnField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Skriv passordet ");
//            return;
//
//        }
//        if (etternavnField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Skriv passordet ");
//            return;
//        }
////
////        if (datecalander.getValue().isEmpty()) {
////            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
////                    "Skriv passordet ");
////            return;
////        }
//        if (Erfaring.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Skriv passordet ");
//            return;
//        }
//        if (Utdannelse.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Skriv passordet ");
//            return;
//        }
//
//        if (Referanser.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
//                    "Skriv passordet ");
//            return;
//        }
//
//
//        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
//                "Welcome " + telefonField.getText());
//    }











    public void handleLagreJobbSøker(ActionEvent event) throws ParseException {
//        Date date = new SimpleDateFormat("DD/NN/YYYY").parse(fødselsDatoField.getText());
//        JobbSøker nyJobbsøker = new JobbSøker(fornavnField.getText(), etternavnField.getText(), epostField.getText(), telefonField.getText()
//                , Referanser.getText(), Erfaring.getText(), Utdannelse.getText(), date);
//
//        String data = telefonField.getText() + epostField.getText() + fornavnField.getText() + etternavnField.getText() +
//                fødselsDatoField.getText() + Utdannelse.getText() + Referanser.getText();
//        f.lagre_csv(data);
//        lbltxt.setText(data);
//
//
//
    }}