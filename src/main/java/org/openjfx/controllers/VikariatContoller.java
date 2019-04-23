package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.openjfx.model.JobbSøker;
import org.openjfx.model.LedigVikarit;
import org.openjfx.model.vo.Saving;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VikariatContoller {

  @FXML
    private RadioButton Private;

  @FXML
    private RadioButton Offentlig;

  @FXML
    private TextField Adresse;

  @FXML
    private TextField Arbeidsgiver;

  @FXML
    private ComboBox jobbkategori;

  @FXML
    private DatePicker Varighet;
  @FXML
  private Label visVaright;

  @FXML
    private TextField ArbeidSted;

  @FXML

    private TextField StillingsType;

  @FXML

  private TextField StillingBeskrivelse;

  @FXML
    private TextField KravTilKvalifikasjoner;

  @FXML

    private TextField LønnBetingelse;

  @FXML
    private TextField Arbeidsvilkår;

  @FXML
    private TextField fødelsdato;

  @FXML
  private Button Lagre;



  private List<JobbSøker> søkere = new ArrayList<>();


  Saving f = new Saving();




     public void LagrehandelonAction(ActionEvent event) throws ParseException {


       String utskrift;
       if(Private.isSelected()){

         utskrift = "Private";


       }
       else{
         utskrift = "Offentlig";


       }
//       LocalDate id = Varighet.getValue();
//       visVaright.setText(id.toString());
//
//       Date dato = new SimpleDateFormat("DD/NN/YYYY").parse(fødelsdato.getText());
//       String m = (String) jobbkategori.getValue();
//       LedigVikarit ledigVikarit = new LedigVikarit(utskrift,ArbeidSted.getText(),Arbeidsgiver.getText(),
//               m,visVaright.getText(),dato,StillingsType.getText(),KravTilKvalifikasjoner.getText(),
////               LønnBetingelse.getText(),
////               Arbeidsvilkår.getText(),StillingBeskrivelse.getText(),søkere);
////
////       String  = ArbeidSted.getText()+Arbeidsgiver.getText()+visVaright.getText()+StillingsType.getText()+
////               KravTilKvalifikasjoner.getText()+jobbkategori.getValue();
////
////       f.lagre_csv(data);
////
////
//
//
//




}

    }
