
import java.util.Random;
public class Cards
{
    private final String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"}; // Declares a new final string array suits[]
    private final String[] states = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; // Declares a new final string array states[]
    private String[] cards; // Declares a new blank string array cards[]
    private String[] cardValues; // Declares a new blank string array cardValues[]

    public void generateDeck() // Generates a new cards[] array with a full deck of cards
    {
        int n = suits.length * states.length;
        cards = new String[n];
        for (int i = 0; i < states.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                cards[suits.length * i + j] = states[i] + " of " + suits[j];
            }
        }
    }

    public void generateValueDeck() // Generates a new cardValues array which is the same size as the cards[] array which can be used to get the values of the cards, the values are in the same positions as the cards in the cards[] array
    {
        int n = suits.length * states.length;
        cardValues = new String[n];
        for(int i = 0; i < states.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                if(states[i].equalsIgnoreCase("Jack") || states[i].equalsIgnoreCase("Queen") || states[i].equalsIgnoreCase("King"))
                {
                    cardValues[suits.length * i + j] = "10"; // Replaces where the "Jack", "Queen" and "King" would be with the value of 10
                }
                else if(states[i].equalsIgnoreCase("Ace"))
                {
                    cardValues[suits.length * i + j] = "11"; // Replaces where the "Ace" would be with the value of 11
                }
                else
                {
                    cardValues[suits.length * i + j] = states[i];
                }
            }
        }
    }

    public String[] getAllSuits() // Returns all suits in the suits[] array
    {
        return this.suits;
    }

    public String[] getAllStates() // Returns all states in the states[] array
    {
        return this.states;
    }

    public String[] getAllCards() // Returns all cards in the cards[] array
    {
        return this.cards;
    }

    public String[] getAllCardValues() // Returns all card values in the cardValues[] array
    {
        return this.cardValues;
    }

    public String getRandomCard() // Generates a random card as a readable string, e.g. "Ace of Hearts".
    {
        Random r = new Random();
        int randomInt = r.nextInt(suits.length * states.length);

        return cards[randomInt];
    }

    public int getCardValue(String card) // Gets the value of a card that is a readable string, pass a card string into this method.
    {
        if(card.contains("2"))
        {
            return 2;
        }
        else if(card.contains("3"))
        {
            return 3;
        }
        else if(card.contains("4"))
        {
            return 4;
        }
        else if(card.contains("5"))
        {
            return 5;
        }
        else if(card.contains("6"))
        {
            return 6;
        }
        else if(card.contains("7"))
        {
            return 7;
        }
        else if(card.contains("8"))
        {
            return 8;
        }
        else if(card.contains("9"))
        {
            return 9;
        }
        else if(card.contains("10") || card.contains("Jack") || card.contains("Queen") || card.contains("King"))
        {
            return 10;
        }
        else if(card.contains("Ace"))
        {
            return 11;
        }
        else
        {
            System.out.println("AN ERROR HAS OCCURRED WHEN FETCHING CARD VALUE.");
            return -1;
        }
    }
}
