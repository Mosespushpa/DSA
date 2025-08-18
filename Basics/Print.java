import java.io.*;
import java.util.*;

class Print{
    public static void main(String mos[]){
        System.out.println("I pledge to \"Work Hard\" and become \'Proficient\' in programming.");
        String f = "Work Hard";
        String s = "Proficient";
        System.out.printf("I pledge to \"%s\" and ",f);
        System.out.printf("become '%s' in Programming.\n\n",s);

        System.out.println("Monday\nTuesday\nWednesday\nThursday\nSaturday\nSunday");

        // Scanner sc = new Scanner(System.in);
        File file = new File("input.txt"); 

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                
                String name = sc.next();
                char gender = sc.next().charAt(0);
                float height = sc.nextFloat();
                double salary = sc.nextDouble();
                int cars = sc.nextInt();

                System.out.printf("%s gender %c is %.2f meters tall, has %d cars and annual salary of %.2fL per annum\n",name,Character.toUpperCase(gender),height,cars,salary);

                if (!sc.hasNextLine()) {
            break;
        }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

        

    }
}