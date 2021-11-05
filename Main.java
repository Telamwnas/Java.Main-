import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
      //ΔΙΛΩΣΗ ΜΕΤΑΒΛΗΤΩΝ 
      double num1,num2,num3;
      double ans;
      //ΑΡΙΘΜΙΤΙΚΟΣ ΧΑΡΑΚΤΗΡΙΣΜΟΣ 
      char op;
      Scanner reader = new Scanner(System.in);
      //ΕΙΣΟΔΟΣ ΑΡΙΘΜΟΝ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ
      System.out.print("ΕΙΣΑΓΕΤΕ ΤΡΕΙΣ ΑΡΙΘΜΟΥΣ : ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      num3 = reader.nextDouble();
      //ΕΙΣΟΔΟΣ ΔΥΑΔΙΚΟΥ ΤΕΛΕΣΤΗ ΑΠΟ ΤΟΝ ΧΡΗΣΗ
      System.out.print("\nΕΠΙΛΕΞΤΕ ΔΥΑΔΙΚΟ ΤΕΛΕΣΤΗ(+, -, *, /) : ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2 + num3;
            break;
         case '-': ans = num1 - num2 - num3;
            break;
         case '*': ans = num1 * num2 * num3;
            break;
         case '/': ans = num1 / num2 / num3;
            break
        default: System.out.printf("ΣΦΑΛΜΑ! ΕΙΣΑΓΕΤΕ ΣΩΣΤΟ ΤΕΛΕΣΤΗ");
         return;
      }
      //ΠΡΑΞΕΙΣ ΤΟΝ ΑΡΙΘΜΟΝ
      System.out.print("\nΤΟ ΑΠΟΤΕΣΜΑΣ ΕΙΝΑΙ :\n");
      System.out.printf(num1 + " " + op + num2 + " "+op + num3 + " = " + ans);
   }
}
