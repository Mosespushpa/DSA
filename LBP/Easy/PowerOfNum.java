class PowerOfNum{
    public static void main(String ar[]){
        Input in = new Input();

        System.out.println("To check if a number is power of another number (x)^n = y");
        System.out.println("Enter the x number");
        int x = in.sc.nextInt();
        System.out.println("Enter the y number");
        int y = in.sc.nextInt();

        System.out.println("Choose the method to find the power of the number\n1. Loop\n2.formual");
        int n = in.sc.nextInt();
        
        PowerOfNum p = new PowerOfNum();

        if(n == 1){
            p.loop(x,y);
        }
        else{
            p.formula(x,y);
        }
    }

    void loop(int x,int y){
        int power = 0;
        int yy = (int)Math.pow(x,power);
        while(yy < y){
            power = power + 1;
            yy = yy * x;
        }
        if(yy == y){
            System.out.println("x = "+x+" and y = "+y+" Its true that "+x+"^"+power+"="+y);
        }
        else{
            System.out.println(" FLASE Can Not be (x)^n = y");
        }
    }

    void formula(int x,int y){
        int power = 0;
        int yy = (int)Math.pow(x,power);
        
        int nn = (int)(Math.log(y) / Math.log(x));

        int val = (int)Math.pow(x,nn);

        if(val == y){
            System.out.println("x = "+x+" and y = "+y+" Its true that "+x+"^"+nn+"="+y);
        }
        else{
            System.out.println(" FLASE Can Not be (x)^n = y");
        }
    }
}