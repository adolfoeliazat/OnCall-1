package OnCall;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class OT_GUI {

	private JFrame frame;
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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
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
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OT_GUI window = new OT_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OT_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calhoun Overtime");
		frame.setBounds(100, 100, 1018, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JButton btnAB = new JButton("A & B Overtime");
		GridBagConstraints gbc_btnAB = new GridBagConstraints();
		gbc_btnAB.insets = new Insets(0, 0, 5, 5);
		gbc_btnAB.gridx = 9;
		gbc_btnAB.gridy = 0;
		frame.getContentPane().add(btnAB, gbc_btnAB);

		JButton btnCD = new JButton("C & D Overtime");
		GridBagConstraints gbc_btnCD = new GridBagConstraints();
		gbc_btnCD.insets = new Insets(0, 0, 5, 5);
		gbc_btnCD.gridx = 25;
		gbc_btnCD.gridy = 0;
		frame.getContentPane().add(btnCD, gbc_btnCD);

		JLabel lblReasonForOvertime = new JLabel("Reason for Overtime:");
		GridBagConstraints gbc_lblReasonForOvertime = new GridBagConstraints();
		gbc_lblReasonForOvertime.anchor = GridBagConstraints.EAST;
		gbc_lblReasonForOvertime.insets = new Insets(0, 0, 5, 5);
		gbc_lblReasonForOvertime.gridx = 9;
		gbc_lblReasonForOvertime.gridy = 2;
		frame.getContentPane().add(lblReasonForOvertime,
				gbc_lblReasonForOvertime);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 16;
		gbc_textField.gridy = 2;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblHours = new JLabel("Hours");
		GridBagConstraints gbc_lblHours = new GridBagConstraints();
		gbc_lblHours.anchor = GridBagConstraints.EAST;
		gbc_lblHours.insets = new Insets(0, 0, 5, 5);
		gbc_lblHours.gridx = 23;
		gbc_lblHours.gridy = 2;
		frame.getContentPane().add(lblHours, gbc_lblHours);

		String[] hours = { "8", "12" };

		JComboBox comboBox_1 = new JComboBox(hours);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 24;
		gbc_comboBox_1.gridy = 2;
		frame.getContentPane().add(comboBox_1, gbc_comboBox_1);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 24;
		gbc_textField_3.gridy = 3;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblDayOfWeek = new JLabel("Day of Week:");
		GridBagConstraints gbc_lblDayOfWeek = new GridBagConstraints();
		gbc_lblDayOfWeek.anchor = GridBagConstraints.EAST;
		gbc_lblDayOfWeek.insets = new Insets(0, 0, 5, 5);
		gbc_lblDayOfWeek.gridx = 9;
		gbc_lblDayOfWeek.gridy = 3;
		frame.getContentPane().add(lblDayOfWeek, gbc_lblDayOfWeek);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 16;
		gbc_textField_1.gridy = 3;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		String[] classifications = { "Extruder Operator",
				"Pelletizer Operator", "Utility", "Warehouse/Shipping" };

		JLabel lblDate = new JLabel("Date");
		GridBagConstraints gbc_lblDate = new GridBagConstraints();
		gbc_lblDate.anchor = GridBagConstraints.EAST;
		gbc_lblDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblDate.gridx = 23;
		gbc_lblDate.gridy = 3;
		frame.getContentPane().add(lblDate, gbc_lblDate);

		JLabel lblClassification = new JLabel("Classification");
		GridBagConstraints gbc_lblClassification = new GridBagConstraints();
		gbc_lblClassification.insets = new Insets(0, 0, 5, 5);
		gbc_lblClassification.anchor = GridBagConstraints.EAST;
		gbc_lblClassification.gridx = 9;
		gbc_lblClassification.gridy = 4;
		frame.getContentPane().add(lblClassification, gbc_lblClassification);

		JComboBox comboBox = new JComboBox(classifications);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 16;
		gbc_comboBox.gridy = 4;
		frame.getContentPane().add(comboBox, gbc_comboBox);

		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 9;
		gbc_lblName.gridy = 5;
		frame.getContentPane().add(lblName, gbc_lblName);

		JLabel lblSeniority = new JLabel("Seniority");
		GridBagConstraints gbc_lblSeniority = new GridBagConstraints();
		gbc_lblSeniority.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeniority.gridx = 11;
		gbc_lblSeniority.gridy = 5;
		frame.getContentPane().add(lblSeniority, gbc_lblSeniority);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 9;
		gbc_textField_4.gridy = 6;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		textField_25 = new JTextField();
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 11;
		gbc_textField_25.gridy = 6;
		frame.getContentPane().add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);

		textField_26 = new JTextField();
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 11;
		gbc_textField_26.gridy = 7;
		frame.getContentPane().add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);

		textField_27 = new JTextField();
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 11;
		gbc_textField_27.gridy = 8;
		frame.getContentPane().add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);

		textField_28 = new JTextField();
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 11;
		gbc_textField_28.gridy = 9;
		frame.getContentPane().add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);

		textField_29 = new JTextField();
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 11;
		gbc_textField_29.gridy = 10;
		frame.getContentPane().add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);

		textField_30 = new JTextField();
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 11;
		gbc_textField_30.gridy = 11;
		frame.getContentPane().add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);

		textField_31 = new JTextField();
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 11;
		gbc_textField_31.gridy = 12;
		frame.getContentPane().add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);

		textField_32 = new JTextField();
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 11;
		gbc_textField_32.gridy = 13;
		frame.getContentPane().add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);

		textField_33 = new JTextField();
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 11;
		gbc_textField_33.gridy = 14;
		frame.getContentPane().add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);

		textField_34 = new JTextField();
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 11;
		gbc_textField_34.gridy = 15;
		frame.getContentPane().add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);

		textField_35 = new JTextField();
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 11;
		gbc_textField_35.gridy = 16;
		frame.getContentPane().add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);

		textField_36 = new JTextField();
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.insets = new Insets(0, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 11;
		gbc_textField_36.gridy = 17;
		frame.getContentPane().add(textField_36, gbc_textField_36);
		textField_36.setColumns(10);

		textField_37 = new JTextField();
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 11;
		gbc_textField_37.gridy = 18;
		frame.getContentPane().add(textField_37, gbc_textField_37);
		textField_37.setColumns(10);

		textField_38 = new JTextField();
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.insets = new Insets(0, 0, 5, 5);
		gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_38.gridx = 11;
		gbc_textField_38.gridy = 19;
		frame.getContentPane().add(textField_38, gbc_textField_38);
		textField_38.setColumns(10);

		textField_39 = new JTextField();
		GridBagConstraints gbc_textField_39 = new GridBagConstraints();
		gbc_textField_39.insets = new Insets(0, 0, 5, 5);
		gbc_textField_39.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_39.gridx = 11;
		gbc_textField_39.gridy = 20;
		frame.getContentPane().add(textField_39, gbc_textField_39);
		textField_39.setColumns(10);

		textField_40 = new JTextField();
		GridBagConstraints gbc_textField_40 = new GridBagConstraints();
		gbc_textField_40.insets = new Insets(0, 0, 5, 5);
		gbc_textField_40.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_40.gridx = 11;
		gbc_textField_40.gridy = 21;
		frame.getContentPane().add(textField_40, gbc_textField_40);
		textField_40.setColumns(10);

		textField_41 = new JTextField();
		GridBagConstraints gbc_textField_41 = new GridBagConstraints();
		gbc_textField_41.insets = new Insets(0, 0, 5, 5);
		gbc_textField_41.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_41.gridx = 11;
		gbc_textField_41.gridy = 22;
		frame.getContentPane().add(textField_41, gbc_textField_41);
		textField_41.setColumns(10);

		textField_42 = new JTextField();
		GridBagConstraints gbc_textField_42 = new GridBagConstraints();
		gbc_textField_42.insets = new Insets(0, 0, 5, 5);
		gbc_textField_42.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_42.gridx = 11;
		gbc_textField_42.gridy = 23;
		frame.getContentPane().add(textField_42, gbc_textField_42);
		textField_42.setColumns(10);
		
		textField_43 = new JTextField();
		GridBagConstraints gbc_textField_43 = new GridBagConstraints();
		gbc_textField_43.insets = new Insets(0, 0, 5, 5);
		gbc_textField_43.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_43.gridx = 11;
		gbc_textField_43.gridy = 24;
		frame.getContentPane().add(textField_43, gbc_textField_43);
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		GridBagConstraints gbc_textField_44 = new GridBagConstraints();
		gbc_textField_44.insets = new Insets(0, 0, 5, 5);
		gbc_textField_44.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_44.gridx = 11;
		gbc_textField_44.gridy = 25;
		frame.getContentPane().add(textField_44, gbc_textField_44);
		textField_44.setColumns(10);
		
		textField_45 = new JTextField();
		GridBagConstraints gbc_textField_45 = new GridBagConstraints();
		gbc_textField_45.insets = new Insets(0, 0, 5, 5);
		gbc_textField_45.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_45.gridx = 11;
		gbc_textField_45.gridy = 26;
		frame.getContentPane().add(textField_45, gbc_textField_45);
		textField_45.setColumns(10);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 9;
		gbc_textField_5.gridy = 7;
		frame.getContentPane().add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 9;
		gbc_textField_6.gridy = 8;
		frame.getContentPane().add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 9;
		gbc_textField_7.gridy = 9;
		frame.getContentPane().add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 9;
		gbc_textField_8.gridy = 10;
		frame.getContentPane().add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 9;
		gbc_textField_9.gridy = 11;
		frame.getContentPane().add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 9;
		gbc_textField_10.gridy = 12;
		frame.getContentPane().add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 9;
		gbc_textField_11.gridy = 13;
		frame.getContentPane().add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 9;
		gbc_textField_12.gridy = 14;
		frame.getContentPane().add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 9;
		gbc_textField_13.gridy = 15;
		frame.getContentPane().add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 9;
		gbc_textField_14.gridy = 16;
		frame.getContentPane().add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 9;
		gbc_textField_15.gridy = 17;
		frame.getContentPane().add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);

		textField_16 = new JTextField();
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 9;
		gbc_textField_16.gridy = 18;
		frame.getContentPane().add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);

		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 9;
		gbc_textField_17.gridy = 19;
		frame.getContentPane().add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);

		textField_18 = new JTextField();
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 9;
		gbc_textField_18.gridy = 20;
		frame.getContentPane().add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);

		textField_19 = new JTextField();
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 9;
		gbc_textField_19.gridy = 21;
		frame.getContentPane().add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);

		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 9;
		gbc_textField_20.gridy = 22;
		frame.getContentPane().add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);

		textField_21 = new JTextField();
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 9;
		gbc_textField_21.gridy = 23;
		frame.getContentPane().add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);

		textField_22 = new JTextField();
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 9;
		gbc_textField_22.gridy = 24;
		frame.getContentPane().add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);

		textField_23 = new JTextField();
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 9;
		gbc_textField_23.gridy = 25;
		frame.getContentPane().add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);

		textField_24 = new JTextField();
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(0, 0, 0, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 9;
		gbc_textField_24.gridy = 26;
		frame.getContentPane().add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);
	}

}
