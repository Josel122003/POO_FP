package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Principal extends JFrame {
	
	private Dimension dim;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setForeground(Color.BLACK);
		setTitle("Pagina Principal\r\n");
		setResizable(false);
		dim = getToolkit().getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.CYAN);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Pacientes \r\n");
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/images/3633274 (1) (1) (1).png")));
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setBackground(Color.CYAN);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Consultas");
		mnNewMenu_1.setIcon(new ImageIcon(Principal.class.getResource("/images/1950715 (1).png")));
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		mnNewMenu_1.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(350, -159, 1904, 979);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/images/330087979d837e6d51faeb778ec503af.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/images/330087979d837e6d51faeb778ec503af.png")));
		lblNewLabel_1.setBounds(142, 223, 69, 20);
		contentPane.add(lblNewLabel_1);
		setSize(dim.width, dim.height-20);
		setLocationRelativeTo(null);
	}
}
