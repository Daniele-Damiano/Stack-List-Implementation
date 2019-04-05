package org.stack_list_implementation;

/**
 * Implementazione di una lista collegata (LinkedList)
 * @author linux-server
 *
 * @param <E> Una elemento di un tipo qualsiasi
 */
public class Node<E> {

	/*Elemento di tipo e*/
	E dato;
	/*Riferimento al nodo successivo*/
	Node<E> succ;


	/**
	 * Costruisce la classe Node<E> 
	 * 
	 * @param dato Un elemento di un tipo qualsiasi
	 * @param succ riferimento al nodo successivo
	 */
	public Node(E dato, Node<E> succ) {

		this.dato = dato;
		this.succ = succ;
	}




}
