package corrida;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Personagem extends JLabel implements Runnable {
	private Thread personagem = null;
	private static int pos = 0;
    private int X;
    private int Y;
    private ImageIcon imgP;
    private String nome;
    
    public Personagem(String nome, ImageIcon img, int X, int Y){
        super(img);
        this.imgP = img;
        this.X = X;
        this.Y = Y;
        this.nome = nome;
     
        personagem = new Thread(this, nome);
        personagem.start();
   
    }
    
    @Override
    public void run() {
        X += new Random().nextInt(7) * 10;
        this.setLocation(X, Y);

        if (X >= 1000) {
        	pos++;
        	JOptionPane.showMessageDialog(null, pos + " lugar: " + nome);
        	return;

        }
            
        try {
            Thread.sleep(new Random().nextInt(5) * 100);
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}