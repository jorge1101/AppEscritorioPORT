package Vista;

import static Vista.Departamentos.cn;
import static Vista.Departamentos.rs;
import static Vista.Departamentos.s;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Servicios extends javax.swing.JFrame {
    public Servicios() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonModificarServicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablelista = new javax.swing.JTable();
        jButtonListar = new javax.swing.JButton();
        jTextFieldIdServicioM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValorServicioM = new javax.swing.JTextField();
        jButtonEliminarServicio = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdServicioA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTipoServicioA = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldValorServicioA = new javax.swing.JTextField();
        jButtonAgregarServicio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldServicioB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Servicios");

        jButtonModificarServicio.setText("Modificar Valor");
        jButtonModificarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarServicioActionPerformed(evt);
            }
        });

        jLabel3.setText("Número de Servicio a modificar:");

        jTablelista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número de Servicio", "Tipo de Servicio", "Valor de Servicio"
            }
        ));
        jScrollPane2.setViewportView(jTablelista);

        jButtonListar.setText("Mostrar servicios disponibles");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jTextFieldIdServicioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdServicioMActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor:");

        jTextFieldValorServicioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorServicioMActionPerformed(evt);
            }
        });

        jButtonEliminarServicio.setText("Eliminar Servicio");
        jButtonEliminarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarServicioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Modificar Valor");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Agregar Servicio");

        jLabel9.setText("Número de Servicio:");

        jTextFieldIdServicioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdServicioAActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo de Servicio:");

        jComboBoxTipoServicioA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tour", "transporte"}));
        jComboBoxTipoServicioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoServicioAActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor:");

        jTextFieldValorServicioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorServicioAActionPerformed(evt);
            }
        });

        jButtonAgregarServicio.setText("Agregar");
        jButtonAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarServicioActionPerformed(evt);
            }
        });

        jLabel4.setText("Número de Servicio:");

        jTextFieldServicioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServicioBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListar)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(264, 264, 264)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldIdServicioM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButtonModificarServicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                                .addComponent(jTextFieldValorServicioM, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldIdServicioA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldValorServicioA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jComboBoxTipoServicioA, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jButtonAgregarServicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(82, 82, 82)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButtonEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldServicioB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 19, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jButtonListar)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldIdServicioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldIdServicioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldValorServicioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxTipoServicioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldValorServicioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarServicio)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldServicioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarServicio)
                    .addComponent(jButtonEliminarServicio))
                .addGap(119, 119, 119))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoservicios.png"))); // NOI18N

        jButton1.setText("Menú Administración");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin administracion = new Admin();
        administracion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
                try {
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTablelista.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@localhost:1521/XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "Portafolio", "duoc");
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select * from SERVICIO_EXTRA");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las columnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
             modelo.addRow(fila);
            }
            rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jTextFieldIdServicioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdServicioMActionPerformed
        // TODO add your handling code here:
        String IdServM = jTextFieldIdServicioM.getText();
                     if (IdServM.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo está vacío. Por favor, ingrese un valor.");
        return; // Salir del método si el campo está vacío
    }
             

    }//GEN-LAST:event_jTextFieldIdServicioMActionPerformed

    private void jTextFieldValorServicioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorServicioMActionPerformed
        // TODO add your handling code here:
        String ValorServM = jTextFieldValorServicioM.getText();
    }//GEN-LAST:event_jTextFieldValorServicioMActionPerformed

    private Connection conn;
    public void establecerConexion() {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Portafolio", "duoc");
        } catch (SQLException ex) {
            // Manejo de excepciones, por ejemplo, mostrar un mensaje de error
            ex.printStackTrace();
        }
    }
    
    public void modificarServicio() {
            establecerConexion();
        String sql = "UPDATE SERVICIO_EXTRA SET   valor_servicio = ? where id_servicio='"+jTextFieldIdServicioM.getText()+"'";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Reemplaza los "?" con los valores que deseas modificar
            pstmt.setString(1, jTextFieldValorServicioM.getText());

            // Ejecuta la consulta
            pstmt.executeUpdate();

            // Puedes mostrar un mensaje de éxito aquí
        } catch (SQLException ex) {
            // Manejo de excepciones, por ejemplo, mostrar un mensaje de error
            ex.printStackTrace();
        }
    }
    
    
    private void jButtonModificarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarServicioActionPerformed
        // TODO add your handling code here:
        modificarServicio();
    }//GEN-LAST:event_jButtonModificarServicioActionPerformed

    private void jTextFieldIdServicioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdServicioAActionPerformed
        // TODO add your handling code here:
        String IdServA = jTextFieldIdServicioA.getText();
                     if (IdServA.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo está vacío. Por favor, ingrese un valor.");
        return; // Salir del método si el campo está vacío
    }
             

    }//GEN-LAST:event_jTextFieldIdServicioAActionPerformed

    private void jComboBoxTipoServicioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoServicioAActionPerformed
        // TODO add your handling code here:
            // Obtener el valor seleccionado del JComboBox
    String valorSeleccionado = jComboBoxTipoServicioA.getSelectedItem().toString();
    
    // Mostrar el valor seleccionado en un JTextField (jTextFieldValorServicioA)
    jTextFieldValorServicioA.setText(valorSeleccionado);
    
    }//GEN-LAST:event_jComboBoxTipoServicioAActionPerformed

    private void jTextFieldValorServicioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorServicioAActionPerformed
        // TODO add your handling code here:
        String ValorServA = jTextFieldValorServicioA.getText();
    }//GEN-LAST:event_jTextFieldValorServicioAActionPerformed

    private void jButtonAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarServicioActionPerformed
        // TODO add your handling code here:
               Connection conn = null;
    PreparedStatement pstmt = null;
    int iduser = 2;
    iduser++;
String numeroComoString = "" + iduser;
//try con guardado de datos a clientes
    try {
        // Establecer la conexión a la base de datos
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Portafolio", "duoc");

        // Deshabilitar el modo de confirmación automática
        conn.setAutoCommit(false);

        
        // Consulta SQL para insertar un nuevo usuario en la tabla reserva
        String sqlR = "INSERT INTO SERVICIO_EXTRA (ID_SERVICIO,TIPO_SERVICIO, VALOR_SERVICIO) VALUES (?,?,?)";

        // Crear un PreparedStatement para la consulta
        pstmt = conn.prepareStatement(sqlR);

        // Establecer los valores de los parámetros de cliente
        pstmt.setString(1,  jTextFieldIdServicioA.getText());
        pstmt.setString(2, jComboBoxTipoServicioA.getSelectedItem().toString() );
        pstmt.setString(3, jTextFieldValorServicioA.getText());
        

        // Ejecutar la consulta de inserción
        int filasAfectadasR = pstmt.executeUpdate();

        // Confirmar la transacción si todo está bien
        conn.commit();
        
        //verificacion para tabla SERVICIO
        if (filasAfectadasR > 0) {
            System.out.println("Registro exitoso. Se han insertado " + filasAfectadasR + " fila(s) en la tabla.");
        } else {
            System.out.println("El registro no pudo ser insertado.");
        }
        

    } catch (SQLException e) {
        // Revertir la transacción en caso de error
        try {
            if (conn != null) {
                conn.rollback();
            }
        } catch (SQLException rollbackEx) {
            System.err.println("Error al revertir la transacción: " + rollbackEx.getMessage());
        }

        
        //try con guiardado de datos a reserva
        
        
        
        // Manejo de la excepción
        System.err.println("Error al conectarse a la base de datos: " + e.getMessage());
    } finally {
        
        // Cerrar recursos
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException closeEx) {
            System.err.println("Error al cerrar recursos: " + closeEx.getMessage());
        }
    }
    
    
    }//GEN-LAST:event_jButtonAgregarServicioActionPerformed

    private void jTextFieldServicioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServicioBActionPerformed
        // TODO add your handling code here:
        String IdServB = jTextFieldServicioB.getText();
    }//GEN-LAST:event_jTextFieldServicioBActionPerformed

    public void eliminarServicio() {
   String Servicio = jTextFieldServicioB.getText();
    Connection cn = null;

    try {
        cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "Portafolio", "duoc");
        String sql = "DELETE FROM SERVICIO_EXTRA WHERE id_servicio=?";
        PreparedStatement elim = cn.prepareStatement(sql);
        elim.setString(1, Servicio);
        int filasAfectadas = elim.executeUpdate();
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            // Manejar el error de cierre de conexión si es necesario
        }
    }
}
    
    private void jButtonEliminarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarServicioActionPerformed
        // TODO add your handling code here:
        eliminarServicio();
    }//GEN-LAST:event_jButtonEliminarServicioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarServicio;
    private javax.swing.JButton jButtonEliminarServicio;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonModificarServicio;
    private javax.swing.JComboBox<String> jComboBoxTipoServicioA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablelista;
    private javax.swing.JTextField jTextFieldIdServicioA;
    private javax.swing.JTextField jTextFieldIdServicioM;
    private javax.swing.JTextField jTextFieldServicioB;
    private javax.swing.JTextField jTextFieldValorServicioA;
    private javax.swing.JTextField jTextFieldValorServicioM;
    // End of variables declaration//GEN-END:variables
}
