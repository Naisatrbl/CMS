/*
    Cameron Martin,
    Jared Key,
    Christopher Duong,
    Luke Higginbotham
 */

package ded;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.*;
import java.awt.Button;
import java.awt.List;
import java.awt.Choice;

public class SettingsClass {

	private static HomePageUI HP;
	private static JFrame frame;

	/**
	 * Create the application.
	 */
        public void getSettingsWindow() {
         frame.setVisible(true);
    }
        
	public SettingsClass(HomePageUI homepage) {
            HP = homepage;
            EventQueue.invokeLater(new Runnable() {
			public void run() {
            frame = new JFrame("Settings Tab");		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Settings");
                frame.setVisible(false);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChangeDedFontSize = new JLabel("Change font size");
                lblChangeDedFontSize.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChangeDedFontSize.setBounds(140, 110, 95, 16);
		frame.getContentPane().add(lblChangeDedFontSize);
		
		
		JButton ToggleButton = new JButton("Toggle Dark Mode");
		ToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// dark mode toggle
				
				frame.getContentPane().setBackground(new Color(25, 25, 112));
				lblChangeDedFontSize.setForeground(Color.GRAY);
			}	
		});
		
		
		ToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ToggleButton.setBounds(140, 50, 146, 25);
		frame.getContentPane().add(ToggleButton);
		
		//Font size combo box
		JComboBox FontcomboBox = new JComboBox();
		FontcomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selection = FontcomboBox.getSelectedIndex();
				Font font1 = new Font("Tahoma", Font.PLAIN, 6);
				Font font2 = new Font("Tahoma", Font.PLAIN, 8);
				Font font3 = new Font("Tahoma", Font.PLAIN, 9);
				Font font4 = new Font("Tahoma", Font.PLAIN, 11);
				Font font5 = new Font("Tahoma", Font.PLAIN, 14);
				Font font6 = new Font("Tahoma", Font.PLAIN, 18);
				Font font7 = new Font("Tahoma", Font.PLAIN, 24);
				Font font8 = new Font("Tahoma", Font.PLAIN, 30);
				Font font9 = new Font("Tahoma", Font.PLAIN, 36);
				Font font10 = new Font("Tahoma", Font.PLAIN, 48);
				Font font11 = new Font("Tahoma", Font.PLAIN, 60);
				Font font12 = new Font("Tahoma", Font.PLAIN, 72);
				Font font13 = new Font("Tahoma", Font.PLAIN, 84);
				
				
				switch(selection)
				{
				case 0: lblChangeDedFontSize.setFont(font1);
				break;
				case 1: lblChangeDedFontSize.setFont(font2);
				break;
				case 3: lblChangeDedFontSize.setFont(font3);
				break;
				case 4: lblChangeDedFontSize.setFont(font4);
				break;
				case 5: lblChangeDedFontSize.setFont(font5);
				break;
				case 6: lblChangeDedFontSize.setFont(font6);
				break;
				case 7: lblChangeDedFontSize.setFont(font7);
				break;
				case 8: lblChangeDedFontSize.setFont(font8);
				break;
				case 9: lblChangeDedFontSize.setFont(font9);
				break;
				case 10: lblChangeDedFontSize.setFont(font10);
				break;
				case 11: lblChangeDedFontSize.setFont(font11);
				break;
				case 12: lblChangeDedFontSize.setFont(font12);
				break;
				case 13: lblChangeDedFontSize.setFont(font13);
				break;
				
		
					
				}
                        }
                });
		
                FontcomboBox.setModel(new DefaultComboBoxModel(new String[] {"6", "8", "9", "10", "11", "14", "18", "24", "30", "36", "48", "60", "72", "84"}));
		FontcomboBox.setMaximumRowCount(15);
		FontcomboBox.setBounds(245, 110, 41, 22);
		frame.getContentPane().add(FontcomboBox);
		
		
		//Home Button
		Button button = new Button("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            frame.setVisible(false);
                            HP.setVisible(true);
			}
		});
		button.setBounds(0, 0, 79, 24);
		frame.getContentPane().add(button);
		}
		public void color()
		{
			frame.getContentPane().setBackground(new Color(25, 25, 112));
			
		}
	});
        }          
}
