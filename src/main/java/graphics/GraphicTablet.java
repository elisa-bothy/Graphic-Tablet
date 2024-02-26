/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Elisa Bothy
 */
public class GraphicTablet extends JFrame{
    JTextField jtf;
    JLabel jl1;
    Container c;
     JLabel jl2;
     JPanel north;

    private static final long serialVersionUID = 1L;
    
     public GraphicTablet() {
        jtf = new JTextField();
        c = new JPanel();
        jl1 = new JLabel();
        jl2 = new JLabel();
        north = new JPanel();
        initGui();
        
        
        this.pack();
        //centrer fenêtre
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initGui() {
     
        jtf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                jl1.setText(" code clavier  : "+ke.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                jl1.setText(" lettre écrite : "+ke.getKeyChar()+ jl1.getText() + " ");
            }
            
             
        });
        
        c.setPreferredSize(new Dimension(200, 200));
        
        c.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent me) {
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                jl2.setText("Souris en x : " + x + " et y :" + y);
            }
        });
        jtf.setPreferredSize(new Dimension(200, 30)); 
        jl1.setPreferredSize(new Dimension(200, 30));
        jl2.setPreferredSize(new Dimension(200, 30)); 
        c.setPreferredSize(new Dimension(400, 400));
        c.setBackground(Color.GREEN);
        jtf.setOpaque(true);
        jtf.setBackground(Color.BLUE);
        north.setLayout(new BoxLayout(north , BoxLayout.PAGE_AXIS));
        north.add(jtf);
        north.add(jl1);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(north);
        this.add(c);
        this.add(jl2);
    }
}
