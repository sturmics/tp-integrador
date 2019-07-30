package pantallas;

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
		
		JButton btnSeleccinDeEnvo = new JButton("Selección de envío");
		btnSeleccinDeEnvo.setBounds(60, 60, 130, 40);
		frame.getContentPane().add(btnSeleccinDeEnvo);
		
		JButton btnAgregarCamin = new JButton("Agregar camión");
		btnAgregarCamin.setBounds(230, 60, 130, 40);
		frame.getContentPane().add(btnAgregarCamin);
		
		JButton btnVerListaCamiones = new JButton("Ver lista camiones");
		btnVerListaCamiones.setBounds(60, 120, 130, 40);
		frame.getContentPane().add(btnVerListaCamiones);
		
		JButton btnBuscarCamin = new JButton("Buscar camión");
		btnBuscarCamin.setBounds(230, 120, 130, 40);
		frame.getContentPane().add(btnBuscarCamin);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnSalir);
	}

}
