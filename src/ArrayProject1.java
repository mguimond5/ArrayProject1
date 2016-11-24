import java.util.Scanner;

/**
*
* Name: Marsha Guimond
* Teacher: Mr.Hardman
* Assignment 5, Program 2
* Date Last Modified: November 22, 2016
*
*/
/**
 * 
 */

/**
 * @author m.guimond3
 *
 */
public class ArrayProject1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int[] values = {13, 3, 6, 56, 17, 100, 1, 15, 45, 30};
		int userNumber;
		int index = -1;
		
		System.out.println("The Array: ");
		
			
			for(int i = 0; i < values.length; i++){
				
				System.out.print( values[i] + "  ");
				
			}
			
			System.out.println("\nWhat value do you want the index of?");
			userNumber = userInput.nextInt();
			
			for(int i = 0; i < values.length; i++){
			
				if(userNumber == values[i]){
					index = i;
				}	
				
		}
			
			
			if (index == -1){
				
				
				System.out.println("That element is not in the array!");
				
				
			} else {
				
			
				System.out.println("Index of number " + userNumber + " is " + index + ".");
				
				
			}
			userInput.close();
		}
				
	}


