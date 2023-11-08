package com.vaishu.gl.q1;

import java.util.Stack;

public class BalancingBracket {

	public static void main(String[] args) {
		String bracketExpression = "(({[]}))";
		boolean result = isBracketIsBalanced(bracketExpression);
		if(result==true)
		{
			System.out.println("The entered string has Balanced Brackets");
		}else
			System.out.println("The entered string doesn't have Balanced Brackets");

	}

	private static boolean isBracketIsBalanced(String bracketExpression) {
		
		Stack<Character>stack = new Stack<>();
		
		for(int i=0; i<bracketExpression.length(); i++) {
			char character = bracketExpression.charAt(i);
			if(character=='('||character=='{'||character=='[') {
				stack.push(character);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char c;
			switch(character) {
			case')':
				c = stack.pop();
				if(c=='{'||c=='[')
					return false;
				break;
			case']':
				c = stack.pop();
				if(c=='{'||c=='(')
					return false;
				break;
			case'}':
				c = stack.pop();
				if(c=='('||c=='[')
					return false;
				break;
			
			default:
				break;
			}
		}
		
		return stack.isEmpty();
	}

}
