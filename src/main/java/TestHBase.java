import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class TestHBase {

    public static void main(String[] args) throws IOException {

        String tableName = "testTable";
        byte[] columnFamily = Bytes.toBytes("cf1");
        byte[] columnQualifier = Bytes.toBytes("column");

        HBaseConnection hBaseConnection= new HBaseConnection();
        HBaseOperation operation = new HBaseOperation();
        Connection connection=hBaseConnection.getConnection();
        Table table = connection.getTable(TableName.valueOf(tableName));

        TableName[] tableList=connection.getAdmin().listTableNames();
        System.out.println("################ TABLE LIST ############");
        System.out.println("########################################");
        int c=1;
        for (TableName tbl: tableList){
            System.out.println("##  "+c+" :>"+Bytes.toString(tbl.getName()));
            c++;
        }
        System.out.println("########################################");
        System.out.println("######Scanning table "+tableName+"######");
        operation.performScan(connection, table, columnFamily, columnQualifier);
        connection.close();



        //Table table =connection.getTable(TableName.valueOf(tableName));
    }


}
