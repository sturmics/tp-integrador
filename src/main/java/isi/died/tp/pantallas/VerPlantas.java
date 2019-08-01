package isi.died.tp.pantallas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import isi.died.tp.datos.Listas;
import isi.died.tp.dominio.*;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerPlantas {

	private JFrame frame;
	private JButton btnVerInsumos;
	private JButton btnAtrs;
	private ListSelectionModel model;
	private Planta planta;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerPlantas window = new VerPlantas();
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
	public VerPlantas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Ver Plantas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 27, 322, 164);
		frame.getContentPane().add(scrollPane);
		
		Listas datos = new Listas();
		
		Object[][] datosPlantas=datos.getBusquedaPlantas();
		String[] columnas= {"ID","Nombre"};
		
		table = new JTable(datosPlantas,columnas);
		model=table.getSelectionModel();
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		table.editingCanceled(null);
		
		btnVerInsumos = new JButton("Ver insumos");
		btnVerInsumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerInsumosDePlanta2 insumosPlanta = new VerInsumosDePlanta2(planta);
				insumosPlanta.main(planta);
				frame.dispose();
			}
		});
		btnVerInsumos.setBounds(262, 202, 110, 25);
		frame.getContentPane().add(btnVerInsumos);
		btnVerInsumos.setEnabled(false);
		
		btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDePlantas gestionP = new GestionDePlantas();
				gestionP.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		model.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(!model.isSelectionEmpty()) {
					btnVerInsumos.setEnabled(true);
					
					int aux1=(int) table.getValueAt(model.getMinSelectionIndex(), 0);
					String aux2=(String) table.getValueAt(model.getMinSelectionIndex(), 1);
					
					planta=(new Listas()).buscarPlanta(aux1,aux2);
				}
			}
		});
	}
}
