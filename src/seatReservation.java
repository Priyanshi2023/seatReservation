//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class seatReservation{
    private static boolean[] seats = new boolean[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nPlease select an option:");
            System.out.println("1.View Seat Map");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            switch (option){
                case 1 :
                    ViewseatMap();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3 :
                    cancelReservation();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid option");


            }
        }
    }
    private static void ViewseatMap(){
        System.out.println("\n Current seat map:");
        for(int i = 0; i < seats.length; i++){
            if (seats[i]){
                System.out.println("x");
            }else{
                System.out.println((i+1)+ " ");
            }

        }
        System.out.println();

    }
    private static void reserveSeat(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number(1 - 10):");
        int seatNumber = scanner.nextInt();
        if(seatNumber < 1 || seatNumber > 10){
            System.out.println("Invalid seat number!");
        }else if (seats[seatNumber-1]){
            System.out.println("seats already reserved");
        } else {
            seats[seatNumber- 1]= true ;
            System.out.println("seat reserved!");
        }
    }
    private static void cancelReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber> 10){
            System.out.println("Invalid seat number!");
        } else if (!seats[seatNumber - 1]){
            System.out.println("seat not reserved !");
        } else {
            seats[ seatNumber - 1] = false;
            System.out.println("Reservation cancelled");
        }
    }
}
