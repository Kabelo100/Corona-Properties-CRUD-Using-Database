/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaproperties;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Melvin K
 */
public class MainMenu extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    /**
     * Creates new form Menu
     */
    public MainMenu() {
        initComponents();
        showDate();
        showTime();
    }

    void showDate() {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        lblDate.setText(dateFormat.format(date));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date date = new java.util.Date();
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(timeFormat.format(date));
            }

        }).start();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        btnComparativeViews = new javax.swing.JButton();
        btnComputation = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnAdd.setText("Add Property");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDisplay.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnDisplay.setText("View Property");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnUpdate.setText("Update Property");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnDelete.setText("Delete Property");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblHeading.setText("Corona Properties Main Menu");

        btnComparativeViews.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnComparativeViews.setText("Comparative Views");
        btnComparativeViews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparativeViewsActionPerformed(evt);
            }
        });

        btnComputation.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnComputation.setText("Computations");
        btnComputation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputationActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblDate.setText("Date");

        lblTime.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblTime.setText("Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 166, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addGap(31, 31, 31)
                .addComponent(lblHeading)
                .addGap(47, 47, 47)
                .addComponent(lblTime)
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnExit))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btnComparativeViews))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnComputation))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd)
                            .addComponent(btnDisplay))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading)
                    .addComponent(lblDate)
                    .addComponent(lblTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(29, 29, 29)
                .addComponent(btnDisplay)
                .addGap(33, 33, 33)
                .addComponent(btnComparativeViews)
                .addGap(30, 30, 30)
                .addComponent(btnComputation)
                .addGap(33, 33, 33)
                .addComponent(btnUpdate)
                .addGap(37, 37, 37)
                .addComponent(btnDelete)
                .addGap(65, 65, 65)
                .addComponent(btnExit)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.dispose();
        CreateProp.createSome();
        System.gc();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Are you sure", JOptionPane.YES_NO_OPTION);
        /*
         * 0 = yes
         * 1 = no
         */
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.dispose();
        DeleteProp.deleteSome();
        System.gc();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.dispose();
        UpdateProp.updateSome();
        System.gc();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        this.dispose();
        ReadPropAll.readAll();
        System.gc();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnComparativeViewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparativeViewsActionPerformed
        this.dispose();

        //Open ComparativeViewsMenu
        ComparativeViewsMenu aComparativeViewsMenu = new ComparativeViewsMenu();

        aComparativeViewsMenu.setTitle("Corona Comparative View");
        aComparativeViewsMenu.setOpacity((float) 0.9);
        aComparativeViewsMenu.setBackground(new Color(0, 0, 0, 0));
        aComparativeViewsMenu.setIconImage(Toolkit.getDefaultToolkit().
                getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
        aComparativeViewsMenu.setLocationRelativeTo(null);
        aComparativeViewsMenu.setVisible(true);

        System.gc();
    }//GEN-LAST:event_btnComparativeViewsActionPerformed

    private void btnComputationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputationActionPerformed
        this.dispose();

        //Open ComputationMenu
        ComputationMenu aComputationMenu = new ComputationMenu();

        aComputationMenu.setTitle("Corona Computation Menu");
        aComputationMenu.setOpacity((float) 0.9);
        aComputationMenu.setBackground(new Color(0, 0, 0, 0));
        aComputationMenu.setIconImage(Toolkit.getDefaultToolkit().
                getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
        aComputationMenu.setLocationRelativeTo(null);
        aComputationMenu.setVisible(true);

        System.gc();
    }//GEN-LAST:event_btnComputationActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        setOpacity((float) 0.7);
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        setOpacity((float) 0.9);
    }//GEN-LAST:event_jPanel1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnComparativeViews;
    private javax.swing.JButton btnComputation;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
