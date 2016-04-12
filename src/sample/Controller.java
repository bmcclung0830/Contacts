package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField name;

    @FXML
    TextField number;

    @FXML
    TextField email;

    public void addContact(){
        if ( ! name.getText().isEmpty()
                && (! number.getText().isEmpty() )
                && (! email.getText().isEmpty() )){
        Contact newContact = new Contact( name.getText(), number.getText(), email.getText() );
        contacts.add(newContact);}
    }
    public void removeContact (){
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }
}
