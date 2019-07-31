
//FALTAN LOS BOTONES ATRÁS Y CREAR PLANTA, 


package isi.died.tp.pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionDePlantas {

	private JFrame frame;
	private final JButton btnVerPlantras = new JButton("Ver plantras");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDePlantas window = new GestionDePlantas();
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
	public GestionDePlantas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Gestión de Plantas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnVerPlantras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		//frame.getContentPane().add(btnVerPlantas, BorderLayout.CENTER);
		frame.getContentPane().setLayout(null);
		
		JButton btnVerPlantas = new JButton("Ver plantas");
		btnVerPlantas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerPlantas verplantas = new VerPlantas();
				verplantas.main(null);
				frame.dispose();
			}
		});
		btnVerPlantas.setBounds(144, 41, 130, 40);
		frame.getContentPane().add(btnVerPlantas);
		
		JButton btnCrearPlanta = new JButton("Crear planta");
		btnCrearPlanta.setBounds(144, 92, 130, 40);
		frame.getContentPane().add(btnCrearPlanta);
		btnCrearPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaAgregarPlanta gestT=new PantallaAgregarPlanta();
				gestT.main(null);
				frame.dispose();
			}
		});
		
		JButton btnBuscarPlanta = new JButton("Buscar planta");
		btnBuscarPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarPlanta buscplant = new BuscarPlanta();
				buscplant.main(null);
				frame.dispose();
			}
		});
		btnBuscarPlanta.setBounds(144, 143, 130, 40);
		frame.getContentPane().add(btnBuscarPlanta);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaPrincipal ppal=new PantallaPrincipal();
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
