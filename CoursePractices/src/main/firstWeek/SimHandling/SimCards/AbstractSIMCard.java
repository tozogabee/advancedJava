package main.firstWeek.SimHandling.SimCards;

public abstract class AbstractSIMCard {

    protected static int TRIAL_NUMBER = 3;
    protected boolean isActivated;
    protected int pin;

    protected int trial;

    protected int id;

    public boolean checkingPinCode(int typedPin) {
        ++trial;
        if (trial <= TRIAL_NUMBER && !isActivated) {
            if (this.pin == typedPin) {
                isActivated = true;
            }
        } else {
            System.out.println("SIM card was forbidden");
        }
        return isActivated;
    }

    public int getId() {
        return id;
    }

    public int getTrial() {
        return trial;
    }
}
