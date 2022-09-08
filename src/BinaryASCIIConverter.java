import java.util.Scanner;

public class BinaryASCIIConverter {

    private static Scanner sc = new Scanner(System.in);

    public static void run(){
        System.out.println(
                """
                1. Text to binary
                2. Binary to text
                3. Quit 
                Enter choice:\s       
                """
        );
        int choice = sc.nextInt();
        sc.nextLine(); // Buffer
        if (choice == 1){
            textToBinary();
        }
        else if (choice == 2) {
            binaryToText();
        }
    }

    private static void binaryToText() {
        System.out.println("Enter binary: ");
    }

    private static void textToBinary() {
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        for(int i = 0; i < text.length(); i++)
        {
            int ascii = text.charAt(i);
            int number = 128;
            String num = "";
            for(int times = 0; times < 8; times++)
            {
               if (ascii >= number)
               {
                  num = num + "1";
                  ascii = ascii - number;
                  number = number/2;
               }

               else
               {
                  num = num + "0";
                  number = number/2;
               }

            }
            System.out.println(num);



        }
    }
}
