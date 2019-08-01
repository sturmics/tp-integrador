package isi.died.tp.pantallas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EliminarCamion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarCamion window = new EliminarCamion();
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
	public EliminarCamion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Eliminar Camión");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(129, 40, 50, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dominio:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(129, 65, 50, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
	//	String id = Integer.toString(planta.getId());
	//	JLabel lblIdPlanta = new JLabel(id);
	//	lblIdPlanta.setHorizontalAlignment(SwingConstants.LEFT);
	//	lblIdPlanta.setBounds(190, 59, 80, 14);
	//	frame.getContentPane().add(lblIdPlanta);
		
	//	JLabel lblNombrePlanta = new JLabel(planta.getNombre());
	//	lblNombrePlanta.setHorizontalAlignment(SwingConstants.LEFT);
	//	lblNombrePlanta.setBounds(190, 81, 140, 14);
	//	frame.getContentPane().add(lblNombrePlanta);
		
		JLabel lbldeseaEliminarLa = new JLabel("Si presiona \"Eliminar\" el camión seleccionado\r\n");
		lbldeseaEliminarLa.setLabelFor(frame);
		lbldeseaEliminarLa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbldeseaEliminarLa.setHorizontalAlignment(SwingConstants.CENTER);
		lbldeseaEliminarLa.setBounds(79, 156, 275, 14);
		frame.getContentPane().add(lbldeseaEliminarLa);
		
		JLabel lblSeEliminarPermanentemente = new JLabel(" se eliminará permanentemente.");
		lblSeEliminarPermanentemente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeEliminarPermanentemente.setLabelFor(frame);
		lblSeEliminarPermanentemente.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeEliminarPermanentemente.setBounds(101, 170, 228, 14);
		frame.getContentPane().add(lblSeEliminarPermanentemente);
		
		JButton btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarCamion opP=new BuscarCamion();
				opP.main(null);
				frame.dispose();
			}
		});
		btnAtrs.setBounds(10, 225, 100, 25);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarCamion opP=new BuscarCamion();
				opP.main(null);
				frame.dispose();
			}
			
		});
		btnEliminar.setBounds(324, 225, 100, 25);
		frame.getContentPane().add(btnEliminar);
		
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidad.setBounds(79, 90, 100, 14);
		frame.getContentPane().add(lblCapacidad);
		
		JLabel lblAptoParaLquidos = new JLabel("Apto para líquidos:");
		lblAptoParaLquidos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAptoParaLquidos.setBounds(39, 118, 140, 14);
		frame.getContentPane().add(lblAptoParaLquidos);
	}

}
