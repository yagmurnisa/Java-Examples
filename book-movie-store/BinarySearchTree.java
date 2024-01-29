public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		
	}

	public BinarySearchTree(Node root) {
		super();
		this.root = root;
	}
	
	public void add(Media media) {
		
		Node newNode= new Node(media);
		if (root==null) {
			root=newNode;
		}
		else {
			addRecursive(root,newNode);
		}
	}
	
	private void addRecursive(Node current, Node node) {
		if (node.getMedia().getName().compareTo(current.getMedia().getName())<0) {			
			if(current.getLeft()==null) {
				current.setLeft(node);
			}
			else {
				addRecursive(current.getLeft(),node);
			}		
		}
		else {
			if(current.getRight()==null) {
				current.setRight(node);
			}
			else {
				addRecursive(current.getRight(),node);
			}
		}	
	}
	
	public Node search(String name) {
		return searchRecursive(root,name);
	}
	
	private Node searchRecursive(Node current, String name) {
		if (current.getMedia().getName().equals(name) || current==null) {
			return current;
		}
		if (name.compareTo(current.getMedia().getName())<0) {						
			return searchRecursive(current.getLeft(),name);		
		}
		return searchRecursive(current.getRight(),name);		
	}
	
	public void printElements() {
		if (root==null) {
			System.out.println("There aren't any items");		
		}
		else {
			printRecursive(root);
		}
	}
	
	private void printRecursive(Node current) {
		if (current!=null) {
			printRecursive(current.getLeft());
			current.getMedia().printMedia();
			printRecursive(current.getRight());
		}
	}
}
