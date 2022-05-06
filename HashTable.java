package Assingment2;

import java.util.Objects;

public class HashTable {
    private Classmate[] hashTable;
    private int currentLength;

    public HashTable(int size){
        currentLength = size;
        hashTable = new Classmate[size];
        for(int i = 0;i < size; i++) {
            hashTable[i] = new Classmate();
        }
    }

    public int getHash(String email) {
        return Math.abs(email.hashCode() % currentLength);
    }

    public void ADDClassmate(Classmate classmate) {
        if(hashTable[getHash(classmate.getEmail())] == null) {
            hashTable[getHash(classmate.getEmail())] = classmate;
        } else {
            Classmate Existed = hashTable[getHash(classmate.getEmail())];
            classmate.setNext(Existed);
            hashTable[getHash(classmate.getEmail())] = classmate;
        }
    }

    public void showClassmate(String email) {
        int hash = getHash(email);
        Classmate classmate = hashTable[hash];

        if(Objects.equals(classmate.getEmail(), email)) {
            System.out.println("It's your classmate: " + classmate.getName());
            return;
        }

        while(classmate.getNext() != null) {
            if(Objects.equals(classmate.getEmail(), email)) {
                System.out.println("It's your classmate: " + classmate.getName());
                break;
            }
            classmate = classmate.getNext();
        }
    }
}


