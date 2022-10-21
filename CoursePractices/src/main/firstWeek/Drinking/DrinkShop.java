package main.firstWeek.Drinking;

import java.util.ArrayList;
import java.util.List;

public class DrinkShop {

    private List<MilkType> milkTypeList;

    public DrinkShop() {
        this.milkTypeList = new ArrayList<>();
    }

    public void fillTheShelf(String[] args) {
        for(String arg : args) {
            this.milkTypeList.add(MilkType.valueOf(arg));
        }
    }

    public void printOut() {
        System.out.println("------Milk KIT-----------");
        for(int i = 0; i < milkTypeList.size(); ++i) {
            if(i <= milkTypeList.size() - 2) {
                System.out.print(milkTypeList.get(i)+",");
            } else {
                System.out.println(milkTypeList.get(i));
            }
        }
    }
}
