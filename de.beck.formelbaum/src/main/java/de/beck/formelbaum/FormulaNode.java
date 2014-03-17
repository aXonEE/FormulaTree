/**
 * 
 */
package de.beck.formelbaum;

/**
 * @author Philipp Patrick Beck
 * 15 Mar 2014	*/
public class FormulaNode extends Node {

	private char letter;
	
	public FormulaNode(char letter){
		this.letter = letter;
	}
	
	
	@Override
	public boolean getValue() {
		return AtomicFormulas.getAtomic(this.letter).getValue();
	}

}
