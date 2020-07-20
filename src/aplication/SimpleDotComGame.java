package aplication;

import entities.SimpleDotCom;

public class SimpleDotComGame {

	

	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		
		int [] localtions = {2,3,4};
			
		dot.setLocationCells(localtions);

		String userGame= "9";
		
		String result = dot.checkYouself(userGame);
		
	}

}
