import java.util.Scanner;

/**
 *  v.20160429
 *  This class contains only STATIC methods. Each method below executes a 
 * 	a basic aspect of programming (loops, conditionals, arrays, variables, 
 *	simple math computations, etc.). Your task is to implement each method
 *	below as indicated in the comments. You will use another file 
 *	(e.g., PortfolioApp.java) to run and test your method implementations.
 */
class MyPortfolio {

    /**
     * Prompts the user for their name. This method should use a Scanner object
     * to retrieve the name. It shoud return the collected string.
     */
	static String getFirstName() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter you first name please: ");
        String name = scnr.next();
		return name;
	}


    /**
     * Accepts a list of integers as an argument and prints the integers to 
     * the screen on one line.
     */	
    static void printIntegerList(int[] values) {
        int value=values.length;
        for(int i = 0; i < value; i++){
            System.out.print(values[i]);
	}
}


    /**
     * Accepts a list of integers as an argument and prints the integers IN REVERSE 
     * ORDER to the screen on one line.
     */	
	static void printIntegerListReversed(int[] values) {
        int sc = values.length-1;
        for (int i = sc;i>=0;i--){
            System.out.print(values[i]);
        }   
	}

    /**
     * 
      */	
	static char swapLeftWithRight(char left_char, char right_char) {
        char temp = left_char;
        left_char=right_char;
        right_char = temp;;
        return left_char;
	}

    /**
     * Accepts a list of integers as an argument and swaps the first value 
     * with the last value in the list. This method should create a new array
     * containing the swapped version of the array passed in as the argument.
     */	
	static int[] swapFirstWithLast(int[] values) {
        int a = values[0];
        int b = values[values.length-1];
        int c = values[0];
        values[0]=b;
        values[values.length-1]=c;
		return values;
	}

    /**
     * Accepts a list of integers as an argument and returns the smallest value
     * found in the list.
     */	
	static int min(int[] values) {
        int min = values[0];
        for(int i = 0;i<values.length;i++){
            if (values[i]<min){
                min = values[i];
            }

        }
            return min;
	}


    /**
     * Accepts a list of integers as an argument and returns the largest value
     * found in the list.
     */	
	static int max(int[] values) {
        int max = values[0];
        for (int i =0;i<values.length;i++){
            if (values[i]>max){
                max = values[i];
            }
        }
		return max;
	}

    /**
     * Accepts a list of integers as an argument and returns the average of all the
     * values found in the list.
     */	
	static int findAverage(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length;i++){
            sum = sum + values[i];
        }
        int average = (sum / values.length);
		  return average;
	}

    /**
     * Accepts a list of integers and an integer value as arguments and returns 
     * the number of times the integer is found in the list.
     */	
	static int frequencyCount(int[] values, int val) {
        int count = 0;
        for (int i = 0; i<values.length;i++){
            if(val == values[i]){
                count++;
            }
        }
		return count;
	}

    /**
     * Accepts a String argument and returns the argument in reverse order.
     */	
	static String reverseString(String chars) {
        String j = "";
        int p = chars.length() -1;
        for (int i = p; i >=0;i--){
            j = j + chars.charAt(i);
        }
		return j;
	}
}