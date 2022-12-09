import java.util.Scanner;

public class Login {

	public boolean Login (Hesap hesap) {
	
		
		Scanner scanner = new Scanner(System.in);
		String Kullanici_adi;
		String Parola;
		
		System.out.println("Kullanıcı Adı : ");
		Kullanici_adi = scanner.nextLine();
		System.out.println("Parola : ");
		Parola = scanner.nextLine();
		
		if (hesap.getKullanici_adi().equals(Kullanici_adi) && hesap.getParola().equals(Parola)) {
			return true;
		}
		
		else {
			
			return false;
		}
		
		

	}

}
