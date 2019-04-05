package org.stack_list_implementation;

/**
 * Implementazione di uno Stack"Pila" mediante una lista, la lista e la classe
 * Node<E>
 * 
 * @author Daniele Damiano
 *
 * @param <E>
 *            Una classe di un qualsiasi tipo
 */
public class Stack<E> {

	/* Riferimento alla lista cioè alla classe Node<E> */
	Node<E> cimaPila;

	/* Inizializza lo stack a null */
	public Stack() {
		cimaPila = null;
	}

	/**
	 * Inserisce un elmento in cima allo Stack
	 * 
	 * @param e
	 *            Una classe di un tipo qualsiasi
	 */
	public void Push(E e) {
		Node<E> u = NuovoNodo();
		u.dato = e;
		u.succ = cimaPila; // u.succ = null perche cimaPila = null vedi il costruttore Stack()
		cimaPila = u; // cimapila.dato contiene u.dato e cimapila.succ contine u.succ che e = null

	}

	/**
	 * 
	 * @return Estrae e restituisce l'elemento in cima allo Stack
	 */
	public E Pop() {
		if (!isEmpty()) {
			E x = cimaPila.dato;
			cimaPila = cimaPila.succ;
			return x;
		}
		return null;
	}

	/**
	 * 
	 * @return Restituisce l'elemento in cima allo Stack
	 */
	public E Top() {
		if (!isEmpty()) {
			return (E) cimaPila.dato;
		}
		return null;
	}

	/**
	 * 
	 * @return True se lo Stack e vuoto
	 */
	public boolean isEmpty() {

		return cimaPila == null;
	}

	/**
	 * 
	 * @return Il riferimento a Node<E> inizializzato a null il campo dato e il nodo
	 *         succ
	 */
	public Node<E> NuovoNodo() {
		Node<E> u = new Node<>(null, null);

		return u;
	}

}
