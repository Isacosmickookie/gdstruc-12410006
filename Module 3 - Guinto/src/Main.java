 public class Main {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "acue", 100));
        stack.push(new Player(2, "Sinatraa", 100));
        stack.push(new Player(3, "Subroza", 95));
        stack.push(new Player(4, "ploo", 90));

       stack.printStack();
       System.out.println("Popping: " + stack.pop());
        stack.printStack();
    }
 }
