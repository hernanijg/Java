package Patterns.Decorator.Decorator;

import Patterns.Decorator.Formate;

public class ReverseDecorator extends TextDecorator {
    public ReverseDecorator(Formate text) {
        super(text);
    }

    @Override
    public String giveFormate() {
        StringBuilder sb = new StringBuilder(text.giveFormate());
        return sb.reverse().toString();
    }
    
}
