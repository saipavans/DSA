package stacks.applications;

import stacks.LinkedStack;

/* 
 * @author saipavansuresh
 *
 * NOTE: a) Parentheses: "(" and ")"
 * b) Braces: "{" and "}"
 * c) Brackets: "[" and "]" 
 */
public class MatchParentheses {
	
	private static char[] symbols = {'(', '{', '[', ')', '}', ']'};
	
	/**
	 * Checks if the character is any of the symbols
	 * @param c, the character to be checked
	 * @return If character is a symbol, returns the index else -1.
	 */
	private static int isSymbol(char c) {
		for (int i = 0; i < symbols.length; i++) {
			if (c == symbols[i]) {
				return i;
			} 
		}
		return -1;	
	}
	
	public static boolean checkExpression(String exp) {
		LinkedStack<Integer> records = new LinkedStack<Integer>(); 
		
		for ( char c : exp.toCharArray()) {
			int i = isSymbol(c);
			
			if (i > 2) { // closing symbol
				if ( (i-3) != records.pop()) {
					return false;
				}
			} else if ( i > -1) { // Opening symbol
				records.push(i);
			}
		}
		
		return records.isEmpty();
	}

	public static void main(String[] args) {
		String exp1 = "[(5+x) - (y+z)]", exp2 = "[}]", exp3 = "(){";
				
		System.out.println(exp1 + " : " + checkExpression(exp1));
		System.out.println(exp2 + " : " + checkExpression(exp2));
		System.out.println(exp3 + " : " + checkExpression(exp3));

	}

}
