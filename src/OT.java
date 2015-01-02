import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

public class OT {
	Calendar cal1 = Calendar.getInstance();
	String dirName = "onCall Files";
	File dir = new File(dirName);
	Scanner s = new Scanner(new File(dirName, "startDate.txt"));
	Scanner s2 = new Scanner(new File(dirName, "aFirstCycle.txt"));
	public int startDate = s.nextInt();
	public int aFirstCycle = s2.nextInt();
	public double cycleDay = ((cal1.get(Calendar.DAY_OF_YEAR) - startDate)) % 16;
	public String crew;

	public OT() throws Exception {
		super();
	}

	public static void main(String[] args) throws Exception {

		OT ot1 = new OT();
		ot1.cal1.add(Calendar.DATE, 4);
		ot1.cycleDay = ((ot1.cal1.get(Calendar.DAY_OF_YEAR) - ot1.startDate)) % 16;
		ot1.crewCheck();
		System.out.println(ot1.crew);
		ot1.add_primary("primary_ab", "Sam R", "C", "extruder", 1234567897);
		// ot1.delete("primary_ab", "Sam R");
		ot1.decreaseHours("hours_ab", 12, "Don Juan");
		ot1.updateSeniority("seniority_ab", 4, "Jojo Bon");
		ot1.updateCrew("primary_ab", 'C', "Sam R");
	}

	public void crewCheck() {

		if ((cycleDay < 4) || ((cycleDay > 7) && (cycleDay < 12)))
			crew = "ab";
		else if (((cycleDay > 3) && (cycleDay < 8))
				|| ((cycleDay > 11) && (cycleDay < 16)))
			crew = "cd";
	}

	// add employees to primary tables: ab or cd
	public void add_primary(String table, String name, String crew,
			String pclass, int phone) throws SQLException,
			ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "INSERT INTO " + table + " VALUES" + "(?,?,?,?)";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, crew);
			preparedStatement.setString(3, pclass);
			preparedStatement.setInt(4, phone);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	// add employees to cross trained tables: ab or cd
	public void add_cross(String table, String name, String crew,
			String cclass, int phone) throws SQLException,
			ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "INSERT INTO " + table + " VALUES" + "(?,?,?,?)";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, crew);
			preparedStatement.setString(3, cclass);
			preparedStatement.setInt(4, phone);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	public void add_hours(String table, String name, int hours)
			throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "INSERT INTO " + table + " VALUES" + "(?,?)";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, hours);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	public void add_seniority(String table, String name, String crew,
			int seniority) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "INSERT INTO " + table + " VALUES" + "(?,?,?,?)";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, crew);
			preparedStatement.setInt(3, seniority);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	// deletes employee from table
	public void delete(String table, String name) throws SQLException,
			ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "DELETE FROM " + table + " WHERE name = " + "'" + name
				+ "'";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	// increase overtime hours offered to an employee
	public void increaseHours(String table, int hours, String name)
			throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "UPDATE " + table + " SET hours =" + " hours + "
				+ hours + " WHERE name = " + "'" + name + "'" + ";";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	// decrease overtime hours offered to an employee
	public void decreaseHours(String table, int hours, String name)
			throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "UPDATE " + table + " SET hours =" + " hours - "
				+ hours + " WHERE name = " + "'" + name + "'" + ";";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	// change an employee's seniority when new employees are added to crew
	// roster
	public void updateSeniority(String table, int seniority, String name)
			throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "UPDATE " + table + " SET seniority = " + seniority
				+ " WHERE name = " + "'" + name + "'" + ";";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	// update's an employee's crew
	public void updateCrew(String table, char crew, String name)
			throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		Connection connection2 = DriverManager
				.getConnection("jdbc:sqlite:C:/sqlite/overtime");
		String insert = "UPDATE " + table + " SET crew = " + "'" + crew + "'"
				+ " WHERE name = " + "'" + name + "'" + ";";
		try {
			// create a database connection
			connection2 = DriverManager
					.getConnection("jdbc:sqlite:C:/sqlite/overtime");

			PreparedStatement preparedStatement = null;
			preparedStatement = connection2.prepareStatement(insert);
			preparedStatement.executeUpdate();
		} finally {
			try {
				if (connection2 != null)
					connection2.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}
}
