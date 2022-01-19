import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String ...args){
        //we will store the database credentials safely and seurely
        //we need connection to mariaDB
        //we will need an interface for crud
        //we will implement this interface onour repos
    Connection conn = ConnectionManager.getConnection();

        Scanner sc = new Scanner(System.in);

        Associate tiffany = new Associate(24,"Tiffany","Obi",25);
        Associate kyle = new Associate(25,"Kyle","Plummer",36);

        AssociateRepo repo = new AssociateRepo();
        repo.create(tiffany);
        repo.create(kyle);


        System.out.println("updating...");
        tiffany.setLastName("Chestnut");
        kyle.setFirstName("Sir Kyle");
        repo.update(tiffany);
        repo.update(kyle);


       sc.nextLine();


    }
}
