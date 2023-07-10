package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class glavna extends JFrame {

	private JPanel contentPane;
	private JPanel panelTelefoni;
	private JPanel panelOprema;
	private JPanel panelKupovina;
	private JLayeredPane layeredPane;
	private JTextField txtosnovica;
	private JTextField txtpdv;
	private JTextField ukupnoo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					glavna frame = new glavna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public glavna() {
		setTitle("Glavna");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 95, 866, 318);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelTelefoni = new JPanel();
		panelTelefoni.setBackground(new Color(0, 102, 255));
		layeredPane.add(panelTelefoni, "name_95133003358000");
		panelTelefoni.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(glavna.class.getResource("/resources/iphone12.png")));
		lblNewLabel.setBounds(50, 44, 100, 100);
		panelTelefoni.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(glavna.class.getResource("/resources/samsungs10.jpg")));
		lblNewLabel_1.setBounds(200, 44, 100, 100);
		panelTelefoni.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(glavna.class.getResource("/resources/matepro.png")));
		lblNewLabel_3.setBounds(350, 44, 100, 100);
		panelTelefoni.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(glavna.class.getResource("/resources/mi11pro.jpg")));
		lblNewLabel_4.setBounds(510, 44, 100, 100);
		panelTelefoni.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(glavna.class.getResource("/resources/p30pro.png")));
		lblNewLabel_5.setBounds(660, 44, 100, 100);
		panelTelefoni.add(lblNewLabel_5);
		
		JCheckBox txtiphone12 = new JCheckBox("104.000");
		txtiphone12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtiphone12.setBackground(Color.LIGHT_GRAY);
		txtiphone12.setHorizontalAlignment(SwingConstants.CENTER);
		txtiphone12.setBounds(50, 243, 100, 28);
		panelTelefoni.add(txtiphone12);
		
		JCheckBox txtsamsungs10 = new JCheckBox("62.500");
		txtsamsungs10.setBackground(Color.LIGHT_GRAY);
		txtsamsungs10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtsamsungs10.setBounds(200, 243, 100, 28);
		panelTelefoni.add(txtsamsungs10);
		
		JCheckBox txtmate20pro = new JCheckBox("44.500");
		txtmate20pro.setBackground(Color.LIGHT_GRAY);
		txtmate20pro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtmate20pro.setBounds(350, 243, 100, 28);
		panelTelefoni.add(txtmate20pro);
		
		JCheckBox txtxiaomi11 = new JCheckBox("75.000");
		txtxiaomi11.setBackground(new Color(192, 192, 192));
		txtxiaomi11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtxiaomi11.setBounds(510, 243, 100, 28);
		panelTelefoni.add(txtxiaomi11);
		
		JCheckBox txthuawei30 = new JCheckBox("58.000");
		txthuawei30.setBackground(Color.LIGHT_GRAY);
		txthuawei30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txthuawei30.setBounds(660, 243, 100, 28);
		panelTelefoni.add(txthuawei30);
		
		JLabel lblNewLabel_6 = new JLabel("Iphone 12 PRO");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(38, 160, 112, 36);
		panelTelefoni.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Black");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(71, 216, 59, 21);
		panelTelefoni.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("256GB");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(65, 195, 65, 13);
		panelTelefoni.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Samsung S10");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(200, 172, 112, 13);
		panelTelefoni.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("128GB");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(223, 195, 59, 13);
		panelTelefoni.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("White");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(233, 222, 45, 13);
		panelTelefoni.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Huawei Mate 20 PRO");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(333, 172, 150, 13);
		panelTelefoni.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("128GB");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(370, 195, 59, 13);
		panelTelefoni.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Blue");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(378, 220, 45, 13);
		panelTelefoni.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Xiaomi MI 11");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(510, 172, 100, 13);
		panelTelefoni.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("128GB");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(531, 197, 53, 13);
		panelTelefoni.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Black");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(535, 220, 45, 13);
		panelTelefoni.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Huawei P30 PRO");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setBounds(652, 172, 119, 13);
		panelTelefoni.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("256GB");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBounds(682, 195, 53, 13);
		panelTelefoni.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Breathing Crystal");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(648, 220, 133, 13);
		panelTelefoni.add(lblNewLabel_20);
		
		JPanel panelOprema = new JPanel();
		panelOprema.setBackground(new Color(0, 102, 255));
		layeredPane.add(panelOprema, "name_95218194880100");
		panelOprema.setLayout(null);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(glavna.class.getResource("/resources/silikonskamaska.jpg")));
		lblNewLabel_21.setBounds(50, 52, 100, 100);
		panelOprema.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon(glavna.class.getResource("/resources/staklo.png")));
		lblNewLabel_22.setBounds(210, 52, 100, 100);
		panelOprema.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Silikonska maska");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_23.setBounds(34, 177, 132, 13);
		panelOprema.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Providna");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_24.setBounds(64, 200, 68, 13);
		panelOprema.add(lblNewLabel_24);
		
		JRadioButton rdnmaska = new JRadioButton("600");
		rdnmaska.setBackground(Color.LIGHT_GRAY);
		rdnmaska.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdnmaska.setBounds(50, 222, 100, 28);
		panelOprema.add(rdnmaska);
		
		JLabel lblNewLabel_25 = new JLabel("Zastitno staklo");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_25.setBounds(208, 177, 113, 13);
		panelOprema.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Tvrdo staklo");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBounds(204, 200, 113, 13);
		panelOprema.add(lblNewLabel_26);
		
		JRadioButton rdnstaklo = new JRadioButton("1.000");
		rdnstaklo.setBackground(Color.LIGHT_GRAY);
		rdnstaklo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdnstaklo.setBounds(210, 224, 100, 28);
		panelOprema.add(rdnstaklo);
		
		
		JPanel panelKupovina = new JPanel();
		panelKupovina.setBackground(new Color(0, 102, 255));
		layeredPane.add(panelKupovina, "name_95221952586100");
		panelKupovina.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Izaberi", "Kartica", "Gotovina", "PayPal", "BitCoin"}));
		comboBox.setBounds(46, 60, 150, 35);
		panelKupovina.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Nacin placanja:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(46, 24, 150, 28);
		panelKupovina.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Racun");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ukupno;
				double osnovica = 0;
				final double porez = 0.2;
				double taksa;
				
				if(txtiphone12.isSelected()) {
					osnovica = osnovica + 104000;
				}if(txtsamsungs10.isSelected()) {
					osnovica = osnovica + 62500;
				}if(txtmate20pro.isSelected()) {
					osnovica = osnovica + 44500;
				}if(txtxiaomi11.isSelected()) {
					osnovica = osnovica + 75000;
				}if(txthuawei30.isSelected()) {
					osnovica= osnovica + 58000;
				}
				
				if(rdnmaska.isSelected()) {
					osnovica = osnovica + 600;
				} else if(rdnstaklo.isSelected()) {
					osnovica = osnovica + 1000;
				}
				
				txtosnovica.setText(Double.toString(osnovica));
		
				osnovica = Double.parseDouble(txtosnovica.getText());
				taksa = osnovica * porez;
				ukupno = taksa + osnovica;
				
				txtpdv.setText(Double.toString(taksa));
				ukupnoo.setText(Double.toString(ukupno));
			
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_2.setBounds(376, 60, 120, 35);
		panelKupovina.add(btnNewButton_2);
		
		JLabel lblNewLabel_27 = new JLabel("Ukupna za naplatu");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27.setBounds(344, 28, 179, 21);
		panelKupovina.add(lblNewLabel_27);
		
		JButton btnNewButton_3 = new JButton("Naruci telefon");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ukupnoo.getText().equals("") || txtpdv.getText().equals("") || txtosnovica.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Odaberite nacin placanja i stisnite racun!");
			    }
				else 
			    {
					UnosPodataka up = new UnosPodataka();
					up.show();
					dispose();
			    }
			}
		});
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(690, 270, 166, 40);
		panelKupovina.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("RESET");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtiphone12.setSelected(false);
				txtsamsungs10.setSelected(false);
				txtmate20pro.setSelected(false);
				txtxiaomi11.setSelected(false);
				txthuawei30.setSelected(false);
				
				rdnmaska.setSelected(false);
				rdnstaklo.setSelected(false);
				
				ukupnoo.setText("");
				txtosnovica.setText("");
				txtpdv.setText("");
			}
		});
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(10, 275, 102, 30);
		panelKupovina.add(btnNewButton_4);
		
		JLabel lblNewLabel_28 = new JLabel("Osnovica");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setBounds(149, 147, 85, 28);
		panelKupovina.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Taksa");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setBounds(356, 147, 85, 28);
		panelKupovina.add(lblNewLabel_29);
		
		JLabel txtukupno = new JLabel("Ukupno");
		txtukupno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtukupno.setHorizontalAlignment(SwingConstants.CENTER);
		txtukupno.setBounds(556, 147, 73, 28);
		panelKupovina.add(txtukupno);
		
		txtosnovica = new JTextField();
		txtosnovica.setBounds(135, 185, 120, 30);
		panelKupovina.add(txtosnovica);
		txtosnovica.setColumns(10);
		
		txtpdv = new JTextField();
		txtpdv.setBounds(337, 186, 120, 30);
		panelKupovina.add(txtpdv);
		txtpdv.setColumns(10);
		
		ukupnoo = new JTextField();
		ukupnoo.setBounds(538, 185, 120, 30);
		panelKupovina.add(ukupnoo);
		ukupnoo.setColumns(10);
		
		JButton btnNewButton = new JButton("Oprema");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelOprema);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(240, 24, 140, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Telefoni");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelTelefoni);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(40, 24, 140, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnPanel = new JButton("Korpa");
		btnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelKupovina);
			}
		});
		btnPanel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPanel.setBounds(440, 24, 140, 45);
		contentPane.add(btnPanel);
		
		JButton btnNapustiProdavnicu = new JButton("Napusti prodavnicu");
		btnNapustiProdavnicu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNapustiProdavnicu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNapustiProdavnicu.setBounds(640, 24, 212, 45);
		contentPane.add(btnNapustiProdavnicu);
	}
}
