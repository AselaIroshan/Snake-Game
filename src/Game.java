import javax.swing.JFrame;

public class Game extends JFrame{
	Game(){
		//main components
		add(new Game_window());

		setTitle("snake");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pack();
        setLocationRelativeTo(null);
        setVisible(true);
	}
}
