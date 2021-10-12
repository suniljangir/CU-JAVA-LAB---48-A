import java.util.*;
class ICICIBank{
    void getSavingInterestRate(){
        System.out.println("Intrest of saving ICICI is : 4.0%\n");
    }
    void getFixedInterestRate(){
        System.out.println("Intrest of fixed ICICI is : 8.5%\n");
    }
}
class KotMBank{
    void getSavingInterestRate(){
        System.out.println("Intrest of saving Kotak is : 6.0%\n");
    }
    void getFixedInterestRate(){
        System.out.println("Intrest of fixed Kotak is : 9.0%\n");
    }
}
public class intrest {
	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();

		iciciBank.getSavingInterestRate();
		iciciBank.getFixedInterestRate();
	    kotMBank.getSavingInterestRate();
	    kotMBank.getFixedInterestRate();
    }

}

