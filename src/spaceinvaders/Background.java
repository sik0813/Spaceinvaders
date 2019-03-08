package spaceinvaders;

import javax.swing.ImageIcon;

public class Background extends Sprite implements Commons{
	 private final String background = "../spacepix/background.png";

	 public Background() {

	        ImageIcon ii = new ImageIcon(this.getClass().getResource(background)); 

	        setImage(ii.getImage());
	    }
}
