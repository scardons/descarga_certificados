
package descargas;

import java.io.IOException;
import java.net.URISyntaxException;


public class descarga extends javax.swing.JFrame {


    public descarga() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnSisben = new javax.swing.JButton();
        btnColpensiones = new javax.swing.JButton();
        btnProcuraduria = new javax.swing.JButton();
        btnContraloria = new javax.swing.JButton();
        btnPolicia = new javax.swing.JButton();
        btnTradicion = new javax.swing.JButton();
        btnRut = new javax.swing.JButton();
        btnSura = new javax.swing.JButton();
        btnAsopagos = new javax.swing.JButton();
        btnEpm = new javax.swing.JButton();
        btnPorvenir = new javax.swing.JButton();
        btnCitasRut = new javax.swing.JButton();
        btnTranscripcion = new javax.swing.JButton();
        btnAdilab = new javax.swing.JButton();
        btnAdilab1 = new javax.swing.JButton();
        btnProdiacnostico = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(153, 255, 0));

        jPanel2.setBackground(new java.awt.Color(153, 255, 0));

        jTextPane1.setBackground(new java.awt.Color(204, 0, 204));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextPane1.setText("ELIGE TU CERTIFICADO A DESCARGAR");
        jScrollPane1.setViewportView(jTextPane1);

        btnSisben.setBackground(new java.awt.Color(255, 204, 255));
        btnSisben.setForeground(new java.awt.Color(0, 0, 0));
        btnSisben.setText("Certificado de Adress(sisben)");
        btnSisben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisbenActionPerformed(evt);
            }
        });

        btnColpensiones.setBackground(new java.awt.Color(255, 204, 255));
        btnColpensiones.setForeground(new java.awt.Color(0, 0, 0));
        btnColpensiones.setText("Certificado de Colpensiones");
        btnColpensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColpensionesActionPerformed(evt);
            }
        });

        btnProcuraduria.setBackground(new java.awt.Color(255, 204, 255));
        btnProcuraduria.setForeground(new java.awt.Color(0, 0, 0));
        btnProcuraduria.setText("Certificado de Procuraduria");
        btnProcuraduria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcuraduriaActionPerformed(evt);
            }
        });

        btnContraloria.setBackground(new java.awt.Color(255, 204, 255));
        btnContraloria.setForeground(new java.awt.Color(0, 0, 0));
        btnContraloria.setText("Certificado de Contraloria");
        btnContraloria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraloriaActionPerformed(evt);
            }
        });

        btnPolicia.setBackground(new java.awt.Color(255, 204, 255));
        btnPolicia.setForeground(new java.awt.Color(0, 0, 0));
        btnPolicia.setText("Certificado de la policia");
        btnPolicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliciaActionPerformed(evt);
            }
        });

        btnTradicion.setBackground(new java.awt.Color(255, 204, 255));
        btnTradicion.setForeground(new java.awt.Color(0, 0, 0));
        btnTradicion.setText("Certificado de tradicion y libertad");
        btnTradicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTradicionActionPerformed(evt);
            }
        });

        btnRut.setBackground(new java.awt.Color(255, 204, 255));
        btnRut.setForeground(new java.awt.Color(0, 0, 0));
        btnRut.setText("Creacion de Rut");
        btnRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutActionPerformed(evt);
            }
        });

        btnSura.setBackground(new java.awt.Color(255, 204, 255));
        btnSura.setForeground(new java.awt.Color(0, 0, 0));
        btnSura.setText("Certificado de Sura");
        btnSura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuraActionPerformed(evt);
            }
        });

        btnAsopagos.setBackground(new java.awt.Color(255, 204, 255));
        btnAsopagos.setForeground(new java.awt.Color(0, 0, 0));
        btnAsopagos.setText("Certificados Asopagos liquidacion");
        btnAsopagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsopagosActionPerformed(evt);
            }
        });

        btnEpm.setBackground(new java.awt.Color(255, 204, 255));
        btnEpm.setForeground(new java.awt.Color(0, 0, 0));
        btnEpm.setText("Factura de epm copia");
        btnEpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEpmActionPerformed(evt);
            }
        });

        btnPorvenir.setBackground(new java.awt.Color(255, 204, 255));
        btnPorvenir.setForeground(new java.awt.Color(0, 0, 0));
        btnPorvenir.setText("Certificado de porvenir");
        btnPorvenir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorvenirActionPerformed(evt);
            }
        });

        btnCitasRut.setBackground(new java.awt.Color(255, 204, 255));
        btnCitasRut.setForeground(new java.awt.Color(0, 0, 0));
        btnCitasRut.setText("Solicitud de Citas Rut");
        btnCitasRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasRutActionPerformed(evt);
            }
        });

        btnTranscripcion.setBackground(new java.awt.Color(255, 204, 255));
        btnTranscripcion.setForeground(new java.awt.Color(0, 0, 0));
        btnTranscripcion.setText("Transcripcion de incapacidad sura");
        btnTranscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscripcionActionPerformed(evt);
            }
        });

        btnAdilab.setBackground(new java.awt.Color(255, 204, 255));
        btnAdilab.setForeground(new java.awt.Color(0, 0, 0));
        btnAdilab.setText("Resultados de Adilab");
        btnAdilab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdilabActionPerformed(evt);
            }
        });

        btnAdilab1.setBackground(new java.awt.Color(255, 204, 255));
        btnAdilab1.setForeground(new java.awt.Color(0, 0, 0));
        btnAdilab1.setText(".");
        btnAdilab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdilab1ActionPerformed(evt);
            }
        });

        btnProdiacnostico.setBackground(new java.awt.Color(255, 204, 255));
        btnProdiacnostico.setForeground(new java.awt.Color(0, 0, 0));
        btnProdiacnostico.setText("Resultados prodiacnostico");
        btnProdiacnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdiacnosticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdilab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTranscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTradicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSisben, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnColpensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPolicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProcuraduria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnContraloria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCitasRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPorvenir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAsopagos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEpm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProdiacnostico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdilab1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSisben)
                        .addGap(18, 18, 18)
                        .addComponent(btnColpensiones)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcuraduria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnContraloria)
                        .addGap(18, 18, 18)
                        .addComponent(btnPolicia)
                        .addGap(18, 18, 18)
                        .addComponent(btnTradicion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRut)
                        .addGap(18, 18, 18)
                        .addComponent(btnSura)
                        .addGap(18, 18, 18)
                        .addComponent(btnAsopagos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEpm)
                        .addGap(18, 18, 18)
                        .addComponent(btnPorvenir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCitasRut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTranscripcion)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdilab))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnProdiacnostico)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdilab1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSisbenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisbenActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.adres.gov.co/consulte-su-eps");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnSisbenActionPerformed

    private void btnColpensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColpensionesActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://sede.colpensiones.gov.co/tramite/updInfo/2/");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnColpensionesActionPerformed

    private void btnProcuraduriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcuraduriaActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.procuraduria.gov.co/Pages/Generacion-de-antecedentes.aspx");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnProcuraduriaActionPerformed

    private void btnContraloriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraloriaActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.contraloria.gov.co/web/guest/persona-natural");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnContraloriaActionPerformed

    private void btnPoliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliciaActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://antecedentes.policia.gov.co:7005/WebJudicial/antecedentes.xhtml");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnPoliciaActionPerformed

    private void btnTradicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTradicionActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://certificados.supernotariado.gov.co/certificado");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnTradicionActionPerformed

    private void btnRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://muisca.dian.gov.co/WebRutVirtualInscripcion/#/proceso-guiado/inicio");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnRutActionPerformed

    private void btnSuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuraActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://login.sura.com/sso/servicelogin.aspx?continueTo=https%3A%2F%2Fportaleps.epssura.com%2FServiciosUnClick%2F&service=epssura");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnSuraActionPerformed

    private void btnAsopagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsopagosActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.enlace-apb.com/interssi/descargarCertificacionPago.jsp");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnAsopagosActionPerformed

    private void btnEpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEpmActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.epm.com.co/clientesyusuarios/servicio-al-cliente/tu-factura/");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnEpmActionPerformed

    private void btnPorvenirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorvenirActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.porvenir.com.co/web/certificados-y-extractos/certificado-de-afiliacion");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnPorvenirActionPerformed

    private void btnCitasRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasRutActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://agendamientodigiturno.dian.gov.co/Player.aspx?recurso=NavegacionDian");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnCitasRutActionPerformed

    private void btnTranscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscripcionActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.epssura.com/transcribir-incapacidad");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
        
    }//GEN-LAST:event_btnTranscripcionActionPerformed

    private void btnAdilabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdilabActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://resultados.adilab.co:8081/PublicacionResultadosDBWinsislabJavaEnvironment/servlet/com.publicacionresultadosdbwinsislab.resultados.webpanellogin");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnAdilabActionPerformed

    private void btnAdilab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdilab1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdilab1ActionPerformed

    private void btnProdiacnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdiacnosticoActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri= new java.net.URI("https://www.prodiagnostico.com/Resultados/index.html");
                desktop.browse(uri);
            }catch(URISyntaxException | IOException ex){}
            
            }
        }
    }//GEN-LAST:event_btnProdiacnosticoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdilab;
    private javax.swing.JButton btnAdilab1;
    private javax.swing.JButton btnAsopagos;
    private javax.swing.JButton btnCitasRut;
    private javax.swing.JButton btnColpensiones;
    private javax.swing.JButton btnContraloria;
    private javax.swing.JButton btnEpm;
    private javax.swing.JButton btnPolicia;
    private javax.swing.JButton btnPorvenir;
    private javax.swing.JButton btnProcuraduria;
    private javax.swing.JButton btnProdiacnostico;
    private javax.swing.JButton btnRut;
    private javax.swing.JButton btnSisben;
    private javax.swing.JButton btnSura;
    private javax.swing.JButton btnTradicion;
    private javax.swing.JButton btnTranscripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
