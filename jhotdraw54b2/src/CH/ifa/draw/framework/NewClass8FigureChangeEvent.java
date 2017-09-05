package CH.ifa.draw.framework;

import java.awt.Rectangle;

public class NewClass8FigureChangeEvent {
	public Figure newSource;
	public Rectangle newRect;
	public FigureChangeEvent nestedEvent;

	public NewClass8FigureChangeEvent(Figure newSource, Rectangle newRect, FigureChangeEvent nestedEvent) {
		this.newSource = newSource;
		this.newRect = newRect;
		this.nestedEvent = nestedEvent;
	}
}