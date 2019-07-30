package pantallas;

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
		
		JButton btnVerMapa = new JButton("Ver mapa");
		btnVerMapa.setBounds(150, 40, 130, 40);
		frame.getContentPane().add(btnVerMapa);
		
		JButton btnCrearRuta = new JButton("Crear ruta");
		btnCrearRuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearRuta.setBounds(150, 100, 130, 40);
		frame.getContentPane().add(btnCrearRuta);
		
		JButton btnFlujoMximoDe = new JButton("Flujo máximo de red");
		btnFlujoMximoDe.setBounds(150, 160, 130, 40);
		frame.getContentPane().add(btnFlujoMximoDe);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnSalir);
	}

}
