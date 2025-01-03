import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner console_scan = new Scanner(System.in);
        String starting_massage =
               "           Menu\n" +
               "==============================\n" +
               "1. Length of an array after removing duplicate elements\n" +
               "2. Find the sum of two elements in the array which equals to a target integer\n" +
               "3. Merge elements of array A with B by maintaining the sorted order\n" +
               "4. Return the missing letter from an array of increasing letters\n" +
               "5. Check whether an array is negative dominant or not\n" +
               "6. Exit\n" +

               "==============================\n";
               

        System.out.print(starting_massage);

        
        while (true){
            System.out.print("Input --> ");
            int choice = console_scan.nextInt();
            switch (choice) {
                case 1:
                    int A1[] = createArray();
                    find_unique_size(A1);
                    break;
            
                case 2: 
                    int[] A2 = createArray();
                    
                    System.out.print("Enter the target integer: ");
                    int target = console_scan.nextInt();

                    for (int i = 0; i < A2.length; i++) {
                        for (int j = i + 1; j < A2.length; j++) {
                            if (A2[i] + A2[j] == target) {
                                System.out.println("The sum of " + A2[i] + " and " + A2[j] + " equals to " + target);
                            }
                        }
                    }
                    break;

                case 3: 
                    int[] A3 = createArray();
                    int[] B = createArray();

                    int[] C = new int[A3.length + B.length];
                    
                    for (int i = 0; i < A3.length; i++){
                        C[i] = A3[i];
                    }
                    for (int i = A3.length; i < C.length; i++){
                        C[i] = B[i - A3.length];
                    }

                    sort_array(C);
                    for (int i = 0; i < A3.length; i++) {
                        A3[i] = C[i];
                    }
                    for (int i = A3.length ; i < C.length ; i++) {
                        B[i -A3.length]= C[i];
                    }

                    print_array(A3);
                    System.out.println();
                    print_array(B);

                    break;

                case 4: 
                    System.out.print("Enter the size of the array: ");
                    int size4 = console_scan.nextInt();
                    char letters[] = new char[size4];
                    
                    for (int x = 0; x < letters.length; x++) {
                        System.out.print("Enter letter [" + x + "] : ");
                        letters[x] = console_scan.next().charAt(0);
                    }
                    
                    String missingLetters = "";
                    
                    for (int x = 0; x < letters.length - 1; x++) {
                        int diff = letters[x + 1] - letters[x];
                        for (int y = 1; y < diff; y++) {
                            missingLetters += (char) (letters[x] + y);
                        }
                    }

                    System.out.println("The missing letters from the array are: " + missingLetters);
                    break;
                    
                case 5: 
                    int[] A5 = createArray();

                
                    boolean isNegativeDominant = true;
                    int negativeCount = 0;
                    int positiveCount = 0;

                    for (int x = 0; x < A5.length; x++) {
                        if (A5[x] >= 0) {
                            positiveCount++;
                        }
                        else if (A5[x] < 0) {
                            negativeCount++;
                        }
                    }

                    if (negativeCount <= positiveCount) {
                        isNegativeDominant = false;
                    }

                
                    if (isNegativeDominant) {
                        System.out.println("The array is negative dominant.");
                    } 
                    else {
                        System.out.println("The array is not negative dominant.");
                    }
                    break;
                
                case 6: 
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;


                default:
                    System.out.println("Invalid choice.");
                    break;
            
            }    
        }
    }

    public static int[] createArray(){
        Scanner console_scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = console_scan.nextInt();
        int[] A = new int[size];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            A[i] = console_scan.nextInt();
        }
        return A;
    }
    public static void find_unique_size(int[] array){
        boolean duplicate_found = false;

        int uniqueCounter = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    duplicate_found = true;
                    break;
                }

            if (!duplicate_found){
                uniqueCounter++;
                break;
            }
            }
        System.out.println("The length of the array after removing duplicates is: " + uniqueCounter);
        }
    }

    public static void sort_array(int[] array){
        for (int x = 0; x < array.length; x++){
            for (int y = 0; y < array.length; y++){
                if (array[x] < array[y]){
                    int temp = array[x];
                    array[x] = array[y];
                    array[y] = temp;
                }
            }
        }
    }

    public static void print_array(int[] array){
        for (int x = 0; x < array.length; x++){
            System.out.print("Array ["+x+"]"+array[x] + "\t");
        }
    }


}