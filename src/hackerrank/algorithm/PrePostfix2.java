package hackerrank.algorithm;


import java.util.Scanner;
import java.util.Stack;

public class PrePostfix2 {
	
	public static String[] prefixToPostfix(String[] prefixes) {
		String[] postfixes = new String[prefixes.length];
        for(int i = 0; i< prefixes.length; i++) {
        	postfixes[i] = pre2post(prefixes[i]);
        }
        return postfixes;
	}


    static boolean isOperator (char ch){
        switch (ch){
            case '+':
            case '-':
            case '*':
            case '/':
            case '$':
                        return true;
            default :
                        return false;
        }
    }
    public static String pre2post(String prefixe) {
        //declarations
        String exp;
        int i;
        STACK s = new STACK ();
        String exp_str[] = new String[100];
        String postfix_exp = "\n";

        //input
        System.out.println("Enter prefix expression (No spaces or brackets) : ");
        exp = in.next();

        //create a string array of all characters but in reverse
        for(i=0; i<=exp.length()-1; i++){
            exp_str[exp.length()-1-i]=Character.toString(exp.charAt(i));
        }

        //computing postfix:
        i=0;
        do{ 
            if (!isOperator(exp_str[i].charAt(0)))
                s.push(exp_str[i]);
            else{
                String str1 = s.pop();
                String str2 = s.pop();
                str1 = str1 + str2 + exp_str[i];
                postfix_exp = str1;
                s.push(str1);
            }
            i++;
        }while(s.getTop()>=0 && i!=exp.length());

        //Output
        System.out.println("After converting to postfix : " + postfix_exp);
        in.close();
    }

}
