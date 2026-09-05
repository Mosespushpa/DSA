public class RectangleOverlap {
    public static void main(String ar[]){
        Input in = new Input();

        System.out.println("To Check whether two rectangles overlapp or not");
        System.out.println("Enter the corrdinates of Rectangle 1\nL1 coordinates: ");
        int l1x = in.sc.nextInt();
        int l1y = in.sc.nextInt();
        System.out.println("R1 coordinates: ");
        int r1x = in.sc.nextInt();
        int r1y = in.sc.nextInt();
        System.out.println("Enter the corrdinates of Rectangle 2\nL2 coordinates: ");
        int l2x = in.sc.nextInt();
        int l2y = in.sc.nextInt();
        System.out.println("R2 coordinates: ");
        int r2x = in.sc.nextInt();
        int r2y = in.sc.nextInt();
        boolean isOverlap = (l1x > r2x || l2x > r1x || r1y > l2y || r2y > l1y);

        if (isOverlap) {
            System.out.println("Do not Overlap");
        } else {
            System.out.println("Overlap");
        }
    }
}
