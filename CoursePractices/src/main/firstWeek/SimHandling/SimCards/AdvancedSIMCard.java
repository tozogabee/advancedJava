package main.firstWeek.SimHandling.SimCards;

import java.util.Random;

public class AdvancedSIMCard extends AbstractSIMCard {

    private int pukCode;
    private boolean isInvalid;
    public AdvancedSIMCard(int ownPin, int ownPuk) {
        this.isActivated = false;
        this.isInvalid = false;
        this.pin = ownPin;
        this.pukCode = ownPuk;
        this.id = ((int)Math.random()*900000)+100000;
    }

    public boolean checkingPukCode(int typedPuk) {
        ++trial;
        if (trial < TRIAL_NUMBER && !isInvalid) {
            if (this.pukCode == typedPuk) {
                isInvalid = true;
            }
        } else {
            System.out.println("SIM card was forbidden totally");
        }
        return isInvalid;
    }
}
