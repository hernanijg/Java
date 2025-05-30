package Patterns.Decorator.Decorator;

import Patterns.Decorator.Formate;

public class MDecorator extends TextDecorator{
    public MDecorator(Formate text) {
        super(text);
    }

    @Override
    public String giveFormate() {
        
        return text.giveFormate().toUpperCase();
    }
    
}
