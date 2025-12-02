import java.util.Objects;
public class Cards {
    private String suit;
    private String name;


    public Cards(String suit, String name)
    {
        this.suit = suit;
        this.name = name;
    }


    public String getSuit()
    {
        return suit;
    }


    public void setSuit(String suit)
    {
        this.suit = suit;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Card {" +
                "suit = " + suit +
                ", name =" + name + '}';
    }


    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return suit == cards.suit && Objects.equals(name, cards.name);
    }


    @Override
    public int hashCode()
    {
        return Objects.hash(suit, name);
    }
}

