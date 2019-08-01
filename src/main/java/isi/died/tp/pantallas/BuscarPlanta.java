package isi.died.tp.pantallas;

import java.awt.EventQueue;



import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.FlowLayout;
import javax.swing.table.DefaultTableModel;

import isi.died.tp.datos.Listas;
import isi.died.tp.dominio.*;
import isi.died.tp.estructuras.ArbolBinarioBusqueda;

import java.awt.Color;
import javax.swing.JScrollPane;

public class BuscarPlanta {

	private JFrame frame;
	private JTextField tfID;
	private JTextField tfNombre;
	private JLabel lblIngreseLosDatos;
	private JLabel lblBsquedaopcional;
	private JLabel lblNombre;
	private JTable table;
	private ListSelectionModel model;
	private Planta planta;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPlanta window = new BuscarPlanta();
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
	public BuscarPlanta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Buscar Planta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(34, 104, 46, 14);
		frame.getContentPane().add(lblId);
		
		tfID = new JTextField();
		tfID.setBounds(85, 101, 86, 20);
		frame.getContentPane().add(tfID);
		tfID.setColumns(10);
		
		lblIngreseLosDatos = new JLabel("Ingrese los datos de búsqueda ");
		lblIngreseLosDatos.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngreseLosDatos.setBounds(10, 45, 178, 14);
		frame.getContentPane().add(lblIngreseLosDatos);
		
		lblBsquedaopcional = new JLabel("(opcional):");
		lblBsquedaopcional.setHorizontalAlignment(SwingConstants.LEFT);
		lblBsquedaopcional.setBounds(10, 61, 150, 14);
		frame.getContentPane().add(lblBsquedaopcional);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 135, 70, 14);
		frame.getContentPane().add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(85, 132, 86, 20);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpcionesPlanta opP = new OpcionesPlanta(planta);
				opP.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(324, 226, 100, 25);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setEnabled(false);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDePlantas gestionP = new GestionDePlantas();
				gestionP.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(10, 226, 100, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblPlantasEncontradas = new JLabel("Plantas encontradas:");
		lblPlantasEncontradas.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlantasEncontradas.setBounds(198, 20, 128, 14);
		frame.getContentPane().add(lblPlantasEncontradas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(198, 45, 226, 151);
		frame.getContentPane().add(scrollPane);
		
		Listas datos = new Listas();
		
		Object[][] datosPlantas=datos.getBusquedaPlantas();
		String[] columnas= {"ID","Nombre"};
		
		table = new JTable(datosPlantas,columnas);
		scrollPane.setViewportView(table);
		model=table.getSelectionModel();
		table.setAutoCreateRowSorter(true);
		table.editingCanceled(null);
		
		tfID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnNewButton.setEnabled(false);
				
				table= new JTable(actualizarTabla(datosPlantas,tfID.getText(),tfNombre.getText()),columnas);
				scrollPane.setViewportView(table);
				model=table.getSelectionModel();
				table.setAutoCreateRowSorter(true);
				
				model.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged (ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
								btnNewButton.setEnabled(true);
								
								int aux1=(int) table.getValueAt(model.getMinSelectionIndex(), 0);
								String aux2=(String) table.getValueAt(model.getMinSelectionIndex(), 1);
								
								planta=(new Listas()).buscarPlanta(aux1,aux2);
							}
						}
					});
			}
		});
		
		
		
		tfNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnNewButton.setEnabled(false);
				
				table= new JTable(actualizarTabla(datosPlantas,tfID.getText(),tfNombre.getText()),columnas);
				scrollPane.setViewportView(table);
				model=table.getSelectionModel();
				table.setAutoCreateRowSorter(true);
				
				model.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged (ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
								btnNewButton.setEnabled(true);
								
								int aux1=(int) table.getValueAt(model.getMinSelectionIndex(), 0);
								String aux2=(String) table.getValueAt(model.getMinSelectionIndex(), 1);
								
								planta=(new Listas()).buscarPlanta(aux1,aux2);
							}
						}
					});
			}
		});
		
		model.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged (ListSelectionEvent e) {
				if(!model.isSelectionEmpty()) {
						btnNewButton.setEnabled(true);
						
						int aux1=(int) table.getValueAt(model.getMinSelectionIndex(), 0);
						String aux2=(String) table.getValueAt(model.getMinSelectionIndex(), 1);
						
						planta=(new Listas()).buscarPlanta(aux1,aux2);
					}
				}
			});
	}
		
		
		
		public Object[][] actualizarTabla(Object[][] datos, String id, String nombre){
			
			Listas datosFinal = new Listas();
			ArrayList<Planta> listaPlantas= new ArrayList<Planta>();
			String idAux;
			String nombreAux;
			Planta pl = new Planta();
			
			for(int i=0; i<datos.length;i++) {
				idAux = Integer.toString((int)datos[i][0]);
				nombreAux = (String)datos[i][1];
				if(nombreAux.contains(nombre) && idAux.contains(id)) {
					pl= datosFinal.buscarPlanta(Integer.parseInt(idAux), nombreAux);
					listaPlantas.add(pl);
				}
			}
			
			datosFinal.setListaPlantas(listaPlantas);
			return datosFinal.getBusquedaPlantas();
		}
	//
	}
