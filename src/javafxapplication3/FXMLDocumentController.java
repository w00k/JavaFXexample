/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Francisco
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    //Checkboxes
    final CheckBox chk1;
    final CheckBox chk2;
    //radio buttons
    ToggleGroup group;
    final RadioButton rdBtn1;
    final RadioButton rdBtn2;
    
    public FXMLDocumentController () {
        chk1 = new CheckBox("Checkbox1");
        chk2 = new CheckBox("checkbox2");
        
        //agrupación de radio buttons
        group = new ToggleGroup(); 

        rdBtn1 = new RadioButton("rdBtn1");
        rdBtn2 = new RadioButton("rdBtn2");
        
        rdBtn1.setToggleGroup(group);
        rdBtn2.setToggleGroup(group);
        
        rdBtn1.setSelected(true);//valor en true
    }
    
    //Checkboxes controller
    @FXML
    private void handleCheckBox1(ActionEvent event) {      
        chk1.setSelected(!chk1.isSelected());
        System.out.println("chk1 value : "+chk1.isSelected());
    }
    
    @FXML
    private void handleCheckBox2(ActionEvent event) {      
        chk2.setSelected(!chk2.isSelected());
        System.out.println("chk2 value : "+chk2.isSelected());
    }
    //end checkboxes controller
    
    //radio buttons controller
    @FXML
    private void handleRbBtn1(ActionEvent event) {      
        rdBtn1.setSelected(!rdBtn1.isSelected());
        System.out.println("rdBtn1 value : "+rdBtn1.isSelected()+" - "+
                "rdBtn2 value : "+rdBtn2.isSelected());
    }
    
    @FXML
    private void handleRbBtn2(ActionEvent event) {      
        rdBtn2.setSelected(!rdBtn2.isSelected());
        System.out.println("rdBtn1 value : "+rdBtn1.isSelected()+" - "+
                "rdBtn2 value : "+rdBtn2.isSelected());
    }
    //end radio buttons controller
    
    //button controller
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Start!");

        //Checkboxes acction
        System.out.println("chk1.isSelected() : "+chk1.isSelected());
        if(chk1.isSelected()){
            try {
                String cmd = "notepad"; //Comando del OS
                Runtime.getRuntime().exec(cmd); 
            } catch (IOException ioe) {
                System.out.println (ioe);
            }
        }
        
        System.out.println("chk2.isSelected() : "+chk2.isSelected());
        if(chk2.isSelected()){
            try {
                String cmd = "C:\\Program Files (x86)\\Notepad++\\notepad++.exe"; //Comando del OS
                Runtime.getRuntime().exec(cmd); 
            } catch (IOException ioe) {
                System.out.println (ioe);
            }
        }
        //End checkboxes acction
        
        //Checkboxes acction
        System.out.println("rdBtn1.isSelected() : "+rdBtn1.isSelected());
        if(rdBtn1.isSelected()){
            try {
                String cmd = "mstsc"; //Comando del OS
                Runtime.getRuntime().exec(cmd); 
            } catch (IOException ioe) {
                System.out.println (ioe);
            }
        } else {
            System.out.println("rdBtn2.isSelected() : "+rdBtn2.isSelected());
            if(rdBtn2.isSelected()){
                try {
                    String cmd = "explorer"; //Comando del OS
                    Runtime.getRuntime().exec(cmd); 
                } catch (IOException ioe) {
                    System.out.println (ioe);
                }
            } else {
                System.out.println("no hay radio buttons seleccionados ");
            }
        }
            
        //End Checkboxes acction
        
        label.setText("Hello World!");
    }
    //End button controller
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
