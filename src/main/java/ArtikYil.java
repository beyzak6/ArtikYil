import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl giriniz : ");
        int yil = scanner.nextInt();

        if(yil%4 ==0){
            System.out.println(yil + " artık bir yıldır!");
        }else{
            System.out.println(yil + " artık yıl değildir!");
        }
    }
}
