package CH.ifa.draw.util;

import java.awt.Dimension;
import java.awt.Image;

public class NewClass4PaletteIcon {
	public Dimension size;
	public Image normal;
	public Image pressed;
	public Image selected;

	public NewClass4PaletteIcon(Dimension size, Image normal, Image pressed, Image selected) {
		this.size = size;
		this.normal = normal;
		this.pressed = pressed;
		this.selected = selected;
	}
}