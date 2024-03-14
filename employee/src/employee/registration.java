package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("student registration");
		lblNewLabel.setBounds(142, 11, 160, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(10, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("roll no");
		lblNewLabel_2.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setBounds(10, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setBounds(10, 114, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("prog lang");
		lblNewLabel_5.setBounds(10, 147, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(109, 36, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(109, 63, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setBounds(75, 110, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setBounds(193, 110, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("python");
		c1.setBounds(72, 143, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("java");
		c2.setBounds(167, 143, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("c");
		c3.setBounds(265, 143, 97, 23);
		frame.getContentPane().add(c3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setForeground(new Color(255, 255, 255));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "cse", "ds", "cs", "iot"}));
		cb1.setBounds(109, 85, 89, 22);
		frame.getContentPane().add(cb1);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender="";
				String proglang="";
				if(r1.isSelected())
				{
					gender="male";
				}
				else
				{
					gender="female";
					
				}
				if(c1.isSelected())
				{
					proglang=proglang+"python";
				}
				if(c2.isSelected())
				{
					proglang=proglang+"java";
				}
				if(c3.isSelected())
				{
					proglang=proglang+"c";
				}
				JOptionPane.showMessageDialog(btnNewButton, "name   "+name+"\nrollno   "+rollno+"\n branch  "+branch+ "\ngender  "+gender+"\nproglang  "+proglang);
				
			}
		});
		btnNewButton.setBounds(109, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
