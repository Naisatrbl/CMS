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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class NewEntry extends JDialog
{
  private JTextField firstNameText;  
  private JLabel first = new JLabel("First Name:");
  private JTextField lastNameText; 
  private JLabel last = new JLabel("Last Name:");
  private JTextField plotNumberText; 
  private JLabel plot = new JLabel("Plot Number:");
  private JTextField dateText;      
  private JLabel date = new JLabel("Date (mm-dd-yyyy):");
  private JTextField sectionText;       
  private JLabel section = new JLabel("Section:");
  private JTextField graveNumberText;       
  private JLabel grave = new JLabel("Grave Number:");
  private JTextField burialNumberText;       
  private JLabel burialNumber = new JLabel("Burial Number:");
  private JButton add;             
  private JButton cancel;           


  public NewEntry()
  {
    //set basic functionality
    int width = 400, height = 200;
    Dimension min = new Dimension(width, height);
    setMinimumSize(min);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setLayout(new GridLayout(20, 2));
    setModal(true);
    //init components
    add = new JButton("Add Entry");
    cancel = new JButton("Cancel");
    firstNameText = new JTextField();
    lastNameText = new JTextField();
    plotNumberText = new JTextField();
    dateText = new JTextField();
    sectionText = new JTextField();
    graveNumberText = new JTextField();
    burialNumberText = new JTextField();


    //stylize
    Color backgroundColor = new Color(153, 204, 255); //initialize main color
    Font mainFont = new Font("Serif", Font.PLAIN, 20); //create main font for buttons
    add.setFont(mainFont);
    cancel.setFont(mainFont);
    setBackground(backgroundColor);
    //add components
    add(first);
    add(firstNameText);
    add(last);
    add(lastNameText);
    add(plot);
    add(plotNumberText);
    add(date);
    add(dateText);
    add(section);
    add(sectionText);
    add(grave);
    add(graveNumberText);
    add(burialNumber);
    add(burialNumberText);
    add(new JLabel(" ")); //spacer
    add(add);
    add(cancel);
    pack();
    //set default enter function
    JRootPane rootPane = SwingUtilities.getRootPane(add);
    rootPane.setDefaultButton(add);

    firstNameText.addMouseListener(new textFieldListener());
    lastNameText.addMouseListener(new textFieldListener());
    plotNumberText.addMouseListener(new textFieldListener());
    dateText.addMouseListener(new textFieldListener());
    sectionText.addMouseListener(new textFieldListener());
    graveNumberText.addMouseListener(new textFieldListener());
    burialNumberText.addMouseListener(new textFieldListener());
    add.addActionListener(new addEntryListener());
    cancel.addActionListener(new cancelButtonListener());
  }


  class addEntryListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String firstName = firstNameText.getText();
      String lastName = lastNameText.getText();
      String plotNumber = plotNumberText.getText();
      String date = dateText.getText();
      String section = sectionText.getText();
      String grave = graveNumberText.getText();
      String interment = burialNumberText.getText();


      if (firstName.equals(""))
      {
        firstNameText.setForeground(Color.RED);
        firstNameText.setText("PLEASE ENTER A FIRST NAME");
      }
      else
      {
          
      }
      if (lastName.equals(""))
      {
        lastNameText.setForeground(Color.RED);
        lastNameText.setText("PLEASE ENTER A LAST NAME");
      }
      else
      {

      }
      if (plotNumber.equals(""))
      {
        plotNumberText.setForeground(Color.RED);
        plotNumberText.setText("PLEASE ENTER A PLOT NUMBER");
      }
      else
      {

      }
      if (date.equals(""))
      {

      }
      else if (dateText.getForeground() == Color.BLACK)
      {
          
      }
      try
      {
        Class.forName("");
        Connection con = DriverManager.getConnection("");
        Statement stmt = con.createStatement();

        firstName = capitalize(firstName);
        lastName = capitalize(lastName);


        if (!date.equals(""))
        {
          boolean rs = stmt.execute("" +
              "INSERT INTO PLOTS (DECEASED_FNAME, DECEASED_LNAME, " +
              "PLOT_NUMBER, DATE_DECEASED, SECTION, GRAVE, INTERMENT_NUMBER) " +
              "VALUES ('" + firstName + "'," + "'" + lastName + "'," + "'" + plotNumber + "'," +
              "'" + date + "'," + "'" + section + "'," + "'" + grave + "'," + "'" + interment + "');"
          );
        }
        else
        {
          boolean rs = stmt.execute("" +
              "INSERT INTO PLOTS (DECEASED_FNAME, DECEASED_LNAME, " +
              "PLOT_NUMBER, DATE_DECEASED, SECTION, GRAVE, INTERMENT_NUMBER) " +
              "VALUES ('" + firstName + "'," + "'" + lastName + "'," + "'" + plotNumber + "'," +
              "NULL," + "'" + section + "'," + "'" + grave + "'," + "'" + interment + "');"
          );
        }
        stmt.close();
        con.close();
      }
      catch (Exception er)
      {
        System.out.println(er.getMessage());
      }
      setVisible(false);
      dispose();
    }
  }


  class cancelButtonListener implements ActionListener
  {

    public void actionPerformed(ActionEvent e)
    {
      setVisible(false);
      dispose();
    }
  }


  class textFieldListener implements MouseListener
  {
    @Override
    public void mouseClicked(MouseEvent e)
    {
      JTextField curr = (JTextField) e.getSource();
      if (curr.getForeground() == Color.RED)
      {
        curr.setForeground(Color.BLACK);
        curr.setText("");
      }
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
      return;
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
      return;
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
      return;
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
      return;
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
