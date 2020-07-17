import java.util.*;
public class JDD_Tunit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		String res="";
		for(int i=0;i<s.length();i++){
			if(i<=1){
				if(s.charAt(i)!='A'){
					res=res+s.charAt(i);
				}
			}
			else{
				res+=s.charAt(i);
			}
		}
		System.out.println("Output String :"+res);
	}
}
