/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awais.risky;

/**
 *
 * @author Hmc
 */
public class NewDialog extends java.awt.Dialog {

    /**
     * Creates new form NewDialog
     */
    public NewDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollBar2 = new javax.swing.JScrollBar();
        jScrollBar3 = new javax.swing.JScrollBar();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                rgb(evt);
            }
        });
        add(jScrollBar1);
        jScrollBar1.setBounds(180, 80, 340, 17);

        jScrollBar2.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar2.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                rgb(evt);
            }
        });
        add(jScrollBar2);
        jScrollBar2.setBounds(190, 210, 340, 17);

        jScrollBar3.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar3.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                rgb(evt);
            }
        });
        add(jScrollBar3);
        jScrollBar3.setBounds(190, 360, 340, 17);
        add(jTextField1);
        jTextField1.setBounds(470, 120, 130, 40);
        add(jTextField2);
        jTextField2.setBounds(480, 250, 130, 40);
        add(jTextField3);
        jTextField3.setBounds(490, 410, 130, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Red");
        add(jLabel1);
        jLabel1.setBounds(30, 50, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("blue");
        add(jLabel2);
        jLabel2.setBounds(30, 220, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("green");
        add(jLabel3);
        jLabel3.setBounds(40, 370, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void rgb(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_rgb
        // TODO add your handling code here:
        
        
        int r ;
        int g ;
        int b;
        
    
        
        r=jScrollBar1.getValue();
        g=jScrollBar2.getValue();
        b=jScrollBar3.getValue();
        
        
        
        
        jTextField1.setText(" "+r);
        
         jTextField2.setText(" "+g);
        
        
         jTextField3.setText(" "+b);
        
        
        
        
        Color c=new Color(r,g,b);
        
        
        setBackground(c);
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_rgb

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewDialog dialog = new NewDialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void setBackground(Color c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
