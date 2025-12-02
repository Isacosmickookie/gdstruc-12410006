import java.util.LinkedList;




public class CardStack {


    private LinkedList<Cards> stack;
    public CardStack()
    {
        stack = new LinkedList<Cards>();
    }


    public void push (Cards cards)
    {
        stack.push(cards);
    }


    public boolean isEmpty()
    {
        return stack.isEmpty();
    }


    public Cards pop()
    {
        if (isEmpty())
        {
            return null;
        }
        return stack.pop();
    }


    public Cards peek()
    {
        return stack.peek();
    }


    public int size() {
        return stack.size();
    }
}

