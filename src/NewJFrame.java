
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hewlett Packard
 */

public class NewJFrame extends javax.swing.JFrame {
     String s;
   
     public NewJFrame() {
        initComponents();
        jTextField5.setEditable(false);
    }

    /**
     * Creates new form NewJFrame
     *//*A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 249. BMI applies to most adults 18-65 years.
    public NewJFrame() {
        initComponents();
    }
    Between 16 and 18.5	Underweight
Between 18.5 and 25	Normal (healthy weight)
Between 25 and 30	Overweight

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CALCULATE YOUR BMI");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("FEMALE");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("MALE");

        jLabel2.setText("SEX");

        jLabel3.setText("HEIGHT");

        jLabel4.setText("WEIGHT");

        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("AGE");

        jLabel6.setText("(in cms)");

        jLabel7.setText("(in kgs)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int we=Integer.parseInt(jTextField2.getText());
       double len=Integer.parseInt(jTextField1.getText());
       len=len/100;
        JOptionPane.showMessageDialog(this, len);
       
               double bmi= we/(len*len);
        int  y=Integer.parseInt(jTextField3.getText());
        if(jRadioButton1.isSelected()==true)
       {
           if(y>=15 && y<=20)
           {
               if(bmi>=24.1 && bmi<=27.1)
               {
                   s = "Your BMI is perfect";
                   
               }
               else if(bmi<24.1)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=21 && y<=30)
           {
               if(bmi>=25.5 && bmi<=26.7)
               {
                   s = "Your BMI is perfect";                  
               }
               else if(bmi<=25.5)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=31 && y<=40)
           {
               if(bmi>=27.9 && y<=30.1)
               {
                   s = "Your BMI is perfect";
               }
               else if(y<=27.9)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=41 && y<=50)
           {
               if(bmi>=28.1 && bmi<=30.3)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=28.1)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=51 && y<=60)
           {
               if(bmi>=27.2 && bmi<=29.8)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=27.2)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=61 && y<=70)
           {
               if(bmi>=27.7 && bmi<=31.3)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=27.7)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=71 && y<=80)
           {
               if(bmi>=22.9 && bmi<=41.1)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=22.9)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
       }
       else
       {
           if(y>=15 && y<=20)
           {
               if(bmi>=23.6 && bmi<=26.0)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=23.6)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=21 && y<=30)
           {
               if(bmi>=24.6 && bmi<=26.2)
               {
                   s = "Your BMI is perfect";                  
               }
               else if(bmi<=24.6)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=31 && y<=40)
           {
               if(bmi>=26.8 && y<=29.0)
               {
                   s = "Your BMI is perfect";
               }
               else if(y<=26.8)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=41 && y<=50)
           {
               if(bmi>=25.7 && bmi<=28.7)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=25.7)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=51 && y<=60)
           {
               if(bmi>=27.5 && bmi<=31.5)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=27.5)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=61 && y<=70)
           {
               if(bmi>=25.6 && bmi<=31.8)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=25.6)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
           else if(y>=71 && y<=80)
           {
               if(bmi>=22.9 && bmi<=41.1)
               {
                   s = "Your BMI is perfect";
               }
               else if(bmi<=22.9)
               {
                   s = "Underweight";
               }
               else
               {
                   s = "Overweight";
               }
           }
       }
        jTextField5.setText(s);
        h k=new h();
       k.jTextField1.setText(this.jTextField5.getText());
       k.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
