package isi.died.tp.pantallas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;

import isi.died.tp.datos.Listas;
import isi.died.tp.dominio.Camion;
import isi.died.tp.dominio.UnidadMedida;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.SpinnerNumberModel;

public class BuscarCamion {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblIngreseLosDatos;
	private JLabel lblBsquedaopcional;
	private JLabel lblNombre;
	private JTextField textField_1;
	private JTable table;
	private JLabel lblIdInsumo;
	private JLabel lblAptoParaLquidos;
	private ListSelectionModel model;
	private Camion camion;
	private final ButtonGroup buttonGroupLiq = new ButtonGroup();
	private JTextField textField_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarCamion window = new BuscarCamion();
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
	public BuscarCamion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 334);
		frame.setTitle("Buscar Camión");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(57, 85, 46, 14);
		frame.getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(108, 82, 93, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblIngreseLosDatos = new JLabel("Ingrese los datos de búsqueda ");
		lblIngreseLosDatos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblIngreseLosDatos.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngreseLosDatos.setBounds(10, 45, 200, 14);
		frame.getContentPane().add(lblIngreseLosDatos);
		
		lblBsquedaopcional = new JLabel("(opcional):");
		lblBsquedaopcional.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblBsquedaopcional.setHorizontalAlignment(SwingConstants.LEFT);
		lblBsquedaopcional.setBounds(10, 61, 150, 14);
		frame.getContentPane().add(lblBsquedaopcional);
		
		lblNombre = new JLabel("Dominio:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(3, 113, 100, 14);
		frame.getContentPane().add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 110, 93, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarCamion gestionP = new EliminarCamion(camion);
				gestionP.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(564, 216, 100, 25);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setEnabled(false);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDeTransporte gestionP = new GestionDeTransporte();
				gestionP.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(10, 259, 100, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblPlantasEncontradas = new JLabel("Camiones encontrados:");
		lblPlantasEncontradas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPlantasEncontradas.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlantasEncontradas.setBounds(218, 29, 128, 14);
		frame.getContentPane().add(lblPlantasEncontradas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(218, 54, 446, 151);
		frame.getContentPane().add(scrollPane);
		
		Listas datos = new Listas();
		
		Object[][] datosCamiones=datos.getBusquedaCamiones();
		String[] columnas= {"ID","Dominio","Capacidad","Líquidos"};
		
		table = new JTable(datosCamiones,columnas);
		scrollPane.setViewportView(table);
		model=table.getSelectionModel();
		table.setAutoCreateRowSorter(true);
		table.editingCanceled(null);
		
		lblIdInsumo = new JLabel("Capacidad:");
		lblIdInsumo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblIdInsumo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdInsumo.setBounds(3, 141, 100, 14);
		frame.getContentPane().add(lblIdInsumo);
		
		lblAptoParaLquidos = new JLabel("Apto para líquidos:");
		lblAptoParaLquidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAptoParaLquidos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAptoParaLquidos.setBounds(-17, 166, 120, 14);
		frame.getContentPane().add(lblAptoParaLquidos);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarCamion edc=new EditarCamion(camion);
				edc.main(null);
				frame.dispose();
			}
		});
		btnEditar.setBounds(218, 216, 100, 25);
		frame.getContentPane().add(btnEditar);
		btnEditar.setEnabled(false);
		
		JRadioButton rdbtnS = new JRadioButton("Sí");
		rdbtnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEditar.setEnabled(false);
				btnNewButton.setEnabled(false);
				table=new JTable(actualizarTabla(datosCamiones,textField.getText(),textField_1.getText(),textField_2.getText(),"1"), columnas);
				scrollPane.setViewportView(table);
				model=table.getSelectionModel();
				table.setAutoCreateRowSorter(true);
				
				model.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged (ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
								btnEditar.setEnabled(true);
								btnNewButton.setEnabled(true);
								
								String aux1ID= (String) table.getValueAt(model.getMinSelectionIndex(), 0);
								String aux2DOMINIO= (String) table.getValueAt(model.getMinSelectionIndex(), 1);
								
								camion=(new Listas()).buscarCamion(aux1ID,aux2DOMINIO);
							}
						}
					});
			}
		});
		buttonGroupLiq.add(rdbtnS);
		rdbtnS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnS.setBounds(108, 162, 52, 23);
		frame.getContentPane().add(rdbtnS);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEditar.setEnabled(false);
				btnNewButton.setEnabled(false);
				table=new JTable(actualizarTabla(datosCamiones,textField.getText(),textField_1.getText(),textField_2.getText(),"2"), columnas);
				scrollPane.setViewportView(table);
				model=table.getSelectionModel();
				table.setAutoCreateRowSorter(true);
				
				model.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged (ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
								btnEditar.setEnabled(true);
								btnNewButton.setEnabled(true);
								
								String aux1ID= (String) table.getValueAt(model.getMinSelectionIndex(), 0);
								String aux2DOMINIO= (String) table.getValueAt(model.getMinSelectionIndex(), 1);
								
								camion=(new Listas()).buscarCamion(aux1ID,aux2DOMINIO);
							}
						}
					});
			}
		});
		buttonGroupLiq.add(rdbtnNo);
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNo.setBounds(162, 162, 52, 23);
		frame.getContentPane().add(rdbtnNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 141, 93, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnEditar.setEnabled(false);
				btnNewButton.setEnabled(false);
				String liqq = "0";
				if(rdbtnS.isSelected()) {
					liqq="1";
				}else if(rdbtnNo.isSelected()){
					liqq="2";
				}
				table=new JTable(actualizarTabla(datosCamiones,textField.getText(),textField_1.getText(),textField_2.getText(),liqq), columnas);
				scrollPane.setViewportView(table);
				model=table.getSelectionModel();
				table.setAutoCreateRowSorter(true);
				
				model.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged (ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
								btnEditar.setEnabled(true);
								btnNewButton.setEnabled(true);
								
								String aux1ID= (String) table.getValueAt(model.getMinSelectionIndex(), 0);
								String aux2DOMINIO= (String) table.getValueAt(model.getMinSelectionIndex(), 1);
								
								camion=(new Listas()).buscarCamion(aux1ID,aux2DOMINIO);
							}
						}
					});
			}
		});
		
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnEditar.setEnabled(false);
				btnNewButton.setEnabled(false);
				String liqq = "0";
				if(rdbtnS.isSelected()) {
					liqq="1";
				}else if(rdbtnNo.isSelected()){
					liqq="2";
				}
				table=new JTable(actualizarTabla(datosCamiones,textField.getText(),textField_1.getText(),textField_2.getText(),liqq), columnas);
				scrollPane.setViewportView(table);
				model=table.getSelectionModel();
				table.setAutoCreateRowSorter(true);
				model.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged (ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
								btnEditar.setEnabled(true);
								btnNewButton.setEnabled(true);
								
								String aux1ID= (String) table.getValueAt(model.getMinSelectionIndex(), 0);
								String aux2DOMINIO= (String) table.getValueAt(model.getMinSelectionIndex(), 1);
								
								camion=(new Listas()).buscarCamion(aux1ID,aux2DOMINIO);
							}
						}
					});
			}
		});
		
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnEditar.setEnabled(false);
				btnNewButton.setEnabled(false);
				String liqq = "0";
				if(rdbtnS.isSelected()) {
					liqq="1";
				}else if(rdbtnNo.isSelected()){
					liqq="2";
				}
				table=new JTable(actualizarTabla(datosCamiones,textField.getText(),textField_1.getText(),textField_2.getText(),liqq), columnas);
				scrollPane.setViewportView(table);
				model=table.getSelectionModel();
				table.setAutoCreateRowSorter(true);
				model.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged (ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
								btnEditar.setEnabled(true);
								btnNewButton.setEnabled(true);
								
								String aux1ID= (String) table.getValueAt(model.getMinSelectionIndex(), 0);
								String aux2DOMINIO= (String) table.getValueAt(model.getMinSelectionIndex(), 1);
								
								camion=(new Listas()).buscarCamion(aux1ID,aux2DOMINIO);
							}
						}
					});
			}
		});
		
		
		
		model.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged (ListSelectionEvent e) {
				if(!model.isSelectionEmpty()) {
						btnEditar.setEnabled(true);
						btnNewButton.setEnabled(true);
						
						String aux1ID= (String) table.getValueAt(model.getMinSelectionIndex(), 0);
						String aux2DOMINIO= (String) table.getValueAt(model.getMinSelectionIndex(), 1);
						
						camion=(new Listas()).buscarCamion(aux1ID,aux2DOMINIO);
					}
				}
			});
		
	} 
	
	public Object[][] actualizarTabla(Object[][] datos, String id, String dominio, String cant, String liq){
		
		Listas datosFinal = new Listas();
		ArrayList<Camion> listaCamiones = new ArrayList<Camion>();
		String idAux;
		String domAux;
		String cantAux;
		String liqAux;
		Camion cam = new Camion();
		for(int i=0; i<datos.length;i++) {
			idAux=(String) datos[i][0];
			domAux=(String) datos[i][1];
			cantAux= Double.toString((double)datos[i][2]);
			if(((String) datos[i][3]).contains("Si")) {
				liqAux = "1";
			}else { liqAux = "2";}
			
			if(idAux.contains(id) && domAux.contains(dominio) && cantAux.contains(cant)) {
				if(liq.contains(liqAux)) {
					cam = datosFinal.buscarCamion(idAux, domAux);
					listaCamiones.add(cam);
				} else if(liq.contains("0")){
					cam = datosFinal.buscarCamion(idAux, domAux);
					listaCamiones.add(cam);
				}
			}
		}
		
		datosFinal.setListaCamiones(listaCamiones);
		return datosFinal.getBusquedaCamiones();
	  }
	}


