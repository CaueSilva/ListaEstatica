package controller;

public class ListaEstaticaMetodos {

	private int dados[];
	private int tamanho;

	public ListaEstaticaMetodos(int c) {
		dados = new int[c];
		tamanho = 0;
	}

	public void adicionaInicio(int e) {
		if (tamanho == dados.length) {
			System.out.println("Erro! Lista cheia.");
		} else {
			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = e;
			tamanho++;
		}
	}

	public void adicionaFinal(int e) {
		if (tamanho == dados.length) {
			System.out.println("Erro! Lista cheia.");
		} else {
			dados[tamanho] = e;
			tamanho++;
		}
	}

	public void adicionaEmPosicao(int pos, int e) {
		if (tamanho != dados.length) {
			if (pos > tamanho + 1) {
				System.out.println("Posição Inválida.");
			} else {
				for (int i = tamanho; i > pos - 1; i--) {
					dados[i] = dados[i - 1];
				}
				dados[pos - 1] = e;
				tamanho++;
				System.out.println("Feito.");
			}

		} else {
			System.out.println("Erro! Lista cheia.");
		}
	}

	public int removeInicio() {
		int r = -1;
		if (tamanho != 0) {
			r = dados[0];
			for (int i = 1; i < tamanho; i++) {
				dados[i - 1] = dados[i];
			}
			tamanho--;
			System.out.println("Item removido.");
		} else {
			System.out.println("Erro! A Lista está vazia.");
		}
		return r;
	}

	public int removeFinal() {
		int r = -1;
		if (tamanho != 0) {
			r = dados[tamanho - 1];
			tamanho--;
			System.out.println("Item removido.");
			;
		} else {
			System.out.println("Erro! A Lista está vazia.");
			;
		}
		return r;
	}

	public int removePosicaoEspecifica(int pos) {
		int r = -1;
		if (tamanho == 0) {
			System.out.println("Erro! A Lista está vazia.");
		} else {
			if (pos <= tamanho) {
				r = dados[pos - 1];
				for (int i = pos - 1; i < tamanho - 1; i++) {
					dados[i] = dados[i + 1];
				}
				tamanho--;
				System.out.println("Feito.");
			} else {
				System.out.println("Posição Inválida.");
			}
		}
		return r;
	}

	public void mostraElementoInicio() {
		if (tamanho == 0) {
			System.out.println("A Lista está vazia.");
		} else {
			for (int i = 0; i < 4; i++) {
				System.out.println(dados[i]);
			}
		}
	}

	public void mostraElementoFinal() {
		if (tamanho == 0) {
			System.out.println("A Lista está vazia.");
		} else {
			for (int i = tamanho - 1; i >= 0; i--) {
				System.out.println(dados[i]);
			}
		}
	}

	@Override

	public String toString() {
		String r = "";
		for (int i = 0; i < tamanho; i++) {
			r = r + " " + dados[i];
		}
		System.out.println('\n' + "Quantidade de elementos: " + tamanho);
		return r;
	}

}
