

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    
        JFrame benimFrame = new JFrame("Başlık");
        benimFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        benimFrame.setLayout(null);
        
        JButton benimButton = new JButton("Tıkla Bana");
        benimButton.setBounds(20, 20, 120, 30);
        
        benimButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Merhaba Dünya");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        benimFrame.add(benimButton);
        
        benimFrame.setSize(160, 100);
        benimFrame.setVisible(true);
    }
}