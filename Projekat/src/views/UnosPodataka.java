package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class UnosPodataka extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UnosPodataka dialog = new UnosPodataka();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UnosPodataka() {
		setTitle("Unos podataka");
		setBounds(100, 500, 500, 400);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(204, 204, 204));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			fl_buttonPane.setVgap(7);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Posalji");
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
							if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")) 
							{
								JOptionPane.showMessageDialog(null, "Popunite sva polja!");
						    }
							else 
						    {
								SlanjePodataka sp = new SlanjePodataka();
								sp.show();
								dispose();
						    }
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
			JButton btnNewButton = new JButton("Zatvori");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			buttonPane.add(btnNewButton);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 102, 255));
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Ime");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNewLabel.setBounds(50, 54, 100, 28);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Prezime");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNewLabel_1.setBounds(50, 92, 100, 28);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Ulica i broj");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNewLabel_2.setBounds(50, 130, 100, 28);
				panel.add(lblNewLabel_2);
			}
			
			JComboBox comboBox = new JComboBox();
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Izaberi", "Becej", "Novi Sad", "Beograd", "Zrenjanin", "Kragujevac", "Subotica", "Nis", "Pancevo", "Smederevo"}));
			comboBox.setBounds(170, 171, 120, 25);
			panel.add(comboBox);
			
			
			JLabel lblNewLabel_3 = new JLabel("Mesto");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_3.setBounds(50, 166, 100, 28);
			panel.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Broj telefona");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_4.setBounds(50, 204, 110, 28);
			panel.add(lblNewLabel_4);
			
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField.setBounds(170, 59, 120, 25);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_1.setBounds(170, 97, 120, 25);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_2.setBounds(170, 135, 120, 25);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textField_3.setBounds(170, 209, 120, 25);
			panel.add(textField_3);
			textField_3.setColumns(10);
		}
	}
}
