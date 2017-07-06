package _4_Decorator.decorators;

import _4_Decorator.components.Button;
import _4_Decorator.components.Checkbox;
import _4_Decorator.components.Component;
import _4_Decorator.components.TextView;
import _4_Decorator.components.Window;

public class Start {

	private static Component window;
	private static Component textView;
	private static Component button;
	private static Component checkbox;

	public static void main(String... args) {

		boolean showBorder = true;

		if (!showBorder) {
			window = new Window();
			textView = new TextView();
			button = new Button();
			checkbox = new Checkbox();
		} else {
			window = new BorderDecorator(new Window());
			textView = new BorderDecorator(new TextView());
			button = new BorderDecorator(new Button());
			checkbox = new ShadowDecorator(new Checkbox());
		}

		window.draw();
		textView.draw();
		button.draw();
		checkbox.draw();
	}

}
