/*
    Cameron Martin,
    Jared Key,
    Christopher Duong,
    Luke Higginbotham
 */
package ded;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;


public class TopHalf extends JPanel
{
  private static DataPanel dp;
  private JPanel titlePanel;
  private JLabel mainHeading = new JLabel("Database for Eternally Deceased");
  private JLabel subHeading = new JLabel("Records");
  private JPanel namePanel;
  private JLabel nameLabel;
  private JTextField nameField;
  private JButton nameButton;
  private JTextField plotField1;
  private JTextField plotField2;
  private JTextField plotField3;
  private JButton plotButton;


  public TopHalf(DataPanel display)
  {

    dp = display;

    //Setup SearchPanel
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    //Deal with titlePanel
    titlePanel = new JPanel(new GridLayout(1, 3));
    Color panelColor = new Color(153, 204, 255); 
    titlePanel.setBackground(panelColor); 
    Font subHeadingFont = new Font("Serif", Font.PLAIN, 24); 
    subHeading.setFont(subHeadingFont); 
    subHeading.setHorizontalAlignment(JLabel.LEFT);
    titlePanel.add(subHeading);
    add(titlePanel);
    Font mainHeadingFont = new Font("Serif", Font.PLAIN, 24);
    mainHeading.setFont(mainHeadingFont); 
    titlePanel.add(mainHeading);
 

    //Initialize namePanel
    Font mainFont = new Font("Serif", Font.PLAIN, 20); 
    namePanel = new JPanel(new GridLayout(1, 3));
    namePanel.setBackground(panelColor); 
    nameLabel = new JLabel("Search By Name:");
    nameLabel.setFont(mainFont);
    nameLabel.setHorizontalAlignment(SwingConstants.RIGHT); 
    nameField = new JTextField();
    nameField.addMouseListener(new fieldListener());
    nameButton = new JButton("Search");
    nameButton.setFont(mainFont); 
    nameButton.addActionListener(new nameListener());
    namePanel.add(nameLabel);
    namePanel.add(nameField);
    namePanel.add(nameButton);
    add(namePanel);
    namePanel.setVisible(true);

  }


  class createListener implements ActionListener
  {
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
      NewEntry entry = new NewEntry();
      entry.setVisible(true);
    }
  }

  class fieldListener implements MouseListener
  {
    @Override
    public void mouseClicked(MouseEvent mouseEvent)
    {
      JTextField temp = (JTextField) mouseEvent.getSource();
      if (temp == nameField)
      {
        JRootPane rootPane = SwingUtilities.getRootPane(nameButton);
        rootPane.setDefaultButton(nameButton);
      }
      if (temp == plotField1 || temp == plotField2 || temp == plotField3)
      {
        JRootPane rootPane = SwingUtilities.getRootPane(plotButton);
        rootPane.setDefaultButton(plotButton);
      }
    }
    @Override
    public void mousePressed(MouseEvent mouseEvent){
    }
    @Override
    public void mouseReleased(MouseEvent mouseEvent){
    }
    @Override
    public void mouseEntered(MouseEvent mouseEvent){
    }
    @Override
    public void mouseExited(MouseEvent mouseEvent){
    }
  }


  class nameListener implements ActionListener
  {
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
     
    }
  }


  public String capitalize(String s)
  {
    char[] sc = s.toCharArray();
    sc[0] = Character.toUpperCase(sc[0]);
    s = new String(sc);
    return s;
  }


}
