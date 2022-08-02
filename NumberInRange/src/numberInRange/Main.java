package numberInRange;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rangeInput = scan.nextLine().split(" ");

        int start = Integer.parseInt(rangeInput[0]);
        int end = Integer.parseInt(rangeInput[1]);
        System.out.printf("Range: [%d...%d]%n",start,end);
        int num = readNumberInRange(scan,start,end);
        System.out.println("Valid number: " + num);

    }
    private static int readNumberInRange(Scanner scan,int start,int end){
        while (true){
            String line = scan.nextLine();
            try {
                int num = Integer.parseInt(line);
                if (num >= start && num <= end){
                    return num;
                }
            }catch (Exception ex){

            }
            System.out.println("Invalid number: " + line);
        }
    }
}
