package main.firstWeek.SimHandling;

import main.firstWeek.SimHandling.SimCards.AbstractSIMCard;
import main.firstWeek.SimHandling.SimCards.AdvancedSIMCard;
import main.firstWeek.SimHandling.SimCards.SimpleSIMCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimCardHandler {
    private List<AbstractSIMCard> simCardList;

    public SimCardHandler() {
        this.simCardList = new ArrayList<>();
    }

    public void addSimCardMenu() {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        do {
            System.out.println("To create simcard please the type of that");
            System.out.println("-----------------------------------------");
            System.out.println("1) Simple Sim card");
            System.out.println("2) Advanced Sim card");
            System.out.println("3) to quit");
            System.out.println("------------------------------------------");
            System.out.print("Give here your selection! -");
            int selection = 0;
            try {
                selection = input.nextInt();
                if (selection == 1) {
                    SimpleSIMCard simCard = createSimpleSimCard();
                    simCardList.add(simCard);
                } else if (selection == 2) {
                    AdvancedSIMCard simCard = createAdvancedSimCard();
                    simCardList.add(simCard);
                } else if (selection == 3) {
                    isDone = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("Not a number");
            }
        } while (!isDone);
        input.close();
    }

    private SimpleSIMCard createSimpleSimCard() {
        int pin = createPinOrPuk();
        return new SimpleSIMCard(pin);
    }

    private AdvancedSIMCard createAdvancedSimCard() {
        int pin = createPinOrPuk();
        int puk = createPinOrPuk();
        return new AdvancedSIMCard(pin, puk);
    }

    private int createPinOrPuk() {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        int pin = 0;
        System.out.print("Give me the PIN/PUK to the sim card - ");
        do {
            try {
                pin = input.nextInt();
                var pinStr = String.valueOf(pin);
                Matcher m = Pattern.compile("\\d{4}").matcher(pinStr);
                if (m.matches()) {
                    isDone = true;
                } else {
                    System.err.println("The pin and puk code must be equal to 4" + "\\033[H");
                    System.out.print("Give me the PIN/PUK to the sim card again - ");
                }
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.print("Give me the PIN/PUK to the sim card again - ");
            }
        } while (!isDone);
        input.close();
        return pin;
    }


}
