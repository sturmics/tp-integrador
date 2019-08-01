package isi.died.tp.pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btnAgregarCamin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaAgregarCamion ppal = new PantallaAgregarCamion();
				ppal.main(null);
				frame.dispose();
			}
		});
		btnAgregarCamin.setBounds(147, 60, 130, 40);
		frame.getContentPane().add(btnAgregarCamin);
		
		JButton btnBuscarCamin = new JButton("Buscar camión");
		btnBuscarCamin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarCamion ppal = new BuscarCamion();
				ppal.main(null);
				frame.dispose();
			}
		});
		btnBuscarCamin.setBounds(147, 120, 130, 40);
		frame.getContentPane().add(btnBuscarCamin);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaPrincipal ppal = new PantallaPrincipal();
				ppal.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnSalir);
	}

}
