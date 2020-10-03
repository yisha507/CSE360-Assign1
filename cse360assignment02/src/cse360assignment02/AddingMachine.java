package cse360assignment02;
/**
 * Program to add and subtract to a total value, and return it as string or int
 * @author yisha
 *
 */
public class AddingMachine {
	private int total;
	private String history;
	
	  /**
	   * Constructs a adding machine with initial total and history
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  /**
	   * Returns the total value as an int
	   */
	  public int getTotal () {
	    return total;
	  }
	  /**
	   * Adds a number to int value and updates history
	   * @param value the value of the current total
	   */
	  public void add (int value) {
		  total += value;
		  history = history + " + " + (value);
	  }
	  /**
	   * Subtracts a number from int value and updates history
	   * @param value the value of the current total
	   */
	  public void subtract (int value) {
		  total -= value;
		  history = history + " - " + (value);
	  }
	  /**
	   * Returns history of additions & subtractions applied to int value
	   */
	  public String toString () {
	    return history;
	  }
	  /**
	   * Unused fuction 
	   */
	  public void clear() {
	  }
	}
