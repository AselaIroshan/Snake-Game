import javax.swing.JFrame;

public class Window extends JFrame{
	Window(){
		add(new table());
		setTitle("snake");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pack();
        setLocationRelativeTo(null);
        setVisible(true);
	}
}
