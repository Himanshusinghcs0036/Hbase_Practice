import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class HBaseOperation {

    public void performScan(Connection connection, Table table, byte[] columnFamily, byte[] columnQualifier) throws IOException {
        Scan scan = new Scan();
        scan.addColumn(columnFamily, columnQualifier);
        ResultScanner scanner = table.getScanner(scan);
        try{
            for (Result rr = scanner.next(); rr != null; rr = scanner.next()) {
                // print out the row we found and the columns we were looking for

                System.out.println(Bytes.toString(rr.getRow())+"<< row:  ===  :value >>" + Bytes.toString(rr.getValue(columnFamily, columnQualifier)));
            }
        }catch (Exception ex){
            ProjectException.printException(ex);
        }
    }

    public void performPut(){

    }

    public void performDelete(){

    }

    public void performDeleteAll() {

    }

    public void performGet(){

    }

}
