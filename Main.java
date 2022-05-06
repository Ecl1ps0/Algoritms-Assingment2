package Assingment2;

public class Main {
    public static void main(String[] args) {
        HashTable h = new HashTable(10);
        Classmate q = new Classmate("1@gmail.com", "Nik");
        Classmate w = new Classmate("2@gmail.com", "Duck");
        Classmate e = new Classmate("3@gmail.com", "Moo");
        Classmate r = new Classmate("4@gmail.com", "John");
        Classmate t = new Classmate("5@gmail.com", "Nice");
        Classmate y = new Classmate("6@gmail.com", "Marmok");
        Classmate u = new Classmate("7@gmail.com", "Dan");
        Classmate i = new Classmate("11@gmail.com", "t");

        h.ADDClassmate(q);
        h.ADDClassmate(w);
        h.ADDClassmate(e);
        h.ADDClassmate(r);
        h.ADDClassmate(t);
        h.ADDClassmate(y);
        h.ADDClassmate(u);
        h.ADDClassmate(i);

        System.out.println(h.getHash("1@gmail.com") + "; " + h.getHash("2@gmail.com") + "; " + h.getHash("3@gmail.com") + "; " + h.getHash("4@gmail.com") + "; " + h.getHash("5@gmail.com") + "; " + h.getHash("6@gmail.com") + "; " + h.getHash("7@gmail.com") + "; " + h.getHash("11@gmail.com") + "; ");

        h.showClassmate("10@gmail.com");
    }
}
