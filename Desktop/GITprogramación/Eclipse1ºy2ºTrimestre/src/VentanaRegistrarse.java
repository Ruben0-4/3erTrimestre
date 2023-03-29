import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;

public class VentanaRegistrarse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	static VentanaRegistrarse vg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vg= new VentanaRegistrarse();
					vg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegistrarse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Registrarse = DefaultComponentFactory.getInstance().createLabel("Registrarse aquí:");
		Registrarse.setForeground(new Color(255, 0, 0));
		Registrarse.setFont(new Font("Arial", Font.BOLD, 14));
		Registrarse.setHorizontalAlignment(SwingConstants.CENTER);
		Registrarse.setBounds(140, 11, 135, 31);
		contentPane.add(Registrarse);
		
		JLabel Correo1 = DefaultComponentFactory.getInstance().createLabel("Correo Electrónico");
		Correo1.setHorizontalAlignment(SwingConstants.CENTER);
		Correo1.setForeground(new Color(255, 128, 64));
		Correo1.setBounds(35, 56, 135, 14);
		contentPane.add(Correo1);
		
		JLabel Usuario = DefaultComponentFactory.getInstance().createLabel("Nombre Usuario");
		Usuario.setHorizontalAlignment(SwingConstants.CENTER);
		Usuario.setForeground(new Color(255, 128, 64));
		Usuario.setBounds(35, 113, 135, 14);
		contentPane.add(Usuario);
		
		JButton btnNewButton_3 = new JButton("Crear Cuenta");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Cuenta creada", "Página", JOptionPane.INFORMATION_MESSAGE) ;
				//vg.setVisible(false) ;
				dispose();
			}
		});
		btnNewButton_3.setBounds(140, 227, 142, 23);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(203, 53, 208, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 110, 208, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Contraseña2 = DefaultComponentFactory.getInstance().createLabel("Contraseña");
		Contraseña2.setHorizontalAlignment(SwingConstants.CENTER);
		Contraseña2.setForeground(new Color(255, 128, 64));
		Contraseña2.setBounds(35, 167, 135, 14);
		contentPane.add(Contraseña2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Palito Peligros\\Desktop\\3er Trimestre\\Programación Interfaces\\fondoventanas.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 164, 208, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(255, 255, 255));
		passwordField_1.setBounds(203, 164, 208, 20);
		contentPane.add(passwordField_1);
	}
}
