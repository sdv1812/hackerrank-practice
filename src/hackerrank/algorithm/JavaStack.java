package hackerrank.algorithm;
import java.util.*;
class JavaStack{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
         System.out.println(checkBalanced(input));
      }
      sc.close();
   }
   
   public static boolean checkBalanced(String input) {
       String str[] = input.split("");
       Stack<String> st = new Stack<>();
       for(int i=0; i<input.length(); i++) {
      	 if(str[i].equals("}")) {
      		 if(st.isEmpty()) {return false;}
      		 if(st.peek().equals("{")){
      			 st.pop();
      		 } else return false;
      	 } else if(str[i].equals("]")) {
      		 if(st.isEmpty()){return false; }
      		 if(st.peek().equals("[")) {
      			 st.pop();
      		 }else return false;
      	 } else if(str[i].equals(")")) {
      		 if(st.isEmpty()){return false;}
      		 if(st.peek().equals("(")) {
      			 st.pop();
      		 } else return false;
      	 } else if(str[i].equals("{")||str[i].equals("[")||str[i].equals("(")) {
      		 st.push(str[i]);
      	 } else {
      		 return false;
      	 }
       }
       if(st.isEmpty())
    	   return true;
       else return false;
   }
}
