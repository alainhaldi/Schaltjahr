import java.util.Scanner;

public class schaltjahr {
    

    public static void main(String[] args){


        System.out.println("Schaltjahrberechnung");
        System.out.println("====================");
        System.out.println("Bitte eine Jahreszahl eingeben");

        
        // Usereingabe
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        
        Boolean schaltjahr = year % 4 == 0;
        Boolean jahrhundert = year % 100 == 0;


        if(jahrhundert){

            System.out.println(year + " ist kein Schaltjahr weil: Es handelt sich um ein Jahrhundert");            

        } else if(!schaltjahr) {

            System.out.println(year + " ist kein Schaltjahr weil: Ihre Eingabe ist nicht durch 4 teilbar");   

        } else if(schaltjahr){

            System.out.println(year + " ist ein Schaltjahr");   

        }








    }





}
