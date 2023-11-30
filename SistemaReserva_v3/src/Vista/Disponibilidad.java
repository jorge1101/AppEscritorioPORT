package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Disponibilidad extends javax.swing.JFrame {
    
     //creando variables
    static Connection cn;
    static Statement s;
    static ResultSet rs;
    
    public Disponibilidad() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonDisponible = new javax.swing.JButton();
        jButtonNoDisponible = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIdNoDisp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFechaIniNoDisp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFechaFinNoDispo = new javax.swing.JTextField();
        jTextFieldRutClienteNoDispo = new javax.swing.JTextField();
        jTextFieldTrabajador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logodispo.png"))); // NOI18N

        btnMostrar.setText("Mostrar Disponibilidad de Departamentos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jButtonDisponible.setText("Marcar Disponible");
        jButtonDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisponibleActionPerformed(evt);
            }
        });

        jButtonNoDisponible.setText("Marcar NO Disponible");
        jButtonNoDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoDisponibleActionPerformed(evt);
            }
        });

        jButton3.setText("Menú Administración");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Id Reserva:");

        jTextFieldIdNoDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdNoDispActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha Reserva:");

        jTextFieldFechaIniNoDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaIniNoDispActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha Fin Reserva:");

        jTextFieldFechaFinNoDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaFinNoDispoActionPerformed(evt);
            }
        });

        jTextFieldRutClienteNoDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRutClienteNoDispoActionPerformed(evt);
            }
        });

        jTextFieldTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTrabajadorActionPerformed(evt);
            }
        });

        jLabel10.setText("Rut cliente:");

        jLabel11.setText("Numero Trabajador:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMostrar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(444, 444, 444)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldIdNoDisp)
                                    .addComponent(jTextFieldFechaIniNoDisp)
                                    .addComponent(jTextFieldFechaFinNoDispo)
                                    .addComponent(jTextFieldRutClienteNoDispo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTrabajador, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButtonNoDisponible)
                                .addGap(35, 35, 35)
                                .addComponent(jButtonDisponible)
                                .addGap(69, 69, 69)))
                        .addGap(353, 353, 353)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldIdNoDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldFechaIniNoDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldFechaFinNoDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRutClienteNoDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDisponible)
                            .addComponent(jButtonNoDisponible))))
                .addGap(25, 25, 25))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Admin sis = new Admin();       
        sis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
try {
    DefaultTableModel modelo = new DefaultTableModel();
    this.jTable1.setModel(modelo);

            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@localhost:1521/XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "Portafolio", "duoc");
            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select * from reserva");
    rs = s.executeQuery("select * from reserva");

    ResultSetMetaData rsMd = rs.getMetaData();
    int cantidadColumnas = rsMd.getColumnCount();

    for (int i = 1; i <= cantidadColumnas; i++) {
        modelo.addColumn(rsMd.getColumnLabel(i));
    }

    while (rs.next()) {
        Object[] fila = new Object[cantidadColumnas];
        for (int i = 0; i < cantidadColumnas; i++) {
            fila[i] = rs.getObject(i + 1);
        }
        modelo.addRow(fila);
    }

    // Ahora resaltar visualmente las celdas ocupadas
for (int fila = 0; fila < modelo.getRowCount(); fila++) {
    // Obtener el valor de la columna "ESTADO_RESERVA" para la fila actual
    Object valorEstadoReserva = modelo.getValueAt(fila, modelo.findColumn("ESTADO_RESERVA"));

    // Comprobar el valor y establecer el color de la fila
    if (valorEstadoReserva != null && valorEstadoReserva.toString().equals("1")) {
        // Fila ocupada (ESTADO_RESERVA = 1), color verde
        for (int columna = 0; columna < modelo.getColumnCount(); columna++) {
            jTable1.setValueAt("<html><font color='red'>" + modelo.getValueAt(fila, columna) + "</font></html>", fila, columna);
        }
    } else {
        // Fila no ocupada (ESTADO_RESERVA = 0 o null), color rojo
        for (int columna = 0; columna < modelo.getColumnCount(); columna++) {
            jTable1.setValueAt("<html><font color='green'>" + modelo.getValueAt(fila, columna) + "</font></html>", fila, columna);
        }
    }
}
    rs.close();
    cn.close();
} catch (Exception ex) {
    ex.printStackTrace();
}
    }//GEN-LAST:event_btnMostrarActionPerformed

    
        private Connection conn;
    public void establecerConexion() {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Portafolio", "duoc");
        } catch (SQLException ex) {
            // Manejo de excepciones, por ejemplo, mostrar un mensaje de error
            ex.printStackTrace();
        }
    }
    
    
    private void jTextFieldIdNoDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdNoDispActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldIdNoDispActionPerformed

    private void jTextFieldFechaIniNoDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaIniNoDispActionPerformed
        // TODO add your handling code here:
        String feciniN = jTextFieldFechaIniNoDisp.getText();
    }//GEN-LAST:event_jTextFieldFechaIniNoDispActionPerformed

    private void jTextFieldFechaFinNoDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaFinNoDispoActionPerformed
        // TODO add your handling code here:
        String fecfinN = jTextFieldFechaFinNoDispo.getText();
    }//GEN-LAST:event_jTextFieldFechaFinNoDispoActionPerformed

    private void jTextFieldRutClienteNoDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRutClienteNoDispoActionPerformed
        // TODO add your handling code here:
        String RutCliente = jTextFieldRutClienteNoDispo.getText();
    }//GEN-LAST:event_jTextFieldRutClienteNoDispoActionPerformed

    private void jTextFieldTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTrabajadorActionPerformed
        // TODO add your handling code here:
        String trabajador = jTextFieldTrabajador.getText();
    }//GEN-LAST:event_jTextFieldTrabajadorActionPerformed

    
    
        public void modificarServicio() {
            establecerConexion();
        String sql = "UPDATE reserva SET   estado_reserva = ?, fec_ini = NULL, fec_ter = NULL, rut_cliente = NULL where id_reserva='"+jTextFieldIdNoDisp.getText()+"'";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Reemplaza los "?" con los valores que deseas modificar
            pstmt.setString(1, "1");

            // Ejecuta la consulta
            pstmt.executeUpdate();

            // Puedes mostrar un mensaje de éxito aquí
        } catch (SQLException ex) {
            // Manejo de excepciones, por ejemplo, mostrar un mensaje de error
            ex.printStackTrace();
        }

            System.out.println("Registro exitoso. La reserva de id: "+jTextFieldIdNoDisp.getText()+" ha sido actualizada");

    }
    
    private void jButtonNoDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoDisponibleActionPerformed
        // TODO add your handling code here:      
    //inovcacion para modificar variable de servicio con los datos 
    modificarServicio();
    }//GEN-LAST:event_jButtonNoDisponibleActionPerformed

    private void jButtonDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisponibleActionPerformed
        // TODO add your handling code here:
               
    Connection conn = null;
    PreparedStatement pstmt = null;
    int iduser = 2;
    iduser++;
String numeroComoString = "" + iduser;
//try con guardado de datos a clientes
try {
    //string conexion
    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Portafolio", "duoc");
    

    //updtate de datos a reserva
    String consultaSQL = "UPDATE reserva SET fec_ini = ?, fec_ter = ?, estado_reserva = ?,  id_trabajador = ?, rut_cliente = ? WHERE id_reserva = ?";
    
    // Crea una declaración preparada
    PreparedStatement preparedStatement2 = conn.prepareStatement(consultaSQL);

    // Establece los valores que deseas actualizar en la base de datos
    preparedStatement2.setString(1, jTextFieldFechaIniNoDisp.getText());
    preparedStatement2.setString(2, jTextFieldFechaFinNoDispo.getText());
    preparedStatement2.setString(3, "0");
    preparedStatement2.setString(4, jTextFieldTrabajador.getText());
    preparedStatement2.setString(5, jTextFieldRutClienteNoDispo.getText());
    preparedStatement2.setString(6, jTextFieldIdNoDisp.getText()); // Aquí se establece el valor de id_reserva 

    // Ejecuta la consulta de actualización
    int filasActualizadas = preparedStatement2.executeUpdate();
    
    if (filasActualizadas > 0) {
        JOptionPane.showMessageDialog(this, "Actualización exitosa");
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró un registro con el ID de reserva proporcionado");
    }
    // Cierra la conexión y la declaración

    preparedStatement2.close();
    conn.close();
} catch (SQLException e) {
    e.printStackTrace();
    // Maneja la excepción de manera apropiada
}




    }//GEN-LAST:event_jButtonDisponibleActionPerformed


    
    private void crearVentana() {
        JFrame frame = new JFrame("Lista de Departamentos Disponibles");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> departamentoList = new JList<>(listModel);

        try {
            // Establecer la conexión a la base de datos (reemplaza con tu URL de conexión, usuario y contraseña)
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "Portafolio", "duoc");

            // Consulta SQL para obtener los departamentos disponibles
            String sql = "SELECT id_reserva,valor_reserva, estado_reserva FROM reserva WHERE estado_reserva = 0";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Agregar los departamentos disponibles a la lista
            while (resultSet.next()) {
                String nombreDepartamento = resultSet.getString("id_reserva");
                listModel.addElement(nombreDepartamento + " (Disponible)");
            }

            // Cerrar la conexión a la base de datos
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Configurar la lista para permitir selección única
        departamentoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Agregar la lista a un JScrollPane y mostrarla en la ventana
        JScrollPane scrollPane = new JScrollPane(departamentoList);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disponibilidad().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDisponible;
    private javax.swing.JButton jButtonNoDisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFechaFinNoDispo;
    private javax.swing.JTextField jTextFieldFechaIniNoDisp;
    private javax.swing.JTextField jTextFieldIdNoDisp;
    private javax.swing.JTextField jTextFieldRutClienteNoDispo;
    private javax.swing.JTextField jTextFieldTrabajador;
    // End of variables declaration//GEN-END:variables
}
