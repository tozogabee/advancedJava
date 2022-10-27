package main.firstWeek.SimHandling.SimCards;

public class SimpleSIMCard extends AbstractSIMCard {

    public SimpleSIMCard(int ownPin) {
        this.pin = ownPin;
        this.isActivated = false;
        this.id = ((int)Math.random()*9000)+1000;
    }
}
