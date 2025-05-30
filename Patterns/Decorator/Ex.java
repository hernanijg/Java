package Patterns.Decorator;

import Patterns.Decorator.Decorator.MDecorator;
import Patterns.Decorator.Decorator.ReverseDecorator;

public class Ex {
    public static void main(String[] args) {
        Formate text = new Text("Hi nigg");

        MDecorator m = new MDecorator(text);
        ReverseDecorator r = new ReverseDecorator(m);

        System.out.println(r.giveFormate());
        System.out.println(m.giveFormate());
        System.out.println(text.giveFormate());
    }
}
