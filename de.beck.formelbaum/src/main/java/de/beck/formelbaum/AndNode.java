/**
 * 
 */
package de.beck.formelbaum;

/**
 * @author Philipp Patrick Beck
 * 14 Mar 2014	*/
public class AndNode extends Node{

	
	@Override
	public boolean getValue() {
		return (this.getLeft().getValue() && this.getRight().getValue() );
	}

}
