import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int books = 0;

        String searchFor = sc.nextLine();
        String input = sc.nextLine();

        boolean Found = false;
        while (!input.equals("No More Books")){
            if (input.equals(searchFor)){
                Found = true;
                break;
            }
            input = sc.nextLine();
            books++;
        }
        if (Found) {
            System.out.printf("You checked %d books and found it.", books);
        } else {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", books);
        }
    }
}
