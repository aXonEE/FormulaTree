/**
 * 
 */
package de.beck.formelbaum;

/**
 * @author Philipp Patrick Beck
 * 14 Mar 2014	*/
public class NotNode extends Node {

	
	
	/* (non-Javadoc)
	 * @see de.beck.formelbaum.Node#getValue()
	 */
	@Override
	public boolean getValue() {
		return !this.left.getValue();
	}
	
	public Node getRight(){
		return null;
	}
	
	public void setRight(Node right){
		this.right = null;
	}
	

}
