import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class HBaseConnection {


        private static Connection connection;

        synchronized Connection getConnection(){
            if(connection==null){
                try{
                    Configuration configuration = HBaseConfiguration.create();
                    connection=ConnectionFactory.createConnection(configuration);
                }catch (Exception ex){
                    System.out.println("################################//#");
                    System.out.println("Exception in Connection to HBase");
                    System.out.println(ex.getMessage());
                    System.out.println(ex.getCause());
                    System.out.println("#################################");
                }
                return connection;
            }else{
                return connection;
            }
        }

    }

