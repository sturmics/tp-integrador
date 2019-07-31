package isi.died.tp.pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class GestionDeTransporte {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDeTransporte window = new GestionDeTransporte();
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
	public GestionDeTransporte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Gestión de Transporte");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAgregarCamin = new JButton("Agregar camión");
		btnAgregarCamin.setBounds(147, 60, 130, 40);
		frame.getContentPane().add(btnAgregarCamin);
		
		JButton btnBuscarCamin = new JButton("Buscar camión");
		btnBuscarCamin.setBounds(147, 120, 130, 40);
		frame.getContentPane().add(btnBuscarCamin);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnSalir);
	}

}
