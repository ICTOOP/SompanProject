/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         Container container = this.getContentPane();
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, "homepage");
        this.setTitle("Home Page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        addcustomer2 = new clinic.Jpanel.addcustomer();
        customerdata2 = new clinic.Jpanel.customerdata();
        homepage3 = new clinic.Jpanel.homepage();
        addtreatment2 = new clinic.Jpanel.addtreatment();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jScrollPane1.setViewportView(jEditorPane1);

        jMenuItem3.setText("jMenuItem3");

        jMenu10.setText("jMenu10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(addcustomer2, "customeradd");
        getContentPane().add(customerdata2, "customerdata");

        javax.swing.GroupLayout homepage3Layout = new javax.swing.GroupLayout(homepage3);
        homepage3.setLayout(homepage3Layout);
        homepage3Layout.setHorizontalGroup(
            homepage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        homepage3Layout.setVerticalGroup(
            homepage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        getContentPane().add(homepage3, "homepage");
        getContentPane().add(addtreatment2, "addtreatment");

        jMenu1.setText("Home");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Customer");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Customer Data");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Add Customer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Treatment&Payment");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Add Treatment&Payment Data");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenuItem5.setText("Treatment&Payment Data");
        jMenu7.add(jMenuItem5);

        jMenuBar1.add(jMenu7);

        jMenu9.setText("Other");

        jMenuItem8.setText("Add Employee Data");
        jMenu9.add(jMenuItem8);

        jMenuItem9.setText("Add Doctor Data");
        jMenu9.add(jMenuItem9);

        jMenuBar1.add(jMenu9);

        jMenu11.setText("About Us");
        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        Container container = this.getContentPane();
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, "homepage");
        this.setTitle("Home Page");
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Container container = this.getContentPane();
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, "customerdata");
        this.setTitle("Customer Data");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       Container container = this.getContentPane();
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, "customeradd");
        this.setTitle("Add Customer");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Container container = this.getContentPane();
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, "addtreatment");
        this.setTitle("Add Treatment&Payment");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clinic.Jpanel.addcustomer addcustomer2;
    private clinic.Jpanel.addtreatment addtreatment2;
    private clinic.Jpanel.customerdata customerdata2;
    private clinic.Jpanel.homepage homepage3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
