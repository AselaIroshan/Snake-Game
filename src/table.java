import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Table extends JPanel implements ActionListener, KeyListener {
    private static final int BLOCK_SIZE = 20;
    static int NUM_BLOCKS = 2;
    private Timer timer;
    private int[] x;
    private int[] y;
    private String direction;
    boolean addblock = true;
    int randome_x ;
    int randome_y ;
    static int marks = 0;
    Snake snake = new Snake();
    Tail tail = new Tail();
    
    public Table() {
    	int mark = 0;
    	randome_x = (int) Math.floor(Math.random() *(570 - 20 + 1) + 20) ;
        randome_y = (int) Math.floor(Math.random() *(570 - 20 + 1) + 20) ;
        setPreferredSize(new Dimension(600, 600));
        addKeyListener(this);
        setFocusable(true);
        setLayout(null);
        resetSnake();
        timer = new Timer(100, this);
        timer.start();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        // draw each block of the snake
        for (int i = 0; i < NUM_BLOCKS; i++) {
            g.fillRect(x[i], y[i], BLOCK_SIZE, BLOCK_SIZE);
        }
        g.fillRect(randome_x, randome_y, BLOCK_SIZE, BLOCK_SIZE);
        g.drawString("Marks  " + marks, 10, 25);
    }
 
    @Override
    public void keyTyped(KeyEvent e) {
        
    } 
    
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                if (!direction.equals("s")) {
                    direction = "w";
                }
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                if (!direction.equals("w")) {
                    direction = "s";
                }
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                if (!direction.equals("d")) {
                    direction = "a";
                }
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                if (!direction.equals("a")) {
                    direction = "d";
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	moveSnake();
        repaint();
    }
    
    private void resetSnake() {
;
        x = new int[10];
        y = new int[10];
        for (int i = 0; i < NUM_BLOCKS; i++) {
            x[i] = BLOCK_SIZE;
            y[i] = BLOCK_SIZE * (i + 1);
        }
        direction = "d";
        // start moving to the right
    }
    
    private void moveSnake() {
        // update the position of each block
        for (int i = NUM_BLOCKS - 1; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        if (x[0] -20< randome_x ) {
        	if(randome_x < x[0] + 20) {
        		if(y[0]-20 <randome_y ) {
        			if(randome_y < y[0] + 20) {
        				randome_x = (int) Math.floor(Math.random() *(570 - 20 + 1) + 20) ;
        	            randome_y = (int) Math.floor(Math.random() *(570 - 20 + 1) + 20) ;
        	            marks ++;
        	            NUM_BLOCKS ++;
        			}
        		}
        	}
        }
        if(x[0] < 10 || y[0] > 570 || x[0] > 570 || y[0]<10) {
        	timer.stop();
        }
        	
        switch (direction) {
            case "w":
                y[0] -= BLOCK_SIZE;
                break;
            case "s":
                y[0] += BLOCK_SIZE;
                break;
            case "a":
                x[0] -= BLOCK_SIZE;
                break;
            case "d":
                x[0] += BLOCK_SIZE;
                break;
        }
    }
}

