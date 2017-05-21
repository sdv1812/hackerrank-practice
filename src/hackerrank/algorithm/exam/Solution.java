static String[] prefixToPostfix(String[] prefixes) {
        String[] new_array = new String[prefixes.length];
       for(int i=0; i<prefixes.length; i++){
           new_array[i]= prefixToPostfixWord(prefixes[i].split(""));
       }
        return new_array;
    }

  public static String prefixToPostfixWord(String[] prefixes){
        StringBuffer prefixesNew = new StringBuffer();
        Stack<Character> stack = new Stack();
        int prefixesPos =0;

      for(int i=0; i<prefixes.length; i++){
            if(Character.isDigit(prefixes[i].charAt(0))){
                prefixesNew.append(prefixes[i]);
                continue;
            }else{
                int value = checkPrecedence(prefixes[i].charAt(0));

              if(stack.isEmpty() || value<checkPrecedence(stack.peek())){
                    stack.push(prefixes[i].charAt(0));

                  continue;
                }else {
                    while(value>checkPrecedence(stack.peek())){
                        prefixesNew.append(stack.pop().toString());
                        if(stack.isEmpty()==true)
                            break;
                    }
                    stack.push(prefixes[i].charAt(0));
                }
            }            
      }

      while(stack.isEmpty()!=true){
            prefixesNew.append(stack.pop().toString());
        }

      return prefixesNew.toString();
    }

  public static  int checkPrecedence(char ch){
        switch (ch)
        {
        case '+':
            return 3;
        case '-':
            return 4;    
       case '*':
            return 2;
        case '/':
            return 1;    
       }
        return -1;
    }