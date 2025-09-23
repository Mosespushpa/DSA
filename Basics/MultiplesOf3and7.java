import java.io.*;

class MultiplesOf3and7{
    public static void main(String mos[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int c = 0;
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i=1;i<=n;i++){
        if(i%3 == 0 && i%7 == 0){
            c++;
             //bw.write(c);
        }
    }
    bw.write(c);
    bw.flush();

}
}