import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Snake extends JLabel{
	JLabel label;
	final int snake_width = 40;
	final int snake_height = 40;
	static int snake_x_position = 10;
	static int snake_y_position = 1;
	int snake_x ;
	int snake_y ;
	
	public JLabel snake() {
		ImageIcon image = new ImageIcon("head.png");
	    Image scaledImage = image.getImage().getScaledInstance(snake_width, snake_height, Image.SCALE_SMOOTH);
	    ImageIcon scaledIcon = new ImageIcon(scaledImage);
	    
	    label = new JLabel();
	    label.setIcon(scaledIcon);
	    label.setLayout(null);
	    label.setBounds(snake_x_position, snake_y_position, 100, 100);
	    return label;  
	}
	public void move_w() {
		snake_y_position  = snake_y_position - 10;
		label.setBounds(snake_x_position, snake_y_position, 100, 100);
		Point snake_location = label.getLocation();
		snake_x = snake_location.x;
		snake_y = snake_location.y;
		System.out.print(snake_x+""+snake_y);
	}
	public void move_s() {
		snake_y_position  = snake_y_position + 10;
		label.setBounds(snake_x_position, snake_y_position, 100, 100);	
		Point snake_location = label.getLocation();
		snake_x = snake_location.x;
		snake_y = snake_location.y;
		System.out.print(snake_x+""+snake_y);
	}
	public void move_a() {
		snake_x_position  = snake_x_position - 10;
		label.setBounds(snake_x_position, snake_y_position, 100, 100);
		Point snake_location = label.getLocation();
		snake_x = snake_location.x;
		snake_y = snake_location.y;
		System.out.print(snake_x+""+snake_y);
	}
	public void move_d() {
		snake_x_position  = snake_x_position + 10;
		label.setBounds(snake_x_position, snake_y_position, 100, 100);
		Point snake_location = label.getLocation();
		snake_x = snake_location.x;
		snake_y = snake_location.y;
		System.out.print(snake_x+""+snake_y);
	}
}

