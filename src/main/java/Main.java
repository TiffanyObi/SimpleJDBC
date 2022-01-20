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

        Associate tiffany = new Associate(24,"Tiffany","Obi",26);
        Associate kyle = new Associate(25,"Kyle","Plummer",36);
        Associate naaman = new Associate(17,"Naamam","Copeland",30);
        Associate melissa = new Associate(3,"Melissa","Leggard",25);
        Associate joshua = new Associate(7,"Joshua","Sweet",27);
        Associate alvin = new Associate(15,"Alvin","F",22);
        Associate david = new Associate(12,"David","A",29);
        AssociateRepo repo = new AssociateRepo();
//        repo.create(tiffany);
//        repo.create(kyle);
//        repo.create(naaman);
//        repo.create(melissa);
//        repo.create(joshua);
//        repo.create(alvin);
        repo.create(david);


//
//        System.out.println("updating...");
//        tiffany.setLastName("Chestnut");
//        kyle.setFirstName("Sir Kyle");
//        repo.update(tiffany);
//        repo.update(kyle);
//
//
//       sc.nextLine();


    }
}
