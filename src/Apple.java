import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Apple {
	JLabel appleJLabel;
	int apple_width = 20;
	int apple_height = 20;
	int apple_x;
	int apple_y;
	ImageIcon image = new ImageIcon("apple.png");
    Image scaledImage = image.getImage().getScaledInstance(apple_width, apple_width , Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
	public JLabel raapple() {
		int apple_x_position = (int) Math.floor(Math.random() *(500 - 20 + 1) + 20); 
		int apple_y_position= (int) Math.floor(Math.random() *(500 - 20 + 1) + 20);
		int apple_x_positions =(int) Math.round(apple_x_position / 10.0) * 10;
		int apple_y_positions = (int) Math.round(apple_y_position/ 10.0) * 10;
	    appleJLabel = new JLabel();
	    appleJLabel.setIcon(scaledIcon);
	    appleJLabel.setLayout(null);
	    appleJLabel.setBounds(apple_x_positions, apple_y_positions, 100, 100);
	    Point apple_location =appleJLabel .getLocation();
		apple_x = apple_location.x;
		apple_y = apple_location.y;
	    return appleJLabel; 
	}
}
