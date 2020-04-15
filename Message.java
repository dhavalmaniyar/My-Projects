
package hello;

import java.awt.event.WindowEvent;

public class Message extends javax.swing.JFrame {

    public Message(String s) {
        initComponents();
        result.setText(s);
    }
                           
    private void initComponents() {

        yesbtn = new javax.swing.JButton();
        nobtn = new javax.swing.JButton();
        gover = new javax.swing.JLabel();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Message");

        yesbtn.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        yesbtn.setText("Retry");
        yesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesbtnActionPerformed(evt);
            }
        });

        nobtn.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        nobtn.setText("No");
        nobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nobtnActionPerformed(evt);
            }
        });

        gover.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gover.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        gover.setText("GAME OVER !!!");
        gover.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        gover.setName(""); // NOI18N
        gover.setPreferredSize(new java.awt.Dimension(106, 30));

        rSMaterialButtonCircle2.setText("?");
        rSMaterialButtonCircle2.setFocusPainted(false);
        rSMaterialButtonCircle2.setFocusable(false);
        rSMaterialButtonCircle2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        result.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        result.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(yesbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nobtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSMaterialButtonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(result))
                    .addComponent(gover, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSMaterialButtonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesbtn)
                    .addComponent(nobtn))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }                       

    private void nobtnActionPerformed(java.awt.event.ActionEvent evt) {                                      
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }                                     

    private void yesbtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
       this.dispose();
        Game g=new Game();
        g.setVisible(true);
    }                                                        
    private javax.swing.JLabel gover;
    private javax.swing.JButton nobtn;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private javax.swing.JLabel result;
    private javax.swing.JButton yesbtn;
                 
}
