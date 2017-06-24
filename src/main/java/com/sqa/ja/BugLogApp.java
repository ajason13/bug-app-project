/**
 * File Name: BugLogApp.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 24, 2017
 */
package com.sqa.ja;

import java.util.*;

import com.sqa.ja.helpers.*;

/**
 * BugLogApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class BugLogApp extends Bug {

	private final static String appName = "Bug Log App";

	public static ArrayList<Bug> arrayListOfBugs = new ArrayList<Bug>();

	private static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean run = true;
		int choice;
		int bugID = 0;
		String name = AppBasics.greetUserAndGetName(appName);
		System.out.println();
		while (run) {
			System.out.println("1. Print Bug Report");
			System.out.println("2. Add Bug");
			System.out.println("3. Remove Bug");
			System.out.println("4. Exit Bug Log App");
			System.out.println();
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				printBugReport();
				break;
			case 2:
				bugID = addBug(bugID);
				break;
			case 3:
				removeBug();
				// System.out.println("Under Construction!!!");
				break;
			case 4:
				AppBasics.farewellUser(name);
				run = false;
				break;
			default:
				System.out.println("Not a valid option");
			}
		}
	}

	private static int addBug(int bugID) {
		String reporterName;
		String bugName;
		char bugCategory;
		String operatingSystem; // LOOK AT ENUMS!!!!!!!!!
		String date; // LOOK AT DATE DATATYPE
		String bugDetails;
		double frequency;
		boolean isActive;
		boolean anotherBug = true;
		do {
			bugID++;
			reporterName = AppBasics.requestString("Reporter's Name?");
			bugName = AppBasics.requestString("Bug Name?");
			bugCategory = AppBasics.requestChar("Bug Category?", "Not a valid bug category", 'A', 'B', 'C', 'D');
			operatingSystem = AppBasics.requestString("Operating System?");
			date = AppBasics.requestString("Date?");
			bugDetails = AppBasics.requestString("Bug Details?");
			frequency = AppBasics.requestDouble("Frequency of bug?");
			isActive = AppBasics.requestBoolean("Is bug active?");
			Bug newBug = new Bug(bugID, reporterName, bugName, bugCategory, operatingSystem, date, bugDetails,
					frequency, isActive);
			arrayListOfBugs.add(newBug);
			anotherBug = AppBasics.requestBoolean("Would you like to log another bug?");
		} while (anotherBug);
		System.out.println();
		return bugID;
	}

	private static void printBugReport() {
		System.out.println(
				"BugID\tReporter Name\tBug Name\tBug Category\tOperating System\tDate\tBug Details\tFrequency\tActive");
		for (Bug printBugs : arrayListOfBugs) {
			System.out.println(printBugs.getBugId() + "\t" + printBugs.getReporterName() + "\t\t"
					+ printBugs.getBugName() + "\t" + printBugs.getBugCategory() + "\t\t"
					+ printBugs.getOperatingSystem() + "\t\t" + printBugs.getDate() + "\t" + printBugs.getBugDetails()
					+ "\t" + printBugs.getFrequency() + "\t" + printBugs.isActive());
		}
		System.out.println();
	}

	private static void removeBug() {
		int bugID;
		int index = 0;
		boolean indexFound = false;
		if (arrayListOfBugs.isEmpty()) {
			System.out.println("No bugs to remove");
		} else {
			System.out.println("Bug ID\tBug Name");
			for (Bug printBugs : arrayListOfBugs) {
				System.out.println(printBugs.getBugId() + "\t" + printBugs.getBugName());
			}
			bugID = AppBasics.requestIntWithinRange("Which bug would you like to remove? (ID)", 1,
					arrayListOfBugs.size(), "Bug does not exist");
			for (Bug searchBug : arrayListOfBugs) {
				if (searchBug.getBugId() == bugID) {
					index = arrayListOfBugs.indexOf(searchBug);
					indexFound = true;
					break;
				}
			}
			if (indexFound) {
				arrayListOfBugs.remove(index);
			}
		}
		System.out.println();
	}

	/**
	 * @param bugID
	 * @param reportName
	 * @param bugName
	 * @param bugCategory
	 * @param operatingSystem
	 * @param date
	 * @param bugDetails
	 * @param frequency
	 * @param isActive
	 */
	public BugLogApp(int bugID, String reporterName, String bugName, char bugCategory, String operatingSystem,
			String date, String bugDetails, double frequency, boolean isActive) {
		super(bugID, reporterName, bugName, bugCategory, operatingSystem, date, bugDetails, frequency, isActive);
	}
}
