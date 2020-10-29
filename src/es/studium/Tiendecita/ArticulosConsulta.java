package es.studium.Tiendecita;


//import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
//import javax.swing.text.Document;

import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.awt.event.ActionEvent;

public class ArticulosConsulta extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableArt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArticulosConsulta frame = new ArticulosConsulta();
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
	public ArticulosConsulta() {
		setTitle("Consulta Art\u00EDculos");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 645, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableArt = new JTable();
		tableArt.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Descripci\u00F3n", "Precio", "Cantidad"
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
		tableArt.setBounds(23, 44, 579, 255);
		contentPane.add(tableArt);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(602, 44, 17, 255);
		contentPane.add(scrollBar);
		
		JLabel lblTitulo = new JLabel("Consulta Art\u00EDculos");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(23, 11, 570, 22);
		contentPane.add(lblTitulo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//Cierra la aplicacion
				//System.exit(0);
			}
		});
		btnAceptar.setBounds(25, 326, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnPdf = new JButton("PDF");
		btnPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//imprimirPDF();
			}
		});
		btnPdf.setBounds(504, 326, 89, 23);
		contentPane.add(btnPdf);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(405, 326, 89, 23);
		contentPane.add(btnImprimir);
		setVisible(true);
	}
//	public void imprimirPDF(){
//		// Se crea el documento 
//				Document documento = new Document();
//				try 
//				{ 
//					// Se crea el OutputStream para el fichero donde queremos dejar el pdf. 
//					FileOutputStream ficheroPdf = new FileOutputStream("ConsultaArticulos.pdf");
//					PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(22);
//					// Se abre el documento. 
//					documento.open();
//					Paragraph titulo = new Paragraph("Listado de Articulos", 
//							FontFactory.getFont("arial", // fuente 
//									22, // tamaño 
//									Font.ITALIC, // estilo 
//									BaseColor.BLUE)); // color
//					titulo.setAlignment(Element.ALIGN_CENTER);
//					documento.add(titulo);
//					// Sacar los datos
//					conexion = bd.conectar();
//					String[] cadena = bd.ArtculosConsultar(conexion).split("\n");
//					bd.desconectar(conexion);
//					PdfPTable tabla = new PdfPTable(3); // Se indica el número de columnas
//					tabla.setSpacingBefore(5); // Espaciado ANTES de la tabla
//					tabla.addCell("Descripcion Articulo");
//					tabla.addCell("Precio");
//					tabla.addCell("Unidades");
//					// En cada posición de cadena tenemos un registro completo
//					// cadena[0] = "Arroz-2.40-40"
//					String[] subCadena;
//					// En subCadena, separamos cada campo por -
//					// subCadena[0] = Arroz
//					// subCadena[1] = 2.40
//					// subCadena[2] = 40
//					for (int i = 0; i < cadena.length; i++) 
//					{
//						subCadena = cadena[i].split("-");
//						for(int j = 0; j < 3;j++)
//						{
//							tabla.addCell(subCadena[j]);
//						}
//					}
//					documento.add(tabla); 
//					documento.close(); 
//					//Abrimos el archivo PDF recién creado 
//					try 
//					{
//						File path = new File ("ConsultaArticulos.pdf"); 
//						Desktop.getDesktop().open(path); 
//					}
//					catch (IOException ex) 
//					{
//						//System.out.println("Se ha producido un error al abrir el archivo PDF"); 
//						System.err.println("Error: "+ex);
//					}
//				}
//				catch ( Exception e ) 
//				{ 
//					//System.out.println("Se ha producido un error al generar el archivo PDF"); 
//					System.err.println("Error: "+e);
//				}
//	}
}
