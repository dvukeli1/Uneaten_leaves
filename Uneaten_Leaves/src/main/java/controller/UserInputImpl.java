package controller;

import java.util.Scanner;

import controller.UserInput;

public class UserInputImpl implements UserInput{

	private Scanner scanner;
   // private Scanner scanner2;

    
	public int numberOfLeaves(String message) throws Exception {
		 int leavesNumber = -1;
		 scanner = new Scanner(message);
		 try {		
			leavesNumber = scanner.nextInt();
			if (leavesNumber <= 0 || leavesNumber > 109){
				leavesNumber=-1;
			}
		} catch (Exception e) {
			leavesNumber= -1;
		}
	     return leavesNumber;
	}

	public int[] caterpillarsPosition(String message) throws Exception  {
		 int caterpillarArray[] = new int[0];
		
		 if(message.contains("0") || message.isEmpty()){
			 return caterpillarArray;
		 }
		 
		 else{
			 scanner = new Scanner(message);
		 scanner.useDelimiter(", *");
			while(scanner.hasNext()){
				if(scanner.hasNextInt()){
					caterpillarArray= addInt(caterpillarArray,scanner.nextInt());
					//k=k+1;
				}
				else{
					break;
				}
				if (caterpillarArray.length > 15){
					caterpillarArray = new int[0];
				}
			}
		 }
			return caterpillarArray; 
		 }
			 
	
	
	private static int[] addInt(int [] place, int newCaterpillar){
	    //create a new array with extra index
	    int[] newPositions = new int[place.length + 1];

	    //copy the integers from series to newPositions    
	    for (int i = 0; i < place.length; i++){
	        newPositions[i] = place[i];
	    }
	//add the new integer to the last index     
	    newPositions[newPositions.length - 1] = newCaterpillar;



	    return newPositions;

	     }

	

}
