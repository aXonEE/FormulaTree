/**
 * 
 */
package de.beck.formelbaum;

/**
 * @author Philipp Patrick Beck
 * 14 Mar 2014	*/
public abstract class Node {

	protected Node left;
	protected Node right;
	
	private boolean value;
	
	/**
	 * 
	 * @param left Left Node	
	 * @param right Right Node
	 */
	public Node(Node left, Node right){
		
	}
	
	public Node(){
		
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * @return the value
	 */
	public abstract boolean getValue();

	
	
	
}
