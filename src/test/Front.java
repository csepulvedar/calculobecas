package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Choice;

public class Front {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmBecas;
	private JMenuItem mntmCargarValoresDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front window = new Front();
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
	public Front() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 261, Short.MAX_VALUE)
		);
		frame.getContentPane().setLayout(groupLayout);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Datos");
		menuBar.add(mnNewMenu);
		
		mntmBecas = new JMenuItem("Cargar Valores Becas y Creditos");
		mnNewMenu.add(mntmBecas);
		
		mntmCargarValoresDe = new JMenuItem("Cargar Valores de Carreras");
		mnNewMenu.add(mntmCargarValoresDe);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnNewMenu.add(mntmSalir);
	}
}
