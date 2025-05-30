package Patterns.Decorator.Decorator;

import Patterns.Decorator.Formate;

abstract public class TextDecorator implements Formate {
    protected Formate text;

    public TextDecorator(Formate text) {
        this.text = text;
    }
}
