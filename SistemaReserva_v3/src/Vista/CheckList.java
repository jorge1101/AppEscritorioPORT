package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class CheckList extends javax.swing.JFrame {
    public CheckList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldIdDepto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldMicroondas = new javax.swing.JTextField();
        jTextFieldHervidor = new javax.swing.JTextField();
        jTextFieldOtros = new javax.swing.JTextField();
        jTextFieldFreezer = new javax.swing.JTextField();
        jTextFieldTv1 = new javax.swing.JTextField();
        jCheckBoxTv = new javax.swing.JCheckBox();
        jCheckBoxAmoblado = new javax.swing.JCheckBox();
        jCheckBoxCalefaccion = new javax.swing.JCheckBox();
        jCheckBoxInternet = new javax.swing.JCheckBox();
        jCheckBoxElectrodomesticos = new javax.swing.JCheckBox();
        jButtonChecklist = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonIngresarEstado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jCheckBox4.setText("Si");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/checklist.png"))); // NOI18N

        jButton1.setText("Menú Funcionario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Adquisición de Nuevo Departamento");

        jLabel6.setText("Amoblado:");

        jLabel7.setText("TV Cable:");

        jLabel8.setText("Internet:");

        jLabel9.setText("Calefacción:");

        jLabel10.setText("Ingresar ID de Departamento:");

        jTextFieldIdDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdDeptoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Informar Estado de Departamento (Post CHECK-OUT)");

        jLabel12.setText("Controles de TV, calefacción, etc.");

        jLabel13.setText("Frazadas, sábanas, etc.");

        jLabel14.setText("Microondas");

        jLabel15.setText("Hervidor");

        jLabel16.setText("Refrigerador");

        jLabel17.setText("Electrodomésticos:");

        jTextFieldMicroondas.setText("Si no hay problemas dejar nulo");
        jTextFieldMicroondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMicroondasActionPerformed(evt);
            }
        });

        jTextFieldHervidor.setText("Si no hay problemas dejar nulo");
        jTextFieldHervidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHervidorActionPerformed(evt);
            }
        });

        jTextFieldOtros.setText("Si no hay problemas dejar nulo");
        jTextFieldOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOtrosActionPerformed(evt);
            }
        });

        jTextFieldFreezer.setText("Si no hay problemas dejar nulo");
        jTextFieldFreezer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFreezerActionPerformed(evt);
            }
        });

        jTextFieldTv1.setText("Si no hay problemas dejar nulo");
        jTextFieldTv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTv1ActionPerformed(evt);
            }
        });

        jCheckBoxTv.setText("Si");
        jCheckBoxTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTvActionPerformed(evt);
            }
        });

        jCheckBoxAmoblado.setText("Si");
        jCheckBoxAmoblado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAmobladoActionPerformed(evt);
            }
        });

        jCheckBoxCalefaccion.setText("Si");
        jCheckBoxCalefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCalefaccionActionPerformed(evt);
            }
        });

        jCheckBoxInternet.setText("Si");
        jCheckBoxInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInternetActionPerformed(evt);
            }
        });

        jCheckBoxElectrodomesticos.setText("Si");
        jCheckBoxElectrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxElectrodomesticosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBoxAmoblado))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBoxTv)))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxInternet)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jCheckBoxCalefaccion)
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel17)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBoxElectrodomesticos)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIdDepto))
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldTv1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldOtros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)))))
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldHervidor, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFreezer, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldIdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCheckBoxTv))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addComponent(jCheckBoxCalefaccion)
                            .addComponent(jCheckBoxElectrodomesticos))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBoxAmoblado)
                            .addComponent(jLabel8)
                            .addComponent(jCheckBoxInternet))))
                .addGap(142, 142, 142)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldTv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldHervidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFreezer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        jButtonChecklist.setText("Ingresar CHECK LIST");
        jButtonChecklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChecklistActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingreso de nuevo departamento");

        jButtonIngresarEstado.setText("Ingresar Estado ");
        jButtonIngresarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarEstadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado de departamento");

        jLabel4.setText("luego de check-out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonChecklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIngresarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButtonChecklist, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(131, 131, 131)
                .addComponent(jButtonIngresarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Funcionario func = new Funcionario();       
        func.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonIngresarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarEstadoActionPerformed
        // TODO add your handling code here:
                // Aqui se inserta la funcion que guardara todo lo seleccionado 
               
            // conexión a base de datos (
            Connection conn = null;
            PreparedStatement pstmt = null;

            // Consulta para guardar datos


            try {
                //string conexion
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Portafolio", "duoc");
                String consultaSQL = "INSERT INTO estado_depto (id_estado,tv_estado,microondas_estado,refrigerador_estado,frazadas_otros,hervidor_estado) VALUES (?,?,?,?,?,?)";
                // Crea una declaración preparada
                PreparedStatement preparedStatement = conn.prepareStatement(consultaSQL);

                // Establece el valor que deseas guardar en la base de datos
                preparedStatement.setString(1, jTextFieldIdDepto.getText());
                preparedStatement.setString(2, jTextFieldTv1.getText());
                preparedStatement.setString(3, jTextFieldMicroondas.getText());
                preparedStatement.setString(4, jTextFieldFreezer.getText());
                preparedStatement.setString(5, jTextFieldOtros.getText());
                preparedStatement.setString(6, jTextFieldHervidor.getText());
                // Ejecuta la consulta
                preparedStatement.executeUpdate();
 JOptionPane.showMessageDialog(this, "ingreso de estado exitoso");
                // Cierra la conexión y la declaración
                preparedStatement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Maneja la excepción de manera apropiada
            }
     
    }//GEN-LAST:event_jButtonIngresarEstadoActionPerformed

   
    private void jButtonChecklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChecklistActionPerformed
    // conexión a la base de datos
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    // Obtener el ID del checklist
    int idChecklist = obtenerProximoID(); // Función para obtener el próximo ID desde la base de datos
    
    // Validar y obtener valores de los JCheckBox
    int tvcable = jCheckBoxTv.isSelected() ? 1 : 0;
    int calefaccion = jCheckBoxCalefaccion.isSelected() ? 1 : 0;
    int electrodomesticos = jCheckBoxElectrodomesticos.isSelected() ? 1 : 0;
    int amoblado = jCheckBoxAmoblado.isSelected() ? 1 : 0;
    int internet = jCheckBoxInternet.isSelected() ? 1 : 0;

    try {
        // Establecer la conexión a la base de datos
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Portafolio", "duoc");
        
        String consultaSQL2 = "INSERT INTO CHECKLIST (id_checklist, tvcable, calefaccion, electrodomesticos, amoblado, internet) VALUES (?, ?, ?, ?, ?, ?)";
        
        // Crear una declaración preparada
        PreparedStatement preparedStatement = conn.prepareStatement(consultaSQL2);
        
        // Establecer los valores que deseas guardar en la base de datos
        preparedStatement.setInt(1, idChecklist); // ID del checklist
        preparedStatement.setInt(2, tvcable);
        preparedStatement.setInt(3, calefaccion);
        preparedStatement.setInt(4, electrodomesticos);
        preparedStatement.setInt(5, amoblado);
        preparedStatement.setInt(6, internet);
        
        // Ejecutar la consulta
        preparedStatement.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Ingreso de checklist exitoso");
        
        // Cerrar la conexión y la declaración
        preparedStatement.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        // Manejar la excepción de manera apropiada
    }
}

// Función para obtener el próximo ID desde la base de datos
private int obtenerProximoID() {
    int proximoID = 0;
    // Realiza la consulta para obtener el próximo ID desde la base de datos
    // Esto puede variar según tu base de datos específica
    // Deberías implementar esta función para tu base de datos
    // Aquí, asumimos que obtienes el próximo ID de alguna manera
    // Puedes reemplazar esto con tu lógica de obtención de ID
    // Ejemplo: SELECT MAX(id_checklist) + 1 FROM CHECKLIST
    // Asigna el valor obtenido a proximoID
    return proximoID;
    }//GEN-LAST:event_jButtonChecklistActionPerformed

    private void jTextFieldFreezerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFreezerActionPerformed
        // TODO add your handling code here:
        String Refrigerador = jTextFieldFreezer.getText();
        
    }//GEN-LAST:event_jTextFieldFreezerActionPerformed

    private void jTextFieldMicroondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMicroondasActionPerformed
        // TODO add your handling code here:
        String Micro = jTextFieldMicroondas.getText();
    }//GEN-LAST:event_jTextFieldMicroondasActionPerformed

    private void jTextFieldHervidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHervidorActionPerformed
        // TODO add your handling code here:
        String Hervidor = jTextFieldHervidor.getText();
    }//GEN-LAST:event_jTextFieldHervidorActionPerformed

    private void jTextFieldOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOtrosActionPerformed
        // TODO add your handling code here:
        String FrazadaOtros = jTextFieldOtros.getText();
    }//GEN-LAST:event_jTextFieldOtrosActionPerformed

    private void jTextFieldTv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTv1ActionPerformed
        // TODO add your handling code here:
        String TvEstado = jTextFieldTv1.getText();
    }//GEN-LAST:event_jTextFieldTv1ActionPerformed

    private void jCheckBoxTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTvActionPerformed
        // TODO add your handling code here:
if (jCheckBoxTv.isSelected()) {

    try {
    String tvTexto = jCheckBoxTv.getText();
    int tv = 1; // Valor por defecto
    if (!tvTexto.isEmpty()) {
        tv = Integer.parseInt(tvTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}
    
} else {
    try {
    String tvTexto = jCheckBoxTv.getText();
    int tv = 2; // Valor por defecto
    if (!tvTexto.isEmpty()) {
        tv = Integer.parseInt(tvTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}
}
    }//GEN-LAST:event_jCheckBoxTvActionPerformed

    private void jTextFieldIdDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdDeptoActionPerformed
        // TODO add your handling code here:
        String idDepto = jTextFieldIdDepto.getText();
                     if (idDepto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo está vacío. Por favor, ingrese un valor.");
        return; // Salir del método si el campo está vacío
    }
    }//GEN-LAST:event_jTextFieldIdDeptoActionPerformed

    private void jCheckBoxAmobladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAmobladoActionPerformed
        // TODO add your handling code here:
if (jCheckBoxAmoblado.isSelected()) {

try {
    String AmobladoTexto = jCheckBoxAmoblado.getText();
    int Amoblado = 1; // Valor por defecto
    if (!AmobladoTexto.isEmpty()) {
        Amoblado = Integer.parseInt(AmobladoTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}

  } else {
try {
    String AmobladoTexto = jCheckBoxAmoblado.getText();
    int Amoblado = 2; // Valor por defecto
    if (!AmobladoTexto.isEmpty()) {
        Amoblado = Integer.parseInt(AmobladoTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}
}
    }//GEN-LAST:event_jCheckBoxAmobladoActionPerformed

    private void jCheckBoxCalefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCalefaccionActionPerformed
        // TODO add your handling code here:
if (jCheckBoxCalefaccion.isSelected()) {

try {
    String calefaxionTexto = jCheckBoxCalefaccion.getText();
    int Calefaccion = 1; // Valor por defecto
    if (!calefaxionTexto.isEmpty()) {
        Calefaccion = Integer.parseInt(calefaxionTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}
                     
} else {
try {
    String calefaxionTexto = jCheckBoxCalefaccion.getText();
    int Calefaccion = 2; // Valor por defecto
    if (!calefaxionTexto.isEmpty()) {
        Calefaccion = Integer.parseInt(calefaxionTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}
}
    }//GEN-LAST:event_jCheckBoxCalefaccionActionPerformed

    private void jCheckBoxInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxInternetActionPerformed
        // TODO add your handling code here:
if (jCheckBoxInternet.isSelected()) {

try {
    String InternetTexto = jCheckBoxInternet.getText();
    int Internet = 1; // Valor por defecto
    if (!InternetTexto.isEmpty()) {
        Internet = Integer.parseInt(InternetTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
} 
    
} else {
try {
    String InternetTexto = jCheckBoxInternet.getText();
    int Internet = 2; // Valor por defecto
    if (!InternetTexto.isEmpty()) {
        Internet = Integer.parseInt(InternetTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}
}
    }//GEN-LAST:event_jCheckBoxInternetActionPerformed

    private void jCheckBoxElectrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxElectrodomesticosActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxElectrodomesticos.isSelected()) {

         try {
    String ElectroTexto = jCheckBoxElectrodomesticos.getText();
    int Electo = 1; // Valor por defecto
    if (!ElectroTexto.isEmpty()) {
        Electo = Integer.parseInt(ElectroTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}   
            
}else {
         try {
    String ElectroTexto = jCheckBoxElectrodomesticos.getText();
    int Electo = 2; // Valor por defecto
    if (!ElectroTexto.isEmpty()) {
        Electo = Integer.parseInt(ElectroTexto);
    }
    // Ahora puedes usar la variable TvEstado como un entero, que será 1 si el campo de texto estaba vacío o no contenía un número válido.
} catch (NumberFormatException e) {
    // Manejo de excepción en caso de que el texto no sea un número válido.
    // Aquí puedes mostrar un mensaje de error o tomar otras medidas.
}        
}
    }//GEN-LAST:event_jCheckBoxElectrodomesticosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonChecklist;
    private javax.swing.JButton jButtonIngresarEstado;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBoxAmoblado;
    private javax.swing.JCheckBox jCheckBoxCalefaccion;
    private javax.swing.JCheckBox jCheckBoxElectrodomesticos;
    private javax.swing.JCheckBox jCheckBoxInternet;
    private javax.swing.JCheckBox jCheckBoxTv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldFreezer;
    private javax.swing.JTextField jTextFieldHervidor;
    private javax.swing.JTextField jTextFieldIdDepto;
    private javax.swing.JTextField jTextFieldMicroondas;
    private javax.swing.JTextField jTextFieldOtros;
    private javax.swing.JTextField jTextFieldTv1;
    // End of variables declaration//GEN-END:variables
}
