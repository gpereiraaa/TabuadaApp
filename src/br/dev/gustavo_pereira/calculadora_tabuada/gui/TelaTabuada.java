package br.dev.gustavo_pereira.calculadora_tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.ObjDoubleConsumer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.gustavo_pereira.calculadora_tabuada.model.Tabuada;

public class TelaTabuada {
	
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	
	private JScrollPane scrollTabuada;
	
	private JList listTabuada;
	
	private void exibirTabuada() {
	}
	private void limparTabuada() {
	}
	public void criarTelaTabuada() {
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(270, 675);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		// Vamos criar os componentes da tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setText(null);
		textMultiplicando.setBounds(180, 20, 50, 30);
		
		//---------------------------------------------------
		
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mín. Multiplicador: ");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setText(null);
		textMinMultiplicador.setBounds(180, 60, 50, 30);
		
		//--------------------------------------------------------
		
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máx. Multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);
		

		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setText(null);
		textMaxMultiplicador.setBounds(180, 100, 50, 30);
		
		//Criar botão
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		
		
		listTabuada = new JList();
		
		
		
		
		//Criar objeto scroll
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 180, 210, 400);	
		
		
		
		
		
		
		// Obtemos o painel de conteúdo e adicionamos o labelMultiplicando nesse painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(textMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(textMaxMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(scrollTabuada);		
		
		
		// Adicionar ouvintes de evento aos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Tabuada tabuada = new Tabuada();
				// Convertendo a string para double
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);
				
				// Convertendo a string para double
				String minMultiplicando = textMinMultiplicador.getText();
				double minMultiplicandoDouble = Double.valueOf(minMultiplicando);
				tabuada.setMinimoMultiplicador(minMultiplicandoDouble);
				
				// Convertendo a string para double
				String maxMultiplicando = textMaxMultiplicador.getText();
				double maxMultiplicandoDouble = Double.valueOf(maxMultiplicando);
				tabuada.setMaximoMultiplicador(maxMultiplicandoDouble);
				
				String[] tabuadaResultado = tabuada.mostrarTabuada();
				
				
				listTabuada.setListData(tabuadaResultado);
				
				
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMinMultiplicador.setText("");
				textMaxMultiplicador.setText("");
				listTabuada.setListData(new String[0]);
				textMultiplicando.requestFocus();
				
				
			}
		});
		
		
		//Essa linha deve ser a última linha desse método
		tela.setVisible(true);
		
		
	}
	

}
