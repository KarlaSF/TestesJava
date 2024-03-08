package br.com.empresa.beans.model;

import javax.swing.JOptionPane;

public class Funcionario extends Condominio{
	
	private String cargo;

	public void mostrarAtributo()
	{
	 setNome(JOptionPane.showInputDialog("Insira o nome"));
	 setSexo(JOptionPane.showInputDialog("Insira o Sexo"));
	 setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
	 setCargo(JOptionPane.showInputDialog("Insira o Cargo"));
	 
	 System.out.println("Nome: " + getNome());
	 System.out.println("Sexo: " + getSexo());
	 System.out.println("Idade: " + getIdade());
	 System.out.println("Cargo: " + getCargo());
	};
	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
