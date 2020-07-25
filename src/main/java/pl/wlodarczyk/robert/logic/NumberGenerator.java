package pl.wlodarczyk.robert.logic;

import pl.wlodarczyk.robert.model.User;

public class NumberGenerator {

    private int number = 0;

    public NumberGenerator(User[] users) {
        for (User user : users) {
            if (user != null && user.getAccount().getNumber() > number) {
                number = user.getAccount().getNumber();
            }
        }
    }
    public int generateNumber (){
        return number ++;
    }
}
