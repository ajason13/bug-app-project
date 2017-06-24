/**
 * File Name: BugLog.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 24, 2017
 */
package com.sqa.ja;

/**
 * BugLog //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class Bug {

	int bugId;

	String reporterName;

	String bugName;

	char bugCategory;

	String operatingSystem;

	String date;

	String bugDetails;

	double frequency;

	boolean isActive;

	/**
	 * Constructer
	 *
	 * @param bugID
	 * @param reporterName
	 * @param bugName
	 * @param bugCategory
	 * @param operatingSystem
	 * @param date
	 * @param bugDetails
	 * @param frequency
	 * @param isActive
	 */
	public Bug(int bugID, String reporterName, String bugName, char bugCategory, String operatingSystem, String date,
			String bugDetails, double frequency, boolean isActive) {
		this.bugId = bugID;
		this.reporterName = reporterName;
		this.bugName = bugName;
		this.bugCategory = bugCategory;
		this.operatingSystem = operatingSystem;
		this.date = date;
		this.bugDetails = bugDetails;
		this.frequency = frequency;
		this.isActive = isActive;
	}

	/**
	 * @return the bugCategory
	 */
	public char getBugCategory() {
		return this.bugCategory;
	}

	/**
	 * @return the bugDetails
	 */
	public String getBugDetails() {
		return this.bugDetails;
	}

	/**
	 * @return the bugId
	 */
	public int getBugId() {
		return this.bugId;
	}

	/**
	 * @return the bugName
	 */
	public String getBugName() {
		return this.bugName;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * @return the frequency
	 */
	public double getFrequency() {
		return this.frequency;
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	/**
	 * @return the reporterName
	 */
	public String getReporterName() {
		return this.reporterName;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return this.isActive;
	}
}
