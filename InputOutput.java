import java.util.Scanner;

public class InputOutput{
 public static void main(String []args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int p,l;
  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);
  System.out.println("== Menghitung Luas Persegi Panjang ==");
  
  System.out.print("Masukkan Panjang : ");
  p = scanner.nextInt();
 
  System.out.print("Masukkan Lebar : ");
  l = scanner.nextInt();
  
  int luas = p * l;
  System.out.print("Luas Persegi Panjang = "+luas);
}
}