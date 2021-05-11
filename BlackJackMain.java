import java.util.Scanner;
public class BlackJackMain {


    public static void main(String[] args) {
        Cards c = new Cards();
        Game g = new Game();

        c.generateValueDeck();

        g.menu();
        g.playerhit();
        g.dealerhit();
        g.Results();
    }

}

