import java.util.*;
class _2Dpatterns {
    public static void main(String mos[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int r = sc.nextInt();

        // Right Angle Triangle Star Pattern
        //* 
        // * * 
        // * * * 
        // * * * * 
        // * * * * *
        System.out.println("Right Angle Triangle Star Pattern"); 
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         System.out.println();

        // ### Up-Side Down ### Right Angle Triangle Star Pattern
        //* * * * * 
        // * * * * 
        // * * * 
        // * * 
        // * 
        System.out.println("Up-Side Down ### Right Angle Triangle Star Pattern");
        for(int i=0;i<r;i++){
            for(int j=r-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
         System.out.println();
        // Left Angle Triangle Star Pattern
        //         * 
        //       * * 
        //     * * * 
        //   * * * * 
        // * * * * * 
        System.out.println("Left Angle Triangle Star Pattern");
        for(int i=0;i<r;i++){
            for(int j=r-2;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         System.out.println();
        // Triangle Star Pattern
        //         * 
        //       * * * 
        //     * * * * *
        //   * * * * * * *
        // * * * * * * * * *
        System.out.println("Triangle Star Pattern");
        for(int i=0;i<r;i++){
            for(int j=r-2;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<=i-1 && i > 0 ;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
        // Triangle Down wards
        // * * * * * * * * *
        //   * * * * * * *
        //     * * * * *
        //       * * *
        //         *
        System.out.println("Triangle Down wards");
         for(int i=0;i<r;i++){
            for(int j=0;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=r-1;j>=i;j--){
                System.out.print("* ");
            }
            for(int j=r-2;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Diamond with Triangle joint
        //         *
        //       * * *
        //     * * * * *
        //   * * * * * * *
        //     * * * * *
        //       * * *
        //         *
        System.out.println(" Diamond with Triangle joint");
        for(int i=0;i<r-1;i++){
            for(int j=r-2;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<=i-1 && i > 0 ;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=r-1;j>=i;j--){
                System.out.print("* ");
            }
            for(int j=r-2;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pyramid
        //     * 
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        System.out.println("Pyramid");
        for(int i=0;i<r;i++){

            for(int j=r-2;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     sc.close();    
    }
}
