package sample;

/**
 * Created by Brittany on 4/12/16.
 */
public class Contact {
    String name;
    String number;
    String email;

    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ": " + number + ", " + email;
    }
}
