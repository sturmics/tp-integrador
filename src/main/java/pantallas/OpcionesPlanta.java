package pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpcionesPlanta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionesPlanta window = new OpcionesPlanta();
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
	public OpcionesPlanta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Opciones");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEditarPlanta = new JButton("Editar planta");
		btnEditarPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarPlanta editP = new EditarPlanta();
				editP.main(null);
				frame.dispose();
			}
		});
		btnEditarPlanta.setBounds(150, 138, 130, 35);
		frame.getContentPane().add(btnEditarPlanta);
		
		JButton btnEliminarPlanta = new JButton("Eliminar planta");
		btnEliminarPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarPlanta deleteP=new EliminarPlanta();
				deleteP.main(null);
				frame.dispose();
			}
		});
		btnEliminarPlanta.setBounds(150, 180, 130, 35);
		frame.getContentPane().add(btnEliminarPlanta);
		
		JLabel lblPlantaSeleccionada = new JLabel("Nombre:");
		lblPlantaSeleccionada.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlantaSeleccionada.setBounds(85, 64, 60, 20);
		frame.getContentPane().add(lblPlantaSeleccionada);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(85, 38, 60, 20);
		frame.getContentPane().add(lblId);
		
		JButton btnVerInsumos = new JButton("Ver insumos");
		btnVerInsumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VerInsumosDePlanta insumosP = new VerInsumosDePlanta();
				insumosP.main(null);
				//frame.dispose();
			}
		});
		btnVerInsumos.setBounds(150, 95, 130, 35);
		frame.getContentPane().add(btnVerInsumos);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarPlanta buscP = new BuscarPlanta();
				buscP.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDePlantas gestionP = new GestionDePlantas();
				gestionP.main(null);
				frame.dispose();
			}
		});
		btnAceptar.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnAceptar);
	}
}
