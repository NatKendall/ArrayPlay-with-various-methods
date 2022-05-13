
// @author Kenda

public class main {

    public static void main(String[] args) {
        System.out.println("This program creatures 2 objects of array type and works with them.\n"
                + "The arrays contain employee names and IDs. \n");

        int[] IDArray = new int[]{123, 245, 789, 354, 256};
        String[] employeeArray = new String[]{"Susan", "Bill", "Margo", "Pamela", "Abe"};

        //initialize employee objects using the constructor from arrayPlay
        arrayPlay object = new arrayPlay();

        //calliing from arrayPlay
        object.sortArray(employeeArray);
        object.sortArray(IDArray);
        object.displayResults(IDArray, employeeArray);
        System.out.println();
        object.linearSearch(IDArray, 354);
        object.binarySearch(employeeArray, "Bill");

    }
}
//The total run time of my program is O(N) 
