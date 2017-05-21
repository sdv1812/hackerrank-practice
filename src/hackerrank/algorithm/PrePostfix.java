package hackerrank.algorithm;


import java.util.Stack;

public class PrePostfix {
	
	public static String[] prefixToPostfix(String[] prefixes) {
		String[] postfixes = new String[prefixes.length];
        for(int i = 0; i< prefixes.length; i++) {
        	postfixes[i] = pre2post(prefixes[i]);
        }
        return postfixes;
	}

	public static String pre2post(String pre){
		String LEFT_DONE="LEFT_DONE";
//		String strPrefix="";
		String strPostfix="";
		//declare the operators stack
		Stack<String> operatorStack = new Stack<String>();
 

			//Loop through all the characters in the prefix string.
			char[] prefixExp = pre.toCharArray();
			for(int i=0; i<prefixExp.length; i++){
				//ignore blank space
				if(prefixExp[i] == ' '){
					continue;
				}
				
				if(isOperator(prefixExp[i])){
					operatorStack.push(String.valueOf(prefixExp[i]));
				}
				else{
					pre += String.valueOf(prefixExp[i]);
					while(!operatorStack.empty() && operatorStack.peek().equals(LEFT_DONE)){
						operatorStack.pop();
						strPostfix += operatorStack.pop();
					}
					operatorStack.push(LEFT_DONE);
				}
			}
			return strPostfix;
    }
	private static boolean isOperator(char c){
		char[] operators = {'+','-','/','*'};
		boolean isOp = false;
		for(int i=0; i<operators.length; i++){
			if(c == operators[i]){
				isOp = true;
				break;
			}
		}
		return isOp;
	}
}
