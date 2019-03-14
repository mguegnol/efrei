package TP3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CtoF extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CtoF();
			}
		});
	}

	public CtoF() {
		super();
		build();
	}

	private void build() {

		setVisible(true);

		setTitle("CtoF"); //On donne un titre à l'application
		setSize(400,300); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); //Création layout
		
		JLabel degLabel = new JLabel();
		
		JTextField degTextField = new JTextField();
		degTextField.setColumns(10);
		contentPane.add(degTextField);
		
		JButton convertButton = new JButton("Convert"); //Création boutton
		ActionListener actionListenerAdd = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				degLabel.setText(degTextField.getText() + " Celsius = " + (Integer.valueOf(degTextField.getText())*(9/5)+32) + " Fahrenheit");
			
			}
		};
		convertButton.addActionListener(actionListenerAdd); //Ajout action listener au boutton
		contentPane.add(convertButton); //Ajout bouton
		contentPane.add(degLabel);
		
	}
}
