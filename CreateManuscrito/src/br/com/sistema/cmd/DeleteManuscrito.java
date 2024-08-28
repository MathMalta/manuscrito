package br.com.sistema.cmd;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class DeleteManuscrito {

	public static void main(String[] args) {
		try {
			Connection conexao = ConnectionFactory.createConnection();
			JOptionPane.showConfirmDialog(null, "Conexao aberta com sucesso!");
			
			Manuscrito manuscrito = new Manuscrito();
			
			manuscrito.setId(JOptionPane.showInputDialog("Entre com ID:"));
			
			String sql = "delete from manuscrito where id = ?;";
			
			java.sql.PreparedStatement cmd = conexao.prepareStatement(sql);
			
			cmd.setString(1,manuscrito.getId());
			cmd.execute();
			
			JOptionPane.showMessageDialog(null, "Registro excuido com sucesso!");
			
			cmd.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
