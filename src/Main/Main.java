package Main;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import dataStructure.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {1,2,1,2,1,2,1,2};
		
		inverter(numeros);
	}

	private static void inverter(final int[] numeros) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(numeros[0]);
		
		for (int i = 1; i < numeros.length; i ++) {
			stack.push(numeros[i]);
		}
		
		var node = stack.pop();
		while(node != null) {
			System.out.println(node.getValue());
			node = stack.pop();
		}
	}
	
	
}
