import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.jar.Attributes.Name;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class table extends JPanel implements  ActionListener,KeyListener{
	Test name = new Test();
	Snake snake = new Snake();
	Timer timer;
	
	public table() {
        setPreferredSize(new Dimension(600, 600));
        addKeyListener(this);
        setFocusable(true);
        setLayout(null);
        
        timer = new Timer(100,this);
        timer.start();
        add(snake.snake());
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == 'w') {
			snake.move_w();
		}
		if (e.getKeyChar() == 's') {
			snake.move_s();
		}
		if (e.getKeyChar() == 'a') {
			snake.move_a();
		}
		if (e.getKeyChar() == 'd') {
			snake.move_d();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
