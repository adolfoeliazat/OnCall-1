import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class onCallCycle {
	Calendar cal1 = Calendar.getInstance();
	String dirName = "onCall Files";
	File dir = new File(dirName);
	Scanner s = new Scanner(new File(dirName, "startDate.txt"));
	Scanner s2 = new Scanner(new File(dirName, "aFirstCycle.txt"));
	public int startDate = s.nextInt();
	public int aFirstCycle = s2.nextInt();
	public double cycleDay = ((cal1.get(Calendar.DAY_OF_YEAR) - startDate)) % 16;
	public double dayOfCycle = cycleDay % 4;
	// number of days into current rotation ( 0 =4, 1=1, 2=2, 3=3)
	public int cycleRotation = (int) (cycleDay / 4);
	// number of current rotation (4 per cycle)
	public int cycleOfYear = ((cal1.get(Calendar.DAY_OF_YEAR) - 3) / 16);
	public int onCallCycle = cycleOfYear % 7;
	public int numberOfDays = 365;

	// Crew names, initialized from txt file
	String[] aNames = new String[9];
	String[] bNames = new String[9];
	String[] cNames = new String[9];
	String[] dNames = new String[9];

	Crew A = new Crew();
	Crew B = new Crew();
	Crew C = new Crew();
	Crew D = new Crew();

	public onCallCycle() throws Exception {
		super();
	}

	public void addDate(onCallCycle c1) {
		cal1.add(Calendar.DATE, 1);
		c1.cycleDay = ((cal1.get(Calendar.DAY_OF_YEAR) - startDate)) % 16;
		c1.dayOfCycle = cycleDay % 4;
		// number of days into current rotation ( 0 =4, 1=1, 2=2, 3=3)
		c1.cycleRotation = (int) (cycleDay / 4);
		// number of current rotation (4 per cycle)
		c1.cycleOfYear = ((cal1.get(Calendar.DAY_OF_YEAR) - 2) / 16);
		c1.onCallCycle = cycleOfYear % 4;
	}

	public void printOutput(onCallCycle c1, PrintWriter output2, File file) {
		c1.A.setCrewLetter("A");
		c1.B.setCrewLetter("B");
		c1.C.setCrewLetter("C");
		c1.D.setCrewLetter("D");
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM/dd/yyyy");
		output2.println(df.format(cal1.getTime()));
		output2.println();
		output2.println("Day Coverage");
		output2.println("----------");

		c1.check0(output2, c1.A.e[0].callStatus, c1.A.e[0].name, 0, "A");
		c1.check0(output2, c1.A.e[1].callStatus, c1.A.e[1].name, 1, "A");
		c1.check0(output2, c1.A.e[2].callStatus, c1.A.e[2].name, 2, "A");

		if (c1.A.e[4].callStatus == 0) {
			checkForBlanks(output2, "A", 4);
			checkForBlanks(output2, "A", 5);
			checkForBlanks(output2, "A", 6);
		}
		if (c1.A.e[7].callStatus == 0) {
			checkForBlanks(output2, "A", 7);
			checkForBlanks(output2, "A", 8);
		}

		c1.check0(output2, c1.B.e[0].callStatus, c1.B.e[0].name, 0, "B");
		c1.check0(output2, c1.B.e[1].callStatus, c1.B.e[1].name, 1, "B");
		c1.check0(output2, c1.B.e[2].callStatus, c1.B.e[2].name, 2, "B");

		if (c1.B.e[4].callStatus == 0) {
			checkForBlanks(output2, "B", 4);
			checkForBlanks(output2, "B", 5);
			checkForBlanks(output2, "B", 6);
		}
		if (c1.B.e[7].callStatus == 0) {
			checkForBlanks(output2, "B", 7);
			checkForBlanks(output2, "B", 8);
		}

		c1.check0(output2, c1.C.e[0].callStatus, c1.C.e[0].name, 0, "C");
		c1.check0(output2, c1.C.e[1].callStatus, c1.C.e[1].name, 1, "C");
		c1.check0(output2, c1.C.e[2].callStatus, c1.C.e[2].name, 2, "C");

		if (c1.C.e[4].callStatus == 0) {
			checkForBlanks(output2, "C", 4);
			checkForBlanks(output2, "C", 5);
			checkForBlanks(output2, "C", 6);
		}
		if (c1.C.e[7].callStatus == 0) {
			checkForBlanks(output2, "C", 7);
			checkForBlanks(output2, "C", 8);
		}

		c1.check0(output2, c1.D.e[0].callStatus, c1.D.e[0].name, 0, "D");
		c1.check0(output2, c1.D.e[1].callStatus, c1.D.e[1].name, 1, "D");
		c1.check0(output2, c1.D.e[2].callStatus, c1.D.e[2].name, 2, "D");

		if (c1.D.e[4].callStatus == 0) {
			checkForBlanks(output2, "D", 4);
			checkForBlanks(output2, "D", 5);
			checkForBlanks(output2, "D", 6);
		}
		if (c1.D.e[7].callStatus == 0) {
			checkForBlanks(output2, "D", 7);
			checkForBlanks(output2, "D", 8);
		}

		output2.println();
		output2.println("Night Coverage");
		output2.println("----------");

		c1.check1(output2, c1.A.e[0].callStatus, c1.A.e[0].name, 0, "A");
		c1.check1(output2, c1.A.e[1].callStatus, c1.A.e[1].name, 1, "A");
		c1.check1(output2, c1.A.e[2].callStatus, c1.A.e[2].name, 2, "A");

		if (c1.A.e[4].callStatus == 1) {
			checkForBlanks(output2, "A", 4);
			checkForBlanks(output2, "A", 5);
			checkForBlanks(output2, "A", 6);
		}
		if (c1.A.e[7].callStatus == 1) {
			checkForBlanks(output2, "A", 7);
			checkForBlanks(output2, "A", 8);
		}

		c1.check1(output2, c1.B.e[0].callStatus, c1.B.e[0].name, 0, "B");
		c1.check1(output2, c1.B.e[1].callStatus, c1.B.e[1].name, 1, "B");
		c1.check1(output2, c1.B.e[2].callStatus, c1.B.e[2].name, 2, "B");

		if (c1.B.e[4].callStatus == 1) {
			checkForBlanks(output2, "B", 4);
			checkForBlanks(output2, "B", 5);
			checkForBlanks(output2, "B", 6);
		}
		if (c1.B.e[7].callStatus == 1) {
			checkForBlanks(output2, "B", 7);
			checkForBlanks(output2, "B", 8);
		}

		c1.check1(output2, c1.C.e[0].callStatus, c1.C.e[0].name, 0, "C");
		c1.check1(output2, c1.C.e[1].callStatus, c1.C.e[1].name, 1, "C");
		c1.check1(output2, c1.C.e[2].callStatus, c1.C.e[2].name, 2, "C");

		if (c1.C.e[4].callStatus == 1) {
			checkForBlanks(output2, "C", 4);
			checkForBlanks(output2, "C", 5);
			checkForBlanks(output2, "C", 6);
		}
		if (c1.C.e[7].callStatus == 1) {
			checkForBlanks(output2, "C", 7);
			checkForBlanks(output2, "C", 8);
		}

		c1.check1(output2, c1.D.e[0].callStatus, c1.D.e[0].name, 0, "D");
		c1.check1(output2, c1.D.e[1].callStatus, c1.D.e[1].name, 1, "D");
		c1.check1(output2, c1.D.e[2].callStatus, c1.D.e[2].name, 2, "D");

		if (c1.D.e[4].callStatus == 1) {
			checkForBlanks(output2, "D", 4);
			checkForBlanks(output2, "D", 5);
			checkForBlanks(output2, "D", 6);
		}
		if (c1.D.e[7].callStatus == 1) {
			checkForBlanks(output2, "D", 7);
			checkForBlanks(output2, "D", 8);
		}
		output2.println();
	}

	// if position is blank, print next
	public void checkForBlanks(PrintWriter output2, String crewLetter,
			int position) {
		if (crewLetter.equals("A")) {
			if (!this.A.e[position].name.equals("")) {
				output2.print(this.A.e[position].name);
				output2.println();
			} 
		}
		if (crewLetter.equals("B")) {
			if (!this.B.e[position].name.equals("")) {
				output2.print(this.B.e[position].name);
				output2.println();
			}
		}
		if (crewLetter.equals("C")) {
			if (!this.C.e[position].name.equals("")) {
				output2.print(this.C.e[position].name);
				output2.println();
			} 
		}
		if (crewLetter.equals("D")) {
			if (!this.D.e[position].name.equals("")) {
				output2.print(this.D.e[position].name);
				output2.println();
			} 
		}
	}

	public void check0(PrintWriter output2, int callStat, String name,
			int position, String crewLetter) {
		if (crewLetter.equals("A")) {
			if (!this.A.e[position].name.equals("")) {
				if (callStat == 0) {
					output2.print(name);
					output2.println();
				}
			}
		}
		if (crewLetter.equals("B")) {
			if (!this.B.e[position].name.equals("")) {
				if (callStat == 0) {
					output2.print(name);
					output2.println();
				}
			}
		}
		if (crewLetter.equals("C")) {
			if (!this.C.e[position].name.equals("")) {
				if (callStat == 0) {
					output2.print(name);
					output2.println();
				}
			}
		}
		if (crewLetter.equals("D")) {
			if (!this.D.e[position].name.equals("")) {
				if (callStat == 0) {
					output2.print(name);
					output2.println();
				}
			}
		}
	}

	public void check1(PrintWriter output2, int callStat, String name,
			int position, String crewLetter) {
		if (crewLetter.equals("A")) {
			if (!this.A.e[position].name.equals("")) {
				if (callStat == 1) {
					output2.print(name);
					output2.println();
				}
			}
		}
		if (crewLetter.equals("B")) {
			if (!this.B.e[position].name.equals("")) {
				if (callStat == 1) {
					output2.print(name);
					output2.println();
				}
			}
		}
		if (crewLetter.equals("C")) {
			if (!this.C.e[position].name.equals("")) {
				if (callStat == 1) {
					output2.print(name);
					output2.println();
				}
			}
		}
		if (crewLetter.equals("D")) {
			if (!this.D.e[position].name.equals("")) {
				if (callStat == 1) {
					output2.print(name);
					output2.println();
				}
			}
		}
	}

	public String readFile(String pathname) throws Exception {
		File file = new File(dir, pathname);
		StringBuilder fileContents = new StringBuilder((int) file.length());
		Scanner scanner = new Scanner(file);
		String lineSeparator = System.getProperty("line.separator");
		try {
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);
			}
			return fileContents.toString();
		} finally {
			scanner.close();
		}
	}

	public void resetVars(Crew f) {
		for (int i = 0; i < f.e.length; i++) {
			f.e[i].callStatus = -1;
		}
	}

	public void calcCall(Crew f) {
		for (int i = 0; i < f.e.length; i++) {
			if (((dayOfCycle == 0) || (dayOfCycle == 1))
					&& f.e[i] instanceof Senior) {
				f.e[i].determineCallSr(cycleDay, aFirstCycle);
				if ((i == 3)
						&& (f.e[i].callStatus == 1 || f.e[i].callStatus == 0))
					f.e = f.e[i].rotateSr(f);
			} else if (((dayOfCycle == 2) || (dayOfCycle == 3))
					&& f.e[i] instanceof Junior) {
				f.e[i].determineCallJr(cycleDay, aFirstCycle);
				if ((i == 6)
						&& (f.e[i].callStatus == 1 || f.e[i].callStatus == 0))
					f.e = f.e[i].rotateJr(f);
			}
			if (((dayOfCycle == 0) || (dayOfCycle == 3))
					&& f.e[i] instanceof Pelletizer) {
				f.e[i].determineCallP(cycleDay, aFirstCycle);
			}
		}
	}
}
