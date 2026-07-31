import java.util.*;
import java.io.*;

class Tables{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<=20;i++){
            bw.write(n+" * "+i+" = "+(n*i)+"\n");
        }
        bw.flush();
    }
}