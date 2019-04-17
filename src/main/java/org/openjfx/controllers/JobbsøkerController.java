package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.openjfx.data.JobbSøkerRegister;
import org.openjfx.model.JobbSøker;
import org.openjfx.model.vo.KontaktInformasjon;
import org.openjfx.model.vo.PersonligInformasjon;

import java.time.LocalDate;

public class JobbsøkerController {

    @FXML
    private TextField telefonField;
    @FXML
    private TextField epostField;

    @FXML
    private TextField fornavnField;
    @FXML
    private TextField etternavnField;
    @FXML
    private TextField fødselsDatoField;

    private JobbSøkerRegister jobbSøkerRegister = new JobbSøkerRegister();


    public void handleLagreJobbSøker(ActionEvent event) {
        KontaktInformasjon nyKontaktInformasjon = new KontaktInformasjon(telefonField.getText(), epostField.getText());
        PersonligInformasjon nyPersonligInformasjon = new PersonligInformasjon(fornavnField.getText(), etternavnField.getText(), LocalDate.parse(fødselsDatoField.getText()));
        JobbSøker nyJobbsøker = new JobbSøker(nyKontaktInformasjon, nyPersonligInformasjon);

        jobbSøkerRegister.settInnJobbSøker(nyJobbsøker);
    }
}
