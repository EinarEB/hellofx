package org.openjfx.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import org.openjfx.model.Arbeidsgiver;
import org.openjfx.model.vo.Saving;

public class ArbeidsgiverController {


    Saving v = new Saving();



    @FXML

    private TextField Bransje;

    @FXML

    private TextField Adresse;

    @FXML
    private TextField Telefone;

    @FXML
    private TextField Epost;

    @FXML
    private TextField Ledigevikariater;


    @FXML
    private RadioButton Private;

    @FXML
    private RadioButton Offentlig;

    @FXML
    private Button Lagre;



    public void GiveronAction(ActionEvent event) {
       String h ;
        if(Private.isSelected()) {
             h = "Privat";
         }
        else {
            h="Offentlig";
        }
        int value = Integer.parseInt(Telefone.getText());

//
//        Arbeidsgiver arbeidsgiver = new Arbeidsgiver(h,Bransje.getText(),Adresse.getText(),value ,Epost.getText(),
//                Ledigevikariater.getText());
//
//
//
//        String data = h +Bransje.getText()+Adresse.getText()+Epost.getText()+
//                Ledigevikariater.getText();
//
//        v.lagre_csv(data);
//




    }









    }

