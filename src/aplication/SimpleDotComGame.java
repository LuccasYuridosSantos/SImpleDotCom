package aplication;

import java.util.Scanner;

//import entities.GameHelper;
import entities.SimpleDotCom;

public class SimpleDotComGame {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int numOfGuesses = 0;
		
		//GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomNum = (int) (Math.random()*5);
		
		int[] locations = {randomNum, randomNum+1,randomNum+2};
		
		theDotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		
		
		while (isAlive == true) {
			//String guess = helper.getUserInput("Insira um n�mero");
			System.out.print("Insira um n�mero ");
			String guess = sc.nextLine();
			
			String result = theDotCom.checkYouself(guess);
			numOfGuesses++;
			
			if(result.equals("KILL")) {
				isAlive= false;
				System.out.println("Voc� usou "+ numOfGuesses + " palpites");
				
			}			
			
		} 
		
	
		sc.close();
	}

}
