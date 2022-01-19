import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
//    jdbc:mariadb://<hostname:port>/<databaseName>?user=<username>&password=<password?

    private static ConnectionManager connectionManager;
    private static Connection connection;

    private ConnectionManager(){

    }

    private ConnectionManager connectionManager(){
        if(connectionManager == null){
            connectionManager = new ConnectionManager();
        }

        return connectionManager;
    }

    public static Connection getConnection(){
        if(connection == null){
            connection = connect();
        }
        return connection;
    }

    public static Connection connect(){
        //connection logic here
      try {
          Properties props = new Properties();
          FileReader fr = new FileReader("src/main/resources/jdbc.properties");
          props.load(fr);

          String connectionURL = "jdbc:mariadb://" +
                  props.get("hostname") + ":"+
                  props.get("port") + "/"+
                  props.get("dbname") + "?user=" +
                  props.get("username") + "&password=" +
                  props.get("password");
//          jdbc:mariadb://hostname:port/databaseName?user=username&password=password
//          Class.forName("org.mariadb.jdbc.Driver");

          connection = DriverManager.getConnection(connectionURL);

          System.out.println(connectionURL);
      } catch(IOException | SQLException e){
          e.printStackTrace();
      }
        return connection;
    }

}
