package Vista;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresarFunc = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login4.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Password");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnIngresarFunc.setBackground(new java.awt.Color(51, 51, 255));
        btnIngresarFunc.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarFunc.setText("Iniciar Sesion");
        btnIngresarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFuncActionPerformed(evt);
            }
        });

        btnCrear.setText("Registrarse");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtContrasenia)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnIngresarFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnIngresarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrear)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 410, 530));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo1.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Hotelería y Turismo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel7)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 610));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 370, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFuncActionPerformed


    // Realiza la autenticación (aquí debes implementar tu lógica de autenticación)
    boolean autenticado = autenticarUsuario(txtUsuario.getText(), txtContrasenia.getText());
    
    // Verifica si la autenticación fue exitosa
    if (autenticado=true) {
        // Si el usuario es autenticado, puedes redirigirlo a otra ventana o realizar las acciones que necesites.
        // Por ejemplo, aquí simplemente mostramos un mensaje de éxito.
        JOptionPane.showMessageDialog(this, "Inicio de sesión");
            // Hacer visible la nueva vista (Vista2)




    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
        // Conexión a la base de datos
        

        // Consulta SQL para verificar la autenticación del usuario
        String sql = "SELECT tipo_usuario FROM CREDENCIALES_USUARIOS WHERE nombre_usuario = ? AND contraseña = ?";
        
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Portafolio", "duoc");
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, txtUsuario.getText());
        pstmt.setString(2, txtContrasenia.getText());
        rs = pstmt.executeQuery();

        if (rs.next()) {
            String tipoUsuario = rs.getString("tipo_usuario");

            // Redirige según el tipo de usuario
            if ("trabajador".equals(tipoUsuario)) {
                Funcionario trabajador = new Funcionario();
                trabajador.setVisible(true);
                this.dispose();
            } else if ("recepcionista".equals(tipoUsuario) || "cliente".equals(tipoUsuario)) {
                Disponibilidad deptos = new Disponibilidad();
                deptos.setVisible(true);
                this.dispose();
            } else if ("administrador".equals(tipoUsuario)) {
                Admin administrador = new Admin();
                administrador.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Tipo de usuario desconocido");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    } catch (SQLException e) {
        // Manejo de excepciones de SQL
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la autenticación"+ e.getMessage());
    } finally {
        // Cerrar recursos y conexión
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}

// Implementa tu lógica de autenticación aquí
private boolean autenticarUsuario(String usuario, String contrasenia) {
    // Aquí debes verificar si el usuario y la contraseña son válidos.
    // Puedes consultar una base de datos, comparar con credenciales almacenadas, etc.
    // Devuelve true si la autenticación es exitosa, o false si falla.
    
    // Ejemplo de autenticación básica (solo para fines demostrativos):
    return usuario.equals("usuarioDemo") && contrasenia.equals("contraseniaDemo");

    }//GEN-LAST:event_btnIngresarFuncActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        CrearUsuario crear = new CrearUsuario();
        
        crear.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
        String Usuario = txtUsuario.getText();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
  char[] contraseniaArray = txtContrasenia.getPassword();
    // Convertir el array de caracteres a una cadena de caracteres
    String contrasenia = String.valueOf(contraseniaArray);

    // Verificar si la longitud es al menos 8 caracteres
    if (contrasenia.length() < 8) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres.");
        // Borrar el contenido del campo de contraseña
        txtContrasenia.setText("");
        return; // Salir del método si no cumple con la longitud mínima
    }

    // Contador para llevar un registro de letras en la contraseña
    int letrasCount = 0;

    // Verificar la cantidad de letras en la contraseña
    for (char c : contraseniaArray) {
        if (Character.isLetter(c)) {
            letrasCount++;
        }
    }

    // Verificar si hay al menos 4 letras en la contraseña
    if (letrasCount < 4) {
        JOptionPane.showMessageDialog(this, "La contraseña debe contener al menos 4 letras.");
        // Borrar el contenido del campo de contraseña
        txtContrasenia.setText("");
        return; // Salir del método si no cumple con la cantidad mínima de letras
    }
    }//GEN-LAST:event_txtContraseniaActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnIngresarFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
