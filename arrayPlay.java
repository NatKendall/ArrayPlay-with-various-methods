
import java.util.Arrays;

class arrayPlay {

    private String employName;
    private int ID;

    public arrayPlay() {

    }

    public arrayPlay(String employName, int ID) {
        this.employName = employName;
        this.ID = ID;

    }

    //Method 1: sortArrays for employeeArray
    public void sortArray(String[] employName) {
        Arrays.sort(employName);
    }

    // sortArray for IDArray
    public void sortArray(int[] ID) {
        Arrays.sort(ID);
    }

    // Method #2: Integer Array and does a Linear Search recursively on key.
    public void linearSearch(int[] someIntArray, int key) {

        int index = linearSearch(someIntArray, 0, someIntArray.length - 1, key);

        if (index != -1) {
            System.out.println("The employee with ID of " + key + " is on the list.");
        } else {
            System.out.println(key + " is not on the list.");
        }
    }

    // Private helper method for #2: recursive Linear Search.
    private int linearSearch(int[] someIntArray, int start, int last, int key) {
        if (last < start) {
            return -1;
        }

        if (someIntArray[start] == key) {
            return start;
        }

        return linearSearch(someIntArray, start + 1, last, key);
    }

    // Method #3: Binary search on the employeeArray looking for the key.
    public void binarySearch(String[] someStringArray, String key) {

        int left = 0;
        int right = someStringArray.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int result = key.compareTo(someStringArray[mid]);

            if (result == 0) {
                System.out.println("The employee with the name of " + key + " is on the list.");
                return;
            }

            if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("The employee with the name of " + key + " is not on the list.");
    }

    // Method #4: display the data of arrayPlay.
    public void displayResults(int[] a, String[] b) {

        for (int index = 0; index < a.length; index++) {
            System.out.println("Employee " + (index + 1) + " name is " + b[index]
                    + " and the employee ID is " + a[index]);
        }

    }

}
