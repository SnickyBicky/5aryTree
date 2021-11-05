
public class Tree5<T> {

	private Node5<T> root;

	public Tree5() {
		this.root = null;
	}

	public void traverseRecursive() {
		this.traversePreOrderRecursive(this.root);
	}

	private void traversePreOrderRecursive(Node5<T> nodeParam) {
		if (nodeParam != null) {
			System.out.print(nodeParam.getElement() + " ");
			this.traversePreOrderRecursive(nodeParam.getChild(0));
			this.traversePreOrderRecursive(nodeParam.getChild(1));
			this.traversePreOrderRecursive(nodeParam.getChild(2));
			this.traversePreOrderRecursive(nodeParam.getChild(3));
			this.traversePreOrderRecursive(nodeParam.getChild(4));
		}
	}

}
