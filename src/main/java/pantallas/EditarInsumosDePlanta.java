
//FALTAN LOS BOTONES AGREGAR STOCK A PLANTA Y EDITAR STOCKS

package pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarInsumosDePlanta {

	private JFrame frame;
	private JTable table;
	private JButton btnAgregarStockA;
	private JButton btnEditarStocks;
	private JButton btnAtrs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarInsumosDePlanta window = new EditarInsumosDePlanta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditarInsumosDePlanta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Editar Insumos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 21, 394, 154);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setForeground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Insumo", "Cantidad", "Cantidad m\u00EDnima"
			}
		));
		scrollPane.setViewportView(table);
		
		btnAgregarStockA = new JButton("Agregar stock a planta");
		btnAgregarStockA.setBounds(20, 186, 180, 25);
		frame.getContentPane().add(btnAgregarStockA);
		btnAgregarStockA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaAgregarStockPlantaX gestP=new PantallaAgregarStockPlantaX();
				gestP.main(null);
				frame.dispose();
			}
		});
		
		btnEditarStocks = new JButton("Editar stocks");
		btnEditarStocks.setBounds(289, 186, 125, 25);
		frame.getContentPane().add(btnEditarStocks);
		
		btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarPlanta editP = new EditarPlanta();
				editP.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
	}
}
