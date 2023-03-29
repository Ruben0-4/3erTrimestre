import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VentanaBienvenido extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBienvenido frame = new VentanaBienvenido();
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
	public VentanaBienvenido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo = DefaultComponentFactory.getInstance().createLabel("BIENVENIDO A ESTA PÁGINA");
		Titulo.setFont(new Font("Arial", Font.BOLD, 18));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setBounds(69, 149, 296, 81);
		contentPane.add(Titulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Palito Peligros\\Desktop\\3er Trimestre\\Programación Interfaces\\fondobienvenido.jpg"));
		lblNewLabel.setBounds(-119, 0, 605, 382);
		contentPane.add(lblNewLabel);
	}

}
