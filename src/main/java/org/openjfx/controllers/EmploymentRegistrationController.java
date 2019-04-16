package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class EmploymentRegistrationController {
   @FXML
   private TextField nameField;

   @FXML
   private TextField emailField;

  @FXML
  private PasswordField passwordField;

  @FXML
   private Button bekreftButton;


  @FXML
  protected void handleSubmitButtonAction(ActionEvent event) {
      Window owner = bekreftButton.getScene().getWindow();
       if(nameField.getText().isEmpty()) {
           AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                  "Skriv navn ditt");
         return;
        }     if(emailField.getText().isEmpty()) {
          AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                   "Please enter your email id");
           return;
       }
       if(passwordField.getText().isEmpty()) {
           AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                  "Skriv passordet ");
          return;
       }
    AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome " + nameField.getText());
   }






}