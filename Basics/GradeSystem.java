import java.io.*;
import java.util.*;
class GradeSystem{
    public static void main(String mos[]){
        // program to caluclate the percentage of student score, 
        // out of 600 marks of 6 subjects.
        File file = new File("inputforGradeSystem.txt");

        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                // System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                // System.out.print("\nEnter marks of Telugu: ");
                int t = Integer.parseInt(sc.nextLine());
                // System.out.print("\nEnter marks of Hindi: ");
                int h = Integer.parseInt(sc.nextLine());
                // System.out.print("\nEnter marks of English: ");
                int e = Integer.parseInt(sc.nextLine());
                // System.out.print("\nEnter marks of Mathametics: ");
                int m = Integer.parseInt(sc.nextLine());
                // System.out.print("\nEnter marks of Science: ");
                int si = Integer.parseInt(sc.nextLine());
                // System.out.print("\nEnter marks of Social: ");
                int so = Integer.parseInt(sc.nextLine());
                // sc.nextLine();
                int total = t+h+e+m+si+so;
                float per = (total/600.0f)*100;
                char grade = ' ';
                if(per >= 90.0){
                    grade = 'O';
                }
                else if(per >= 80.0){
                    grade = 'A';
                }
                else if(per >= 70.0){
                    grade = 'B';
                }
                else if(per >= 60.0){
                    grade = 'C';
                }
                else if(per >= 50.0){
                    grade = 'D';
                }
                else if(per >= 40.0){
                    grade = 'E';
                }
                else{
                    grade = 'F';
                }
                System.out.println("\n--- " + name + "'s Report ---");
                System.out.println("Total Marks: "+total);
                System.out.printf("Percentage: %.2f\n",per);
                System.out.println("Grade: "+ grade+"\n");

            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
}