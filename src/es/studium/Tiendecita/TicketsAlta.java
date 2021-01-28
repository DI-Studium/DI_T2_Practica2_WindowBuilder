package es.studium.Tiendecita;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDateChooser;

public class TicketsAlta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFecha;
	private JTextField textCantidad;
	private JTable tableTicket;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketsAlta frame = new TicketsAlta();
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
	public TicketsAlta() {
		setTitle("Alta Ticket");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 700, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Nuevo Ticket");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(12, 13, 658, 22);
		contentPane.add(lblTitulo);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(12, 67, 56, 16);
		contentPane.add(lblFecha);
		
		JLabel lblArticulo = new JLabel("Articulo:");
		lblArticulo.setBounds(12, 96, 56, 16);
		contentPane.add(lblArticulo);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(499, 96, 56, 16);
		contentPane.add(lblCantidad);
		
		textFecha = new JTextField();
		textFecha.setBounds(68, 64, 177, 22);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		Choice choiceArticulo = new Choice();
		choiceArticulo.setBounds(68, 96, 372, 22);
		contentPane.add(choiceArticulo);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(563, 93, 107, 22);
		contentPane.add(textCantidad);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(12, 136, 97, 25);
		contentPane.add(btnAnadir);
		
		tableTicket = new JTable();
		tableTicket.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Articulo", "Cantidad", "Precio"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableTicket.setBounds(12, 174, 658, 177);
		contentPane.add(tableTicket);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(480, 375, 42, 16);
		contentPane.add(lblTotal);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setBounds(533, 372, 137, 22);
		contentPane.add(textTotal);
		textTotal.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//Cierra la aplicacion
				//Conectarse a la BD y hacer las consustas
			}
		});
		btnAceptar.setBounds(12, 431, 97, 25);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//Cierra la aplicacion
				//System.exit(0);
			}
		});
		btnCancelar.setBounds(573, 431, 97, 25);
		contentPane.add(btnCancelar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(300, 27, 95, 20);
		contentPane.add(dateChooser);
		setVisible(true);
	}
}
