package br.com.sistema.cmd;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int opcao = 0;
		
		while (opcao!= 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1: Cadastrar Manuscrito \n" +
					"2: Listar Manuscrito \n" +
					"3: Listar Manuscrito Selecionado \n" +
					"4: Atualizar Manuscrito \n" +
					"5: Deletar Manuscrito \n" +
					"9: Sair \n"));
					
					switch(opcao) {
					case 1:
						JOptionPane.showInputDialog(null, "Cadastrar!");
					break;	
	                case 2:
		                JOptionPane.showInputDialog(null, "Cadastrar!");
	                break;	
	                case 3:
						JOptionPane.showInputDialog(null, "Cadastrar!");
					break;	
	                case 4:
						JOptionPane.showInputDialog(null, "Cadastrar!");
					break;	
	                case 5:
						JOptionPane.showInputDialog(null, "Cadastrar!");
					break;	
	                case 9:
						JOptionPane.showInputDialog(null, "Sistema Finalizado");
					break;	
					default:
						JOptionPane.showConfirmDialog(null, "Entre com uma opção válida");
					}

		
		}

	}

}