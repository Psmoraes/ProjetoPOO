package interfacagrafica;

import java.awt.GridLayout;

import javax.swing.*;

public class JanelaMenu extends JFrame{
	private JPanel painel= new JPanel();
	private JButton btnCadastrarLocomotiva, btnCadastrarVagao,btnComposicao, btnListaLocomotiva,btnListaVagao;
	JanelaMenu(){
		super("Composi��o Ferrovi�ria");
		btnCadastrarLocomotiva = new JButton("Cadastrar Locomotiva");
		btnCadastrarVagao = new JButton("Cadastrar Vag�o");
		btnComposicao = new JButton("Composi��o");
		btnListaLocomotiva = new JButton("Consultar/Remover Locomotiva");
		btnListaVagao = new JButton("Consultar/Remover Vag�o");
		
		painel.setLayout(new GridLayout(7, 2, 5, 5));
		
		painel.add(btnCadastrarLocomotiva);
		painel.add(btnListaLocomotiva);
		painel.add(btnCadastrarVagao);
		painel.add(btnListaVagao);
		painel.add(btnComposicao);
		pack();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(painel);
		
		btnCadastrarLocomotiva.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JanelaLocomotiva l = new JanelaLocomotiva();
        		l.setVisible(true);
        		l.setSize(680,480);
            }                            
        });
		btnListaLocomotiva.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }                            
        });
		btnCadastrarVagao.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }                            
        });
		btnListaVagao.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }                            
        });
		btnComposicao.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }                            
        });
	}
}
