/**
 * 
 */
package de.beck.formelbaum;

import java.util.HashSet;
import java.util.Set;

import de.beck.formelbaum.AtomicFormulas.AtomicFormulaException;

/**
 * @author Philipp Patrick Beck 15 Mar 2014
 */
public class Tree {

	private static final char AND = '*';
	private static final char OR = '+';
	private static final char NOT = '!';

	private Node root;

	public Tree(String formula) {
		generateTree(formula.trim());
	}

	/**
	 * @param formula
	 */
	private void generateTree(String formula) {
		try {
			readAtomics(formula);
		} catch (AtomicFormulaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @throws AtomicFormulaException
	 * 
	 */
	private void readAtomics(String s) throws AtomicFormulaException {
		Set<Character> atomics = new HashSet<Character>();
		char[] chars = s.toCharArray();

		for (char c : chars) {
			if (Character.isLetter(c))
				atomics.add(c);
		}

		AtomicFormulas.addAtomics(atomics);
	}

	public static void main(String[] args) {
		new Tree("(a * b) + c");

	}

}
