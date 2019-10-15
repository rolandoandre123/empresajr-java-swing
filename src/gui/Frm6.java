/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import conn.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rolando Andre
 */
public class Frm6 extends javax.swing.JFrame {

    /**
     * Creates new form Frm6
     */
    private String dni;
    //private TableRowSorter rst;
    private DefaultTableModel modelo1=new DefaultTableModel();
    
    public Frm6() {
        initComponents();
        tabla.setModel(modelo1);
        cargarTabla();
        cargar_combo();
    }

    public void cargar_combo(){
        Connection cn=null;
        Statement st=null;
        try{
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs=st.executeQuery("select descripcion from dbo.FUNCION");
            
            while(rs.next()){
                cbo_funcion.addItem(rs.getString(1));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
        }
    }
    
    public void cargarTabla(){
        modelo1.setColumnCount(0);
        modelo1.setRowCount(0);
        rellenar_tabla();
    }
    
    public void rellenar_tabla(){
        this.dni=null;
        Connection cn=null;
        Statement st=null;
        try{
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs=st.executeQuery("select apellido as APELLIDO,nombre as NOMBRE,direccion as DIRECCION,telefono as TELEFONO,F.DESCRIPCION as FUNCION,convert(varchar,fecha_nac,105) as FECHA_NAC,correo as CORREO,dni as DNI,nacionalidad as NACIONALIDAD from dbo.EMPLEADO E,dbo.FUNCION F where E.COD_FUNCION=F.COD_FUNCION order by APELLIDO asc");
            
            ResultSetMetaData md=rs.getMetaData();
            int cantidad_columnas=md.getColumnCount();   
            for(int i=1;i<=cantidad_columnas;i++){
                modelo1.addColumn(md.getColumnLabel(i));
            }
            
            while(rs.next()){
                Object[] fila=new Object[cantidad_columnas];
                for(int i=0;i<cantidad_columnas;i++){
                    fila[i]=rs.getObject(i+1);
                }
                modelo1.addRow(fila);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_buscarPorCodigoEstilo = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        txt_telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_listar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_nacionalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbo_funcion = new javax.swing.JComboBox();
        txt_estilo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mantenimiento de Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        btn_buscarPorCodigoEstilo.setText("Buscar por código de estilo");
        btn_buscarPorCodigoEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPorCodigoEstiloActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscarPorCodigoEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 130, 30));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 130, 30));

        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, 940, 244));

        jLabel8.setText("Correo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 270, -1, -1));

        jLabel4.setText("Dirección:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, -1, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 270, 173, -1));

        jLabel5.setText("Teléfono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, -1, -1));

        jLabel7.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, -1, -1));

        jLabel10.setText("Dni:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, -1, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, 173, -1));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 173, -1));
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 173, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 120, 173, -1));
        getContentPane().add(txt_fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 173, -1));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, 173, -1));

        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, -1, 20));

        jLabel3.setText("Nombres:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, -1, -1));

        btn_listar.setText("Listar");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 120, 30));

        jLabel11.setText("Nacionalidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 330, -1, -1));
        getContentPane().add(txt_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 173, -1));

        jLabel6.setText("Cargo/Función:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, -1, -1));

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 130, 30));

        cbo_funcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".................." }));
        getContentPane().add(cbo_funcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 210, -1, -1));
        getContentPane().add(txt_estilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 130, -1));

        jMenu1.setText("Option");

        menuitem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, 0));
        menuitem1.setText("Regresar");
        menuitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem1ActionPerformed(evt);
            }
        });
        jMenu1.add(menuitem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarPorCodigoEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPorCodigoEstiloActionPerformed
        Connection cn=null;
        Statement st=null;
        try{
            String codigo_estilo=txt_estilo.getText().toUpperCase().trim();
            
            if(!codigo_estilo.equalsIgnoreCase("")){
                if(Validacion.existe_codigo_estilo(codigo_estilo)){
                    int cantidad_filas=0;
                    cn=Conection.getConnection();
                    st=cn.createStatement();

                    ResultSet rs2=st.executeQuery("select count(*) from dbo.FICHA_TECNICA F,dbo.EMPLEADO_FICHA EF,dbo.EMPLEADO E,dbo.FUNCION U where cod_estilo='"+codigo_estilo+"' and F.COD_FICHA=EF.COD_FICHA and E.COD_EMP=EF.COD_EMP and U.COD_FUNCION=E.COD_FUNCION");
                    
                    if(rs2.next()){
                        cantidad_filas=rs2.getInt(1);
                    }
                    
                    if(cantidad_filas>0){
                        ResultSet rs=st.executeQuery("select apellido as APELLIDO,nombre as NOMBRE,direccion as DIRECCION,telefono as TELEFONO,U.DESCRIPCION as FUNCION,fecha_nac as FECHA_NAC,correo as CORREO,dni as DNI,nacionalidad as NACIONALIDAD from dbo.FICHA_TECNICA F,dbo.EMPLEADO_FICHA EF,dbo.EMPLEADO E,dbo.FUNCION U where cod_estilo='C001' and F.COD_FICHA=EF.COD_FICHA and E.COD_EMP=EF.COD_EMP and U.COD_FUNCION=E.COD_FUNCION order by E.APELLIDO asc");

                        modelo1.setColumnCount(0);
                        modelo1.setRowCount(0);

                        ResultSetMetaData md=rs.getMetaData();
                        int cantidad_columnas=md.getColumnCount();
                        for(int i=1;i<=cantidad_columnas;i++){
                            modelo1.addColumn(md.getColumnLabel(i));
                        }
        
                        while(rs.next()){
                            Object[] fila=new Object[cantidad_columnas];
                            for(int i=0;i<cantidad_columnas;i++){
                                fila[i]=rs.getObject(i+1);
                            }
                            modelo1.addRow(fila);
                        }
                        JOptionPane.showMessageDialog(null,"Búsqueda exitosa!!");
                    }else{
                        JOptionPane.showMessageDialog(null,"No hay datos que mostrar!!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Codigo de estilo no existe!!","Mensaje",3);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Complete el campo!!","Mensaje",3);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_buscarPorCodigoEstiloActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        Connection cn=null;
        Statement st=null;
        try{
            
            if(dni!=null){
                    String apellido=txt_apellido.getText().toUpperCase().trim();
                    if(!apellido.equalsIgnoreCase("")){
                        if(!Validacion.existencia_numero(apellido)){
                            String nombre=txt_nombre.getText().toUpperCase().trim();
                            if(!nombre.equalsIgnoreCase("")){
                                if(!Validacion.existencia_numero(nombre)){
                                    String direccion=txt_direccion.getText().toUpperCase().trim();
                                    if(!direccion.equalsIgnoreCase("")){
                                        String telefono=txt_telefono.getText().trim();
                                        if(!telefono.equalsIgnoreCase("")){
                                            if(!Validacion.existencia_letras(telefono)){
                                                String funcion=cbo_funcion.getSelectedItem().toString();
                                                if(!funcion.equalsIgnoreCase("..................")){
                                                    String fechaString=null;
                                                    Date fecha= txt_fechaNacimiento.getDate();
                                                    if(fecha!=null){
                                                        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
                                                        fechaString=sdf.format(fecha);
                                                        String correo=txt_correo.getText().toUpperCase().trim();
                                                        if(!correo.equalsIgnoreCase("")){
                                                            if(Validacion.existencia_arroba(correo)){
                                                                String dni=txt_dni.getText().trim();
                                                                if(!dni.equalsIgnoreCase("")){
                                                                    if(!Validacion.existencia_letras(dni)){
                                                                        String nacionalidad=txt_nacionalidad.getText().toUpperCase().trim();
                                                                        if(!nacionalidad.equalsIgnoreCase("")){
                                                                            if(!Validacion.existencia_numero(nacionalidad)){
                                                                                int input=JOptionPane.showConfirmDialog(null, "Estás seguro?","Escoger una opción",2,3);
                                                                                if(input==0){
                                                                                    String codigo_funcion="";
                                                                                    cn=Conection.getConnection();
                                                                                    st=cn.createStatement();

                                                                                    ResultSet rs=st.executeQuery("select cod_funcion from dbo.FUNCION where descripcion='"+funcion+"'");

                                                                                    if(rs.next()){
                                                                                        codigo_funcion=rs.getString(1);
                                                                                    }

                                                                                    st.executeUpdate("update dbo.EMPLEADO set apellido='"+apellido+"',nombre='"+nombre+"',direccion='"+direccion+"',telefono='"+telefono+"',cod_funcion='"+codigo_funcion+"',fecha_nac=convert(datetime,'"+fechaString+"',5),correo='"+correo+"',dni='"+dni+"',nacionalidad='"+nacionalidad+"' where dni='"+this.dni+"'");
                                                                                    cargarTabla();

                                                                                    JOptionPane.showMessageDialog(null, "Se modificó correctamente!!");      
                                                                                }
                                                                            }else{
                                                                                JOptionPane.showMessageDialog(null,"La nacionalidad no debe contener números!!","Mensaje",2);
                                                                            }
                                                                        }else{
                                                                            JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                                                                        }
                                                                    }else{
                                                                        JOptionPane.showMessageDialog(null,"El dni no debe contener letras!!","Mensaje",2);
                                                                    }
                                                                }else{
                                                                    JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                                                                }
                                                            }else{
                                                                JOptionPane.showMessageDialog(null,"El correo debe tener @!!","Mensaje",2);
                                                            }
                                                        }else{
                                                            JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                                                        }
                                                    }else{
                                                        JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                                                    }
                                                }else{
                                                    JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                                                }
                                            }else{
                                                JOptionPane.showMessageDialog(null,"El telefono no debe contener letras!!","Mensaje",2);
                                            }
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null,"El nombre no debe contener números!!","Mensaje",2);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números!!","Mensaje",2);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Complete todos los campos!!","Mesanje",3);
                    }
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila_selecionada=tabla.getSelectedRow();
        if(fila_selecionada>=0){
            txt_apellido.setText(tabla.getValueAt(fila_selecionada, 0).toString());
            txt_nombre.setText(tabla.getValueAt(fila_selecionada, 1).toString());
            txt_direccion.setText(tabla.getValueAt(fila_selecionada, 2).toString());
            txt_telefono.setText(tabla.getValueAt(fila_selecionada, 3).toString());
            cbo_funcion.setSelectedItem(tabla.getValueAt(fila_selecionada,4).toString());
            
            String fechaString=tabla.getValueAt(fila_selecionada, 5).toString();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
            Date fechaDate;
            try {
                fechaDate = sdf.parse(fechaString);
                txt_fechaNacimiento.setDate(fechaDate);
            } catch (ParseException ex) {
                Logger.getLogger(Frm6.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            txt_correo.setText(tabla.getValueAt(fila_selecionada, 6).toString());
            
            dni=tabla.getValueAt(fila_selecionada, 7).toString();
            txt_dni.setText(dni);
            
            txt_nacionalidad.setText(tabla.getValueAt(fila_selecionada,8).toString());
        }
            
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Connection cn=null;
        Statement st=null;
        try{
            
            if(this.dni!=null){
                int input = JOptionPane.showConfirmDialog(null, "Estás seguro?","Escoger una opción",2,3);
                if(input==0){
                    cn=Conection.getConnection();
                    st=cn.createStatement();
                    st.executeUpdate("delete from dbo.EMPLEADO_FICHA where COD_EMP=(select cod_emp from empleado where dni='"+this.dni+"')");
                    st.executeUpdate("delete from dbo.empleado where dni='"+this.dni+"'");//sentencia sql para eliminar una fila de la tabla donde el dni se encuentre
                    cargarTabla();
                    JOptionPane.showMessageDialog(null, "Se eliminó correctamente!!");  
                }
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btn_listarActionPerformed

    private void menuitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem1ActionPerformed
        Frm7 objF=new Frm7();
        objF.setVisible(true);
        objF.setLocationRelativeTo(null);
        objF.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_menuitem1ActionPerformed

    private void limpiar_campos(){
        txt_apellido.setText("");
        txt_nombre.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        cbo_funcion.setSelectedIndex(0);
        txt_fechaNacimiento.setDate(null);
        txt_correo.setText("");
        txt_dni.setText("");
        txt_nacionalidad.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar_campos();
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
            java.util.logging.Logger.getLogger(Frm6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarPorCodigoEstilo;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cbo_funcion;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuitem1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_estilo;
    private com.toedter.calendar.JDateChooser txt_fechaNacimiento;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
