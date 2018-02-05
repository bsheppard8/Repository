package edu.gatech.oad.antlab.person;
import java.lang.*;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Suin
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
        String inp = input;
        StringBuilder rand = new StringBuilder();
        for (int i = inp.length(); i >= 1; i--) {
            int nint = (int) (Math.random() * ((double) i));
            rand = rand.append(inp.charAt(nint));
            if (nint == 0) {
                inp = inp.substring(1, i);
            } else if (nint == (i - 1)) {
                inp = inp.substring(0, i - 1);
            } else {
                inp = inp.substring(0, nint).concat(inp.substring(nint + 1, i));
            }
        }
        String output = rand.toString();
	    return output;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
