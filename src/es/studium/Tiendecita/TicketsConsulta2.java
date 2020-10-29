package es.studium.Tiendecita;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketsConsulta2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFecha;
	private JTable tableTicket;
	private JTextField textTotal;
	private JTextField textIdTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketsConsulta2 frame = new TicketsConsulta2();
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
	public TicketsConsulta2() {
		setTitle("Consulta Ticket");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 700, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(437, 50, 56, 16);
		contentPane.add(lblFecha);
		
		textFecha = new JTextField();
		textFecha.setEditable(false);
		textFecha.setBounds(493, 47, 177, 22);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
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
		tableTicket.setBounds(12, 93, 658, 258);
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
				//System.exit(0);
			}
		});
		btnAceptar.setBounds(12, 431, 97, 25);
		contentPane.add(btnAceptar);
		
		textIdTicket = new JTextField();
		textIdTicket.setEditable(false);
		textIdTicket.setColumns(10);
		textIdTicket.setBounds(74, 47, 177, 22);
		contentPane.add(textIdTicket);
		
		JLabel lblIdTicket = new JLabel("N\u00BA Ticket:");
		lblIdTicket.setBounds(12, 47, 68, 16);
		contentPane.add(lblIdTicket);
		
		JButton btnPDF = new JButton("PDF");
		btnPDF.setBounds(573, 431, 97, 25);
		contentPane.add(btnPDF);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(464, 431, 97, 25);
		contentPane.add(btnImprimir);
		setVisible(true);
	}
}
