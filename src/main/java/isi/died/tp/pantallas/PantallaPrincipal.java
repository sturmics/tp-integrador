//VER LINEAS 60 Y 61

package isi.died.tp.pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class PantallaPrincipal {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal window = new PantallaPrincipal();
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
	public PantallaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Menú");
		frame.setSize(450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton gestionPlantas = new JButton("Gestión de Plantas");
		gestionPlantas.setBounds(20, 60, 170, 40);
		frame.getContentPane().add(gestionPlantas);
		gestionPlantas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDePlantas gestP=new GestionDePlantas();
				gestP.main(null);
				frame.dispose();
			}
		});
		
		JButton gestionLogistica = new JButton("Gestión de Logística");
		gestionLogistica.setBounds(20, 120, 170, 40);
		frame.getContentPane().add(gestionLogistica);
		gestionLogistica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDeLogistica gestL=new GestionDeLogistica();
				gestL.main(null);
				frame.dispose();
			}
		});
		
		JButton gestionInsumos = new JButton("Gestión de Insumos");
		gestionInsumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionInsumos gInsumo = new GestionInsumos();
				gInsumo.main(null);
				frame.dispose();
			}
		});
		gestionInsumos.setBounds(230, 60, 170, 40);
		frame.getContentPane().add(gestionInsumos);
		
		JButton gestionTransporte = new JButton("Gestión de Transporte");
		gestionTransporte.setBounds(230, 120, 170, 40);
		frame.getContentPane().add(gestionTransporte);
		gestionTransporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDeTransporte gestT=new GestionDeTransporte();
				gestT.main(null);
				frame.dispose();
			}
		});
		
		JButton salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		salir.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(salir);
	}
}
