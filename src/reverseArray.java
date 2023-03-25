import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        byte[] arr;
        byte size;
        Scanner sc = new Scanner(System.in);
         do {
             System.out.println("Nhap kich thuoc: ");
             size = sc.nextByte();
             if ( size > 20)
                 System.out.println("Kich thuoc khong qua 20 ");
         } while (size > 20);
         arr = new byte[size];
         byte i = 0;
         while ( i < size){
             System.out.print("Nhap gia tri " + (i + 1) + ": ");
             arr[i] = sc.nextByte();
             i++;
         }
        System.out.println("Mang vua nhap: ");
         for (byte j = 0; j < size; j++){
             System.out.print(arr[j] + "\t");
         }
        System.out.println();
         for (byte j = 0; j < size / 2; j++){
             byte temp = arr[j];
             arr[j] = arr[size - j - 1];
             arr[size - j - 1] = temp;
         }
        System.out.println("Mang doi nguoc la: ");
         for (byte j = 0; j < size; j++){
             System.out.print(arr[j] + "\t");
         }
    }
}
