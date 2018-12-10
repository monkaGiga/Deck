import java.util.ArrayList;

public class Deck {
    private ArrayList<Deck>Dealt;
    private ArrayList<Deck>unDealt;
    public Deck(String[] Rank, String[] Suit, int PointValue);
    {

    }
    public int Size()
    {
        return unDealt.size();
    }
    public boolean isEmpty()
    {
        if(unDealt.size() == 0)
            return true;
        else
            return false;
    }

}
