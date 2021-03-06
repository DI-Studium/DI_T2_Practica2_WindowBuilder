 package es.studium.Tiendecita;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArticuloBaja extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArticuloBaja frame = new ArticuloBaja();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArticuloBaja() {
		setTitle("Baja de art\u00EDculo");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 396, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Choice choiceSelecArt = new Choice();
		choiceSelecArt.setBounds(122, 57, 235, 20);
		contentPane.add(choiceSelecArt);
		
		JLabel lblSelecArt = new JLabel("Selecciona el art\u00EDculo a dar de baja:");
		lblSelecArt.setBounds(10, 37, 209, 14);
		contentPane.add(lblSelecArt);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(10, 120, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//Cierra la aplicacion
				//System.exit(0);
			}
		});
		btnCancelar.setBounds(268, 120, 89, 23);
		contentPane.add(btnCancelar);
		setVisible(true);
	}
}
