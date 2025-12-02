import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       Player asuna = new Player(1, "Asuna", 100);
       Player lethalBacon = new Player(2, "LethalBacon", 205);
       Player printer = new Player(3, "Printer", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(printer);

        playerLinkedList.printList();
        System.out.println( "size: " + playerLinkedList.getSize()); //getSize
        System.out.println("Contains Asuna: " + playerLinkedList.contains(new Player(1, "Asuna", 100))); //contains
        System.out.println("Index of Printer: " + playerLinkedList.indexOf(new Player(3,"Printer", 34)));

        PlayerNode removed = playerLinkedList.removeFront();

        playerLinkedList.printList();

        System.out.println("size: " + playerLinkedList.getSize());
    }
}