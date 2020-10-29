package es.studium.Tiendecita;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class ArticuloModificar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDescripcion;
	private JTextField textPrecio;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArticuloModificar frame = new ArticuloModificar();
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
	public ArticuloModificar() {
		setTitle("Modificar Art\u00EDculo");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 388, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setBounds(10, 158, 89, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 195, 82, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(10, 236, 89, 14);
		contentPane.add(lblCantidad);
		
		textDescripcion = new JTextField();
		textDescripcion.setBounds(109, 155, 238, 20);
		contentPane.add(textDescripcion);
		textDescripcion.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(109, 192, 238, 20);
		contentPane.add(textPrecio);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(109, 233, 238, 20);
		contentPane.add(textCantidad);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setBounds(28, 274, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//Cierra la aplicacion
				//System.exit(0);
			}
		});
		btnCancelar.setBounds(258, 274, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblTitulo = new JLabel("Modificar art\u00EDculo");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(136, 11, 134, 14);
		contentPane.add(lblTitulo);
		
		Choice choiceSelecArt = new Choice();
		choiceSelecArt.setBounds(109, 71, 238, 20);
		contentPane.add(choiceSelecArt);
		
		JLabel lblSeleccionaUnArtculo = new JLabel("Selecciona un art\u00EDculo a editar:");
		lblSeleccionaUnArtculo.setBounds(10, 46, 156, 20);
		contentPane.add(lblSeleccionaUnArtculo);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeleccionar.setBounds(245, 107, 102, 23);
		contentPane.add(btnSeleccionar);
		setVisible(true);
	}
}
