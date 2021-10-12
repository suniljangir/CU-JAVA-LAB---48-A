import java.util.*;
class ClassSet1 {
	public static int SumOfOddsAndEvens(int n){
		int n1,n2=0,n3;
		while(n!=0)
		{
			n1=n%10;
			if((n1%2)!=0)
				n2+=n1;
			n/=10;
		}
		if(n2%2==0)
			n3=-1;
		else
			n3=1;
		
		return n3;	
	}
}
class evenOdd{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    System.out.print("Drop Your Number :\n");
    int num = input.nextInt();
		System.out.println(ClassSet1.SumOfOddsAndEvens(num));
        System.out.println("\nMohit lal\n");
        System.out.println("\n20BCS2977");
	}
}

