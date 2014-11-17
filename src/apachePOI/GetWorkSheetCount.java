package apachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class GetWorkSheetCount {
	public static FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private static XSSFWorkbook workbook = null;
	private static XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	
	static Reader xls = new Reader();
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "D:/SDG/Employee-Personal/AutomationKit/src/test/resources/com/resources/TestCases.xlsx";
		
		fis = new FileInputStream(fileName);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		System.out.println(workbook.getNumberOfSheets());
		for (int i=0; i<workbook.getNumberOfSheets(); i++) {
		    System.out.println(workbook.getSheetName(i));
		}
		
		readData("sucessfullLoginTest", xls);
		readData("LoadLoginTest", xls);
		readData("SOALoginTest", xls);			
		readData("MobileLoginTest", xls);	
	}
	
	/**
	 * 
	 * @param testName
	 * @param xls
	 * @return
	 */
	public static Object[][] readData(String testName, Reader xls) {
		String sheetName = null;
		// find the row num from which test starts
		// number of columns
		// number of rows
		// put the data in hashtable and put hashtable in array
		int testStartRowNum = 0;
		
		for (int i=0; i<workbook.getNumberOfSheets(); i++) {
		    System.out.println(workbook.getSheetName(i));
		    sheetName = workbook.getSheetName(i);
		
			// find the row num from which test start
			for (int rNum = 1; rNum <= xls.getRowCount(sheetName); rNum++) {
				if (xls.getCellData(sheetName, 0, rNum).equals(testName)) {
					testStartRowNum = rNum;
					System.out.println("Test Start Row Num - "+sheetName);
					System.out.println("Test Start Row Num - "+testName);
					System.out.println("Test Start Row Num - "+testStartRowNum);
					break;
				}
			}
		}
			// cols
			int colStartRowNum = testStartRowNum + 1;
			int totalCols = 0;
			while (!xls.getCellData(sheetName, totalCols, colStartRowNum).equals("")) {
				totalCols++;
			}
		
			// rows
			int dataStartRowNum = testStartRowNum + 2;
			int totalRows = 0;
			while (!xls.getCellData(sheetName, 0, dataStartRowNum + totalRows).equals("")) {
				totalRows++;
			}
	
			// extract data
			Object[][] data = new Object[totalRows][1];
			Hashtable<String, String> table = null;
			int index = 0;
			for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + totalRows); rNum++) {
				table = new Hashtable<String, String>();
				for (int cNum = 0; cNum < totalCols; cNum++) {
					table.put(xls.getCellData(sheetName, cNum, colStartRowNum),
							xls.getCellData(sheetName, cNum, rNum));
					System.out.print(xls.getCellData(sheetName, cNum, rNum)	+ " -- ");
				}
				data[index][0] = table;
				index++;
				System.out.println();
			}
		System.out.println("Done");
		return data;
	}

}
