import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;


public class Main {


    public static void main(String[] args) {


        CardStack stack = new CardStack();
        CardStack discardPile = new CardStack();


        List<Cards> Hand = new ArrayList<>();


        stack.push(new Cards("Major Arcana", "The Fool"));
        stack.push(new Cards("Major Arcana", "The Magician"));
        stack.push(new Cards("Major Arcana", "The High Priestess"));
        stack.push(new Cards("Major Arcana", "The Empress"));
        stack.push(new Cards("Major Arcana", "The Emperor"));
        stack.push(new Cards("Major Arcana", "The Hierophant"));
        stack.push(new Cards("Cups", "Ace"));
        stack.push(new Cards("Cups", "Two"));
        stack.push(new Cards("Cups", "Three"));
        stack.push(new Cards("Cups", "Four"));
        stack.push(new Cards("Cups", "Five"));
        stack.push(new Cards("Cups", "Six"));
        stack.push(new Cards("Pentacles", "Ace"));
        stack.push(new Cards("Pentacles", "Two"));
        stack.push(new Cards("Pentacles", "Three"));
        stack.push(new Cards("Pentacles", "Four"));
        stack.push(new Cards("Pentacles", "Five"));
        stack.push(new Cards("Pentacles", "Six"));
        stack.push(new Cards("Swords", "Ace"));
        stack.push(new Cards("Swords", "Two"));
        stack.push(new Cards("Swords", "Three"));
        stack.push(new Cards("Swords", "Four"));
        stack.push(new Cards("Swords", "Five"));
        stack.push(new Cards("Swords", "Six"));
        stack.push(new Cards("Wands", "Ace"));
        stack.push(new Cards("Wands", "Two"));
        stack.push(new Cards("Wands", "Three"));
        stack.push(new Cards("Wands", "Four"));
        stack.push(new Cards("Wands", "Five"));
        stack.push(new Cards("Wands", "Six"));




        System.out.println("-------------------------\n");
        int round = 1;
        while (!stack.isEmpty()) {
            //each round info
            System.out.println("Round: " + (round++));
            System.out.println("Your Hand: " + Hand);
            System.out.println("Cards in deck: " + stack.size());
            System.out.println("Discarded Cards: " + discardPile.size());
            //end


            //random command
            Random random = new Random();


            int randomNumber = random.nextInt(3);
            int randomCards = random.nextInt(5);


            int command = randomNumber;


            switch (command) {
                case 0:
                    int x = randomCards;
                    System.out.println("Drawing " + x + "cards");
                    for (int i = 0; i < x; i++) {
                        if (stack.isEmpty()) {
                            System.out.println("no more cards to pull");
                            break;
                        }
                        Cards drawnCard = stack.pop();
                        Hand.add(drawnCard);
                    }
                    break;
                case 1:
                    int y = randomCards;
                    System.out.println("Discarding " + y + "cards");
                    for (int i = 0; i < y; i++) {
                        if (Hand.isEmpty()) {
                            System.out.println("no more cards to discard");
                            break;
                        }
                        Cards discardedCard = Hand.remove(0);
                        discardPile.push(discardedCard);
                        System.out.println("Discarded: " + discardedCard);
                    }
                    break;
                case 2:
                    int z = randomCards;
                    System.out.println("Getting from discard pile");
                    for (int i = 0; i < z; i++) {
                        if (stack.isEmpty()) {
                            System.out.println("no cards to pull from discarded");
                            break;
                        }
                        Cards retrievedCard = discardPile.pop();
                        Hand.add(retrievedCard);
                        System.out.println("Pulled: " + retrievedCard);
                    }
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            System.out.println("------------------------------\n");
        }
        System.out.println("DECK IS EMPTY");
        Hand.removeIf(cards -> cards == null);
        System.out.println("Your hand: " + Hand);
        System.out.println("Discard Pile: " + discardPile.size() + "cards");
    }
}


