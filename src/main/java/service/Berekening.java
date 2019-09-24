package service;

/**
 * Created by Michel Koolwaaij on 23-09-19.
 */
public class Berekening {
    public String verdubbel(int number) {
        int result = number * 2;
        return String.valueOf(result);
    }

    public String kwadraat(int number){
        long result = number * number;
        return String.valueOf(result);
    }
}
