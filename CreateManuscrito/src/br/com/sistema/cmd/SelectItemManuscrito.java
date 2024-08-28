package br.com.sistema.cmd;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class SelectItemManuscrito {

	public static void main(String[] args) {
		try {
			//abri conexao com o banco de dados
			Connection conexao = (Connection) ConnectionFactory.createConnection();
			
			//Criar variavel para buscar o regidstro no banco
			String id;
			
			//ID irá receber o valor digitado pelo usuário
			id = JOptionPane.showInputDialog("Digite o ID do manuscrito: ");
			
			//Criar o sql para etrair os dados do banco
			String sql;
			
			sql = "select * from manuscrito where id = " + id + ";";
			
			// Linha abaixo para fazer o teste no banco de dados
			//System.out.println(sql);
			
			//Preparar para receber os dados
			java.sql.PreparedStatement cmd = conexao.prepareStatement(sql);
			
			//Executar o comando
			ResultSet resultado = cmd.executeQuery();
			
		}catch (Exception e) {
		
	
		}

	}	

}
