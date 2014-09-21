package controller;


public interface UserInput {

	/**
	 * Checks user input for leaves number
	 * correct input is number between 1 and 109
	 * @param consoleInput user input string
	 * @return number of leaves if correct, -1 if wrong
	 * @throws Exception
	 */
	public int numberOfLeaves(String message) throws Exception ;
	
	/**
	 * Checks user input for caterpillars position
	 * correct input is x,y,z,.....,n, max 15 caterpillars
	 * @param consoleInput user input string
	 * @return integer array if correct, and empty array if wrong
	 * @throws Exception
	 */
	public int[] caterpillarsPosition(String message) throws Exception ;
	 
}
