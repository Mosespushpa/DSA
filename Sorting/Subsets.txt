import java.util.*;

class Subsets{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		List<String> subsets = new ArrayList<>();
		
		int l = s.length();
		int n = (int)Math.pow(2,l);
		
		for(int i=0;i<n;i++){
			String ss = "";
			for(int j=0;j<l;j++){
                int num = i & (1 << j);
				if(num != 0){
					ss = ss + s.charAt(j);
				}
			}
			System.out.println(ss);
			subsets.add(ss);
		}
		
	}
}