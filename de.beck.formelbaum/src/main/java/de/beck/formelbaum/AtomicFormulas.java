/**
 * 
 */
package de.beck.formelbaum;

import java.util.Set;
import java.util.HashSet;

/**
 * @author Philipp Patrick Beck 14 Mar 2014
 */
public class AtomicFormulas {

	private static Set<AtomicFormula> atomics = new HashSet<AtomicFormula>();

	public static void addAtomic(char letter) throws AtomicFormulaException {

		if (!containsAtomic(letter))
			throw new AtomicFormulaException("This Formula exists");

		if (!Character.isLetter(letter))
			throw new AtomicFormulaException("Character is not a letter");

		atomics.add(new AtomicFormula(Character.toLowerCase(letter)));
	}

	public static void addAtomics(Set<Character> set)
			throws AtomicFormulaException {

		for (Character c : set) {
			if (!containsAtomic(c))
				throw new AtomicFormulaException("This Formula exists");

			if (!Character.isLetter(c))
				throw new AtomicFormulaException("Character is not a letter");

			atomics.add(new AtomicFormula(Character.toLowerCase(c)));
		}

	}

	/**
	 * 
	 * @param letter
	 * @return the atomic or null if is not existing
	 */
	public static AtomicFormula getAtomic(char letter) {
		for (AtomicFormula atomic : atomics) {
			if (atomic.getLetter() == Character.toLowerCase(letter))
				return atomic;
		}

		return null;

	}

	/**
	 * @param letter
	 * @return
	 */
	private static boolean containsAtomic(char letter) {

		for (AtomicFormula atomic : atomics) {
			if (atomic.getLetter() == letter)
				return true;
		}

		return false;
	}

	public static class AtomicFormula {
		private boolean value = false;
		private char letter;

		public AtomicFormula(char letter) {
			this.letter = letter;
		}

		/**
		 * @return the value
		 */
		public boolean getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(boolean value) {
			this.value = value;
		}

		/**
		 * @return the letter
		 */
		public char getLetter() {
			return letter;
		}

	}

	public static class AtomicFormulaException extends Exception {

		public AtomicFormulaException(String s) {
			super(s);
		}
	}
}
