

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JTextField;

public class onCallGUI2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;

	private JButton rotateASr;
	private JButton rotateBSr;
	private JButton rotateCSr;
	private JButton rotateDSr;
	private JButton rotateAJr;
	private JButton rotateBJr;
	private JButton rotateCJr;
	private JButton rotateDJr;
	private JButton runReport;
	private JButton writeButton;
	onCallCycle c1 = new onCallCycle();

	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					onCallGUI2 frame = new onCallGUI2();
					Object[] choices = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
					Object[] choices2 = { 1, 2 };
					if ((frame.c1.cal1.get(Calendar.MONTH)) == 0) {
						JFrame f2 = new JFrame();
						JFrame f3 = new JFrame();
						frame.c1.startDate = (int) JOptionPane.showInputDialog(
								f2, "Select the date of A Crew's first"
										+ " full crew rotation in January",
								"New Year Set Up",
								JOptionPane.QUESTION_MESSAGE, null, choices,
								choices[0]);
						String startDateString = Integer
								.toString(frame.c1.startDate);
						writeFile("aFirstCycle.txt", startDateString,
								frame.c1.dirName);
						frame.c1.aFirstCycle = (int) JOptionPane
								.showInputDialog(
										f3,
										"Select A Crew's first"
												+ " full crew rotation: 1 for day shift or 2 for night shift",
										"New Year Set Up",
										JOptionPane.QUESTION_MESSAGE, null,
										choices2, choices2[0]);
						String aFirstCycleString = Integer
								.toString(frame.c1.aFirstCycle);
						writeFile("aFirstCycle.txt", aFirstCycleString,
								frame.c1.dirName);
					}
					frame.setVisible(true);
					// read names from file
					frame.c1.A.e[0] = new Senior(frame.c1.readFile("a1.txt"),
							0, 'a');
					frame.c1.A.e[1] = new Senior(frame.c1.readFile("a2.txt"),
							1, 'a');
					frame.c1.A.e[2] = new Senior(frame.c1.readFile("a3.txt"),
							2, 'a');
					frame.c1.A.e[3] = new Senior(frame.c1.readFile("a4.txt"),
							3, 'a');
					frame.c1.A.e[4] = new Junior(frame.c1.readFile("aJr1.txt"),
							4, 'a');
					frame.c1.A.e[5] = new Junior(frame.c1.readFile("aJr2.txt"),
							5, 'a');
					frame.c1.A.e[6] = new Junior(frame.c1.readFile("aJr3.txt"),
							6, 'a');
					frame.c1.A.e[7] = new Pelletizer(frame.c1
							.readFile("aP1.txt"), 7, 'a');
					frame.c1.A.e[8] = new Pelletizer(frame.c1
							.readFile("aP2.txt"), 8, 'a');

					frame.c1.B.e[0] = new Senior(frame.c1.readFile("b1.txt"),
							0, 'b');
					frame.c1.B.e[1] = new Senior(frame.c1.readFile("b2.txt"),
							1, 'b');
					frame.c1.B.e[2] = new Senior(frame.c1.readFile("b3.txt"),
							2, 'b');
					frame.c1.B.e[3] = new Senior(frame.c1.readFile("b4.txt"),
							3, 'b');
					frame.c1.B.e[4] = new Junior(frame.c1.readFile("bJr1.txt"),
							4, 'b');
					frame.c1.B.e[5] = new Junior(frame.c1.readFile("bJr2.txt"),
							5, 'b');
					frame.c1.B.e[6] = new Junior(frame.c1.readFile("bJr3.txt"),
							6, 'b');
					frame.c1.B.e[7] = new Pelletizer(frame.c1
							.readFile("bP1.txt"), 7, 'b');
					frame.c1.B.e[8] = new Pelletizer(frame.c1
							.readFile("bP2.txt"), 8, 'b');

					frame.c1.C.e[0] = new Senior(frame.c1.readFile("c1.txt"),
							0, 'c');
					frame.c1.C.e[1] = new Senior(frame.c1.readFile("c2.txt"),
							1, 'c');
					frame.c1.C.e[2] = new Senior(frame.c1.readFile("c3.txt"),
							2, 'c');
					frame.c1.C.e[3] = new Senior(frame.c1.readFile("c4.txt"),
							3, 'c');
					frame.c1.C.e[4] = new Junior(frame.c1.readFile("cJr1.txt"),
							4, 'c');
					frame.c1.C.e[5] = new Junior(frame.c1.readFile("cJr2.txt"),
							5, 'c');
					frame.c1.C.e[6] = new Junior(frame.c1.readFile("cJr3.txt"),
							6, 'c');
					frame.c1.C.e[7] = new Pelletizer(frame.c1
							.readFile("cP1.txt"), 7, 'c');
					frame.c1.C.e[8] = new Pelletizer(frame.c1
							.readFile("cP2.txt"), 8, 'c');

					frame.c1.D.e[0] = new Senior(frame.c1.readFile("d1.txt"),
							0, 'd');
					frame.c1.D.e[1] = new Senior(frame.c1.readFile("d2.txt"),
							1, 'd');
					frame.c1.D.e[2] = new Senior(frame.c1.readFile("d3.txt"),
							2, 'd');
					frame.c1.D.e[3] = new Senior(frame.c1.readFile("d4.txt"),
							3, 'd');
					frame.c1.D.e[4] = new Junior(frame.c1.readFile("dJr1.txt"),
							4, 'd');
					frame.c1.D.e[5] = new Junior(frame.c1.readFile("dJr2.txt"),
							5, 'd');
					frame.c1.D.e[6] = new Junior(frame.c1.readFile("dJr3.txt"),
							6, 'd');
					frame.c1.D.e[7] = new Pelletizer(frame.c1
							.readFile("dP1.txt"), 7, 'd');
					frame.c1.D.e[8] = new Pelletizer(frame.c1
							.readFile("dP2.txt"), 8, 'd');

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public onCallGUI2() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0,
				1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblACrew = new JLabel("A Crew");
		GridBagConstraints gbc_lblACrew = new GridBagConstraints();
		gbc_lblACrew.insets = new Insets(0, 0, 5, 5);
		gbc_lblACrew.gridx = 1;
		gbc_lblACrew.gridy = 0;
		contentPane.add(lblACrew, gbc_lblACrew);

		JLabel lblBCrew = new JLabel("B Crew");
		GridBagConstraints gbc_lblBCrew = new GridBagConstraints();
		gbc_lblBCrew.insets = new Insets(0, 0, 5, 5);
		gbc_lblBCrew.gridx = 3;
		gbc_lblBCrew.gridy = 0;
		contentPane.add(lblBCrew, gbc_lblBCrew);

		JLabel lblCCrew = new JLabel("C Crew");
		GridBagConstraints gbc_lblCCrew = new GridBagConstraints();
		gbc_lblCCrew.insets = new Insets(0, 0, 5, 5);
		gbc_lblCCrew.gridx = 5;
		gbc_lblCCrew.gridy = 0;
		contentPane.add(lblCCrew, gbc_lblCCrew);

		JLabel lblDCrew = new JLabel("D Crew");
		GridBagConstraints gbc_lblDCrew = new GridBagConstraints();
		gbc_lblDCrew.insets = new Insets(0, 0, 5, 5);
		gbc_lblDCrew.gridx = 7;
		gbc_lblDCrew.gridy = 0;
		contentPane.add(lblDCrew, gbc_lblDCrew);

		JLabel lblSeniorOperators = new JLabel("Senior Operators");
		GridBagConstraints gbc_lblSeniorOperators = new GridBagConstraints();
		gbc_lblSeniorOperators.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeniorOperators.gridx = 0;
		gbc_lblSeniorOperators.gridy = 1;
		contentPane.add(lblSeniorOperators, gbc_lblSeniorOperators);

		textField = new JTextField(readFile("a1.txt"));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		textField_19 = new JTextField(readFile("b1.txt"));
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 3;
		gbc_textField_19.gridy = 1;
		contentPane.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);

		textField_20 = new JTextField(readFile("c1.txt"));
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 5;
		gbc_textField_20.gridy = 1;
		contentPane.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);

		textField_29 = new JTextField(readFile("d1.txt"));
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 7;
		gbc_textField_29.gridy = 1;
		contentPane.add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);

		textField_1 = new JTextField(readFile("a2.txt"));
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);

		textField_18 = new JTextField(readFile("b2.txt"));
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 3;
		gbc_textField_18.gridy = 2;
		contentPane.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);

		textField_21 = new JTextField(readFile("c2.txt"));
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 5;
		gbc_textField_21.gridy = 2;
		contentPane.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);

		textField_30 = new JTextField(readFile("d2.txt"));
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 7;
		gbc_textField_30.gridy = 2;
		contentPane.add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);

		textField_2 = new JTextField(readFile("a3.txt"));
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);

		textField_17 = new JTextField(readFile("b3.txt"));
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 3;
		gbc_textField_17.gridy = 3;
		contentPane.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);

		textField_22 = new JTextField(readFile("c3.txt"));
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 5;
		gbc_textField_22.gridy = 3;
		contentPane.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);

		textField_31 = new JTextField(readFile("d3.txt"));
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 7;
		gbc_textField_31.gridy = 3;
		contentPane.add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);

		textField_3 = new JTextField(readFile("a4.txt"));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		textField_16 = new JTextField(readFile("b4.txt"));
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 3;
		gbc_textField_16.gridy = 4;
		contentPane.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);

		textField_23 = new JTextField(readFile("c4.txt"));
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 5;
		gbc_textField_23.gridy = 4;
		contentPane.add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);

		textField_32 = new JTextField(readFile("d4.txt"));
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 7;
		gbc_textField_32.gridy = 4;
		contentPane.add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);

		rotateASr = new JButton("Rotate A Seniors");
		GridBagConstraints gbc_rotateASr = new GridBagConstraints();
		gbc_rotateASr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateASr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateASr.gridx = 1;
		gbc_rotateASr.gridy = 5;
		contentPane.add(rotateASr, gbc_rotateASr);

		rotateBSr = new JButton("Rotate B Seniors");
		GridBagConstraints gbc_rotateBSr = new GridBagConstraints();
		gbc_rotateBSr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateBSr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateBSr.gridx = 3;
		gbc_rotateBSr.gridy = 5;
		contentPane.add(rotateBSr, gbc_rotateBSr);

		rotateCSr = new JButton("Rotate C Seniors");
		GridBagConstraints gbc_rotateCSr = new GridBagConstraints();
		gbc_rotateCSr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateCSr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateCSr.gridx = 5;
		gbc_rotateCSr.gridy = 5;
		contentPane.add(rotateCSr, gbc_rotateCSr);

		rotateDSr = new JButton("Rotate D Seniors");
		GridBagConstraints gbc_rotateDSr = new GridBagConstraints();
		gbc_rotateDSr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateDSr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateDSr.gridx = 7;
		gbc_rotateDSr.gridy = 5;
		contentPane.add(rotateDSr, gbc_rotateDSr);

		rotateAJr = new JButton("Rotate A Juniors");
		GridBagConstraints gbc_rotateAJr = new GridBagConstraints();
		gbc_rotateAJr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateAJr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateAJr.gridx = 1;
		gbc_rotateAJr.gridy = 9;
		contentPane.add(rotateAJr, gbc_rotateAJr);

		rotateBJr = new JButton("Rotate B Juniors");
		GridBagConstraints gbc_rotateBJr = new GridBagConstraints();
		gbc_rotateBJr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateBJr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateBJr.gridx = 3;
		gbc_rotateBJr.gridy = 9;
		contentPane.add(rotateBJr, gbc_rotateBJr);

		rotateCJr = new JButton("Rotate C Juniors");
		GridBagConstraints gbc_rotateCJr = new GridBagConstraints();
		gbc_rotateCJr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateCJr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateCJr.gridx = 5;
		gbc_rotateCJr.gridy = 9;
		contentPane.add(rotateCJr, gbc_rotateCJr);

		rotateDJr = new JButton("Rotate D Juniors");
		GridBagConstraints gbc_rotateDJr = new GridBagConstraints();
		gbc_rotateDJr.insets = new Insets(0, 0, 5, 5);
		gbc_rotateDJr.fill = GridBagConstraints.HORIZONTAL;
		gbc_rotateDJr.gridx = 7;
		gbc_rotateDJr.gridy = 9;
		contentPane.add(rotateDJr, gbc_rotateDJr);

		JLabel lblJuniorOperators = new JLabel("Junior Operators");
		GridBagConstraints gbc_lblJuniorOperators = new GridBagConstraints();
		gbc_lblJuniorOperators.insets = new Insets(0, 0, 5, 5);
		gbc_lblJuniorOperators.gridx = 0;
		gbc_lblJuniorOperators.gridy = 6;
		contentPane.add(lblJuniorOperators, gbc_lblJuniorOperators);

		textField_4 = new JTextField(readFile("aJr1.txt"));
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 6;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		textField_14 = new JTextField(readFile("bJr1.txt"));
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 3;
		gbc_textField_14.gridy = 6;
		contentPane.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);

		textField_33 = new JTextField(readFile("cJr1.txt"));
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 5;
		gbc_textField_33.gridy = 6;
		contentPane.add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);

		textField_24 = new JTextField(readFile("dJr1.txt"));
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 7;
		gbc_textField_24.gridy = 6;
		contentPane.add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);

		textField_5 = new JTextField(readFile("aJr2.txt"));
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 7;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		textField_13 = new JTextField(readFile("bJr2.txt"));
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 3;
		gbc_textField_13.gridy = 7;
		contentPane.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);

		textField_34 = new JTextField(readFile("cJr2.txt"));
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 5;
		gbc_textField_34.gridy = 7;
		contentPane.add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);

		textField_25 = new JTextField(readFile("dJr2.txt"));
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 7;
		gbc_textField_25.gridy = 7;
		contentPane.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);

		textField_6 = new JTextField(readFile("aJr3.txt"));
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 8;
		contentPane.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);

		textField_12 = new JTextField(readFile("bJr3.txt"));
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 3;
		gbc_textField_12.gridy = 8;
		contentPane.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);

		textField_35 = new JTextField(readFile("cJr3.txt"));
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 5;
		gbc_textField_35.gridy = 8;
		contentPane.add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);

		textField_26 = new JTextField(readFile("dJr3.txt"));
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 7;
		gbc_textField_26.gridy = 8;
		contentPane.add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);

		JLabel lblPelletizerOperators = new JLabel("Pelletizer Operators");
		GridBagConstraints gbc_lblPelletizerOperators = new GridBagConstraints();
		gbc_lblPelletizerOperators.insets = new Insets(0, 0, 5, 5);
		gbc_lblPelletizerOperators.gridx = 0;
		gbc_lblPelletizerOperators.gridy = 10;
		contentPane.add(lblPelletizerOperators, gbc_lblPelletizerOperators);

		textField_7 = new JTextField(readFile("aP1.txt"));
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 10;
		contentPane.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);

		textField_10 = new JTextField(readFile("bP1.txt"));
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 3;
		gbc_textField_10.gridy = 10;
		contentPane.add(textField_10, gbc_textField_10);

		textField_36 = new JTextField(readFile("cP1.txt"));
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.insets = new Insets(0, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 5;
		gbc_textField_36.gridy = 10;
		contentPane.add(textField_36, gbc_textField_36);
		textField_36.setColumns(10);

		textField_27 = new JTextField(readFile("dP1.txt"));
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 7;
		gbc_textField_27.gridy = 10;
		contentPane.add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);

		textField_8 = new JTextField(readFile("aP2.txt"));
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 11;
		contentPane.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField(readFile("bP2.txt"));
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 11;
		contentPane.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		textField_9.setColumns(10);

		textField_37 = new JTextField(readFile("cP2.txt"));
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 5;
		gbc_textField_37.gridy = 11;
		contentPane.add(textField_37, gbc_textField_37);
		textField_37.setColumns(10);

		textField_28 = new JTextField(readFile("dP2.txt"));
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 7;
		gbc_textField_28.gridy = 11;
		contentPane.add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);

		runReport = new JButton("Run Report");
		GridBagConstraints gbc_runReport = new GridBagConstraints();
		gbc_runReport.insets = new Insets(0, 0, 0, 5);
		gbc_runReport.fill = GridBagConstraints.HORIZONTAL;
		gbc_runReport.gridx = 7;
		gbc_runReport.gridy = 14;
		contentPane.add(runReport, gbc_runReport);

		writeButton = new JButton("Record Names");
		GridBagConstraints gbc_writeButton = new GridBagConstraints();
		gbc_writeButton.insets = new Insets(0, 0, 0, 5);
		gbc_writeButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_writeButton.gridx = 5;
		gbc_writeButton.gridy = 14;
		contentPane.add(writeButton, gbc_writeButton);

		ActionListener listener1 = new rotateASListener();
		ActionListener listener2 = new rotateBSListener();
		ActionListener listener3 = new rotateCSListener();
		ActionListener listener4 = new rotateDSListener();
		ActionListener listener5 = new rotateAJListener();
		ActionListener listener6 = new rotateBJListener();
		ActionListener listener7 = new rotateCJListener();
		ActionListener listener8 = new rotateDJListener();
		ActionListener listener9 = new runReportListener();
		ActionListener listener10 = new writeButtonListener();

		rotateASr.addActionListener(listener1);
		rotateBSr.addActionListener(listener2);
		rotateCSr.addActionListener(listener3);
		rotateDSr.addActionListener(listener4);
		rotateAJr.addActionListener(listener5);
		rotateBJr.addActionListener(listener6);
		rotateCJr.addActionListener(listener7);
		rotateDJr.addActionListener(listener8);
		runReport.addActionListener(listener9);
		writeButton.addActionListener(listener10);
	}

	class rotateASListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.A.e = c1.A.e[0].rotateSr(c1.A);
			textField.setText(c1.A.e[0].name);
			textField_1.setText(c1.A.e[1].name);
			textField_2.setText(c1.A.e[2].name);
			textField_3.setText(c1.A.e[3].name);
		}
	}

	class rotateBSListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.B.e = c1.B.e[0].rotateSr(c1.B);
			textField_19.setText(c1.B.e[0].name);
			textField_18.setText(c1.B.e[1].name);
			textField_17.setText(c1.B.e[2].name);
			textField_16.setText(c1.B.e[3].name);
		}
	}

	class rotateCSListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.C.e = c1.C.e[0].rotateSr(c1.C);
			textField_20.setText(c1.C.e[0].name);
			textField_21.setText(c1.C.e[1].name);
			textField_22.setText(c1.C.e[2].name);
			textField_23.setText(c1.C.e[3].name);
		}
	}

	class rotateDSListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.D.e = c1.D.e[0].rotateSr(c1.D);
			textField_29.setText(c1.D.e[0].name);
			textField_30.setText(c1.D.e[1].name);
			textField_31.setText(c1.D.e[2].name);
			textField_32.setText(c1.D.e[3].name);
		}
	}

	class rotateAJListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.A.e = c1.A.e[0].rotateJr(c1.A);
			textField_4.setText(c1.A.e[4].name);
			textField_5.setText(c1.A.e[5].name);
			textField_6.setText(c1.A.e[6].name);
		}
	}

	class rotateBJListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.B.e = c1.B.e[0].rotateJr(c1.B);
			textField_14.setText(c1.B.e[4].name);
			textField_13.setText(c1.B.e[5].name);
			textField_12.setText(c1.B.e[6].name);
		}
	}

	class rotateCJListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.C.e = c1.C.e[0].rotateJr(c1.C);
			textField_33.setText(c1.C.e[4].name);
			textField_34.setText(c1.C.e[5].name);
			textField_35.setText(c1.C.e[6].name);
		}
	}

	class rotateDJListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			c1.D.e = c1.D.e[0].rotateJr(c1.D);
			textField_24.setText(c1.D.e[4].name);
			textField_25.setText(c1.D.e[5].name);
			textField_26.setText(c1.D.e[6].name);
		}
	}

	class runReportListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			File file = new File("oncall.txt");
			PrintWriter output;
			try {
				output = new PrintWriter(file);
				output.print("Berry Plastics");
				output.println();
				output.println("Calhoun, GA Film Plant Off Shift Coverage");
				for (int i = 0; i < c1.numberOfDays; i++) {
					c1.resetVars(c1.A);
					c1.resetVars(c1.B);
					c1.resetVars(c1.C);
					c1.resetVars(c1.D);
					c1.addDate(c1);
					c1.calcCall(c1.A);
					c1.calcCall(c1.B);
					c1.calcCall(c1.C);
					c1.calcCall(c1.D);
					c1.printOutput(c1, output, file);
					output.println();
				}
				output.close();
				c1.cal1 = Calendar.getInstance();
				c1.cycleDay = ((c1.cal1.get(Calendar.DAY_OF_YEAR) - c1.startDate)) % 16;
				c1.dayOfCycle = c1.cycleDay % 4;
				c1.cycleOfYear = ((c1.cal1.get(Calendar.DAY_OF_YEAR) - 3) / 16);
				c1.onCallCycle = c1.cycleOfYear % 7;
				c1.resetVars(c1.A);
				c1.resetVars(c1.B);
				c1.resetVars(c1.C);
				c1.resetVars(c1.D);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	class writeButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			try {
				writeFile("a1.txt", textField);
				writeFile("a2.txt", textField_1);
				writeFile("a3.txt", textField_2);
				writeFile("a4.txt", textField_3);
				writeFile("aJr1.txt", textField_4);
				writeFile("aJr2.txt", textField_5);
				writeFile("aJr3.txt", textField_6);
				writeFile("aP1.txt", textField_7);
				writeFile("aP2.txt", textField_8);

				writeFile("b1.txt", textField_19);
				writeFile("b2.txt", textField_18);
				writeFile("b3.txt", textField_17);
				writeFile("b4.txt", textField_16);
				writeFile("bJr1.txt", textField_14);
				writeFile("bJr2.txt", textField_13);
				writeFile("bJr3.txt", textField_12);
				writeFile("bP1.txt", textField_10);
				writeFile("bP2.txt", textField_9);

				writeFile("c1.txt", textField_20);
				writeFile("c2.txt", textField_21);
				writeFile("c3.txt", textField_22);
				writeFile("c4.txt", textField_23);
				writeFile("cJr1.txt", textField_33);
				writeFile("cJr2.txt", textField_34);
				writeFile("cJr3.txt", textField_35);
				writeFile("cP1.txt", textField_36);
				writeFile("cP2.txt", textField_37);

				writeFile("d1.txt", textField_29);
				writeFile("d2.txt", textField_30);
				writeFile("d3.txt", textField_31);
				writeFile("d4.txt", textField_32);
				writeFile("dJr1.txt", textField_24);
				writeFile("dJr2.txt", textField_25);
				writeFile("dJr3.txt", textField_26);
				writeFile("dP1.txt", textField_27);
				writeFile("dP2.txt", textField_28);

				c1.A.e[0] = new Senior(c1.readFile("a1.txt"), 0, 'a');
				c1.A.e[1] = new Senior(c1.readFile("a2.txt"), 1, 'a');
				c1.A.e[2] = new Senior(c1.readFile("a3.txt"), 2, 'a');
				c1.A.e[3] = new Senior(c1.readFile("a4.txt"), 3, 'a');
				c1.A.e[4] = new Junior(c1.readFile("aJr1.txt"), 4, 'a');
				c1.A.e[5] = new Junior(c1.readFile("aJr2.txt"), 5, 'a');
				c1.A.e[6] = new Junior(c1.readFile("aJr3.txt"), 6, 'a');
				c1.A.e[7] = new Pelletizer(c1.readFile("aP1.txt"), 7, 'a');
				c1.A.e[8] = new Pelletizer(c1.readFile("aP2.txt"), 8, 'a');

				c1.B.e[0] = new Senior(c1.readFile("b1.txt"), 0, 'b');
				c1.B.e[1] = new Senior(c1.readFile("b2.txt"), 1, 'b');
				c1.B.e[2] = new Senior(c1.readFile("b3.txt"), 2, 'b');
				c1.B.e[3] = new Senior(c1.readFile("b4.txt"), 3, 'b');
				c1.B.e[4] = new Junior(c1.readFile("bJr1.txt"), 4, 'b');
				c1.B.e[5] = new Junior(c1.readFile("bJr2.txt"), 5, 'b');
				c1.B.e[6] = new Junior(c1.readFile("bJr3.txt"), 6, 'b');
				c1.B.e[7] = new Pelletizer(c1.readFile("bP1.txt"), 7, 'b');
				c1.B.e[8] = new Pelletizer(c1.readFile("bP2.txt"), 8, 'b');

				c1.C.e[0] = new Senior(c1.readFile("c1.txt"), 0, 'c');
				c1.C.e[1] = new Senior(c1.readFile("c2.txt"), 1, 'c');
				c1.C.e[2] = new Senior(c1.readFile("c3.txt"), 2, 'c');
				c1.C.e[3] = new Senior(c1.readFile("c4.txt"), 3, 'c');
				c1.C.e[4] = new Junior(c1.readFile("cJr1.txt"), 4, 'c');
				c1.C.e[5] = new Junior(c1.readFile("cJr2.txt"), 5, 'c');
				c1.C.e[6] = new Junior(c1.readFile("cJr3.txt"), 6, 'c');
				c1.C.e[7] = new Pelletizer(c1.readFile("cP1.txt"), 7, 'c');
				c1.C.e[8] = new Pelletizer(c1.readFile("cP2.txt"), 8, 'c');

				c1.D.e[0] = new Senior(c1.readFile("d1.txt"), 0, 'd');
				c1.D.e[1] = new Senior(c1.readFile("d2.txt"), 1, 'd');
				c1.D.e[2] = new Senior(c1.readFile("d3.txt"), 2, 'd');
				c1.D.e[3] = new Senior(c1.readFile("d4.txt"), 3, 'd');
				c1.D.e[4] = new Junior(c1.readFile("dJr1.txt"), 4, 'd');
				c1.D.e[5] = new Junior(c1.readFile("dJr2.txt"), 5, 'd');
				c1.D.e[6] = new Junior(c1.readFile("dJr3.txt"), 6, 'd');
				c1.D.e[7] = new Pelletizer(c1.readFile("dP1.txt"), 7, 'd');
				c1.D.e[8] = new Pelletizer(c1.readFile("dP2.txt"), 8, 'd');
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String readFile(String pathname) throws Exception {
		File file = new File(this.c1.dir, pathname);
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

	public void writeFile(String pathname, JTextField field) throws Exception {
		try {
			// Create file
			FileWriter fstream = new FileWriter(this.c1.dirName + '\\'
					+ pathname);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(field.getText().trim());
			// Close the output stream
			out.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static void writeFile(String pathname, String field, String dirName)
			throws Exception {
		try {
			// Create file
			FileWriter fstream = new FileWriter(dirName + '\\' + pathname);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(field.trim());
			// Close the output stream
			out.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}