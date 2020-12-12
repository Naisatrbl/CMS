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


public class DEDRecordsTab
{
    private JButton homeButton;
    private static HomePageUI HP;
    private static JFrame mainWindow; 
    private static TopHalf mw;
    private static DataPanel dp;


    public DEDRecordsTab(HomePageUI homepage)
    {
        HP = homepage;
        mainWindow = new JFrame("Records Tab");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new GridLayout(3, 1));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) ((.66) * (screenSize.getWidth()));
        int height = (int) ((.66) * (screenSize.getHeight()));
        Dimension min = new Dimension(width, height); 
        mainWindow.setMinimumSize(min);
        dp = new DataPanel();  
        mw = new TopHalf(dp);
    
        mainWindow.add(mw);
        mainWindow.add(dp);
    
        mw.setVisible(true);
        dp.setVisible(true);
        mainWindow.setVisible(false);
    
    
        Font homeFont = new Font("Serif", Font.PLAIN, 20);
        homeButton = new JButton("Home");
        homeButton.setFont(homeFont);
        homeButton.addActionListener(new homeListener());
        mainWindow.add(homeButton);
    }

    public void getMainWindow() {
         mainWindow.setVisible(true);
    }
        
    class homeListener implements ActionListener
    {
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
       mainWindow.setVisible(false);
       HP.setVisible(true);
    }
    }
}
