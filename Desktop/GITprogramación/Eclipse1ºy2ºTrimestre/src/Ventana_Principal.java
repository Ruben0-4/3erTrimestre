import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JScrollPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Ventana_Principal extends JFrame {

	private JPanel contentPane;
	static Ventana_Principal Ventana1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 = new Ventana_Principal();
					Ventana1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));

		setContentPane(contentPane);
			contentPane.setLayout(null);
		
			Canvas canvas = new Canvas();
			canvas.setBounds(40, 31, 0, 0);
		canvas.setForeground(new Color(0, 0, 0));
		contentPane.add(canvas);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Página Web");
		lblNewJgoodiesTitle.setForeground(new Color(255, 0, 255));
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setFont(new Font("MV Boli", Font.BOLD, 25));
		lblNewJgoodiesTitle.setBounds(60, 31, 305, 39);
		contentPane.add(lblNewJgoodiesTitle);
		
		JButton btnAHGGASASAS = new JButton("Iniciar Sesión"); 
		btnAHGGASASAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new VentanaIniciar();
				frame.setVisible(true);
				//Ventana1.setVisible(false);
				dispose();
			}
		});
		
		btnAHGGASASAS.setBounds(40, 173, 123, 23);
		contentPane.add(btnAHGGASASAS);
		

		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new VentanaRegistrarse();
				frame.setVisible(true);
				//Ventana1.setVisible(false);
				dispose(); 
			}
		});
		btnNewButton_1.setBounds(40, 81, 123, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Palito Peligros\\Desktop\\3er Trimestre\\Programación Interfaces\\fondo.jpg"));
		lblNewLabel.setBounds(-154, -13, 629, 292);
		contentPane.add(lblNewLabel);
	}
}
