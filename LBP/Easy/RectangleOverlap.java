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
        int ll1x = l1x;
        int ll1y = r1y;
        int rr1x = r1x;
        int rr1y = l1y;
        System.out.println("Enter the corrdinates of Rectangle 2\nL2 coordinates: ");
        int l2x = in.sc.nextInt();
        int l2y = in.sc.nextInt();
        System.out.println("R2 coordinates: ");
        int r2x = in.sc.nextInt();
        int r2y = in.sc.nextInt();
        int ll2x = l2x;
        int ll2y = r2y;
        int rr2x = r2x;
        int rr2y = l2y;

        boolean point1x = (l2x <= l1x) || (l2x <= ll1x) || (l2x <= r1x) || (l2x <= rr1x );
        boolean point1y = (l2y <= l1y) || (l2y <= ll1y) || (l2y <= r1y) || (l2y <= rr1y );
        boolean point2x = (ll2x <= l1x) || (ll2x <= ll1x) || (ll2x <= r1x) || (ll2x <= rr1x );
        boolean point2y = (ll2y <= l1y) || (ll2y <= ll1y) || (ll2y <= r1y) || (ll2y <= rr1y );

        boolean point3x = (r2x <= l1x) || (r2x <= ll1x) || (r2x <= r1x) || (r2x <= rr1x );
        boolean point3y = (r2y <= l1y) || (r2y <= ll1y) || (r2y <= r1y) || (r2y <= rr1y );
        boolean point4x = (rr2x <= l1x) || (rr2x <= ll1x) || (rr2x <= r1x) || (rr2x <= rr1x );
        boolean point4y = (rr2y <= l1y) || (rr2y <= ll1y) || (rr2y <= r1y) || (rr2y <= rr1y );

        if(point1x || point1y || point2x || point2y || point3x || point3y || point4x || point4y ){
            System.out.println("Overlapp");
        }
        else{
            System.out.println("Do not Overlap");
        }

        // RectangleOverlap r = new RectangleOverlap();

        
    }
}
