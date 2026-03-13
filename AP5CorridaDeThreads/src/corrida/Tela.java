package corrida;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tela extends JFrame implements ActionListener {

    private JButton btnStart;
    private JButton btnStop;
    private JLabel pista;
    private ImageIcon imgPerso1;
    private ImageIcon imgPerso2;
    private ImageIcon imgPerso3;
   
    public Tela() {
        super();
        this.setLayout(null);
        this.setSize(1000, 650);
        this.setLocation(50, 50);
        this.setResizable(false);
        getContentPane().setBackground(Color.black);
       
        this.setTitle("Corrida de Threads");
       
        ImageIcon imgPista = new ImageIcon(
        	    new ImageIcon("./src/imagens/pista.jpg")
        	        .getImage()
        	        .getScaledInstance(1100, 650, Image.SCALE_SMOOTH)
        	);

    	this.pista = new JLabel(imgPista);
        this.pista.setBounds(0, 0, 1100, 650);
       
        this.add(pista);
       
        this.btnStart = new JButton("Start");
        this.btnStop = new JButton("Stop");
        
        this.btnStart.setBounds(340, 550, 120, 50);
        this.btnStop.setBounds(510, 550, 120, 50);
        
        imgPerso1 = new ImageIcon("./src/imagens/shrek.png");
        imgPerso2 = new ImageIcon("./src/imagens/sonic.png");
        imgPerso3 = new ImageIcon("./src/imagens/mcqueen.png");
       
        this.pista.add(btnStart);
        this.pista.add(btnStop);

        this.setVisible(true);

        btnStart.addActionListener(this);
        btnStop.addActionListener(this);

    }

     public JLabel JLabelPerso(String nome, ImageIcon img, int X, int Y) {
    	Personagem perso = new Personagem(nome, img, X, Y);
    	perso.setSize(200, 180);
    	perso.setVisible(true);
        this.add(perso);
        return perso;
    }


    public void actionPerformed(ActionEvent dispara) {
        if (dispara.getSource() == this.btnStart) {
            this.pista.add(JLabelPerso("shrek", imgPerso1, 0, 10));
            this.pista.add(JLabelPerso("sonic", imgPerso2, 0, 230));
            this.pista.add(JLabelPerso("mcqueen", imgPerso3, 0, 400));
        }
        if (dispara.getSource() == this.btnStop) {
            System.exit(0);
        }
    }
}