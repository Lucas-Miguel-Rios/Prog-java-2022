package br.com.senaisp.aula23.classes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioTeste extends JFrame {

	private JLabel labelNome;
	private JLabel labelEndereco;
	private JTextField textNome;
	private JTextField textEndereco;
	private JButton btnOlaMundo;
	private JButton btnOlaClasse;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FormularioTeste() {
		super("Titulo da Janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void exibirForm() {
		exibirFormFlow();
	}
	
	protected void criarComponentes() {
		labelNome = new JLabel("Nome do Cliente");
		textNome = new JTextField("digite aqui o conte?do");
		labelEndereco = new JLabel("Endere?o do Cliente");
		textEndereco = new JTextField("digite aqui o conte?do");
		btnOlaMundo = new JButton("Click-me");
		btnOlaClasse = new JButton("Click-me Ol? Classe");
		EventoPadrao evt = new EventoPadrao();
		btnOlaMundo.addActionListener(evt);
		btnOlaClasse.addActionListener(evt);
	}
	
	protected void addComponentes2Panel() {
		addComponentes2Panel(false);
	}
	
	protected void addComponentes2Panel(boolean isBordered) {
		if (isBordered) {
			getContentPane().add(labelNome,BorderLayout.NORTH);
			getContentPane().add(textNome, BorderLayout.SOUTH);
			getContentPane().add(labelEndereco,BorderLayout.EAST);
			getContentPane().add(textEndereco,BorderLayout.WEST);
			getContentPane().add(btnOlaMundo,BorderLayout.WEST);
		} else {
			getContentPane().add(labelNome);
			getContentPane().add(textNome);
			getContentPane().add(labelEndereco);
			getContentPane().add(textEndereco);
			getContentPane().add(btnOlaMundo);
			getContentPane().add(btnOlaClasse);
		}
	}
	
	public void exibirFormAbsoluto() {
		setSize(500, 300);
		//setLocation(300, 300);
		//Centralizando a Janela no computador
		setLocationRelativeTo(null);
		criarComponentes();
		//Colocando os posicionamentos
		labelNome.setBounds(10, 10, 100, 25);
		textNome.setBounds(110, 10, 200, 25);
		labelEndereco.setBounds(10, 50, 130, 25);
		textEndereco.setBounds(140, 50, 200, 25);
		//Colocando como Layout Absoluto
		getContentPane().setLayout(null);
		
		addComponentes2Panel();
		
		setVisible(true);		
	}
	
	public void exibirFormFlow() {
		setSize(500, 300);
		//setLocation(300, 300);
		//Centralizando a Janela no computador
		setLocationRelativeTo(null);
		criarComponentes();
		//Colocando o FlowLayout
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		addComponentes2Panel();
		
		setVisible(true);		
	}
	
	public void exibirFormBorder() {
		setSize(500, 300);
		//setLocation(300, 300);
		//Centralizando a Janela no computador
		setLocationRelativeTo(null);
		criarComponentes();
		//Colocando o BorderLayout
		getContentPane().setLayout(new BorderLayout());
		
		addComponentes2Panel(true);
		
		setVisible(true);		
	}

	public void exibirFormGrid() {
		setSize(500, 300);
		//setLocation(300, 300);
		//Centralizando a Janela no computador
		setLocationRelativeTo(null);
		criarComponentes();
		//Colocando o GridLayout
		getContentPane().setLayout(new GridLayout(2,2));
		
		addComponentes2Panel();
		
		setVisible(true);		
	}
	
	class EventoPadrao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnOlaMundo) {
				JOptionPane.showMessageDialog(null, "Ol? Mundo");
			} else if (e.getSource() == btnOlaClasse) {
				JOptionPane.showMessageDialog(null, "Ol? Classe, tudo bem?");
			}
			
		}
		
	}

}