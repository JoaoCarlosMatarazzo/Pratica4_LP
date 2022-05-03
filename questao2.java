package meuPacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;
	private JTextField valor3;
	
	int v1, v2, v3;
	int total;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao2 frame = new questao2();
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
	public questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quantidade de Seletores IDs");
		lblNewLabel.setBounds(46, 49, 147, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade de Seletores Classes");
		lblNewLabel_1.setBounds(46, 100, 165, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade de Seletores Tags");
		lblNewLabel_2.setBounds(46, 150, 147, 14);
		contentPane.add(lblNewLabel_2);
		
		valor1 = new JTextField();
		valor1.setBounds(221, 46, 86, 20);
		contentPane.add(valor1);
		valor1.setColumns(10);		
		valor2 = new JTextField();
		valor2.setBounds(221, 97, 86, 20);
		contentPane.add(valor2);
		valor2.setColumns(10);
		
		valor3 = new JTextField();
		valor3.setBounds(221, 147, 86, 20);
		contentPane.add(valor3);
		valor3.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v1 = Integer.parseInt(valor1.getText()) * 100;
				v2 = Integer.parseInt(valor2.getText()) * 10;
				v3 = Integer.parseInt(valor3.getText()) * 1;
				total = v1+v2+v3;
				JOptionPane.showMessageDialog(null," o total de pontos é: "+total+"/ln IDs = "+v1+"/ln Classes = "+v2+"/ln Tags = "+v3,null,JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnNewButton.setBounds(169, 203, 89, 23);
		contentPane.add(btnNewButton);
	}
}
