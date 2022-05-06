package Assingment2;

public class Classmate {
    private String email;
    private String name;
    private Classmate next;

    public String getName() {
        return name;
    }

    public void setNext(Classmate next) {
        this.next = next;
    }
    public Classmate getNext() {
        return next;
    }

    public String getEmail() {
        return email;
    }

    public Classmate(String email, String name) {
        this.name = name;
        this.email = email;
        next = null;
    }

    public Classmate() {
        next = null;
    }
}
