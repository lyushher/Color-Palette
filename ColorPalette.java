import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPalette implements ChangeListener{
	
	JFrame window;
	JColorChooser cc;
	JPanel colorChooserPanel, colorPanel;
	JPanel panel = new JPanel();
	JLabel textfield = new JLabel();
	
	public static void main(String[] args) {
		
		new ColorPalette();
	}
	
	public ColorPalette() {
		
		window = new JFrame();
		window.setSize(800, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(new Color(255, 250, 250));
		window.setLayout(null);
		
		panel.setBackground(new Color(198, 226,255));
		panel.setBounds(50,50,700,570);
		window.add(panel);
		
		colorChooserPanel = new JPanel();
		colorChooserPanel.setBounds(100,50,600,300);
		colorChooserPanel.setBackground(new Color(198,226,255));
		panel.add(colorChooserPanel);
		
		cc = new JColorChooser();
		cc.getSelectionModel().addChangeListener(this);
		
		
		
		cc.setPreviewPanel(new JPanel());
		
		colorChooserPanel.add(cc);
		cc.setBackground(new Color(198,226,255));
		
		colorPanel = new JPanel();
		colorPanel.setBounds(100,400,600,170);
		colorPanel.setBackground(Color.yellow);
		window.add(colorPanel);
		
		textfield.setText("Output; ");
		textfield.setFont(new Font("Serif",Font.BOLD, 25));
		textfield.setForeground(Color.white);
		textfield.setBounds(100,400,600,170);
		panel.add(textfield);
		
		window.setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) {
		
		Color newColor = cc.getColor();
		colorPanel.setBackground(newColor);
	}
}
