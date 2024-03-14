package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieapp {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapp window = new movieapp();
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
	public movieapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("movie app");
		lblNewLabel_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setBounds(105, 11, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setForeground(new Color(64, 0, 128));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2.setBounds(31, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("movie");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_3.setBounds(31, 100, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("no of tickets");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_4.setBounds(31, 158, 90, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(213, 51, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "bheema", "gaami", "premalu"}));
		cb1.setBounds(213, 96, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(213, 154, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(movie.equals("bheema"))
				{
					bill=bill+150*nt;
				}
				if(movie.equals("gaami"))
				{
					bill=bill+200*nt;
			}
				if(movie.equals("premalu"))
				{
					bill=bill+100*nt;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"name   "+name+"\nmovie   "+movie+"\nticket   "+tickets+"\n amount "+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "booking confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "booking canceled");
					
				}
			}
		});
		btnNewButton.setBounds(115, 208, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\Screenshots\\movie.jpg.png"));
		lblNewLabel.setBounds(0, 0, 371, 253);
		frame.getContentPane().add(lblNewLabel);
	}
}
