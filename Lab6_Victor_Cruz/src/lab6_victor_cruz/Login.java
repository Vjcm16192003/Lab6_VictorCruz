package lab6_victor_cruz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Login extends javax.swing.JFrame {

     static ArrayList<Autos> lista_carro = new ArrayList();
     static ArrayList<Cliente> lista_cliente = new ArrayList(); 
    public Login() {
        
        
        
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JDialog();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        JM_Admin = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        CrearCarro = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        JTF_VINCarro = new javax.swing.JTextField();
        JTF_Marca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTF_Carroce = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTF_Modelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTF_Pasajeros = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTF_Precio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTF_CapMale = new javax.swing.JTextField();
        JTF_Potencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTF_ColorCar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JB_CrearCarro = new javax.swing.JButton();
        ModifcarEliminarCarro = new javax.swing.JDialog();
        JCB_Auto = new javax.swing.JComboBox<>();
        JTF_CapMaleMod = new javax.swing.JTextField();
        JTF_CarroceMod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTF_PotenciaMod = new javax.swing.JTextField();
        JTF_ModeloMod = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JTF_ColorCarMod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JTF_PasajerosMod = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JB_ModifcarCarro = new javax.swing.JButton();
        JTF_VINCarroMod = new javax.swing.JTextField();
        JTF_PrecioMod = new javax.swing.JTextField();
        JTF_MarcaMod = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        JB_EliminarCarro = new javax.swing.JButton();
        ListarCarros = new javax.swing.JDialog();
        JB_ListarCarro = new javax.swing.JButton();
        JB_GuardarCarro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_Auto = new javax.swing.JTextArea();
        CrearClientes = new javax.swing.JDialog();
        JTF_PuestoTrabajo = new javax.swing.JTextField();
        JTF_Nacionalidad = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        JTF_Apellido = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        JTF_DineroAct = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        JTF_LugarTrabajo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        JB_CrearCliente = new javax.swing.JButton();
        JTF_ID = new javax.swing.JTextField();
        JTF_Nombre = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        JCB_VinCli = new javax.swing.JComboBox<>();
        ModificarEliminarClientes = new javax.swing.JDialog();
        JTF_PuestoTrabajoMod = new javax.swing.JTextField();
        JTF_NacionalidadMod = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        JB_ModCliente = new javax.swing.JButton();
        JTF_IDMod = new javax.swing.JTextField();
        JTF_ApellidoMod = new javax.swing.JTextField();
        JTF_NombreMod = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        JTF_DineroActMod = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        JTF_LugarTrabajoMod = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        JB_EliminarCliente = new javax.swing.JButton();
        JCB_Clientes = new javax.swing.JComboBox<>();
        ListarClientes = new javax.swing.JDialog();
        JB_ListarCliente = new javax.swing.JButton();
        JB_GuardarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTA_Cliente = new javax.swing.JTextArea();
        ComprarCarro = new javax.swing.JDialog();
        VerCarrosComprados = new javax.swing.JDialog();
        Reporte = new javax.swing.JDialog();
        InfoClientes = new javax.swing.JDialog();
        InfoCarros = new javax.swing.JDialog();
        JB_VerCarro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTA_CarroVer = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTF_UserName = new javax.swing.JTextField();
        JPF_Pass = new javax.swing.JPasswordField();
        JB_InSesion1 = new javax.swing.JToggleButton();
        JB_RegisUsuario1 = new javax.swing.JToggleButton();
        JB_Salir1 = new javax.swing.JToggleButton();

        jMenu3.setText("Carros");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setText("Modificar/Eliminar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Listar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Comprar");
        jMenu3.add(jMenuItem5);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Clientes");

        jMenuItem6.setText("Crear");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem8.setText("Modificar/Eliminar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Listar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Ver Carros Comprados");
        jMenu4.add(jMenuItem10);

        jMenuBar2.add(jMenu4);

        JM_Admin.setText("Administrador");
        JM_Admin.setEnabled(false);

        jMenuItem11.setText("Reporte");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        JM_Admin.add(jMenuItem11);

        jMenuItem12.setText("Info Clientes");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        JM_Admin.add(jMenuItem12);

        jMenuItem13.setText("Info Autos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        JM_Admin.add(jMenuItem13);

        jMenuBar2.add(JM_Admin);

        Principal.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal.getContentPane());
        Principal.getContentPane().setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        jLabel1.setText("VIN: ");

        jLabel2.setText("MARCA");

        jLabel3.setText("CARROCERIA");

        jLabel4.setText("MODELO");

        jLabel5.setText("PASAJEROS");

        jLabel6.setText("COLOR");

        jLabel9.setText("CAP. MALETERO");

        jLabel11.setText("POT MOTOR");

        jLabel12.setText("PRECIO");

        JB_CrearCarro.setText("Crear Carro");
        JB_CrearCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CrearCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearCarroLayout = new javax.swing.GroupLayout(CrearCarro.getContentPane());
        CrearCarro.getContentPane().setLayout(CrearCarroLayout);
        CrearCarroLayout.setHorizontalGroup(
            CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearCarroLayout.createSequentialGroup()
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CrearCarroLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CrearCarroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(376, 376, 376)
                                .addComponent(JTF_Potencia))
                            .addGroup(CrearCarroLayout.createSequentialGroup()
                                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CrearCarroLayout.createSequentialGroup()
                                        .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTF_VINCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(JTF_Marca, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                .addComponent(JTF_Modelo)))
                                        .addGap(164, 164, 164)
                                        .addComponent(JB_CrearCarro))
                                    .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JTF_Carroce, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(CrearCarroLayout.createSequentialGroup()
                                                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JTF_CapMale)
                                                    .addComponent(JTF_ColorCar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                                            .addGroup(CrearCarroLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                                .addComponent(JTF_Pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(CrearCarroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addComponent(JTF_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(185, 185, 185))
        );
        CrearCarroLayout.setVerticalGroup(
            CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCarroLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_VINCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JTF_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearCarroLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearCarroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTF_Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(9, 9, 9)
                        .addComponent(JTF_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTF_Carroce, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearCarroLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTF_Pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearCarroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_CrearCarro)
                        .addGap(15, 15, 15)))
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTF_CapMale, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTF_ColorCar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("CARROCERIA");

        jLabel13.setText("POT MOTOR");

        jLabel14.setText("MODELO");

        jLabel15.setText("PRECIO");

        jLabel16.setText("PASAJEROS");

        jLabel17.setText("VIN: ");

        jLabel18.setText("COLOR");

        JB_ModifcarCarro.setText("Modificar Carro");
        JB_ModifcarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ModifcarCarroActionPerformed(evt);
            }
        });

        jLabel19.setText("CAP. MALETERO");

        jLabel20.setText("MARCA");

        JB_EliminarCarro.setText("Eliminar Carro");
        JB_EliminarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EliminarCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModifcarEliminarCarroLayout = new javax.swing.GroupLayout(ModifcarEliminarCarro.getContentPane());
        ModifcarEliminarCarro.getContentPane().setLayout(ModifcarEliminarCarroLayout);
        ModifcarEliminarCarroLayout.setHorizontalGroup(
            ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTF_ColorCarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel19))
                            .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel14))
                            .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGap(25, 25, 25)
                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTF_PasajerosMod, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_CarroceMod, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_CapMaleMod, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_ModeloMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_MarcaMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_VINCarroMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifcarEliminarCarroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(31, 31, 31)
                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_PotenciaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_PrecioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124))
                    .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JB_EliminarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JB_ModifcarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(JCB_Auto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ModifcarEliminarCarroLayout.setVerticalGroup(
            ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifcarEliminarCarroLayout.createSequentialGroup()
                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTF_ColorCarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(JCB_Auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_VINCarroMod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(JTF_MarcaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifcarEliminarCarroLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(JTF_ModeloMod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifcarEliminarCarroLayout.createSequentialGroup()
                                        .addComponent(JTF_PasajerosMod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel19))
                                    .addComponent(JTF_CapMaleMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifcarEliminarCarroLayout.createSequentialGroup()
                                        .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(JTF_CarroceMod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTF_PotenciaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel16)
                                        .addGap(55, 55, 55)
                                        .addComponent(JB_ModifcarCarro)
                                        .addGap(21, 21, 21))))
                            .addGroup(ModifcarEliminarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JTF_PrecioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(JB_EliminarCarro)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel18)))
                .addGap(73, 73, 73))
        );

        JB_ListarCarro.setText("Listar");
        JB_ListarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ListarCarroActionPerformed(evt);
            }
        });

        JB_GuardarCarro.setText("Guardar en Archivo");
        JB_GuardarCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_GuardarCarroMouseClicked(evt);
            }
        });

        JTA_Auto.setColumns(20);
        JTA_Auto.setRows(5);
        jScrollPane1.setViewportView(JTA_Auto);

        javax.swing.GroupLayout ListarCarrosLayout = new javax.swing.GroupLayout(ListarCarros.getContentPane());
        ListarCarros.getContentPane().setLayout(ListarCarrosLayout);
        ListarCarrosLayout.setHorizontalGroup(
            ListarCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarCarrosLayout.createSequentialGroup()
                .addGroup(ListarCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListarCarrosLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(JB_ListarCarro)
                        .addGap(187, 187, 187)
                        .addComponent(JB_GuardarCarro))
                    .addGroup(ListarCarrosLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        ListarCarrosLayout.setVerticalGroup(
            ListarCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarCarrosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ListarCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_ListarCarro)
                    .addComponent(JB_GuardarCarro))
                .addGap(37, 37, 37))
        );

        jLabel21.setText("Nacionalida");

        jLabel23.setText("Apellido");

        jLabel24.setText("Lista VIN");

        jLabel25.setText("Lugar de Trabajo");

        jLabel26.setText("ID");

        jLabel27.setText("Dinero Actual");

        JB_CrearCliente.setText("Crear Cliente");
        JB_CrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CrearClienteActionPerformed(evt);
            }
        });

        jLabel28.setText("Puesto de Trabajo");

        jLabel29.setText("Nombre");

        javax.swing.GroupLayout CrearClientesLayout = new javax.swing.GroupLayout(CrearClientes.getContentPane());
        CrearClientes.getContentPane().setLayout(CrearClientesLayout);
        CrearClientesLayout.setHorizontalGroup(
            CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearClientesLayout.createSequentialGroup()
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearClientesLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(CrearClientesLayout.createSequentialGroup()
                            .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(453, 546, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearClientesLayout.createSequentialGroup()
                            .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JTF_PuestoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_LugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_DineroAct, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(CrearClientesLayout.createSequentialGroup()
                        .addComponent(JTF_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(JB_CrearCliente))))
            .addGroup(CrearClientesLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(55, 55, 55)
                .addComponent(JCB_VinCli, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        CrearClientesLayout.setVerticalGroup(
            CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearClientesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearClientesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(JCB_VinCli, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CrearClientesLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(JTF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearClientesLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(JTF_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CrearClientesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(JB_CrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(JTF_LugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(JTF_PuestoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(CrearClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(JTF_DineroAct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel22.setText("Nacionalida");

        JB_ModCliente.setText("Modificar");
        JB_ModCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ModClienteActionPerformed(evt);
            }
        });

        jLabel30.setText("Apellido");

        jLabel31.setText("Puesto de Trabajo");

        jLabel32.setText("Nombre");

        jLabel34.setText("Lugar de Trabajo");

        jLabel35.setText("ID");

        jLabel36.setText("Dinero Actual");

        JB_EliminarCliente.setText("Eliminar");
        JB_EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarEliminarClientesLayout = new javax.swing.GroupLayout(ModificarEliminarClientes.getContentPane());
        ModificarEliminarClientes.getContentPane().setLayout(ModificarEliminarClientesLayout);
        ModificarEliminarClientesLayout.setHorizontalGroup(
            ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel32)
                                .addComponent(jLabel30))
                            .addGap(39, 39, 39))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEliminarClientesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel36)
                        .addGap(27, 27, 27)))
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_DineroActMod, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_LugarTrabajoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_PuestoTrabajoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_ApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_NombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_NacionalidadMod, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_IDMod, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_EliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_ModCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCB_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        ModificarEliminarClientesLayout.setVerticalGroup(
            ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_IDMod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(JCB_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(JTF_NombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(JTF_ApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(JB_ModCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(JB_EliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModificarEliminarClientesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(JTF_NacionalidadMod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(JTF_LugarTrabajoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(JTF_PuestoTrabajoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(ModificarEliminarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(JTF_DineroActMod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        JB_ListarCliente.setText("Listar");
        JB_ListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ListarClienteActionPerformed(evt);
            }
        });

        JB_GuardarCliente.setText("Guardar en Archivo");
        JB_GuardarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_GuardarClienteMouseClicked(evt);
            }
        });

        JTA_Cliente.setColumns(20);
        JTA_Cliente.setRows(5);
        jScrollPane2.setViewportView(JTA_Cliente);

        javax.swing.GroupLayout ListarClientesLayout = new javax.swing.GroupLayout(ListarClientes.getContentPane());
        ListarClientes.getContentPane().setLayout(ListarClientesLayout);
        ListarClientesLayout.setHorizontalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarClientesLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(JB_ListarCliente)
                .addGap(187, 187, 187)
                .addComponent(JB_GuardarCliente)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        ListarClientesLayout.setVerticalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarClientesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addGroup(ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_ListarCliente)
                    .addComponent(JB_GuardarCliente))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout ComprarCarroLayout = new javax.swing.GroupLayout(ComprarCarro.getContentPane());
        ComprarCarro.getContentPane().setLayout(ComprarCarroLayout);
        ComprarCarroLayout.setHorizontalGroup(
            ComprarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ComprarCarroLayout.setVerticalGroup(
            ComprarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout VerCarrosCompradosLayout = new javax.swing.GroupLayout(VerCarrosComprados.getContentPane());
        VerCarrosComprados.getContentPane().setLayout(VerCarrosCompradosLayout);
        VerCarrosCompradosLayout.setHorizontalGroup(
            VerCarrosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        VerCarrosCompradosLayout.setVerticalGroup(
            VerCarrosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ReporteLayout = new javax.swing.GroupLayout(Reporte.getContentPane());
        Reporte.getContentPane().setLayout(ReporteLayout);
        ReporteLayout.setHorizontalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ReporteLayout.setVerticalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout InfoClientesLayout = new javax.swing.GroupLayout(InfoClientes.getContentPane());
        InfoClientes.getContentPane().setLayout(InfoClientesLayout);
        InfoClientesLayout.setHorizontalGroup(
            InfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        InfoClientesLayout.setVerticalGroup(
            InfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        JB_VerCarro.setText("Ver");
        JB_VerCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_VerCarroActionPerformed(evt);
            }
        });

        JTA_CarroVer.setColumns(20);
        JTA_CarroVer.setRows(5);
        jScrollPane3.setViewportView(JTA_CarroVer);

        javax.swing.GroupLayout InfoCarrosLayout = new javax.swing.GroupLayout(InfoCarros.getContentPane());
        InfoCarros.getContentPane().setLayout(InfoCarrosLayout);
        InfoCarrosLayout.setHorizontalGroup(
            InfoCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoCarrosLayout.createSequentialGroup()
                .addGroup(InfoCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoCarrosLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(JB_VerCarro))
                    .addGroup(InfoCarrosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        InfoCarrosLayout.setVerticalGroup(
            InfoCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoCarrosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(JB_VerCarro)
                .addGap(73, 73, 73))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INGRESE EL NOMBRE DEL USUARIO:");

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INGRESE SU CONTRASEÑA:");

        JTF_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_UserNameActionPerformed(evt);
            }
        });

        JPF_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPF_PassActionPerformed(evt);
            }
        });

        JB_InSesion1.setText("INICIAR SESION");
        JB_InSesion1.setOpaque(false);
        JB_InSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_InSesion1MouseClicked(evt);
            }
        });
        JB_InSesion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JB_InSesion1ENTER(evt);
            }
        });

        JB_RegisUsuario1.setText("Crear Usuario");
        JB_RegisUsuario1.setOpaque(false);
        JB_RegisUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_RegisUsuario1MouseClicked(evt);
            }
        });

        JB_Salir1.setText("SALIR");
        JB_Salir1.setOpaque(false);
        JB_Salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_Salir1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(JB_InSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(JB_RegisUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(JB_Salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPF_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTF_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(JB_Salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(JPF_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_InSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_RegisUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_UserNameActionPerformed

    private void JPF_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPF_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPF_PassActionPerformed

    private void JB_InSesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_InSesion1MouseClicked
        Validate();
        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
        }//fin de la condicion
    }//GEN-LAST:event_JB_InSesion1MouseClicked

    private void JB_InSesion1ENTER(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JB_InSesion1ENTER
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Normal();
        }
    }//GEN-LAST:event_JB_InSesion1ENTER

    private void JB_RegisUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_RegisUsuario1MouseClicked
        Validate2();
        if (numero == 0) {
            RegisterUser();
            JOptionPane.showMessageDialog(null, "Usuario Agregado Exitosamente");
        }
    }//GEN-LAST:event_JB_RegisUsuario1MouseClicked

    private void JB_Salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_Salir1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_JB_Salir1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    CrearA();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void JB_CrearCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CrearCarroActionPerformed
        
        try{
        int VIN = Integer.parseInt(JTF_VINCarro.getText());
        String marca = JTF_Modelo.getText();
        String modelo = JTF_Modelo.getText();
        String t_car = JTF_Carroce.getText();
        int cant = Integer.parseInt(JTF_Pasajeros.getText());
        int cap = Integer.parseInt(JTF_CapMale.getText());
        String color = JTF_VINCarro.getText(); 
        double precio = Double.parseDouble(JTF_Precio.getText());
        double pot = Double.parseDouble(JTF_Potencia.getText());
         JOptionPane.showMessageDialog(this, "Carro Agregado");
        Autos au = new Autos(VIN, cant, cap, marca, modelo, t_car, color, pot, precio); 
        
        DefaultComboBoxModel model = (DefaultComboBoxModel)JCB_Auto.getModel();
        model.addElement(au.getModelo());
          JCB_Auto.setModel(model);
          
          //
           DefaultComboBoxModel model_vin = (DefaultComboBoxModel)JCB_VinCli.getModel();
          model_vin.addElement(au.getVIN());
          JCB_VinCli.setModel(model_vin);
          
        lista_carro.add(au); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocurrio un Error");
        }
        
        
        
        
    }//GEN-LAST:event_JB_CrearCarroActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ModELiA();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void JB_ModifcarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ModifcarCarroActionPerformed
        try{
            
           String auto =  (String) JCB_Auto.getSelectedItem();
           int num=0; 
           
            for (int i = 0; i < lista_carro.size(); i++) {
                
                Autos a = lista_carro.get(i);
                if(a.getModelo()==auto){
                num = i;
                
                }
               
            }
             JOptionPane.showMessageDialog(this, "Modificado Correctamente");
            Autos aux = lista_carro.get(num); 
            aux.setCant_pas(Integer.parseInt(JTF_PasajerosMod.getText()));
            aux.setCap_mal(Integer.parseInt(JTF_CapMaleMod.getText()));
            aux.setVIN(Integer.parseInt(JTF_VINCarroMod.getText()));
            aux.setMarca(JTF_MarcaMod.getText());
            aux.setColor(JTF_ColorCarMod.getText());
            aux.setModelo(JTF_ModeloMod.getText());
            aux.setTipo_carr(JTF_CarroceMod.getText());
            aux.setPot_mot(Double.parseDouble(JTF_PotenciaMod.getText()));
            aux.setPrecio(Double.parseDouble(JTF_PrecioMod.getText()));
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocurrio un Error");
        }
    }//GEN-LAST:event_JB_ModifcarCarroActionPerformed

    private void JB_EliminarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EliminarCarroActionPerformed
        try {
          String auto =  (String) JCB_Auto.getSelectedItem();
           int num=0; 
           
            for (int i = 0; i < lista_carro.size(); i++) {
                
                Autos a = lista_carro.get(i);
                if(a.getModelo()==auto){
                num = i;
                
                }
                JOptionPane.showMessageDialog(this, "Eliminado Correctamente");
                lista_carro.remove(num); 
                JCB_Auto.remove(num);
            }  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Ocurrio un Error");
        }
    }//GEN-LAST:event_JB_EliminarCarroActionPerformed

    private void JB_ListarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ListarCarroActionPerformed
        // TODO add your handling code here:
        String info = " "; 
        for (int i = 0; i < lista_carro.size(); i++) {
            Autos a = lista_carro.get(i); 
            info = info + i+") "+ a.getMarca() +" ,"+a.getColor() +" ,"+a.getTipo_carr() +" ,"+a.getPrecio()+" ,"+a.getVIN()+"\n";
          //  System.out.println("");
        }
        JTA_Auto.setText(info);
     
    }//GEN-LAST:event_JB_ListarCarroActionPerformed

    private void JB_GuardarCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_GuardarCarroMouseClicked
        File fl = null;
        String FileWriter;
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fl = new File("./Registro Autos.txt");            
            fw = new FileWriter(fl);// sino esta creado el documento se crea automaticamente pero si ya esta creado se le pone un true  fw = new FileWriter(fl,true);
            bw = new BufferedWriter(fw);            
            bw.write(JTA_Auto.getText());
            bw.newLine();
            bw.flush(); // esto es para extraer los datos escritos en la memora ram 
        } catch (Exception e) {
            
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_JB_GuardarCarroMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ListarA();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void JB_CrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CrearClienteActionPerformed
        try{
        int Id = Integer.parseInt(JTF_ID.getText());
        String nombre = JTF_Nombre.getText();
        String apellido = JTF_Apellido.getText();
        String nacio = JTF_Nacionalidad.getText();
        String lugar = JTF_LugarTrabajo.getText(); 
        String puesto = JTF_PuestoTrabajo.getText();
        double din = Double.parseDouble(JTF_DineroAct.getText());
        int vin;
       vin = (int) JCB_VinCli.getSelectedItem(); 
       
       int num=0; 
            for (int i = 0; i < lista_carro.size(); i++) {
                Autos a = lista_carro.get(i);
                if(vin==a.getVIN()){
                  num = i;   
                }
            }
             Autos a = lista_carro.get(num);
            
         //JOptionPane.showMessageDialog(this, "Carro Agregado");
        Cliente cl = new Cliente(Id, nombre, apellido, nacio, lugar, puesto, din);      
        //cl.setVIN(a);
         lista_cliente.add(cl);
            System.out.println(cl.getNombre());
            JOptionPane.showMessageDialog(this, "Agregado Cliente");
        /*DefaultComboBoxModel model_cliente = (DefaultComboBoxModel)JCB_Clientes.getModel(); 
        model_cliente.addElement(cl.getNombre());
        JCB_Clientes.setModel(model_cliente);*/
        
          
       
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_JB_CrearClienteActionPerformed

    private void JB_ModClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ModClienteActionPerformed
       
        try{
            
           String nombre = (String) JCB_Clientes.getSelectedItem();
           int num =0; 
            for (int i = 0; i < lista_cliente.size(); i++) {

                Cliente a = lista_cliente.get(i);

                if (nombre.equals(a.getNombre())) {
                      num = 1; 
                }

            }

          
            JOptionPane.showMessageDialog(this, "Modificado Correctamente");
           
            Cliente aux = lista_cliente.get(num); 
            aux.setID(Integer.parseInt(JTF_IDMod.getText()));
            aux.setNombre(JTF_NombreMod.getText());
            aux.setApellido(JTF_ApellidoMod.getText());
            aux.setNacionalidad(JTF_NacionalidadMod.getText());
            aux.setLugar_trabajo(JTF_LugarTrabajoMod.getText());
            aux.setPuesto_trabajo(JTF_PuestoTrabajoMod.getText());
            aux.setDinero_act(Double.parseDouble(JTF_DineroActMod.getText()));
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocurrio un Error");
        }
        
        
    }//GEN-LAST:event_JB_ModClienteActionPerformed

    private void JB_EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EliminarClienteActionPerformed
        try {
          String cli =  (String) JCB_Clientes.getSelectedItem();
           int num=0; 
           
            for (int i = 0; i < lista_cliente.size(); i++) {
                
                Cliente a = lista_cliente.get(i);
                if(a.getNombre()==cli){
                num = i;
                
                }
                JOptionPane.showMessageDialog(this, "Eliminado Correctamente");
                lista_cliente.remove(num); 
                JCB_Clientes.remove(num);
            }  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Ocurrio un Error");
        }
    }//GEN-LAST:event_JB_EliminarClienteActionPerformed

    private void JB_ListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ListarClienteActionPerformed
        String info = " "; 
        for (int i = 0; i < lista_cliente.size(); i++) {
            Cliente a = lista_cliente.get(i); 
            info = info + i+") "+ a.getNombre()+" ,"+a.getApellido()+" ,"+ a.getID()+" ,"+a.getNacionalidad()+" ,"+a.getDinero_act()+"\n";
          //  System.out.println("");
        }
        JTA_Cliente.setText(info);
    }//GEN-LAST:event_JB_ListarClienteActionPerformed

    private void JB_GuardarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_GuardarClienteMouseClicked
        File fl = null;
        String FileWriter;
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fl = new File("./Registro Clientes.txt");            
            fw = new FileWriter(fl);
            bw = new BufferedWriter(fw);            
            bw.write(JTA_Cliente.getText());
            bw.newLine();
            bw.flush(); // esto es para extraer los datos escritos en la memora ram 
        } catch (Exception e) {
            
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_JB_GuardarClienteMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CrearC();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
      ModificarEliminarC();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
      ListarC();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        InfoC();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        InfoA();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Reporte();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void JB_VerCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_VerCarroActionPerformed
               File fl = null; 
        FileReader fr = null; 
        BufferedReader br = null; 
        Scanner sc = null; 
        try{
            fl = new File("./Registro Autos.txt");
            sc = new Scanner(fl);
            while(sc.hasNext()){
                String siguiente = sc.nextLine();
                System.out.println(siguiente);
                JTA_CarroVer.setText(siguiente);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR");
        }
sc.close();
    }//GEN-LAST:event_JB_VerCarroActionPerformed

    public boolean Validate() {

        //METODOS
        boolean existe = false;
        File file = new File("./Users.txt");
        FileReader read;
        BufferedReader Save;
        int registreishon = 1;
        String text = "";
        String usuario = "";
        String contraseña = "";
        try {
            read = new FileReader(file);
            Save = new BufferedReader(read);

            while (text != null) {
                try {
                    text = Save.readLine();
                    usuario = text;
                    text = Save.readLine();
                    contraseña = text;

                    if (text != null) {
                        String username;
                        String password;
                        username = JTF_UserName.getText();
                        password = JPF_Pass.getText();
                        if (username.isEmpty() || password.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Error, no debe dejar espacios vacios");
                            numero = 1;
                            break;
                        } else {
                            if (usuario.equalsIgnoreCase(username) && contraseña.equals(password)) {
                                existe = true;
                                numero = 1;
                                if (usuario.equalsIgnoreCase("Admin") && contraseña.equals("admin")) {
                                    JOptionPane.showMessageDialog(null, "Bienvenido Sr. ADMIN");
                                    Normal();
                                    JM_Admin.setEnabled(true);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Bienvenido " + username);
                                    Normal();
                                }//fin del else
                                this.setVisible(false);
                                break;
                            } else {
                                numero = 0;
                            }//fin del else
                        }//fin de la condcion
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }//fin del try n catch
            }//fin del while
            try {
                read.close();
                Save.close();
            } catch (Exception e) {
                e.printStackTrace();
            }//fin del try n catch
        } catch (Exception e) {
            e.printStackTrace();
        }//fin del try n catch
        return existe = true;
    }//fin del metodo Validate usuario

    public void RegisterUser() {
        File file = new File("./Users.txt");
        FileWriter write;
        PrintWriter writeline;
        String user = JTF_UserName.getText();
        String pass = JPF_Pass.getText();
        if (!file.exists()) {
            try {
                file.createNewFile();
                write = new FileWriter(file, true);
                writeline = new PrintWriter(write);
                writeline.println(user);
                writeline.println(pass);
                write.close();
                writeline.close();
            } catch (Exception e) {
                e.printStackTrace();
            }//fin del try n catch
        } else {
            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Verifique de que ningun campo este vacio");
            } else {
                try {
                    System.out.println();
                    user = JTF_UserName.getText();
                    pass = JPF_Pass.getText();
                    write = new FileWriter(file, true);
                    writeline = new PrintWriter(write);
                    writeline.println(user);
                    writeline.println(pass);
                    JOptionPane.showMessageDialog(null, "USUARIO CREADO CORRECTAMENTE");
                    write.close();
                    writeline.close();
                    JTF_UserName.setText("");
                    JPF_Pass.setText("");
                } catch (Exception e) {
                    e.printStackTrace();
                }//fin del try n catch
            }//fin del else
        }//fin del if
    }//fin del metodo registrar usuario

    public boolean Validate2() {
        boolean existe = false;
        File file = new File("./Users.txt");
        FileReader read;
        BufferedReader Save;
        int regist = 1;
        String text = "";
        String usuario = "";
        String contraseña = "";
        try {
            read = new FileReader(file);
            Save = new BufferedReader(read);
            while (text != null) {
                try {
                    text = Save.readLine();
                    usuario = text;
                    text = Save.readLine();
                    contraseña = text;
                    if (text != null) {
                        String username;
                        String password;
                        username = JTF_UserName.getText();
                        password = JPF_Pass.getText();
                        if (username.isEmpty() || password.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Asegurese que todo este correcto");
                            numero = 1;
                            break;
                        } else {
                            if (usuario.equals(username)) {
                                JOptionPane.showMessageDialog(null, "Error, usuario Existente");
                                JTF_UserName.setText("");
                                JPF_Pass.setText("");
                                existe = true;
                                numero = 1;
                                break;
                            } else {
                                numero = 0;
                            }//fin del else
                        }//fin del else
                    }//fin del if
                } catch (Exception e) {
                    e.printStackTrace();
                }//fin de try n catch
            }//fin del while
            try {
                read.close();
                Save.close();
            } catch (Exception e) {
                e.printStackTrace();
            }//fin del try n catch
        } catch (Exception e) {
            e.printStackTrace();
        }//fin del try n catch
        return existe = true;
    }//fin del metodo 2 de Validate
    
    public void Normal() {
        Principal.pack();
        //NORMAL.setModal(true);
        Principal.setLocationRelativeTo(this);
        Principal.setVisible(true);
    }//fin del llamado del JDialog
    
    public void CrearC() {
        CrearClientes.pack();
        //NORMAL.setModal(true);
        CrearClientes.setLocationRelativeTo(this);
        CrearClientes.setVisible(true);
    }//fin del llamado del JDialog
    public void ModificarEliminarC() {
        ModificarEliminarClientes.pack();
        //NORMAL.setModal(true);
        ModificarEliminarClientes.setLocationRelativeTo(this);
        ModificarEliminarClientes.setVisible(true);
    }//fin del llamado del JDialog
    public void ListarC() {
        ListarClientes.pack();
        //NORMAL.setModal(true);
        ListarClientes.setLocationRelativeTo(this);
        ListarClientes.setVisible(true);
    }//fin del llamado del JDialog
   
    public void CrearA() {
        CrearCarro.pack();
        CrearCarro.setLocationRelativeTo(this);
        CrearCarro.setVisible(true);
    }//fin del llamado del JDialog
    public void ModELiA() {
        ModifcarEliminarCarro.pack();
        //NORMAL.setModal(true);
        ModifcarEliminarCarro.setLocationRelativeTo(this);
        ModifcarEliminarCarro.setVisible(true);
    }//fin del llamado del JDialog
    public void ListarA() {
        ListarCarros.pack();
        //NORMAL.setModal(true);
        ListarCarros.setLocationRelativeTo(this);
        ListarCarros.setVisible(true);
    }//fin del llamado del JDialog
    
    public void ComprarA() {
        Principal.pack();
        //NORMAL.setModal(true);
        Principal.setLocationRelativeTo(this);
        Principal.setVisible(true);
    }//fin del llamado del JDialog
    public void VerA() {
        InfoCarros.pack();
        //NORMAL.setModal(true);
        InfoCarros.setLocationRelativeTo(this);
        InfoCarros.setVisible(true);
    }//fin del llamado del JDialog
    public void Reporte() {
        Reporte.pack();
        //NORMAL.setModal(true);
        Reporte.setLocationRelativeTo(this);
        Reporte.setVisible(true);
    }//fin del llamado del JDialog
    public void InfoA() {
        InfoCarros.pack();
        //NORMAL.setModal(true);
        InfoCarros.setLocationRelativeTo(this);
        InfoCarros.setVisible(true);
    }//fin del llamado del JDialog
    public void InfoC() {
        InfoClientes.pack();
        //NORMAL.setModal(true);
        InfoClientes.setLocationRelativeTo(this);
        InfoClientes.setVisible(true);
    }//fin del llamado del JDialog
    
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ComprarCarro;
    private javax.swing.JDialog CrearCarro;
    private javax.swing.JDialog CrearClientes;
    private javax.swing.JDialog InfoCarros;
    private javax.swing.JDialog InfoClientes;
    private javax.swing.JButton JB_CrearCarro;
    private javax.swing.JButton JB_CrearCliente;
    private javax.swing.JButton JB_EliminarCarro;
    private javax.swing.JButton JB_EliminarCliente;
    private javax.swing.JButton JB_GuardarCarro;
    private javax.swing.JButton JB_GuardarCliente;
    private javax.swing.JToggleButton JB_InSesion1;
    private javax.swing.JButton JB_ListarCarro;
    private javax.swing.JButton JB_ListarCliente;
    private javax.swing.JButton JB_ModCliente;
    private javax.swing.JButton JB_ModifcarCarro;
    private javax.swing.JToggleButton JB_RegisUsuario1;
    private javax.swing.JToggleButton JB_Salir1;
    private javax.swing.JButton JB_VerCarro;
    private javax.swing.JComboBox<String> JCB_Auto;
    private javax.swing.JComboBox<String> JCB_Clientes;
    private javax.swing.JComboBox<String> JCB_VinCli;
    private javax.swing.JMenu JM_Admin;
    private javax.swing.JPasswordField JPF_Pass;
    private javax.swing.JTextArea JTA_Auto;
    private javax.swing.JTextArea JTA_CarroVer;
    private javax.swing.JTextArea JTA_Cliente;
    private javax.swing.JTextField JTF_Apellido;
    private javax.swing.JTextField JTF_ApellidoMod;
    private javax.swing.JTextField JTF_CapMale;
    private javax.swing.JTextField JTF_CapMaleMod;
    private javax.swing.JTextField JTF_Carroce;
    private javax.swing.JTextField JTF_CarroceMod;
    private javax.swing.JTextField JTF_ColorCar;
    private javax.swing.JTextField JTF_ColorCarMod;
    private javax.swing.JTextField JTF_DineroAct;
    private javax.swing.JTextField JTF_DineroActMod;
    private javax.swing.JTextField JTF_ID;
    private javax.swing.JTextField JTF_IDMod;
    private javax.swing.JTextField JTF_LugarTrabajo;
    private javax.swing.JTextField JTF_LugarTrabajoMod;
    private javax.swing.JTextField JTF_Marca;
    private javax.swing.JTextField JTF_MarcaMod;
    private javax.swing.JTextField JTF_Modelo;
    private javax.swing.JTextField JTF_ModeloMod;
    private javax.swing.JTextField JTF_Nacionalidad;
    private javax.swing.JTextField JTF_NacionalidadMod;
    private javax.swing.JTextField JTF_Nombre;
    private javax.swing.JTextField JTF_NombreMod;
    private javax.swing.JTextField JTF_Pasajeros;
    private javax.swing.JTextField JTF_PasajerosMod;
    private javax.swing.JTextField JTF_Potencia;
    private javax.swing.JTextField JTF_PotenciaMod;
    private javax.swing.JTextField JTF_Precio;
    private javax.swing.JTextField JTF_PrecioMod;
    private javax.swing.JTextField JTF_PuestoTrabajo;
    private javax.swing.JTextField JTF_PuestoTrabajoMod;
    private javax.swing.JTextField JTF_UserName;
    private javax.swing.JTextField JTF_VINCarro;
    private javax.swing.JTextField JTF_VINCarroMod;
    private javax.swing.JDialog ListarCarros;
    private javax.swing.JDialog ListarClientes;
    private javax.swing.JDialog ModifcarEliminarCarro;
    private javax.swing.JDialog ModificarEliminarClientes;
    private javax.swing.JDialog Principal;
    private javax.swing.JDialog Reporte;
    private javax.swing.JDialog VerCarrosComprados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    int numero = 0;
   
   
}
