import java.util.*;
public class Soalan_2_IF_ELSE {
public static void main(String[]args){
    
    int gajiasas=800;
    double gaji;
    double bonus;
    int bilpelanggan;
    
    Scanner input=new Scanner(System.in);
    System.out.print("Masukkan bilangan pelanngan yang anda peroleh: ");
    bilpelanggan = input.nextInt();
    
    if(bilpelanggan==0){
        bonus=0;
    }else if(bilpelanggan<11){
        bonus=550;
    }else if(bilpelanggan<51){
        bonus=1400;
    }else if(bilpelanggan<101){
        bonus=2500;
    }else{
        bonus=10500;
    }
    gaji=gajiasas+bonus;
    
    System.out.println("Jumlah gaji sebulan :" +gaji);
}
}
