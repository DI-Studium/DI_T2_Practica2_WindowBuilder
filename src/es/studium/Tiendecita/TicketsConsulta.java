package es.studium.Tiendecita;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketsConsulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketsConsulta frame = new TicketsConsulta();
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
	public TicketsConsulta() {
		setTitle("Consulta Ticket");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 690, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableTicket = new JTable();
		tableTicket.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"idTicket", "Fecha", "Total"
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
		tableTicket.setBounds(12, 52, 648, 269);
		contentPane.add(tableTicket);
		
		JLabel lblTitulo = new JLabel("Consultar Tickets");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(12, 13, 648, 16);
		contentPane.add(lblTitulo);
		
		JButton btnPDF = new JButton("PDF");
		btnPDF.setBounds(563, 331, 97, 25);
		contentPane.add(btnPDF);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(454, 331, 97, 25);
		contentPane.add(btnImprimir);
		
		JLabel lblSelecTicket = new JLabel("Selecciona el ticket a consultar:");
		lblSelecTicket.setBounds(12, 383, 200, 16);
		contentPane.add(lblSelecTicket);
		
		Choice choiceSelecTicket = new Choice();
		choiceSelecTicket.setBounds(105, 405, 446, 22);
		contentPane.add(choiceSelecTicket);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(563, 402, 97, 25);
		contentPane.add(btnConsultar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(12, 469, 97, 25);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//Cierra la aplicacion
				//System.exit(0);
			}
		});
		btnCancelar.setBounds(563, 469, 97, 25);
		contentPane.add(btnCancelar);
		setVisible(true);
	}
}
