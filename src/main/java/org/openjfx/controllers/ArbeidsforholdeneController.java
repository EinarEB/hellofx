package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.openjfx.model.Arbeidsforhold;
import org.openjfx.model.vo.Saving;

public class ArbeidsforholdeneController {
    Saving f = new Saving();
    @FXML

    private TextField Vikariet;

    @FXML
    private TextField Vikaren;

    @FXML

    private TextField Opplevelse;



    public void LagreOnAction(ActionEvent event){
//
//        Arbeidsforhold arbeidsforhold = new Arbeidsforhold(Vikaren.getText(), Vikariet.getText(),Opplevelse.getText());
//        String data = Vikariet.getText()+ Vikaren.getText()+Opplevelse.getText();
//        f.lagre_csv();

    }
}
