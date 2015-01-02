
public class Crew {
	// Crew members
	Employee[] e = new Employee[9];

	public Crew() {

	}

	public void resetVars(Crew f) {
		for (int i = 0; i < f.e.length; i++) {
			f.e[i].callStatus = -1;
		}
	}
}
