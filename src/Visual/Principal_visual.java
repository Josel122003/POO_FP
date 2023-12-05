package Visual;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Principal_visual extends JFrame {

	private JPanel contentPane;

	
	//cambios
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal_visual frame = new Principal_visual();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal_visual() {
		setTitle("Principal");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 765, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\equipo-medico.png"));
		button.setForeground(new Color(30, 144, 255));
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(10, 0, 97, 80);
		panel.add(button);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 79, 116, 331);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 255, 240));
		
		JMenuItem MI_ini = new JMenuItem("INCIO");
		MI_ini.setBounds(0, 11, 106, 38);
		panel_1.add(MI_ini);
		MI_ini.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\casa.png"));
		
		JMenuItem MI_pa = new JMenuItem("Pacientes");
		MI_pa.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\grupo-de-chat.png"));
		MI_pa.setBounds(0, 57, 106, 38);
		panel_1.add(MI_pa);
		
		JMenuItem MI_doc = new JMenuItem("DOCTORES");
		MI_doc.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\doctor.png"));
		MI_doc.setBounds(0, 106, 116, 38);
		panel_1.add(MI_doc);
	}
}
