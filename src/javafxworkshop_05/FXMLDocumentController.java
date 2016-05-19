/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxworkshop_05;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import model.Person;

/**
 *
 * @author mhrimaz
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField ageField;
    @FXML
    private TextArea area;
    @FXML
    private TableView<Person> tableView;
    @FXML
    private ListView<Person> listView;

    @FXML
    private void handleSubmitButton(ActionEvent event) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        int age = Integer.parseInt(ageField.getText());
        Person person = new Person(firstName, lastName, age);
        area.appendText(age + "\n");
        int parseInt = Integer.parseInt(area.getText().trim());
        String text = area.getText().trim();
        System.out.println("text = " + text + " lenght" + text.length());
        
//        tableView.getItems().add(person);
//        listView.getItems().add(person);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        TableColumn<Person, String> firsNameCol = new TableColumn<>("First Name");
//        firsNameCol.setEditable(true);
//        firsNameCol.setCellValueFactory((param) -> param.getValue().firstNameProperty());
//        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
//        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
//        TableColumn<Person, Integer> ageCol = new TableColumn<>("Age");
//        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));
//        tableView.getColumns().addAll(firsNameCol, lastNameCol, ageCol);
    }

}
