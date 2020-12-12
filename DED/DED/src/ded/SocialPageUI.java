/*
    Cameron Martin,
    Jared Key,
    Christopher Duong,
    Luke Higginbotham
 */
package ded;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;

class SocialPageUI extends JFrame implements ActionListener 
{
    private static JFrame frame;
    private static HomePageUI HP;
    private JButton homeButton;
    private JButton calendarButton;
    private static JPanel So;
    //Socials Tab constructor which builds the frame and fills it with a 
    //calendar button and an editable employee role text area.
    public SocialPageUI(HomePageUI homepage)
    {
        HP = homepage;
        frame = new JFrame("Social Tab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) ((.44) * (screenSize.getWidth()));
        int height = (int) ((.44) * (screenSize.getHeight()));
        Dimension min = new Dimension(width, height); 
        frame.setMinimumSize(min);
        
        Font calendarFont = new Font("Serif", Font.PLAIN, 20);
        calendarButton = new JButton("Open Calendar");
        calendarButton.setFont(calendarFont);
        calendarButton.addActionListener(new calendarButton());
        frame.add(calendarButton);

        
        JTextArea ta = new JTextArea("Name\tRole\t  Phone #\t  Email"
                + "\n-----------------------------------------------------------"
                + "----------------------------------\n"
                + "Nate Payton\tFront Desk\t  255-234-4567\t  npayto@gmail.com\n"
                + "Zak Elawasi\tRecords\t  255-131-4767\t  zelaw@gmail.com\n"
                + "Carson Witt\tGroundskeeper\t  255-431-8273\t  wittbr@gmail.com\n"
                + "Eli Negev\tGroundskeeper\t  255-879-3459\t  enegev@yahoo.com\n"
                + "Paul Brian\tSales Prof.\t  255-837-2932\t  gemini@gmail.com\n"
                + "Harrison Griffin\tGravedigger\t  255-732-2314\t  harryba@gmail.com");
        frame.add(ta);
        
        
        Font homeFont = new Font("Serif", Font.PLAIN, 20);
        homeButton = new JButton("Home");
        homeButton.setFont(homeFont);
        homeButton.addActionListener(new homeListener());
        frame.add(homeButton);
        
        
    }
    
    public void getSocialWindow(){
        frame.setVisible(true);
        HP.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    class homeListener implements ActionListener
    {
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
       frame.setVisible(false);
       HP.setVisible(true);
    }
    }
    
    class calendarButton implements ActionListener{
    //Displayed Calendar
    @Override
    public void actionPerformed(ActionEvent actionEvent) 
    {
            JOptionPane.showMessageDialog(null, "                                               "
                    + "DECEMBER 2020\n--------------------------------------------"
                    + "--------------------------------------------------------\n"
                    + "|Sunday   Monday   Tuesday   Wednesday   Thursday   Friday   Saturday|\n"
                    + "----------------------------------------------------------------------------------------------------\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|                |                 |                 |                        |                   |                |                |\n"
                    + "|--------------------------------------------------------------------------------------------------|\n");
        }
    }
    }
