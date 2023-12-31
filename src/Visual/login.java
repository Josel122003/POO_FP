package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.Button;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField tx_user;
	private JPasswordField pf_login;

	
	//cambios
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setAutoRequestFocus(false);
		setType(Type.UTILITY);
		setTitle("LOGIN");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tx_user = new JTextField();
		tx_user.setBounds(154, 127, 163, 33);
		contentPane.add(tx_user);
		tx_user.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me?");
		chckbxNewCheckBox.setBounds(47, 254, 133, 23);
		chckbxNewCheckBox.setBackground(new Color(255, 215, 0));
		contentPane.add(chckbxNewCheckBox);
		
		pf_login = new JPasswordField();
		pf_login.setBounds(154, 189, 163, 33);
		contentPane.add(pf_login);
		
		Button btn_login = new Button("LOGIN");
		btn_login.setForeground(new Color(240, 248, 255));
		btn_login.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_login.setBackground(new Color(128, 0, 0));
		btn_login.setBounds(111, 279, 163, 43);
		contentPane.add(btn_login);
		
		JButton btnpass = new JButton("");
		btnpass.setEnabled(false);
		btnpass.setBackground(new Color(128, 0, 0));
		btnpass.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\llave.png"));
		btnpass.setBounds(70, 182, 50, 50);
		contentPane.add(btnpass);
		
		JButton btn_user = new JButton("");
		btn_user.setEnabled(false);
		btn_user.setSelectedIcon(new ImageIcon("C:\\Users\\Mr\\Downloads\\avatar (1).png"));
		btn_user.setForeground(new Color(0, 0, 0));
		btn_user.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\avatar (1).png"));
		btn_user.setBackground(new Color(128, 0, 0));
		btn_user.setBounds(70, 116, 50, 50);
		contentPane.add(btn_user);
		
		JButton btn_icon = new JButton("");
		btn_icon.setForeground(new Color(30, 144, 255));
		btn_icon.setBackground(new Color(30, 144, 255));
		btn_icon.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\usuario (1).png"));
		btn_icon.setBounds(149, 11, 97, 82);
		contentPane.add(btn_icon);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, tx_user, chckbxNewCheckBox, pf_login, btn_login, btnpass, btn_user, btn_icon}));
	}
}
