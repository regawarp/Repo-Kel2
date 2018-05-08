/*
 * Copyright May - 2018
 * JTK POLBAN.
 * Made in Ciwaruga.
 */
package swing;

import com.sun.rowset.internal.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import javafx.scene.control.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ASUS
 */
public class BacaData {

    public void getAllData() throws IOException {
        FileInputStream excelFile = new FileInputStream(new File("*/../src/Excel/data.xlsx"));
        Workbook workbook = new XSSFWorkbook(excelFile);
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
        Iterator<org.apache.poi.ss.usermodel.Row> iterator = sheet.iterator();

        iterator.next();

        while (iterator.hasNext()) {
            Row currentRow = (Row) iterator.next();

            Cell label = currentRow.getCell(0);
            Cell jml = currentRow.getCell(1);
        }
    }

}
