package isi.died.tp.pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionDeLogistica {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDeLogistica window = new GestionDeLogistica();
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
	public GestionDeLogistica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Gestión de Logística");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnVerMapa = new JButton("Ver mapa");
		btnVerMapa.setBounds(30, 60, 170, 40);
		frame.getContentPane().add(btnVerMapa);
		
		JButton btnCrearRuta = new JButton("Crear ruta");
		btnCrearRuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearRuta.setBounds(230, 60, 170, 40);
		frame.getContentPane().add(btnCrearRuta);
		
		JButton btnFlujoMximoDe = new JButton("Flujo máximo de red");
		btnFlujoMximoDe.setBounds(30, 120, 170, 40);
		frame.getContentPane().add(btnFlujoMximoDe);
		
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
		
		JButton btnSeleccinDeEnvo = new JButton("Selección de envío");
		btnSeleccinDeEnvo.setBounds(230, 120, 170, 40);
		frame.getContentPane().add(btnSeleccinDeEnvo);
	}

}
