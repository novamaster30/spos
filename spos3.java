Import javax.swing.JTextField;

Public class spos3 extends javax.swing.JFrame {
    Private Object Interger;
    Private Object JTextField2;
    Private Object JTextField1;
    Private Object JTextField3;
    Private float c;
    
    Public spos3() {
        initComponents();
    }
                             
    Private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setText(“NUM 1  =”);
        jLabel2.setText(“NUM 2  =”);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jButton1.setText(“ADD”);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel3.setText(“RESULT  =”);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(jTextField2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        Layout.setVerticalGroup(
            Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        Pack();
    }// </editor-fold>                        
    Private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           
    Private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
jTextField1.getText();
jTextField2.getText();
int a,b;
a=Integer.parseInt(jTextField1.getText());
b=Integer.parseInt(jTextField2.getText());
       
        int c = a+b;
jTextField3.setText(“ “+c);

    }                                        
    Private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    Public static void main(String args[]) {
        Try {
            For (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                If (“Nimbus”.equals(info.getName())) {
                    Javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    Break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Java.util.logging.Logger.getLogger(spos3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Java.util.logging.Logger.getLogger(spos3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Java.util.logging.Logger.getLogger(spos3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Java.util.logging.Logger.getLogger(spos3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        Java.awt.EventQueue.invokeLater(new Runnable() {
            Public void run() {
                New spos3().setVisible(true);
            }
        });
    }
                      
    Private javax.swing.JButton jButton1;
    Private javax.swing.JLabel jLabel1;
    Private javax.swing.JLabel jLabel2;
    Private javax.swing.JLabel jLabel3;
    Private javax.swing.JTextField jTextField1;
    Private javax.swing.JTextField jTextField2;
    Private javax.swing.JTextField jTextField3;
                   
}
