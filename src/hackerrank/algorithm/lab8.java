package hackerrank.algorithm;
import java.io.*;
import java.util.*;
public class lab8 {
 
	
	public static String LEFT_DONE="LEFT_DONE";
    
	public static void main(String[] args)   {
		String strPrefix="";
		String strPostfix="";
		//declare the operators stack
		Stack<String> operatorStack = new Stack<String>();
 
		 try {
			//File operations
			BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("c:\\Prefix.txt"))));
	        PrintWriter pw = new PrintWriter("c:\\Postfix.txt");
			//read a line containing the prefix string from the file
			String strLine="";			
			while ((strLine = br.readLine()) != null)   {
			  if(strLine != null)
				  strPrefix = strLine;
				  System.out.println("Prefix expression = "+strPrefix);
			}
			//Loop through all the characters in the prefix string.
			char[] prefixExp = strPrefix.toCharArray();
			for(int i=0; i<prefixExp.length; i++){
				//ignore blank space
				if(prefixExp[i] == ' '){
					continue;
				}
				
				if(isOperator(prefixExp[i])){
					operatorStack.push(String.valueOf(prefixExp[i]));
				}
				else{
					strPostfix += String.valueOf(prefixExp[i]);
					while(!operatorStack.empty() && operatorStack.peek().equals(LEFT_DONE)){
						operatorStack.pop();
						strPostfix += operatorStack.pop();
					}
					operatorStack.push(LEFT_DONE);
				}
			}
 
			System.out.println("Postfix expression = "+strPostfix);
			//write to the file
			pw.write(strPostfix);
	        br.close();
	        pw.close();
	     }
	     catch (Exception e) {
			e.printStackTrace();
	     }
		 
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
	
}//end project