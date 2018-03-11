package view;

import controller.ListaEstaticaMetodos;

import javax.swing.JOptionPane;

public class ListaEstaticaPrincipal {

	public static void main(String args[]) {
		int opc = 0, element = 0, posicao = 0;
		ListaEstaticaMetodos l = new ListaEstaticaMetodos(4);
		while (opc != 10) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Adiciona Início " + "\n 2 - Adiciona Final "
					+ "\n 3 - Adiciona em Posição Específica " + "\n 4 - Remove Início " + "\n 5 - Remove Final "
					+ "\n 6 - Remove de Posição Específica " + "\n 7 - Mostra Elemento do Início "
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
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição."));
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
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição."));
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
				JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
			}
		}
	}

}
