package entities;

public class SimpleDotCom {
	
	int[] localtionCells;
	int numOfHits=0;
	
	public SimpleDotCom() {
	}
	
	public String checkYouself(String stringGuess) {
		
		
		int guess =Integer.parseInt(stringGuess);// o parâmetro recebindo em formato String será convertido para um Integer.
				
		String result = "miss";
			for(int cell: localtionCells) {			 
				if(guess== cell) {				 
					 result="hit";				 
					 numOfHits++;
					 
					 break;
				 }			 
			}			
			if (numOfHits == localtionCells.length) {
				result ="KILL";
			}
			System.out.println(result);
			return result;
		}	
	
	public void  setLocationCells(int[] loc) {
		localtionCells = loc;
	}
	
	
}
