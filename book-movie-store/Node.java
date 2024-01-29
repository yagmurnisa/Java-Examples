public class Node {
	
	private Media media;
	private Node left;
	private Node right;
	
	public Node() {
	}
	
	public Node(Media media) {
		this.media=media;
	}
	public Node getLeft() {
		
		return left;
	}
	public Node getRight() {
		
		return right;
	}
	public Media getMedia() {
		
		return media;
	}
	public void setLeft(Node node) {
		
		this.left=node;
	}
	public void setRight(Node node) {
		
		this.right= node;
	}
	public void setMedia(Media media) {

		this.media=media;	
	}
}
