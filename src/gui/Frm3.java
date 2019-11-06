/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Date;
import conn.Conection;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;

/**
 *
 * @author Rolando Andre
 */
public class Frm3 extends javax.swing.JFrame {

    /**
     * Creates new form Frm3
     */
    public Frm3() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigoEstilo = new javax.swing.JTextField();
        btn_grabar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        spin1 = new javax.swing.JSpinner();
        spin2 = new javax.swing.JSpinner();
        spin3 = new javax.swing.JSpinner();
        cbo_empleado = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_mostrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_codigoEstilo3 = new javax.swing.JTextField();
        txt_codigoEstilo2 = new javax.swing.JTextField();
        btn_mostrarProduccion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txt_fechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txt_fechaFin = new com.toedter.calendar.JDateChooser();
        btn_cargar_empleado = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 640));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(650, 640));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESAR AVANCES DE EMPLEADO");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código de Estilo:");

        btn_grabar.setForeground(new java.awt.Color(102, 102, 102));
        btn_grabar.setText("Grabar");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criterio", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empleado:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prendas bien elaboradas:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prendas mal elaboradas:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Horas trabajadas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        txt_fecha.setDateFormatString("dd-MM-yyyy");

        spin1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spin2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spin3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        cbo_empleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...................................................." }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_empleado, 0, 240, Short.MAX_VALUE)
                    .addComponent(spin1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spin2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spin3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(cbo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(spin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(spin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(spin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MOSTRAR AVANCE DE FICHA TECNICA");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cóigo de estilo:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de inicio:");

        btn_mostrar.setForeground(new java.awt.Color(102, 102, 102));
        btn_mostrar.setText("Mostrar");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MOSTRAR AVANCE POR FICHA TÉCNICA");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Código de estilo:");

        txt_codigoEstilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoEstilo3ActionPerformed(evt);
            }
        });

        btn_mostrarProduccion.setForeground(new java.awt.Color(102, 102, 102));
        btn_mostrarProduccion.setText("Mostrar Producción");
        btn_mostrarProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarProduccionActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha de fin:");

        btn_cargar_empleado.setForeground(new java.awt.Color(102, 102, 102));
        btn_cargar_empleado.setText("Cargar Empleados");
        btn_cargar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargar_empleadoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("EN UN PERIODO DETERMINADO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(txt_codigoEstilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)
                                .addComponent(txt_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(37, 37, 37)
                                .addComponent(txt_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(txt_codigoEstilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_mostrarProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_codigoEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cargar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_codigoEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cargar_empleado)
                    .addComponent(btn_grabar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel14)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel9))
                                    .addComponent(txt_codigoEstilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel10))
                                    .addComponent(txt_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel13))
                                    .addComponent(txt_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(btn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_codigoEstilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(btn_mostrarProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jMenu1.setText("Opción");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Regresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Estandares de producción");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Frm8 obj=new Frm8();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Frm9 obj=new Frm9();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_cargar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargar_empleadoActionPerformed
        Connection cn=null;
        Statement st=null;
        try{
            String codigo_estilo=txt_codigoEstilo.getText().toUpperCase().trim();
            if(!codigo_estilo.equalsIgnoreCase("")){
                if(Validacion.existe_codigo_estilo(codigo_estilo)){
                    cn=Conection.getConnection();
                    st=cn.createStatement();
                    cbo_empleado.removeAllItems();
                    boolean cantidad=false;

                    ResultSet rs=st.executeQuery("SELECT E.APELLIDO+', '+E.NOMBRE FROM DBO.EMPLEADO E,DBO.EMPLEADO_FICHA EF,DBO.FICHA_TECNICA FT WHERE E.COD_EMP=EF.COD_EMP AND FT.COD_FICHA=EF.COD_FICHA AND FT.COD_ESTILO='"+codigo_estilo+"'");

                    cbo_empleado.addItem("....................................................");
                    while(rs.next()){
                        cbo_empleado.addItem(rs.getString(1));
                        cantidad=true;
                    }

                    if(cantidad){
                        JOptionPane.showMessageDialog(null,"Se cargó correctamente!!");
                    }else{
                        JOptionPane.showMessageDialog(null,"No existen empleados asignados a esta ficha ténica!!");
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"Codigo de estilo no existe!!","Mensaje",3);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Complete el campo!!","Mensaje",3);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_cargar_empleadoActionPerformed

    private void btn_mostrarProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarProduccionActionPerformed
        try{
            String codigo_estilo=txt_codigoEstilo3.getText().toUpperCase().trim();
            if(!codigo_estilo.equalsIgnoreCase("")){
                if(Validacion.existe_codigo_estilo(codigo_estilo)){
                    Frm1.codigo_estilo=codigo_estilo;
                    Frm1 obj=new Frm1();
                    obj.setVisible(true);
                    obj.setLocationRelativeTo(null);
                    obj.setResizable(false);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Codigo de estilo no existe!!","Mensaje",3);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Complete el campo!!","Mensaje",3);
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_mostrarProduccionActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        Connection cn=null;
        Statement st=null;
        try{
            String codigo_estilo=txt_codigoEstilo2.getText().toUpperCase().trim();
            if(!codigo_estilo.equalsIgnoreCase("")){
                if(Validacion.existe_codigo_estilo(codigo_estilo)){
                    String StringFecha_inicio="";
                    Date fecha_inicio=txt_fechaInicio.getDate();
                    if(fecha_inicio!=null){
                        String StringFecha_fin="";
                        Date fecha_fin=txt_fechaFin.getDate();
                        if(fecha_fin!=null){
                            if(Validacion.fechas_validas(fecha_inicio, fecha_fin)){
                                SimpleDateFormat sdf_uno=new SimpleDateFormat("dd-MM-yyyy");
                                StringFecha_inicio=sdf_uno.format(fecha_inicio);

                                SimpleDateFormat sdf_dos=new SimpleDateFormat("dd-MM-yyyy");
                                StringFecha_fin=sdf_dos.format(fecha_fin);

                                Frm2.codigo_estilo=codigo_estilo;
                                Frm2.StringFecha_fin=StringFecha_fin;
                                Frm2.StringFecha_inicio=StringFecha_inicio;

                                Frm2 obj=new Frm2();
                                obj.setVisible(true);
                                obj.setLocationRelativeTo(null);
                                obj.setResizable(false);
                                this.dispose();
                            }else{
                                JOptionPane.showMessageDialog(null,"La fecha de inico debe ser anterior a la fecha de fin!!","Mensaje",3);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Codigo de estilo no existe!!","Mensaje",3);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        Connection cn=null;
        Statement st=null;
        try{
            String codigo_estilo=txt_codigoEstilo.getText().toUpperCase().trim();
            if(!codigo_estilo.equalsIgnoreCase("")){
                if(Validacion.existe_codigo_estilo(codigo_estilo)){
                    String nombre_empleado=cbo_empleado.getSelectedItem().toString();
                    if(!nombre_empleado.equalsIgnoreCase("....................................................")){
                        String dni_empleado="";
                        cn=Conection.getConnection();
                        st=cn.createStatement();

                        ResultSet rs4=st.executeQuery("SELECT E.DNI FROM EMPLEADO E WHERE E.APELLIDO+', '+E.NOMBRE='"+nombre_empleado+"'");

                        if(rs4.next()){
                            dni_empleado=rs4.getString(1);
                        }
                        if(Validacion.existe_dni_empleado(dni_empleado)){
                            if(!Validacion.existencia_letras(dni_empleado)){
                                String fechaString=null;
                                Date fecha=txt_fecha.getDate();
                                if(fecha!=null){
                                    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
                                    fechaString=sdf.format(fecha);
                                    String prendas_bien=spin1.getValue().toString();
                                    String prendas_mal=spin2.getValue().toString();
                                    String horas_trab=spin3.getValue().toString();

                                    boolean band=false;
                                    String codigo_empleado="",codigo_ficha="";

                                    ResultSet rs=st.executeQuery("select cod_emp from dbo.EMPLEADO where DNI='"+dni_empleado+"'");

                                    if(rs.next()){
                                        codigo_empleado=rs.getString(1);
                                    }

                                    ResultSet rs2=st.executeQuery("select COD_FICHA from dbo.FICHA_TECNICA where COD_ESTILO='"+codigo_estilo+"'");

                                    if(rs2.next()){
                                        codigo_ficha=rs2.getString(1);
                                    }

                                    if(Validacion.esta_asignado(codigo_empleado, codigo_ficha)){
                                        if(Validacion.ficha_activa(codigo_ficha,dni_empleado)){
                                            if(!Validacion.avance_registrado_hoy(codigo_empleado,new SimpleDateFormat("dd-MM-yyyy").format(fecha),codigo_ficha)){
                                                int input=JOptionPane.showConfirmDialog(null, "Estás seguro?","Escoger una opción",2,3);
                                                if(input==0){
                                                    st.executeUpdate("insert into dbo.AVANCE VALUES(convert(datetime,'"+fechaString+"',5),'"+prendas_bien+"','"+prendas_mal+"','"+horas_trab+"','"+codigo_empleado+"','"+codigo_ficha+"')");
                                                    JOptionPane.showMessageDialog(null,"Se ingresó correctamente!!");
                                                }
                                            }else{
                                                JOptionPane.showMessageDialog(null,"Ya se ha registrado el avance de ese empleado en esa fecha!!","Mensaje",2);
                                            }
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null,"El empleado no esta asignado a esa ficha técnica actualmente!!","Mensaje",2);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"El dni no debe contener letras!!","Mensaje",2);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Dni de empleado no existe!!","Mensaje",3);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Codigo de estilo no existe!!","Mensaje",3);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void txt_codigoEstilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoEstilo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoEstilo3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargar_empleado;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_mostrarProduccion;
    private javax.swing.JComboBox cbo_empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spin1;
    private javax.swing.JSpinner spin2;
    private javax.swing.JSpinner spin3;
    private javax.swing.JTextField txt_codigoEstilo;
    private javax.swing.JTextField txt_codigoEstilo2;
    private javax.swing.JTextField txt_codigoEstilo3;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private com.toedter.calendar.JDateChooser txt_fechaFin;
    private com.toedter.calendar.JDateChooser txt_fechaInicio;
    // End of variables declaration//GEN-END:variables
}
