/*
    Cameron Martin,
    Jared Key,
    Christopher Duong,
    Luke Higginbotham
 */
package ded;
import java.awt.Color;

public class HomePageUI extends javax.swing.JFrame {

    LoginPageUI loginPage;
    SocialPageUI socialPage;
    Map mapPage;
    DEDRecordsTab recordsPage;
    SettingsClass settingsPage;
    String curUser, curCem;
    
    /**
     * Creates new form HomePageUI
     * @param loginPage the LoginPageUI which called constructor
     */
    public HomePageUI(LoginPageUI loginPage) {
        initComponents();
        this.loginPage = loginPage;
        socialPage = new SocialPageUI(this);
        mapPage = new Map(this);
        recordsPage = new DEDRecordsTab(this);
        settingsPage = new SettingsClass(this);
        curUser = "";
    }
    
    public void complyWithSettings(boolean isDark, float fontSize) {
        if(isDark) {
            homePanel.setBackground(new Color((float) 0.09803921568,(float) 0.09803921568,(float) 0.43921568627));
        }
        else {
            homePanel.setBackground(new Color((float) 0.50196078431, (float) 0.50196078431, (float) 0.50196078431));
        }
        cemNameLbl.setFont(cemNameLbl.getFont().deriveFont(fontSize));
        contactSprtBtn.setFont(contactSprtBtn.getFont().deriveFont(fontSize));
        logoutBtn.setFont(logoutBtn.getFont().deriveFont(fontSize));
        mpBtn.setFont(mpBtn.getFont().deriveFont(fontSize));
        rcdsBtn.setFont(rcdsBtn.getFont().deriveFont(fontSize));
        sclBtn.setFont(sclBtn.getFont().deriveFont(fontSize));
        sprtMsg.setFont(sprtMsg.getFont().deriveFont(fontSize));
        stgsBtn.setFont(stgsBtn.getFont().deriveFont(fontSize));
        usersNameLbl.setFont(usersNameLbl.getFont().deriveFont(fontSize));
        loginPage.complyWithSettings(isDark, fontSize);
    }
    
    public void updateWelcome() {
        cemNameLbl.setText(curCem);
        usersNameLbl.setText("Welcome, " + curUser);
    }
    
    public void setCurUserAndCem(String curUser, String curCem) {
        this.curUser = curUser;
        this.curCem = curCem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        contactSprtBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        cemNameLbl = new javax.swing.JLabel();
        usersNameLbl = new javax.swing.JLabel();
        sprtMsg = new javax.swing.JLabel();
        sclBtn = new javax.swing.JButton();
        mpBtn = new javax.swing.JButton();
        rcdsBtn = new javax.swing.JButton();
        stgsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database for the Eternally Deceased");

        contactSprtBtn.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        contactSprtBtn.setText("Contact Support");
        contactSprtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactSprtBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        cemNameLbl.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cemNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cemNameLbl.setText("Name of Cemetery");

        usersNameLbl.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        usersNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersNameLbl.setText("Welcome, User");

        sprtMsg.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        sprtMsg.setForeground(new java.awt.Color(255, 0, 0));

        sclBtn.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        sclBtn.setText("Social");
        sclBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sclBtnActionPerformed(evt);
            }
        });

        mpBtn.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        mpBtn.setText("Map");
        mpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpBtnActionPerformed(evt);
            }
        });

        rcdsBtn.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        rcdsBtn.setText("Records");
        rcdsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcdsBtnActionPerformed(evt);
            }
        });

        stgsBtn.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        stgsBtn.setText("Settings");
        stgsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stgsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutBtn))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(sprtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(contactSprtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homePanelLayout.createSequentialGroup()
                                .addComponent(sclBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mpBtn))
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(rcdsBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stgsBtn))
                            .addComponent(cemNameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usersNameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(cemNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(usersNameLbl)
                .addGap(32, 32, 32)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpBtn)
                    .addComponent(sclBtn))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stgsBtn)
                    .addComponent(rcdsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(sprtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contactSprtBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        loginPage.setVisible(true);
        this.setVisible(false);
        curUser = "";
        updateWelcome();
        sprtMsg.setText("");
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void contactSprtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactSprtBtnActionPerformed
        if(sprtMsg.getText().equals("")) sprtMsg.setText("Support doesn't care");
        else sprtMsg.setText("No, really, they don't.");
    }//GEN-LAST:event_contactSprtBtnActionPerformed

    private void sclBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sclBtnActionPerformed
        socialPage.getSocialWindow(); //May need to access frame
        this.setVisible(false);
    }//GEN-LAST:event_sclBtnActionPerformed

    private void mpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpBtnActionPerformed
        mapPage.getmapWindow();
        this.setVisible(false);
    }//GEN-LAST:event_mpBtnActionPerformed

    private void rcdsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcdsBtnActionPerformed
        recordsPage.getMainWindow();
        this.setVisible(false);
    }//GEN-LAST:event_rcdsBtnActionPerformed

    private void stgsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stgsBtnActionPerformed
        settingsPage.getSettingsWindow();
        this.setVisible(false);
    }//GEN-LAST:event_stgsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cemNameLbl;
    private javax.swing.JButton contactSprtBtn;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton mpBtn;
    private javax.swing.JButton rcdsBtn;
    private javax.swing.JButton sclBtn;
    private javax.swing.JLabel sprtMsg;
    private javax.swing.JButton stgsBtn;
    private javax.swing.JLabel usersNameLbl;
    // End of variables declaration//GEN-END:variables
}