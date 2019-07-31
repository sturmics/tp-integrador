package isi.died.tp.pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerInsumosFaltantes {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerInsumosFaltantes window = new VerInsumosFaltantes();
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
	public VerInsumosFaltantes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Ver Insumos Faltantes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0001", "0002", "0003", "0004", "0005", "0006"}));
		comboBox.setBounds(69, 21, 119, 25);
		frame.getContentPane().add(comboBox);
		
		JLabel lblPlanta = new JLabel("Planta: ");
		lblPlanta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlanta.setBounds(22, 27, 46, 14);
		frame.getContentPane().add(lblPlanta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 62, 380, 128);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
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
				{null, null, null},
			},
			new String[] {
				"Insumo", "Cantidad Actual", "Cantidad Faltante"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnSalir.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnSalir);
		
		JButton btnAtrs = new JButton("Atrás");
//		btnAtrs.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
	//			GestionDePlantas gestionP = new GestionDePlantas();
		//		gestionP.main(null);
		//		frame.dispose();
	//		}
//		});
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
	}
}
