
public class Node5<T> {

	T element;
	Node5<T>[] children;

	public Node5(T elementParam, Node5<T>[] childrenParam) {
		this.element = elementParam;
		this.children = childrenParam;
	}

	public T getElement() {
		return this.element;
	}

	public Node5<T> getChild(int i) {
		return this.children[i];
	}

}
