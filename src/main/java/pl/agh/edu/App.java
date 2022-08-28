package pl.agh.edu;

import java.util.Map;
import org.apache.commons.cli.ParseException;

public class App {

    public static void main(String[] args) throws ParseException {

        Calculator calculator = new Calculator();
        Employees employees = new Employees();
        Printer printer = new Printer();
        ExcelLoader excelLoader = new ExcelLoader();
        Utilities utilities = new Utilities();
        String pathFromCommandLine = utilities.getPathFromCommandLine(args);
        String path;
        if (pathFromCommandLine != null) {
            path = pathFromCommandLine;
        } else {
            path = utilities.askForPath();
        }
        if (!excelLoader.isPathCorrect(path)) {
            System.out.println("Provided path is not correct");
            return;
        }
        boolean doesFolderContainExcelFiles = calculator.calculateDailyWorkWorEachDayforEachEmployee(path, employees);
        if (!doesFolderContainExcelFiles) {
            System.out.println("No excel files found in provided path");
            return;
        }
        Map<String, Double> resultsByEmployee = calculator.calculateTotalsByEmployee(employees);
        Map<String, Double> resultsByMonth = calculator.calculateTotalsByMonths(employees);
        Map<String, Double> resultsByDay = calculator.calculateTotalsByDay(employees);
        Sorter sorterByEmployee = new Sorter(resultsByEmployee);
        Sorter sorterByMonth = new Sorter(resultsByMonth);
        Sorter sorterByDay = new Sorter(resultsByDay);
        printer.printResults(sorterByEmployee.sort(), "Ranking of employees by most hard working", false);
        printer.printResults(sorterByMonth.sort(), "Ranking of months by most hard working", false);
        printer.printResults(sorterByDay.sort(), "Ranking of days by 10 most hard working", true);
    }
}