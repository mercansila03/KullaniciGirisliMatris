import java.util.Scanner;
public class soru1 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        int [][] Dizi=new int[4][4];//4X4'lük iki boyutlu bir dizi oluşturuyoruz.

        for(int satir=0;satir<Dizi.length;satir++){//Kullanıcıdan oluşturulacak matris için değer alıyoruz.
            for(int sutun=0;sutun<4;sutun++){
                System.out.println("Dizinin ["+satir+"]["+sutun+"] değerini giriniz: ");
                Dizi[satir][sutun]=tara.nextInt();
            }
        }
        System.out.println("4X4'lük Dizi");//Diziyi konsola yazdırıyoruz.
        for(int i=0;i<Dizi.length;i++){
            for(int j=0;j<4;j++){
                System.out.print(Dizi[i][j]+" ");
            }
            System.out.println();
        }
       
        
    }
}