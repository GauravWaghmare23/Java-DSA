package searching;
public class LineraSearch {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        int result = search(array, 5);

        System.out.println("The target 5 is present at index " + result);

    }
    
    static int search(int[] arr, int target) {
        
        if (arr.length == 0) {
            return -1;
        }
        
        for (int i = 0; i <= arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
