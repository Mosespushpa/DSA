public class WaterTank {
    public static void main(String ar[]){
        System.out.println("Water Tank Capcity");
        Input in = new Input();
        System.out.print("Enter the Lenght of the Water Tank: ");
        int l = in.sc.nextInt();
        System.out.print("Enter the width of the Water Tank: ");
        int w = in.sc.nextInt();
        System.out.print("Ente the Height of the Water Tank: ");
        int h = in.sc.nextInt();

        double volume = l * w * h;
        Double capcityInLiters = volume * 1000;

        System.out.println("The Volume of the Water Tank: "+capcityInLiters+" liters");
    }
}
