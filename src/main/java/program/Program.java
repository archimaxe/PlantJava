package program;

import model.Plant;

public class Program {
    public static void main(String[] args) {
        Plant flower = new Plant();
        Plant rose = new Plant("Rose", 140.0);
        Plant tulip = new Plant("Tulip", "red", "green", 2, 100.0);

        System.out.println(flower);
        System.out.println(rose);
        System.out.println(tulip);


        flower.evalPrice(100);
    }
}
