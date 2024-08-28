package br.com.sistema.cmd;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class UpadateManuscrito {

	public static void main(String[] args) {
		
		try {
			
			//Abri conexao com o banco de dados
			Connection conexao = ConnectionFactory.createConnection();
			
		
			//Importa a classe de transição de dados no sql
			Manuscrito manuscrito = new Manuscrito();
			
			
			
			//Envia o dado para a classe Manuscrito()
			
			
			manuscrito.setTitulo(JOptionPane.showInputDialog("Entre com o ID ser alterado"));
			
			manuscrito.setTitulo(JOptionPane.showInputDialog("Entre com o Titulo do Manuscrito"));
			
			manuscrito.setAutor(JOptionPane.showInputDialog("Entre com o nome do Autor do Manuscrito"));
			
			String sql = " update manuscrito set titulo = ?, autor = ? where id = ?; ";	
			
			//update = manuscrito set
			//titulo = 'manuscrito.getTitulo()' and
			//autor = 'manuscrito.getAutor()'
			//where id = 'manuscrito.getID()';

			//Criando um comando para passar o SQL
			java.sql.PreparedStatement cmd = conexao.prepareStatement(sql);
			cmd.setString(1, manuscrito.getTitulo());
			cmd.setString(2, manuscrito.getAutor());
			cmd.setString(3, manuscrito.getId());
			
			
			cmd.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dado atualizado com sucesso!");
			
			cmd.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		// Vamos salvar variaveis os dados que serão inseridos no banco

	}

}
