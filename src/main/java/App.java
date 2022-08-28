import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("main");

        ExcelLoader excelLoader = new ExcelLoader();
        Calculator calculator = new Calculator();
        String path = "src/main/resources/";
        float allHoursWorked = 0;
        ArrayList<File> excelFiles = excelLoader.FindAllExcleFiles(path);

        for (File file : excelFiles) {
            Workbook wb = excelLoader.loadExcelFile(file);
            System.out.println("przed  " + allHoursWorked);
            allHoursWorked += calculator.calculateHoursWorked(wb);
            System.out.println("po  " + allHoursWorked);
        }
        System.out.println(allHoursWorked);
    }
}
