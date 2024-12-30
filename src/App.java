import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner console_scan = new Scanner(System.in);
        String starting_massage = "\n"+
               "           Menu\n" +
               "==============================\n" +
               "1. Length of an array after removing duplicate elements\n" +
               "2. Find the sum of two elements in the array which equals to a target integer\n" +
               "3. Merge elements of array A with B by maintaining the sorted order\n" +
               "4. Return the missing letter from an array of increasing letters\n" +
               "5. Check whether an array is negative dominant or not\n" +
               "6. Exit\n" +
               "==============================\n" +
               "Input --> " ;
               

        System.out.print(starting_massage);

        int choice = console_scan.nextInt();
        System.out.println();

        switch (choice) {
           
            case 1:
                System.out.print("Enter the size of the array: ");
                int size = console_scan.nextInt();
                int[] A = new int[size];

                for (int i = 0; i < A.length; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    A[i] = console_scan.nextInt();
                }

                

                int uniqueCount = 1;
                for (int i = 1; i < A.length; i++) {
                    boolean isDuplicate = false;
                    for (int j = 0; j < i; j++) {
                        if (A[i] == A[j]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        uniqueCount++;
                    }
                }
                int[] Unique = new int[uniqueCount];
                
                for (int i = 0, j = 0; i < A.length; i++) {
                    boolean isDuplicate = false;
                    for (int k = 0; k < i; k++) {
                        if (A[i] == A[k]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        Unique[j] = A[i];
                        j++;
                    }
                }

                System.out.println("Unique elements in the array:");

                for (int i = 0; i < Unique.length; i++) {
                    System.out.print("Unique ["+i+"] = " + Unique[i] +"\t");
                }
                
                System.out.println();
                System.out.println("Length of array after removing duplicates: " + uniqueCount);
                break;
        
            case 2:
                System.out.print("Enter the size of the array: ");
                int size2 = console_scan.nextInt();
                int[] A2 = new int[size2];

                System.out.print("Enter targeted integer: ");
                int target = console_scan.nextInt();

                for (int i = 0; i < A2.length; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    A2[i] = console_scan.nextInt();
                }

                for (int i = 0; i < A2.length; i++) {
                    for (int j = i + 1; j < A2.length; j++) {
                        if (A2[i] + A2[j] == target) {
                            System.out.println("The sum of " + A2[i] + " and " + A2[j] + " equals to " + target);
                        }
                    }
                }
                break;

            case 3:
            // TODO: clean up and remove the use of the array C
                System.out.print("Enter the size of array A: ");
                int sizeA = console_scan.nextInt();
                int[] A3 = new int[sizeA];
                System.out.print("Enter the size of array B: ");
                int sizeB = console_scan.nextInt();
                int[] B = new int[sizeB];

                for (int i = 0; i < A3.length; i++){
                    System.out.print("Enter element [" + i + "] for array A :");
                    A3[i] = console_scan.nextInt();
                }

                for (int i = 0; i < B.length; i++){
                    System.out.print("Enter element [" + i + "] for array B:");
                    B[i] = console_scan.nextInt();
                }


                int[] C = new int[A3.length + B.length];
                
                for (int i = 0; i < A3.length; i++){
                    C[i] = A3[i];
                }
                for (int i = A3.length; i < C.length; i++){
                    C[i] = B[i - A3.length];
                }

                for (int x = 0; x < C.length; x++) {
                    for (int y = 0; y < C.length ; y++){
                        if (C[x] < C[y]){
                            int temp = C[x];
                            C[x] = C[y];
                            C[y] = temp;
                        }
                    }
                }

                for (int i = 0; i < A3.length; i++) {
                    A3[i] = C[i];
                }
                for (int i = A3.length ; i < C.length ; i++) {
                    B[i -A3.length]= C[i];
                }

                for (int x = 0; x < A3.length; x++) {
                    System.out.print("Array A[" +x+ "] :" + A3[x] + "\t");
                }

                System.out.println();
                for (int x =0 ; x < B.length; x++) {
                    System.out.print("Array B[" +x+ "] :" + B[x] + "\t");
                }
                break;


            
            case 4:
                System.out.print("Enter the size of the array: ");
                int size4 = console_scan.nextInt();
                char letters[] = new char[size4];
                
                for (int x = 0; x < letters.length; x++) {
                    System.out.print("Enter letter [" + x + "] : ");
                    letters[x] = console_scan.next().charAt(0);
                }
                
                char missingLetter = ' ';
                
                
                for (int x = 0; x < letters.length - 1; x++) {
                    if (letters[x + 1] - letters[x] != 1) {
                        missingLetter = (char) (letters[x] + 1);
                        break;
                    }
                }

                System.out.println("The missing letter from the array is: " + missingLetter);
                break;
                
            case 5:
                System.out.print("Enter the size of the array:");
                int size5 = console_scan.nextInt();
                int[] A5 = new int[size5];
                for (int x = 0; x < A5.length; x++) {
                    System.out.print("Enter the array element[" + x + "]:");
                    A5[x] = console_scan.nextInt();
                }

             
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
                break;

            case 7:
                // create ASCII art representation
                System.out.println(" __    __  ______  __  __  ______  __    __  ______  _____      ");
                System.out.println("/\\ \"-./  \\/\\  __ \\/\\ \\_\\ \\/\\  __ \\/\\ \"-./  \\/\\  ___\\/\\  __-.    ");
                System.out.println("\\ \\ \\-./\\ \\ \\ \\/\\ \\ \\  __ \\ \\  __ \\ \\ \\-./\\ \\ \\  __\\\\ \\ \\/\\ \\    ");
                System.out.println(" \\ \\_\\ \\ \\_\\ \\_____\\ \\_\\ \\_\\ \\_\\ \\_\\ \\_\\ \\ \\_\\ \\_____\\ \\____-    ");
                System.out.println("  \\/_/  \\/_/\\/_____/\\/_/\\/_/\\/_/\\/_/\\/_/  \\/_/\\/_____/\\/____/          ");
                System.out.println("                                                                       \r\n" + //
                                        " ______  __      __    __  ______  ______  __      ______  ______ __   ");
                System.out.println("/\\  ___\\/\\ \\    /\\ \"-./  \\/\\  ___\\/\\  __ \\/\\ \\    /\\  __ \\/\\__  _/\\ \\ ");
                System.out.println("\\ \\  __\\\\ \\ \\___\\ \\ \\-./\\ \\ \\___  \\ \\  __ \\ \\ \\___\\ \\  __ \\/_/\\ \\\\ \\ \\ ");
                System.out.println(" \\ \\_____\\ \\_____\\ \\_\\ \\ \\_\\/\\_____\\ \\_\\ \\_\\ \\_____\\ \\_\\ \\_\\ \\ \\_\\\\ \\_\\");
                System.out.println("  \\/_____/\\/_____/\\/_/  \\/_/\\/_____/\\/_/\\/_/\\/_____/\\/_/\\/_/  \\/_/ \\/_/");
                //System.out.println("  \\/_/  \\/_/\\/_____/\\/_/\\/_/\\/_/\\/_/\\/_/  \\/_/\\/_____/\\/____/          ");

                break;
                
            case 8:
                String zelda = "                                    /@\r\n" + //
                                        "                     __        __   /\\/\r\n" + //
                                        "                    /==\\      /  \\_/\\/   \r\n" + //
                                        "                  /======\\    \\/\\__ \\__\r\n" + //
                                        "                /==/\\  /\\==\\    /\\_|__ \\\r\n" + //
                                        "             /==/    ||    \\=\\ / / / /_/\r\n" + //
                                        "           /=/    /\\ || /\\   \\=\\/ /     \r\n" + //
                                        "        /===/   /   \\||/   \\   \\===\\\r\n" + //
                                        "      /===/   /_________________ \\===\\\r\n" + //
                                        "   /====/   / |                /  \\====\\\r\n" + //
                                        " /====/   /   |  _________    /  \\   \\===\\    THE LEGEND OF \r\n" + //
                                        " /==/   /     | /   /  \\ / / /  __________\\_____      ______       ___\r\n" + //
                                        "|===| /       |/   /____/ / /   \\   _____ |\\   /      \\   _ \\      \\  \\\r\n" + //
                                        " \\==\\             /\\   / / /     | |  /= \\| | |        | | \\ \\     / _ \\\r\n" + //
                                        " \\===\\__    \\    /  \\ / / /   /  | | /===/  | |        | |  \\ \\   / / \\ \\\r\n" + //
                                        "   \\==\\ \\    \\\\ /____/   /_\\ //  | |_____/| | |        | |   | | / /___\\ \\\r\n" + //
                                        "   \\===\\ \\   \\\\\\\\\\\\\\/   /////// /|  _____ | | |        | |   | | |  ___  |\r\n" + //
                                        "     \\==\\/     \\\\\\\\/ / //////   \\| |/==/ \\| | |        | |   | | | /   \\ |\r\n" + //
                                        "     \\==\\     _ \\\\/ / /////    _ | |==/     | |        | |  / /  | |   | |\r\n" + //
                                        "       \\==\\  / \\ / / ///      /|\\| |_____/| | |_____/| | |_/ /   | |   | |\r\n" + //
                                        "       \\==\\ /   / / /________/ |/_________|/_________|/_____/   /___\\ /___\\\r\n" + //
                                        "         \\==\\  /               | /==/\r\n" + //
                                        "         \\=\\  /________________|/=/    OCARINA OF TIME\r\n" + //
                                        "           \\==\\     _____     /==/ \r\n" + //
                                        "          / \\===\\   \\   /   /===/\r\n" + //
                                        "         / / /\\===\\  \\_/  /===/\r\n" + //
                                        "        / / /   \\====\\ /====/\r\n" + //
                                        "       / / /      \\===|===/\r\n" + //
                                        "       |/_/         \\===/\r\n" + //
                                        "                      =";
            System.out.println(zelda);
            break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}