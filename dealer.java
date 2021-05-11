
import java.util.Random;

public class dealer {

    private String playerHand;
    private String playerHit;
    private String dealerHand;
    private String Hit;
    private int HitValue;
    private int dealerHandValue;
    private int playerHandValue;


    Cards c = new Cards();



    public String Dealerhand() {
        this.dealerHand = "";

            c.generateDeck();

            String dealerCard1 = c.getRandomCard();
            int dealerCardValue1 = c.getCardValue(dealerCard1);

            String dealerCard2 = c.getRandomCard();
            int dealerCardValue2 = c.getCardValue(dealerCard2);

            this.dealerHand = dealerCard1 + ", " + dealerCard2;
            this.dealerHandValue = dealerCardValue1 + dealerCardValue2;


        return this.dealerHand;
    }

    public String Playerhand() {
        this.playerHand = "";
        for (int i = 0; i <= 2; i++) {
            c.generateDeck();

            String playerCard1 = c.getRandomCard();
            int playerCardValue1 = c.getCardValue(playerCard1);

            String playerCard2 = c.getRandomCard();
            int playerCardValue2 = c.getCardValue(playerCard2);

            this.playerHand =  playerCard1 + ", " + playerCard2;
            this.playerHandValue = playerCardValue1 + playerCardValue2;

        }
        return this.playerHand;
    }
    public String Hit() {
        this.Hit = "";
        c.generateDeck();

        String HitCard1 = c.getRandomCard();
        int HitCardValue1 = c.getCardValue(HitCard1);

        this.Hit = HitCard1;
        this.HitValue = HitCardValue1;

        return this.Hit;
    }




    public void setPlayerHand(String PlayerHand) {
        this.playerHand = PlayerHand;

    }

    public void setDealerHand(String DealerHand) {
        this.dealerHand = DealerHand;
    }

    public void setDealerHandValue(int dealerHandValue){
        this.dealerHandValue = dealerHandValue;
    }

    public void setPlayerHandValue(int playerHandValue){
        this.playerHandValue = playerHandValue;
    }

    public void setHitValue(int HitValue){
         this.HitValue = HitValue;
    }

    public String getPlayerHand(){
        return this.playerHand;
    }

    public String getDealerHand(){
        return this.dealerHand;
    }

    public int getDealerHandValue(){return this.dealerHandValue;}

    public int getPlayerHandValue(){return this.playerHandValue;}

    public int getHitValue(){return this.HitValue;}
}
