import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaIniciar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	static VentanaIniciar Ventana2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 = new VentanaIniciar();
					Ventana2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaIniciar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Inicio = DefaultComponentFactory.getInstance().createLabel("Iniciar Sesión");
		Inicio.setFont(new Font("Arial", Font.BOLD, 14));
		Inicio.setForeground(new Color(255, 0, 0));
		Inicio.setBounds(166, 25, 141, 14);
		contentPane.add(Inicio);
		
		textField = new JTextField();
		textField.setBounds(243, 74, 168, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Iniciar Sesión\r\n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new VentanaBienvenido();
				frame.setVisible(true);
				//Ventana1.setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(139, 214, 168, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel Correo = new JLabel("Correo o Usuario\r\n:");
		Correo.setHorizontalAlignment(SwingConstants.CENTER);
		Correo.setForeground(new Color(255, 128, 0));
		Correo.setBounds(33, 77, 153, 14);
		contentPane.add(Correo);
		
		JLabel Contraseña = new JLabel("Contraseña\r\n:");
		Contraseña.setHorizontalAlignment(SwingConstants.CENTER);
		Contraseña.setForeground(new Color(255, 128, 0));
		Contraseña.setBounds(33, 136, 153, 14);
		contentPane.add(Contraseña);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(243, 133, 168, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Palito Peligros\\Desktop\\3er Trimestre\\Programación Interfaces\\fondoventanas.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_2);
	}
}
