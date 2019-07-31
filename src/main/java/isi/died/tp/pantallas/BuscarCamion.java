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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import isi.died.tp.dominio.UnidadMedida;
import java.awt.Font;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Buscar Camión");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(44, 89, 46, 14);
		frame.getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(95, 86, 93, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblIngreseLosDatos = new JLabel("Ingrese los datos de búsqueda ");
		lblIngreseLosDatos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIngreseLosDatos.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngreseLosDatos.setBounds(10, 45, 178, 14);
		frame.getContentPane().add(lblIngreseLosDatos);
		
		lblBsquedaopcional = new JLabel("(opcional):");
		lblBsquedaopcional.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBsquedaopcional.setHorizontalAlignment(SwingConstants.LEFT);
		lblBsquedaopcional.setBounds(10, 61, 150, 14);
		frame.getContentPane().add(lblBsquedaopcional);
		
		lblNombre = new JLabel("Dominio:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(20, 117, 70, 14);
		frame.getContentPane().add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 114, 93, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpcionesPlanta opP = new OpcionesPlanta();
				opP.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(324, 226, 100, 25);
		frame.getContentPane().add(btnNewButton);
		
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
		
		String[] columnNames = {"ID","Años"};
		DefaultTableModel dtm= new DefaultTableModel(null,columnNames);
		
		JLabel lblPlantasEncontradas = new JLabel("Camiones encontrados:");
		lblPlantasEncontradas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPlantasEncontradas.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlantasEncontradas.setBounds(198, 20, 128, 14);
		frame.getContentPane().add(lblPlantasEncontradas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(198, 54, 226, 151);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"ID", "Nombre"
			}
		));
		
		lblIdInsumo = new JLabel("Capacidad:");
		lblIdInsumo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIdInsumo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdInsumo.setBounds(20, 145, 70, 14);
		frame.getContentPane().add(lblIdInsumo);
		
		lblAptoParaLquidos = new JLabel("Apto para líquidos:");
		lblAptoParaLquidos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAptoParaLquidos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAptoParaLquidos.setBounds(-3, 170, 100, 14);
		frame.getContentPane().add(lblAptoParaLquidos);
		
		JRadioButton rdbtnS = new JRadioButton("Sí");
		rdbtnS.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnS.setBounds(102, 166, 33, 23);
		frame.getContentPane().add(rdbtnS);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNo.setBounds(137, 166, 39, 23);
		frame.getContentPane().add(rdbtnNo);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(95, 142, 46, 20);
		frame.getContentPane().add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox.setModel(new DefaultComboBoxModel(UnidadMedida.values()));
		comboBox.setBounds(142, 142, 46, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(214, 226, 100, 25);
		frame.getContentPane().add(btnEditar);
	} 
	}


