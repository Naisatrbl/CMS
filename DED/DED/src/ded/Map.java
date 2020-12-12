/*
    Cameron Martin,
    Jared Key,
    Christopher Duong,
    Luke Higginbotham
 */
package ded;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Map 
{
    private static HomePageUI HP;
    private static JFrame frame;

    private static final int MIN_ZOOM = 0;
    private static final int MAX_ZOOM = 21;
    private static int zoomValue = 18;


    public void getmapWindow() {
         frame.setVisible(true);
    }

    
    public Map(HomePageUI homepage){
        HP = homepage;
        System.setProperty("jxbrowser.license.key", "1BNDHFSC1FXK8HPZR6LEAWSWMDQ2N301LIPOTDLNHTJL14I0POO9SGM8NSCESCU2PX042G");
        EngineOptions options = EngineOptions.newBuilder(HARDWARE_ACCELERATED).build();
        Engine engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();

        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                BrowserView view = BrowserView.newInstance(browser);
                         
                JButton backHomeButton = new JButton("Back To Home");

                backHomeButton.addActionListener(new backListener());
                
                JPanel toolBar = new JPanel();
                toolBar.add(backHomeButton);
                
                frame = new JFrame("Maps Tab");
                frame.add(toolBar, BorderLayout.SOUTH);
                frame.add(view, BorderLayout.CENTER);
                frame.setSize(1550, 1100);
                frame.setVisible(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                browser.navigation().loadUrl("C:\\Users\\chris\\Desktop\\mapp.html");
                
            }
        });
    }
                    class backListener implements ActionListener
                {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent)
                    {
                        frame.setVisible(false);
                        HP.setVisible(true);
                    }
                }
}
 
