import java.util.Scanner;

public class gajikaryawan {
 public static void main(String[] args) {
 double gajikaryawan,jamkerja,potonganpajak,totalgaji;
 
 Scanner input = new Scanner (System.in);
 System.out.println("masukkan gaji karyawan :");
 gajikaryawan = input.nextDouble();
 System.out.println("masukkan jumlah jam kerja : ");
 jamkerja = input.nextDouble();
 System.out.println("masukkan potongan pajak: ");
 potonganpajak = input.nextDouble();

 totalgaji=gajikaryawan*jamkerja;
 potonganpajak=(potonganpajak/100)*totalgaji;
  totalgaji=totalgaji-potonganpajak;
 System.out.println("total gaji karyawan :"+ totalgaji);

}




}
