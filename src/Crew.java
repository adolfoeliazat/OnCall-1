public class Crew {
	// Crew members
	Employee[] e = new Employee[9];
	String crewLetter;

	public Crew() {

	}

	public void resetVars(Crew f) {
		for (int i = 0; i < f.e.length; i++) {
			f.e[i].callStatus = -1;
		}
	}

	public String getCrewLetter() {
		return crewLetter;
	}

	public void setCrewLetter(String crewLetter) {
		this.crewLetter = crewLetter;
	}
}
