import java.util.*;
import java.io.*;

class Cubes{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=30;i++){
            bw.write(i+"  "+(i*i*i)+"\n");
        }
        bw.flush();
    }
}