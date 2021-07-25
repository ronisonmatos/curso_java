package UdemyCod3r.colecoes;

import java.util.HashSet;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * SortedSet ordena por ordem de inser��o
		 * 
		 * devmedia.com.br/diferencas-entre-treeset-hashset-e-linkedhashset-em-java/29077
		 * 
		 * O HashSet � o mais r�pido de todos, este usa HashTable e seus elementos n�o
		 * s�o ordenados, a complexidade desta estrutura � O(1), em outras palavras, n�o
		 * importa o quanto voc� adicione, remova, retire, o tempo de execu��o sempre
		 * ser� o mesmo. E isso � extremamente cr�tico em processos onde temos uma
		 * situa��o cr�tica com milh�es de dados a serem inseridos em um Set. Por outro
		 * lado, a garantia de continuidade na ordem dos elementos inseridos � zero, ou
		 * seja, esse tipo de estrutura � indicada se voc� precisa apenas garantir a
		 * alta performance sem se importar com a ordem com que os elementos est�o
		 * ordenados.
		 * 
		 */

		Set<String> alfabeto = new HashSet<>();

		alfabeto.add("A");
		alfabeto.add("R");
		alfabeto.add("T");
		alfabeto.add("C");
		alfabeto.add("B");

		for (String listar : alfabeto) {
			System.out.println(listar);
		}
	}

}
