import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

   try{
       Class.forName ("org.postgresql.Driver"); // Load the Driver
       Connection conn = DriverManager.getConnection
               ("jdbc:postgresql://localhost:5432/Progetto", "postgres", "210600" );

       File folder = new File("/Users/monta/Downloads/allenamento");
       FileReader file_in = new FileReader(folder);
       BufferedReader buf_file_in = new BufferedReader(file_in);

       FileWriter file_out = new FileWriter(new File("/Users/monta/Desktop/allenamentoSQL_Alternative"));
       BufferedWriter buf_file_out = new BufferedWriter(file_out);

       String p1, p2 ,p3;

       String sql = "INSERT INTO allenamento VALUES (?,?,?);";
       PreparedStatement preparedstatement = conn.prepareStatement(sql);

       while (buf_file_in.ready()){
           p1 = buf_file_in.readLine();
           p2 = buf_file_in.readLine();
           p3 = buf_file_in.readLine();

           preparedstatement.setString(1, p1);
           preparedstatement.setString(2, p2);
           preparedstatement.setString(3, p3);

           buf_file_out.write(preparedstatement.toString()+"\n");
       }

       preparedstatement.close();
       buf_file_out.close();
       buf_file_in.close();

   } catch (SQLException e){
       System.out.println(e);
   } catch (ClassNotFoundException z){
       System.out.println(z);
   } catch (FileNotFoundException x){
       System.out.println();
   } catch (IOException y){
       System.out.println(y);
   }



    }
}



/*
import java.io.*;

public class Main {

    public static void main(String[] args) {

        File folder = new File("/Users/monta/Downloads/allenamento");
        BufferedReader buf_file_in = null;
        FileReader file_in;
        String p1, p2, p3;

        BufferedWriter buf_file_out = null;
        FileWriter file_out;


        try {
            file_in = new FileReader(folder);
            buf_file_in = new BufferedReader(file_in);
        } catch (IOException e){
            System.out.println(e);
        }

        String sql = "INSERT INTO allenamento Values ";


        try {

            file_out = new FileWriter(new File("/Users/monta/Desktop/allenamentoSQL"));
            buf_file_out = new BufferedWriter(file_out);

            while (buf_file_in.ready()) {
                p1 = buf_file_in.readLine();
                p2 = buf_file_in.readLine();
                p3 = buf_file_in.readLine();

                buf_file_out.write(sql + "('" + p1 + "','" + p2 + "','" + p3 + "');\n");
            }

            buf_file_in.close();
            buf_file_out.close();

        } catch (IOException e){
            System.out.println(e);
        }



    }
}
 */