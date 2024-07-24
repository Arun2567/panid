import java.util.*;
public class PanId {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();


    String panId = "";
    
    System.out.println("Enter Your Name:");
    String name = sc.nextLine();
    System.out.println("Type of Pan Holder\n" +
    "1. Individual\n" +
    "2. Company\n" +
    "3. Hindu Undivided Family (HUF)\n" +
    "4. Association of Persons (AOP)\n" +
    "5. Body of Individuals (BOI)\n" +
    "6. Government Agency\n" +
    "7. Artificial Juridical Persoarn\n" +
    "8. Local Authority\n" +
    "9. Firm\n" +
    "10. Trust");

    int purpose = sc.nextInt();
    

    for(int i=1; i<=3;i++){
        char first3alpha = (char) (random.nextInt(26) + 'A');
        panId += first3alpha;
    }

    panId += Character.toUpperCase(name.charAt(0));


    switch (purpose) {
            case 1:panId += 'P';
            break;
            case 2:panId += 'C';
            break;
            case 3:panId += 'H';
            break;
            case 4:panId += 'A';
            break;
            case 5:panId += 'B';
            break;
            case 6:panId += 'G';
            break;
            case 7:panId += 'J';
            break;
            case 8:panId += 'L';
            break;
            case 9:panId += 'F';
            break;
            case 10:panId += 'T';
            break;
        default:
            break;
    }
    
    for(int i=1; i<=4;i++){
        char randomDigit = (char) (random.nextInt(10) + '0');
        panId += randomDigit;
    }
      
    char first3alpha = (char) (random.nextInt(26) + 'A');
    panId += first3alpha;



    System.out.println("Here is Your PanID :"+panId);
}
}