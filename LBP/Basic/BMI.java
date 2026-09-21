public class BMI {
    public static void main(String ar[]){
        Input in = new Input();

        System.out.println("Calculating Body Mass Index");
        System.out.print("Enter your Name: ");
        String name = in.sc.nextLine();
        System.out.println("Enter F or f for Female and M or m for Male: ");
        char sex = in.sc.next().charAt(0);
        System.out.print("Enter your Age: ");
        int age = in.sc.nextInt();
        System.out.print("Enter your wright in kg: ");
        double weight = in.sc.nextDouble();
        System.out.print("Enter your Height in cm: ");
        double height = in.sc.nextDouble();


        double bmi = weight/Math.pow(height,2);

        if(bmi < 18.5){
            System.out.println(name+" You are Under-Weight");
        }
        else if(bmi >=18.5 && bmi <= 22.9){
            System.out.println(name+" You are in Normal weight");
        }
        else if(bmi >= 23.0 && bmi <= 24.9){
            System.out.println(name+" You are Over-Weight");
        }
        else if(bmi >= 25){
            System.out.println(name+" You are Obese");
        }
    }
    
}
