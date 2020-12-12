/*
    Cameron Martin,
    Jared Key,
    Christopher Duong,
    Luke Higginbotham
 */
package ded;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataPanel extends JPanel
{
  private DefaultTableModel model;


  public DataPanel(){
    model = new DefaultTableModel();
    final JTable searchTable = new JTable();
    searchTable.setModel(model);

    //Add columns with appropriate headings to the table
    model.addColumn("First Name");
    model.addColumn("Last Name");
    model.addColumn("Burial Number");
    model.addColumn("Section");
    model.addColumn("Plot Number");
    model.addColumn("Grave Number");
    model.addColumn("Date Deceased");

    //Add the table to the display panel
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    add(new JScrollPane(searchTable));

    //Create panel to hold buttons
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(1, 5));

    //Create new buttons and add to the button panel
    JButton select = new JButton("View Entries");
    buttonPanel.add(select);

    JButton createButton = new JButton("Create New Entry");
    buttonPanel.add(createButton);

    //Add buttons to the display panel
    add(buttonPanel);
    setVisible(true);
    
       createButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        NewEntry entry = new NewEntry();
        entry.setVisible(true);
      }
    });
//      try {
//
//    FileInputStream file = new FileInputStream(new File("C:/Users/chris/Documents/NetBeansProjects/DED/src/ded/DED DB.xlsx"));
//
//    //Get the workbook instance for XLS file 
//    XSSFWorkbook workbook = new XSSFWorkbook(file);
//
//    //Get first sheet from the workbook
//    XSSFSheet sheet = workbook.getSheetAt(0);
//
//    //Iterate through each rows from first sheet
//    Iterator < Row > rowIterator = sheet.iterator();
//    while (rowIterator.hasNext()) {
//        Row row = rowIterator.next();
//
//        //For each row, iterate through each columns
//        Iterator < Cell > cellIterator = row.cellIterator();
//        while (cellIterator.hasNext()) {
//
//            Cell cell = cellIterator.next();
//
//            switch (cell.getCellType()) {
//                case 0: Cell.CELL_TYPE_NUMERIC:
//                    System.out.print(cell.getNumericCellValue() + "\t\t");
//                    break;
//                case 1 Cell.CELL_TYPE_STRING:
//                    System.out.print(cell.getStringCellValue() + "\t\t");
//                    break;
//            }
//        }
//        System.out.println("");
//    }
//    file.close();
//    FileOutputStream out =
//        new FileOutputStream(new File("C:\\test.xls"));
//    workbook.write(out);
//    out.close();
//
//} catch (FileNotFoundException e) {
//    e.printStackTrace();
//} catch (IOException e) {
//    e.printStackTrace();
//}
  }
}
