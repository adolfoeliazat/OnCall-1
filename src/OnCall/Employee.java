package OnCall;

public class Employee {
	// Name: Sam Renick Student ID: 900332371
	boolean onShift = false;
	int callStatus = -1;
	public String name;
	public int crewNumber;
	public char crewName;

	public void determineCallP(double cycleDay, int aFirstCycle) {
		if (aFirstCycle == 1) {
			switch (this.crewName) {
			case 'a':
				if ((cycleDay == 4) || (cycleDay == 15))
					this.callStatus = 0;
				else if ((cycleDay == 7) || (cycleDay == 12))
					this.callStatus = 1;
				break;
			case 'b':
				if ((cycleDay == 7) || (cycleDay == 12))
					this.callStatus = 0;
				else if ((cycleDay == 4) || (cycleDay == 15))
					this.callStatus = 1;
				break;
			case 'c':
				if ((cycleDay == 3) || (cycleDay == 8))
					this.callStatus = 0;
				else if ((cycleDay == 0) || (cycleDay == 11))
					this.callStatus = 1;
				break;
			case 'd':
				if ((cycleDay == 0) || (cycleDay == 11))
					this.callStatus = 0;
				else if ((cycleDay == 3) || (cycleDay == 8))
					this.callStatus = 1;
				break;
			}
		} else if (aFirstCycle == 2) {
			switch (this.crewName) {
			case 'a':
				if ((cycleDay == 7) || (cycleDay == 12))
					this.callStatus = 0;
				else if ((cycleDay == 4) || (cycleDay == 15))
					this.callStatus = 1;
				break;
			case 'b':
				if ((cycleDay == 4) || (cycleDay == 15))
					this.callStatus = 0;
				else if ((cycleDay == 7) || (cycleDay == 12))
					this.callStatus = 1;
				break;
			case 'c':
				if ((cycleDay == 0) || (cycleDay == 11))
					this.callStatus = 0;
				else if ((cycleDay == 3) || (cycleDay == 8))
					this.callStatus = 1;
				break;
			case 'd':
				if ((cycleDay == 3) || (cycleDay == 8))
					this.callStatus = 0;
				else if ((cycleDay == 0) || (cycleDay == 11))
					this.callStatus = 1;
				break;
			}
		}
	}

	public void determineCallJr(double cycleDay, int aFirstCycle) {
		if (aFirstCycle == 1) {
			switch (this.crewName) {
			case 'a':
				if ((cycleDay == 14) || (cycleDay == 15))
					this.callStatus = 0;
				else if ((cycleDay == 6) || (cycleDay == 7))
					this.callStatus = 1;
				break;
			case 'b':
				if ((cycleDay == 6) || (cycleDay == 7))
					this.callStatus = 0;
				else if ((cycleDay == 14) || (cycleDay == 15))
					this.callStatus = 1;
				break;
			case 'c':
				if ((cycleDay == 2) || (cycleDay == 3))
					this.callStatus = 0;
				else if ((cycleDay == 10) || (cycleDay == 11))
					this.callStatus = 1;
				break;
			case 'd':
				if ((cycleDay == 10) || (cycleDay == 11))
					this.callStatus = 0;
				else if ((cycleDay == 2) || (cycleDay == 3))
					this.callStatus = 1;
				break;
			}
		} else if (aFirstCycle == 2) {
			switch (this.crewName) {
			case 'a':
				if ((cycleDay == 6) || (cycleDay == 7))
					this.callStatus = 0;
				else if ((cycleDay == 14) || (cycleDay == 15))
					this.callStatus = 1;
				break;
			case 'b':
				if ((cycleDay == 14) || (cycleDay == 15))
					this.callStatus = 0;
				else if ((cycleDay == 6) || (cycleDay == 7))
					this.callStatus = 1;
				break;
			case 'c':
				if ((cycleDay == 10) || (cycleDay == 11))
					this.callStatus = 0;
				else if ((cycleDay == 2) || (cycleDay == 3))
					this.callStatus = 1;
				break;
			case 'd':
				if ((cycleDay == 2) || (cycleDay == 3))
					this.callStatus = 0;
				else if ((cycleDay == 10) || (cycleDay == 11))
					this.callStatus = 1;
				break;
			}
		}
	}

	public void determineCallSr(double cycleDay, int aFirstCycle) {
		if (aFirstCycle == 1) {
			switch (this.crewName) {
			case 'a':
				if ((cycleDay == 4) || (cycleDay == 5))
					this.callStatus = 0;
				else if ((cycleDay == 12) || (cycleDay == 13))
					this.callStatus = 1;
				break;
			case 'b':
				if ((cycleDay == 12) || (cycleDay == 13))
					this.callStatus = 0;
				else if ((cycleDay == 4) || (cycleDay == 5))
					this.callStatus = 1;
				break;
			case 'c':
				if ((cycleDay == 8) || (cycleDay == 9))
					this.callStatus = 0;
				else if ((cycleDay == 0) || (cycleDay == 1))
					this.callStatus = 1;
				break;
			case 'd':
				if ((cycleDay == 0) || (cycleDay == 1))
					this.callStatus = 0;
				else if ((cycleDay == 8) || (cycleDay == 9))
					this.callStatus = 1;
				break;
			}
		} else if (aFirstCycle == 2) {
			switch (this.crewName) {
			case 'a':
				if ((cycleDay == 12) || (cycleDay == 13))
					this.callStatus = 0;
				else if ((cycleDay == 4) || (cycleDay == 5))
					this.callStatus = 1;
				break;
			case 'b':
				if ((cycleDay == 4) || (cycleDay == 5))
					this.callStatus = 0;
				else if ((cycleDay == 12) || (cycleDay == 13))
					this.callStatus = 1;
				break;
			case 'c':
				if ((cycleDay == 0) || (cycleDay == 1))
					this.callStatus = 0;
				else if ((cycleDay == 8) || (cycleDay == 9))
					this.callStatus = 1;
				break;
			case 'd':
				if ((cycleDay == 8) || (cycleDay == 9))
					this.callStatus = 0;
				else if ((cycleDay == 0) || (cycleDay == 1))
					this.callStatus = 1;
				break;
			}
		}
	}

	public Employee[] rotateSr(Crew f) {
		Employee temp = new Employee();
		temp = f.e[0];
		f.e[0] = f.e[1];
		f.e[1] = f.e[2];
		f.e[2] = f.e[3];
		f.e[3] = temp;
		return f.e;
	}

	public Employee[] rotateJr(Crew f) {
		Employee temp = new Employee();
		temp = f.e[4];
		f.e[4] = f.e[5];
		f.e[5] = f.e[6];
		f.e[6] = temp;
		return f.e;
	}
}