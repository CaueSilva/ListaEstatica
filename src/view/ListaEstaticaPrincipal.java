package view;

import controller.ListaEstaticaMetodos;

import javax.swing.JOptionPane;

public class ListaEstaticaPrincipal {

	public static void main(String args[]) {
		int opc = 0, element = 0, posicao = 0;
		ListaEstaticaMetodos l = new ListaEstaticaMetodos(4);
		while (opc != 10) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Adiciona In�cio " + "\n 2 - Adiciona Final "
					+ "\n 3 - Adiciona em Posi��o Espec�fica " + "\n 4 - Remove In�cio " + "\n 5 - Remove Final "
					+ "\n 6 - Remove de Posi��o Espec�fica " + "\n 7 - Mostra Elemento do In�cio "
					+ "\n 8 - Mostra Elemento do Final " + "\n 9 - Mostra Todos os Elementos " + "\n 10 - Sair"));
			switch (opc) {
			case 1:
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				l.adicionaInicio(element);
				break;
			case 2:
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				l.adicionaFinal(element);
				break;
			case 3:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o."));
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				l.adicionaEmPosicao(posicao, element);
				break;
			case 4:
				l.removeInicio();
				break;
			case 5:
				l.removeFinal();
				break;
			case 6:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o."));
				l.removePosicaoEspecifica(posicao);
				break;
			case 7:
				l.mostraElementoInicio();
				break;
			case 8:
				l.mostraElementoFinal();
				break;
			case 9:
				System.out.println(l.toString());
				break;
			case 10:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida.");
			}
		}
	}

}
