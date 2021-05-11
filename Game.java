/**
 * @author cameron davison
 */

import java.util.Scanner;

public class Game {

    Cards c = new Cards();
    dealer d = new dealer();
    Scanner scan = new Scanner(System.in);
    int dealerNewHand;
    String dealerHandText;
    int dealerHitCard1 = 0;
    int dealerHitCard2 = 0;
    int PlayernewHand = 0;
    boolean dealerBust;
    boolean playerBust;

    public String menu() {

        c.generateValueDeck();

        System.out.println("Lets play some blackjack!");
        System.out.println("The dealer has given out the cards");
        System.out.println("You have : "+d.Playerhand());
        System.out.println("your cards are worth "+d.getPlayerHandValue()+" points");
        System.out.println("the dealer has : "+d.Dealerhand());
        System.out.println("these cards are worth "+d.getDealerHandValue()+" points");
        dealerNewHand = d.getDealerHandValue();
        dealerHandText = d.getDealerHand();
        if(dealerNewHand==21)

        {
             System.out.println("The dealer has 21, BlackJack!");
        }
        else if(dealerNewHand>21)

         {
             System.out.println("The dealer is bust");//
             dealerBust = true;
        }
        else if(d.getDealerHandValue() < 21&& d.getDealerHandValue()>=17)

        {//
        System.out.println("the dealer sticks");
        dealerBust = false;
    }
    return dealerHandText;
}
        public int dealerhit(){
            c.generateValueDeck();
        if (d.getDealerHandValue() <= 16) {
        String hit1 = d.Hit();
        int hit1Value = d.getHitValue();
        String hit2 = d.Hit();
        dealerNewHand = d.getDealerHandValue() + hit1Value;

            System.out.println("the dealer Hits, the dealer now has " + hit1 + " giving them an extra " + hit1Value + " points");
            System.out.println(" the dealer now has : " + d.getDealerHand() + " and " + hit1 + " for an overall of " + dealerNewHand);

            if (dealerNewHand == 21) {
                System.out.println("The dealer has 21, BlackJack!");
                System.out.println("you can now only win with a blackjack of your own");//
            }

            if (dealerNewHand > 21) {
                System.out.println("The dealer is bust!");//
                dealerBust = true;
            }


            while (dealerNewHand <= 16) {
                dealerNewHand = d.getDealerHandValue() + hit1Value;
                dealerHitCard1 = dealerNewHand + d.getHitValue();
                System.out.println("the dealer hits again, he receives a " + hit2);
                System.out.println("the dealer now has " + dealerHitCard1);
                dealerNewHand = dealerHitCard1;
            if (dealerNewHand == 21) {
                System.out.println("The dealer has 21, BlackJack!");
                System.out.println("you can now only win with a blackjack of your own");//
            }
            if (dealerNewHand > 21) {
                System.out.println("The dealer is bust!"); //
                dealerBust = true;
        }
            if (dealerNewHand < 21 && dealerNewHand >= 17) {
                System.out.println("the dealer sticks"); //
        }

            }
        if (dealerNewHand < 21) {
            System.out.println("the dealer sticks");
        }//

        }
        return this.dealerNewHand;
    }
        public int playerhit() {
            c.generateValueDeck();
            System.out.println("press 1 to stick and 2 to hit");
            int HitorStick = scan.nextInt();
//            int HitorStick2 = 0;
//            int hit3Value = d.getHitValue();
            String hit2 = d.Hit();
            if (HitorStick == 1) {
                System.out.println("you have decided to stick");
                System.out.println("you have " + d.getPlayerHand() + " giving you " + d.getPlayerHandValue() + " points");
                System.out.println("the dealer has " + getDealerNewHand() + " points");

            } else if (HitorStick == 2) {

                int hit2Value = d.getHitValue();
                PlayernewHand = d.getPlayerHandValue() + hit2Value;

                System.out.println("you have decided to Hit");
                System.out.println("you currently have " + d.getPlayerHand() + " giving you " + d.getPlayerHandValue() + " points");
                System.out.println("you hit and receive a " + hit2);
                System.out.println("your now have " + PlayernewHand + " points");
                if (PlayernewHand > 21) {
                    System.out.println("you have Busted!");
                    playerBust = true;
                }
             /*   System.out.println("would you like to hit again? 1 to stick and 2 to hit");
                HitorStick2 = scan.nextInt();*/


            }
            /*if (HitorStick2 == 1) {
                System.out.println("you have decided to stick");
                System.out.println("you have " + d.getPlayerHand() + " giving you " + d.getPlayerHandValue() + " points");
                System.out.println("the dealer has " + getDealerNewHand() + " points");

            } else if (HitorStick2 == 2) {
                String hit3 = d.Hit();
                int hit3int = PlayernewHand + hit3Value;
                System.out.println("you have decided to Hit");
                System.out.println("you currently have " + (d.getPlayerHand() + "" + hit2) + " giving you " + PlayernewHand + " points");
                System.out.println("you hit and receive a " + hit3);
                System.out.println("your now have " + (PlayernewHand + hit3Value) + " points");
                if (PlayernewHand > 21) {
                    System.out.println("you have Busted!");
                    playerBust = true;
                }

            }*/
            return PlayernewHand;
        }
        public void Results(){
            System.out.println("and the winner is ...");

            if(getDealerNewHand() == 21 && getPlayernewHand() == 21){
                System.out.println("Both players Have a blackjack, no-one wins.");
            }
            if(getDealerNewHand() == 21 && (getPlayernewHand() != 21)){
                System.out.println("The dealer has blackjack, the player does not and therefore loses!");
            }
            if(getDealerNewHand() != 21 && getPlayernewHand() == 21){
                System.out.println("The Player Has blackjack, the dealer does not and therefore loses!");
            }

            if(getDealerNewHand() > 21 && getPlayernewHand() > 21){
                System.out.println("Both players Have a busted , no-one wins.");
            }
            if(getDealerNewHand() > 21 && (getPlayernewHand() <= 21)){
                System.out.println("The dealer has busted, the player has not and therefore Wins!");
            }
            if(getDealerNewHand()<= 21 && getPlayernewHand() > 21){
                System.out.println("The Player Has busted, the dealer has not and therefore Wins!");
            }
            if(getDealerNewHand() > getPlayernewHand() && getDealerNewHand() < 21){
                System.out.println(" the dealer wins through high card!.");
            }
            if(getDealerNewHand() < getPlayernewHand() && getPlayernewHand() < 21){
                System.out.println(" the player wins through high card!.");
            }
            if(getDealerNewHand() == getPlayernewHand() && getDealerNewHand() < 21 && getPlayernewHand() < 21){
                System.out.println("both players have the same amount on cards, What are the chances?!");
            }

        }
        public void setDealerNewHand(int dealerNewHand){
            this.dealerNewHand = dealerNewHand;
        }

        public void setDealerHandText(String dealerHandText){
            this.dealerHandText = dealerHandText;
        }
        public void setPlayernewHand(int PlayernewHand){
            this.PlayernewHand = PlayernewHand;
        }
        public int getDealerNewHand(){
            return this.dealerNewHand;
        }
        public String getDealerHandText(){
            return this.dealerHandText;
        }
        public int getPlayernewHand(){
            return this.PlayernewHand;
        }
}