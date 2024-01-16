package StudentRecord;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class StudentRecord {

	private JFrame frame;
	private JTextField jtxtStudentID;
	private JTextField jtxtFirstName;
	private JTextField jtxtSurName;
	private JTextField jtxtExamNo;
	private JTextField jtxtDOB;
	private JTextField jtxtMaths;
	private JTextField jtxtEnglish;
	private JTextField jtxtBiology;
	private JTextField jtxtBusiness;
	private JTextField jtxtAddMaths;
	private JTextField jtxtComputing;
	private JTextField jtxtChemistry;
	private JTextField jtxtPhysics;
	private JTextField jtxtTotalScore;
	private JTextField jtxtAverage;
	private JTextField jtxtRanking;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord window = new StudentRecord();
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
	public StudentRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		 
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new LineBorder(new Color(105, 105, 105), 12));
		panel.setBounds(10, 11, 953, 479);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		jtxtStudentID = new JTextField();
		jtxtStudentID.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtStudentID.setBounds(228, 48, 238, 33);
		panel.add(jtxtStudentID);
		jtxtStudentID.setColumns(10);
		
		Label label = new Label("StudentID:");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(63, 48, 124, 33);
		panel.add(label);
		
		Label label_1 = new Label("FirstName:");
		label_1.setFont(new Font("Dialog", Font.BOLD, 20));
		label_1.setBounds(63, 92, 124, 33);
		panel.add(label_1);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtFirstName.setColumns(10);
		jtxtFirstName.setBounds(228, 92, 238, 33);
		panel.add(jtxtFirstName);
		
		Label label_2 = new Label("SurName:");
		label_2.setFont(new Font("Dialog", Font.BOLD, 20));
		label_2.setBounds(63, 139, 124, 33);
		panel.add(label_2);
		
		jtxtSurName = new JTextField();
		jtxtSurName.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtSurName.setColumns(10);
		jtxtSurName.setBounds(228, 139, 238, 33);
		panel.add(jtxtSurName);
		
		Label label_3 = new Label("Course Code:");
		label_3.setFont(new Font("Dialog", Font.BOLD, 20));
		label_3.setBounds(52, 182, 135, 33);
		panel.add(label_3);
		
		Label label_4 = new Label("Exam No:");
		label_4.setFont(new Font("Dialog", Font.BOLD, 20));
		label_4.setBounds(63, 226, 124, 33);
		panel.add(label_4);
		
		jtxtExamNo = new JTextField();
		jtxtExamNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtExamNo.setColumns(10);
		jtxtExamNo.setBounds(228, 226, 238, 33);
		panel.add(jtxtExamNo);
		
		Label label_5 = new Label("Gender:");
		label_5.setFont(new Font("Dialog", Font.BOLD, 20));
		label_5.setBounds(63, 270, 124, 33);
		panel.add(label_5);
		
		Label label_6 = new Label("DOB:");
		label_6.setFont(new Font("Dialog", Font.BOLD, 20));
		label_6.setBounds(63, 314, 124, 33);
		panel.add(label_6);
		
		jtxtDOB = new JTextField();
		jtxtDOB.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtDOB.setColumns(10);
		jtxtDOB.setBounds(228, 314, 238, 33);
		panel.add(jtxtDOB);
		
		Label label_7 = new Label("Address:");
		label_7.setFont(new Font("Dialog", Font.BOLD, 20));
		label_7.setBounds(63, 358, 107, 33);
		panel.add(label_7);
		
		Label label_8 = new Label("Maths:");
		label_8.setFont(new Font("Dialog", Font.BOLD, 20));
		label_8.setBounds(566, 23, 124, 33);
		panel.add(label_8);
		
		jtxtMaths = new JTextField();
		jtxtMaths.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtMaths.setColumns(10);
		jtxtMaths.setBounds(731, 23, 186, 33);
		panel.add(jtxtMaths);
		
		Label label_9 = new Label("English:");
		label_9.setFont(new Font("Dialog", Font.BOLD, 20));
		label_9.setBounds(566, 62, 124, 33);
		panel.add(label_9);
		
		jtxtEnglish = new JTextField();
		jtxtEnglish.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtEnglish.setColumns(10);
		jtxtEnglish.setBounds(731, 62, 186, 33);
		panel.add(jtxtEnglish);
		
		Label label_10 = new Label("Biology:");
		label_10.setFont(new Font("Dialog", Font.BOLD, 20));
		label_10.setBounds(566, 102, 124, 33);
		panel.add(label_10);
		
		jtxtBiology = new JTextField();
		jtxtBiology.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtBiology.setColumns(10);
		jtxtBiology.setBounds(731, 102, 186, 33);
		panel.add(jtxtBiology);
		
		Label label_11 = new Label("Computing:");
		label_11.setFont(new Font("Dialog", Font.BOLD, 20));
		label_11.setBounds(566, 139, 135, 33);
		panel.add(label_11);
		
		jtxtComputing = new JTextField();
		jtxtComputing.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtComputing.setColumns(10);
		jtxtComputing.setBounds(731, 139, 186, 33);
		panel.add(jtxtComputing);
		
		Label label_12 = new Label("Chemistry:");
		label_12.setFont(new Font("Dialog", Font.BOLD, 20));
		label_12.setBounds(566, 182, 124, 33);
		panel.add(label_12);
		
		jtxtChemistry = new JTextField();
		jtxtChemistry.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtChemistry.setColumns(10);
		jtxtChemistry.setBounds(731, 182, 186, 33);
		panel.add(jtxtChemistry);
		
		Label label_13 = new Label("Physics:");
		label_13.setFont(new Font("Dialog", Font.BOLD, 20));
		label_13.setBounds(566, 226, 124, 33);
		panel.add(label_13);
		
		jtxtPhysics = new JTextField();
		jtxtPhysics.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtPhysics.setColumns(10);
		jtxtPhysics.setBounds(731, 226, 186, 33);
		panel.add(jtxtPhysics);
		
		Label label_14 = new Label("Add Maths");
		label_14.setFont(new Font("Dialog", Font.BOLD, 20));
		label_14.setBounds(566, 270, 124, 33);
		panel.add(label_14);
		
		jtxtAddMaths = new JTextField();
		jtxtAddMaths.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtAddMaths.setColumns(10);
		jtxtAddMaths.setBounds(731, 270, 186, 33);
		panel.add(jtxtAddMaths);
		
		Label label_15 = new Label("Business");
		label_15.setFont(new Font("Dialog", Font.BOLD, 20));
		label_15.setBounds(566, 314, 124, 33);
		panel.add(label_15);
		
		jtxtBusiness = new JTextField();
		jtxtBusiness.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtBusiness.setColumns(10);
		jtxtBusiness.setBounds(731, 314, 186, 33);
		panel.add(jtxtBusiness);
		
		Label label_16 = new Label("TotalScore");
		label_16.setFont(new Font("Dialog", Font.BOLD, 20));
		label_16.setBounds(566, 358, 124, 33);
		panel.add(label_16);
		
		jtxtTotalScore = new JTextField();
		jtxtTotalScore.setEnabled(false);
		jtxtTotalScore.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtTotalScore.setColumns(10);
		jtxtTotalScore.setBounds(731, 358, 186, 33);
		panel.add(jtxtTotalScore);
		
		Label label_17 = new Label("Average:");
		label_17.setFont(new Font("Dialog", Font.BOLD, 20));
		label_17.setBounds(566, 393, 124, 33);
		panel.add(label_17);
		
		jtxtAverage = new JTextField();
		jtxtAverage.setEnabled(false);
		jtxtAverage.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtAverage.setColumns(10);
		jtxtAverage.setBounds(731, 393, 186, 33);
		panel.add(jtxtAverage);
		
		jtxtRanking = new JTextField();
		jtxtRanking.setEnabled(false);
		jtxtRanking.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtRanking.setColumns(10);
		jtxtRanking.setBounds(731, 432, 186, 33);
		panel.add(jtxtRanking);
		
		Label label_17_1 = new Label("Ranking:");
		label_17_1.setFont(new Font("Dialog", Font.BOLD, 20));
		label_17_1.setBounds(566, 432, 124, 33);
		panel.add(label_17_1);
		
		JTextArea jtxtAddress = new JTextArea();
		jtxtAddress.setFont(new Font("Monospaced", Font.BOLD, 18));
		jtxtAddress.setBounds(228, 366, 288, 86);
		panel.add(jtxtAddress);
		

		JTextArea jtxtTranscript = new JTextArea();
		
		
		JComboBox jcomboBox = new JComboBox();
		jcomboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		jcomboBox.setModel(new DefaultComboBoxModel(new String[] {"OOP", "PF", "MVC", "DSA", "ICT", "Applied Phy", "Calculus"}));
		jcomboBox.setBounds(228, 183, 238, 32);
		panel.add(jcomboBox);
		
		JComboBox jcomboBox_1 = new JComboBox();
		jcomboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		jcomboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		jcomboBox_1.setBounds(228, 270, 238, 32);
		panel.add(jcomboBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(105, 105, 105), 12));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(20, 493, 1414, 88);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				JTextField temp =null;
				
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp =(JTextField)c;
						temp.setText(null);
						
						
					}
					
				}
				 jtxtTranscript.setText(null);
				jtxtAddress.setText(null);
				jtxtFirstName.setText(null);
				jtxtStudentID.setText(null);
				jtxtSurName.setText(null);
				jtxtDOB.setText(null);
				
			
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(662, 23, 335, 38);
		panel_2.add(btnReset);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				
				   jtxtTranscript.setText("");
			        jtxtTranscript.append("Student Result Recording System\n"
			                + "=================================\n"
			                + "Student ID:\t\t" + jtxtStudentID.getText()
			                + "\nFirstName:\t\t" + jtxtFirstName.getText()
			                + "\nSurName:\t\t" + jtxtSurName.getText()
			                + "\nMaths:\t\t\t" + jtxtMaths.getText()
			                + "\nEnglish:\t\t" + jtxtEnglish.getText()
			                + "\nBiology:\t\t" + jtxtBiology.getText()
			                + "\nComputing:\t\t" + jtxtComputing.getText()
			                + "\nChemistry:\t\t" + jtxtChemistry.getText()
			                + "\nPhysics:\t\t" + jtxtPhysics.getText()
			                + "\nAddMaths:\t\t" + jtxtBusiness.getText()
			                + "\nBusiness:\t\t" + jtxtAddMaths.getText()
			                + "\n======================================"
			                + "\nTotal Score:\t\t" + jtxtTotalScore.getText()
			                + "\nAverage:\t\t" + jtxtAverage.getText()
			                + "\nRanking:\t\t" + jtxtRanking.getText() + "\n");
						 






			       






				 
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTranscript.setBounds(341, 23, 260, 38);
		panel_2.add(btnTranscript);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double [] R = new double[14];
				R[0] = Double.parseDouble(jtxtMaths.getText());
				R[1] = Double.parseDouble(jtxtEnglish.getText());
				R[5] = Double.parseDouble(jtxtBiology.getText());

				R[2] = Double.parseDouble(jtxtComputing.getText());
				R[3] = Double.parseDouble(jtxtChemistry.getText());
				R[4] = Double.parseDouble(jtxtPhysics.getText());
				R[7] = Double.parseDouble(jtxtAddMaths.getText());

				R[6] = Double.parseDouble(jtxtBusiness.getText());
						
				R[8] = (R[0]+R[1] +R[2] +R[3] +R[4] +R[5] +R[6] +R[7] )/8;
				R[9] = (R[0]+R[1] +R[2] +R[3] +R[4] +R[5] +R[6] +R[7]);
				
				String Average = String.format("%.0f",R[8]);
				jtxtAverage.setText(Average);
				
				String TotalScore = String.format("%.0f",R[9]);
				jtxtTotalScore.setText(TotalScore);
				
				if(R[9] >= 700) {
					
					
					jtxtRanking.setText("1st Class");
					
				}
				else if(R[9] >= 600) {
					
					
					jtxtRanking.setText("2nd Class Upper");
					
				}
				
				else if(R[9] >= 500) {
					
					
					jtxtRanking.setText("2nd Class lower");
					
				}
				
				else if(R[9] >= 400) {
					
					
					jtxtRanking.setText("3rd Class");
					
				}
				
				else if(R[9] >= 300) {
					
					
					jtxtRanking.setText("coHE");
					
				}
				else if(R[9] >= 200) {
					
					
					jtxtRanking.setText("Fail");
					
				}else {
					jtxtRanking.setText("Fail");
				}
				
				// COndition less than 100
				
				if(R[1]>100) {
					
					jtxtMaths.setText("");
					jtxtMaths.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");

				}
				
				if(R[2]>100) {
					
					jtxtEnglish.setText("");
					jtxtEnglish.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");

				}
				
				
				if(R[3]>100) {
					
					
					jtxtBiology.setText("");
					jtxtBiology.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				
				}
				
				if(R[4]>100) {
					
					
					
					jtxtComputing.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				

				}
				
				if(R[5]>100) {
					
					
					
					jtxtChemistry.setText("");
					jtxtChemistry.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				

				}
				
				if(R[6]>100) {
					
					
					jtxtPhysics.setText("");
					jtxtPhysics.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					

				}
				
				if(R[7]>100) {
					
					
					jtxtAddMaths.setText("");
					jtxtAddMaths.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
					jtxtBusiness.setText("");
					

				}
				
				
				if(R[5]>100) {
					
					jtxtBusiness.requestFocus();
					
					jtxtAverage.setText("");
					
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");

				}
				
			
			
			
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnResult.setBounds(26, 23, 286, 38);
		panel_2.add(btnResult);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Student Result System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(1048, 23, 335, 38);
		panel_2.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(105, 105, 105), 12));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(973, 11, 451, 479);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		jtxtTranscript.setFont(new Font("Monospaced", Font.BOLD, 18));
		jtxtTranscript.setBounds(24, 21, 406, 436);
		panel_1.add(jtxtTranscript);
	}
}
