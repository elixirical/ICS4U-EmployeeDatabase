/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;
import java.util.ArrayList;
/**
 *
 * @author Haichen
 */
public class EmployeeTable {
	
	private int numItems = 0;
	private int k = 2; //default 2
	private ArrayList<EmployeeData>[] hashTable; 
	private int[] numInBucket;
	
	public EmployeeTable ( int hashSize ){
		k = hashSize;
		initializeArray();
	} public EmployeeTable () {
		initializeArray();
	}
	
	@SuppressWarnings("unchecked")
	private void initializeArray () {
		hashTable = new ArrayList[k];
		numInBucket = new int[k];
		for (int n = 0; n < k; n++) {
			hashTable[n] = new ArrayList<EmployeeData>();
		}
	}
	
	public int calcBucket ( int employeeNumber ) {
		return (employeeNumber % k);
	}
	
	public void addToTable ( EmployeeData arg ) {
		int whichBucket = calcBucket(arg.getEmpNumber());
		hashTable[whichBucket].add(arg);
		numInBucket[whichBucket]++;
		numItems++;
	}
	
	public EmployeeData removeFromTable ( int employeeNumber ) {
		int location = findInTable(employeeNumber);
		if (location >= 0) {
			int whichBucket = calcBucket(employeeNumber);
			EmployeeData toReturn = hashTable[whichBucket].get(location);
			hashTable[whichBucket].remove(location);
			numInBucket[whichBucket]--;
			numItems--;
			return toReturn;
		} else return null;
	}
        
        public EmployeeData getEmployeeFromNumber ( int employeeNumber ) {
            int location = findInTable(employeeNumber);
		if (location >= 0) {
			int whichBucket = calcBucket(employeeNumber);
			EmployeeData toReturn = hashTable[whichBucket].get(location);
			return toReturn;
		} else return null;
        }
	
	public int findInTable ( int searchNumber ) { //searchTable??
		int whichBucket = calcBucket(searchNumber);
		for (int n = 0; n < hashTable[whichBucket].size(); n++) {
			if (hashTable[whichBucket].get(n).getEmpNumber() == searchNumber) {
				return n;
			}
		} return -1;
	} 
	
	public void displayContents () {
		for (int n = 0; n < k; n++) {
			hashTable[n].forEach((a) -> System.out.println(a.getEmpNumber() + " " + a.getFirstName()));
		}
	}
	
}
