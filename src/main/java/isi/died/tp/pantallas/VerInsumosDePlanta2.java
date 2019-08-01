package isi.died.tp.pantallas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import isi.died.tp.dominio.Planta;

public class VerInsumosDePlanta2 {

	private JFrame frame;
	private JScrollPane scrollPane;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblIdPlanta;
	private JLabel lblNombrePlanta;
	private static Planta planta;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(Planta pl) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerInsumosDePlanta2 window = new VerInsumosDePlanta2(pl);
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
	public VerInsumosDePlanta2(Planta pl) {
		planta=pl;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Ver Insumos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerPlantas verplantas=new VerPlantas();
				verplantas.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 64, 402, 144);
		frame.getContentPane().add(scrollPane);
		
		Object[][] datosStocks= planta.getDatosStock();
		String[] columnas= {"Insumo","Cantidad","Cantidad Mínima"};
		
		table = new JTable(datosStocks, columnas);
		table.editingCanceled(null);
		scrollPane.setViewportView(table);
		
		lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(18, 21, 46, 14);
		frame.getContentPane().add(lblId);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(4, 39, 60, 14);
		frame.getContentPane().add(lblNombre);
		
		String id = Integer.toString(planta.getId());
		lblIdPlanta = new JLabel(id);
		lblIdPlanta.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdPlanta.setBounds(79, 21, 46, 14);
		frame.getContentPane().add(lblIdPlanta);
		
		lblNombrePlanta = new JLabel(planta.getNombre());
		lblNombrePlanta.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombrePlanta.setBounds(79, 39, 140, 14);
		frame.getContentPane().add(lblNombrePlanta);
		
	}

}
