package de.its.sw;

public class GUIZeit extends javax.swing.JFrame {

    Wecker[] uhren = new Radiowecker[2];
    String ausgabe;
    public GUIZeit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAusgeben = new javax.swing.JButton();
        btnSortieren = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAusgabe = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAusgeben.setText("ausgeben");
        btnAusgeben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAusgebenActionPerformed(evt);
            }
        });

        btnSortieren.setText("sortieren");
        btnSortieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortierenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSortieren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAusgeben)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAusgeben)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSortieren)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taAusgabe.setColumns(20);
        taAusgabe.setRows(5);
        jScrollPane2.setViewportView(taAusgabe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAusgebenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAusgebenActionPerformed
        
        Zeit zeit1 = new Zeit(8, 0);
        Zeit zeit2 = new Zeit(10, 30);
        Zeit zeit4 = new Zeit(12, 0);
        Zeit zeit5 = new Zeit(13, 30);

        uhren[0] = new Wecker(zeit1, zeit2);
        uhren[1] = new Radiowecker(zeit4, zeit5, 50);

        for (int i = 0; i < uhren.length - 1; i++) {
            ausgabe = uhren[i].getAusgabe();
            ausgabe = ausgabe + "\n";
        }
        for (int i = 0; i < uhren.length - 1; i++) {
            uhren[i].setSommerzeit(true);
        }
        for (int i = 0; i < uhren.length - 1; i++) {
            ausgabe = uhren[i].getAusgabe();
            ausgabe = ausgabe + "\n";
        }

        taAusgabe.setText(ausgabe);


    }//GEN-LAST:event_btnAusgebenActionPerformed

    private void btnSortierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortierenActionPerformed
        TimeComparator cn = new TimeComparator();
        
        int result = cn.compare(uhren[0].zeit,uhren[1].zeit);
        if(result ==0){
                cn.compare(uhren[0].zeit,uhren[1].zeit);
                }
        taAusgabe.setText(ausgabe);
        
    }//GEN-LAST:event_btnSortierenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAusgeben;
    private javax.swing.JButton btnSortieren;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taAusgabe;
    // End of variables declaration//GEN-END:variables
}
