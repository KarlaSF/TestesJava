package br.com.primeiroexercicio.beans.teste;

import javax.swing.JOptionPane;

import br.com.primeiroexercicio.beans.model.Mamifero;

public class Teste {

	public static void main(String[] args) {
		
		Mamifero mamifero = new Mamifero ();
		
		String recebeEspecie = JOptionPane.showInputDialog("Especie:");
		String recebeNome = JOptionPane.showInputDialog("Nome:");
		int recebeIdade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		int recebeMesesGestacao = Integer.parseInt(JOptionPane.showInputDialog("Meses de Gestação"));
		
		mamifero.setNome(recebeNome);
		mamifero.setIdade(recebeIdade);
		mamifero.setEspecie(recebeEspecie);
		mamifero.setMesesGestacao(recebeMesesGestacao);
		
		System.out.println("\n A especie do animal é: " + mamifero.getEspecie() +
				"\n O nome do Animal é: " + mamifero.getNome() + 
				"\n A idade do animal é: " + mamifero.getIdade() + 
				"\n Meses de gestação do animal:: " + mamifero.getMesesGestacao());

		
	}

}
