package _4_Decorator.decorators;

import _4_Decorator.components.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" ... add border");
    }
   
}
