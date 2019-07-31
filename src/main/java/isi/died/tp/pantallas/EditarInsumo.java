package isi.died.tp.pantallas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.InsumoLiquido;
import isi.died.tp.dominio.UnidadMedida;

public class EditarInsumo {

	private JFrame frame;
	
	private JTextField tfId;
	private JTextField tfDescripcion;
	private JTextField tfCosto;
	private JTextField tfStock;
	private static Insumo seleccion;
	
	private final ButtonGroup buttonGroupRefrigerado = new ButtonGroup();
	private final ButtonGroup buttonGroupLiquidos = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(Insumo insumo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarInsumo window = new EditarInsumo(insumo);
					window.frame.setVisible(true);
					}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditarInsumo(Insumo insumo) {
		seleccion=insumo;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Editar Insumo");
		frame.setSize(500,380);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel editarCampos = new JLabel("Editar los campos del Insumo: ");
		editarCampos.setBounds(10, 11, 164, 14);
		frame.getContentPane().add(editarCampos);
		
		tfId = new JTextField();
		tfId.setBounds(214, 36, 130, 20);
		frame.getContentPane().add(tfId);
		tfId.setColumns(10);
		
		JButton agregarInsumo = new JButton("Agregar Insumo");
		agregarInsumo.setBounds(349, 305, 125, 25);
		frame.getContentPane().add(agregarInsumo);
		
		JButton Atrás = new JButton("Atrás");
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarInsumos bInsumos = new BuscarInsumos();
				bInsumos.main(null);
				frame.dispose();
			}
		});
		Atrás.setBounds(10, 305, 100, 25);
		frame.getContentPane().add(Atrás);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(164, 39, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblDescripcin = new JLabel("Descripción: ");
		lblDescripcin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescripcin.setBounds(10, 70, 200, 14);
		frame.getContentPane().add(lblDescripcin);
		
		tfDescripcion = new JTextField();
		tfDescripcion.setColumns(10);
		tfDescripcion.setBounds(214, 67, 130, 20);
		frame.getContentPane().add(tfDescripcion);

		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida: ");
		lblUnidadDeMedida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnidadDeMedida.setBounds(10, 98, 200, 14);
		frame.getContentPane().add(lblUnidadDeMedida);
		
		JLabel lblCostoPorUnidad = new JLabel("Costo por unidad: ");
		lblCostoPorUnidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostoPorUnidad.setBounds(10, 126, 200, 14);
		frame.getContentPane().add(lblCostoPorUnidad);
		
		tfCosto = new JTextField();
		tfCosto.setColumns(10);
		tfCosto.setBounds(214, 123, 130, 20);
		frame.getContentPane().add(tfCosto);

		JLabel lblStockEnCentro = new JLabel("Stock en centro de acopio: ");
		lblStockEnCentro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStockEnCentro.setBounds(10, 154, 200, 14);
		frame.getContentPane().add(lblStockEnCentro);
		
		tfStock = new JTextField();
		tfStock.setColumns(10);
		tfStock.setBounds(214, 151, 130, 20);
		frame.getContentPane().add(tfStock);

		
		JLabel lblRef = new JLabel("¿Es refrigerado? ");
		lblRef.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRef.setBounds(10, 182, 200, 14);
		frame.getContentPane().add(lblRef);
		
		JComboBox cbUnidad = new JComboBox();
		cbUnidad.setModel(new DefaultComboBoxModel(UnidadMedida.values()));
		cbUnidad.setBounds(214, 95, 130, 20);
		frame.getContentPane().add(cbUnidad);

		
		JRadioButton siR = new JRadioButton("Si");
		siR.setBounds(214, 178, 46, 23);
		frame.getContentPane().add(siR);

		
		JRadioButton noR = new JRadioButton("No");
		noR.setBounds(298, 178, 46, 23);
		frame.getContentPane().add(noR);

		JLabel lblesLquido = new JLabel("¿Es líquido? ");
		lblesLquido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblesLquido.setBounds(10, 207, 200, 14);
		frame.getContentPane().add(lblesLquido);
		
		JRadioButton noL = new JRadioButton("No");
		noL.setBounds(298, 204, 46, 23);
		frame.getContentPane().add(noL);

		JRadioButton siL = new JRadioButton("Si");
		siL.setBounds(214, 204, 46, 23);
		frame.getContentPane().add(siL);
		
		buttonGroupRefrigerado.add(noR);
		buttonGroupRefrigerado.add(siR);
		buttonGroupLiquidos.add(noL);
		buttonGroupLiquidos.add(siL);
		
		JLabel lblPeso = new JLabel("Peso: ");
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setBounds(10, 232, 200, 14);
		frame.getContentPane().add(lblPeso);
		lblPeso.setVisible(false);
		
		JTextField tfPeso = new JTextField();
		tfPeso.setColumns(10);
		tfPeso.setBounds(214, 229, 130, 20);
		frame.getContentPane().add(tfPeso);
		tfPeso.setVisible(false);
		
		JLabel lblDensidad = new JLabel("Densidad: ");
		lblDensidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDensidad.setBounds(10, 232, 200, 14);
		frame.getContentPane().add(lblDensidad);
		lblDensidad.setVisible(false);
		
		JTextField tfDensidad = new JTextField();
		tfDensidad.setColumns(10);
		tfDensidad.setBounds(214, 229, 130, 20);
		frame.getContentPane().add(tfDensidad);
		tfDensidad.setVisible(false);
		
		JLabel lblVol = new JLabel("Volumen: ");
		lblVol.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVol.setBounds(10, 263, 200, 14);
		frame.getContentPane().add(lblVol);
		lblVol.setVisible(false);
		
		JTextField tfVol = new JTextField();
		tfVol.setColumns(10);
		tfVol.setBounds(214, 260, 130, 20);
		frame.getContentPane().add(tfVol);
		tfVol.setVisible(false);
		
		tfId.setText(seleccion.getId());
		tfDescripcion.setText(seleccion.getDescripcion());
		tfCosto.setText(String.valueOf(seleccion.getCosto()));
		tfStock.setText(String.valueOf(seleccion.getStock()));
		cbUnidad.setSelectedItem(seleccion.getUnidad());
		siR.setSelected(seleccion.isEsRefrigerado());
		noR.setSelected(!seleccion.isEsRefrigerado());
		noL.setSelected(!(seleccion instanceof InsumoLiquido));
		siL.setSelected(seleccion instanceof InsumoLiquido);	
		if(!(seleccion instanceof InsumoLiquido)){
			tfPeso.setVisible(true);
			lblPeso.setVisible(true);
			tfPeso.setText(String.valueOf(seleccion.getPeso()));
		}
		if(seleccion instanceof InsumoLiquido) {
			tfDensidad.setVisible(true);
			tfVol.setVisible(true);
			lblDensidad.setVisible(true);
			lblVol.setVisible(true);
			tfDensidad.setText(String.valueOf(((InsumoLiquido)seleccion).getDensidad()));
			tfVol.setText(String.valueOf(((InsumoLiquido)seleccion).getVolumen()));
		}
		
		siL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPeso.setVisible(false);
				lblDensidad.setVisible(true);
				lblVol.setVisible(true);
				tfPeso.setVisible(false);
				tfDensidad.setVisible(true);
				tfVol.setVisible(true);
			}
		});
		
		noL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPeso.setVisible(true);
				lblDensidad.setVisible(false);
				lblVol.setVisible(false);
				tfPeso.setVisible(true);
				tfDensidad.setVisible(false);
				tfVol.setVisible(false);
			}
		});
	}
}
