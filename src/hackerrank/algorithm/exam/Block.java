package hackerrank.algorithm.exam;

public class Block {
	public int totalScore(String[] blocks, int n){
        int current_score[]=new int[n];
        int total_score=0;
        
        for(int i=0; i<n;i++){
            if(Character.isDigit(blocks[i].charAt(0))){
               current_score[i] =Integer.valueOf(blocks[i]);
               total_score+=current_score[i];
            }
            
            else if(blocks[i].equals("X")){
            	if(!(i==0))
            	current_score[i] = 2*current_score[i-1];
            	  total_score+=current_score[i];
            } else if(blocks[i].equals("Z")){
            	if(!(i==0)){
            		total_score = total_score-current_score[i-1];
            		current_score[i-1]= 0;
            		
            		if(!(i<2))
            			current_score[i] = current_score[i-2];
            	}else if(blocks[i].equals("+")){  
            		if(!(i<2))           			
            		  current_score[i]=current_score[i-1]+current_score[i-2];
            		else if((i==1))
            			current_score[i]=current_score[i-1];
            		
            		total_score+=current_score[i];
            	}
            }
          
        }
        return total_score;

        }
}
