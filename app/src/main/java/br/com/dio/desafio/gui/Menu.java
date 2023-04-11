/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.dio.desafio.gui;

//imagem retirada de � <a href='https://www.123rf.com/profile_captainvector'>captainvector</a>, <a href='https://www.123rf.com/free-images/'>123RF Free Images</a>
import br.com.dio.desafio.dominio.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Mia
 */
public class Menu extends javax.swing.JFrame {
    
    public final static Set<Curso> Cursos = new LinkedHashSet<>();
    public final static Set<Mentoria> Mentorias = new LinkedHashSet<>();
    public final static Set<Bootcamp> Bootcamps = new LinkedHashSet<>();
    public final static Set<Dev> Devs = new LinkedHashSet<>();

    public static Set<Curso> getCursos() {
        return Cursos;
    }

    public static Set<Mentoria> getMentorias() {
        return Mentorias;
    }


    public static Set<Bootcamp> getBootcamps() {
        return Bootcamps;
    }


    public static Set<Dev> getDevs() {
        return Devs;
    }



    /**
     * Creates new form Menu
     */
    public Menu() {
        
        
        Curso cursox = new Curso();
        cursox.setTitulo("Curso Java");
        cursox.setDescricao("descri��o curso java");
        cursox.setCargaHoraria(8);
        Cursos.add(cursox);
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso C++");
        curso1.setDescricao("Desc C");
        curso1.setCargaHoraria(10);
        Cursos.add(curso1);
        
        /*Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Curso b�sico de Python");
        curso2.setCargaHoraria(13);
        Cursos.add(curso2);
        */
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("TDD e Testes unit�rios");
        mentoria1.setTitulo("Mentoria sobre testes");
        mentoria1.setData(LocalDate.parse("2019-07-19"));
        Mentorias.add(mentoria1);
        /*
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setDescricao("Princ�pios SOLID");
        mentoria2.setTitulo("Aplica��es de SOLID");
        mentoria2.setData(LocalDate.parse("2022-08-31"));
        Mentorias.add(mentoria2);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp C intensivo");
        bootcamp1.setDescricao("Bootcamp sobre C");
        bootcamp1.setDataInicial(LocalDate.now());
        bootcamp1.setDataFinal(bootcamp1.getDataInicial().plusDays(45));
        bootcamp1.getConteudos().add(curso1);
//        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        Bootcamps.add(bootcamp1);
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Teste Bootcamp");
        bootcamp2.setDescricao("Desc temp");
        bootcamp2.setDataInicial(LocalDate.now());
        bootcamp2.setDataFinal(LocalDate.now().plusDays(45));
        //System.out.println("data inicial: " + bootcamp2.getDataInicial());
        //System.out.println("data final: " + bootcamp2.getDataFinal());
//        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(cursox);
        bootcamp2.getConteudos().add(mentoria1);
        Bootcamps.add(bootcamp2);
        
        Dev dev1 = new Dev();
        dev1.setNome("Jo�o");
        
        Dev dev2 = new Dev();
        dev2.setNome("Marta");
        
        //dev1.inscreverBootcamp(bootcamp2);
        dev1.inscreverBootcamp(bootcamp1);
        //dev1.progredir();
        Devs.add(dev1);
        Devs.add(dev2);
        
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
        jPanelLogo = new javax.swing.JLabel();
        jBCurso = new javax.swing.JButton();
        jBMentoria = new javax.swing.JButton();
        jBVerCurso = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBCriarbootcamp = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBMentoria2 = new javax.swing.JButton();
        jBMentoria3 = new javax.swing.JButton();
        jBInscreveDevBootcamp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jPanelLogo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_2.png"))); // NOI18N

        jBCurso.setText("Criar curso");
        jBCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCursoActionPerformed(evt);
            }
        });

        jBMentoria.setText("Criar mentorias");
        jBMentoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBMentoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMentoriaActionPerformed(evt);
            }
        });

        jBVerCurso.setText("Ver cursos");
        jBVerCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBVerCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerCursoActionPerformed(evt);
            }
        });

        jButton1.setText("Ver mentorias");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBCriarbootcamp.setText("Criar bootcamp");
        jBCriarbootcamp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBCriarbootcamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarbootcampActionPerformed(evt);
            }
        });

        jButton3.setText("Ver bootcamps");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jBMentoria2.setText("Criar dev");
        jBMentoria2.setActionCommand("Criar bootcamp");
        jBMentoria2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBMentoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMentoria2ActionPerformed(evt);
            }
        });

        jBMentoria3.setText("Ver devs");
        jBMentoria3.setActionCommand("Criar bootcamp");
        jBMentoria3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBMentoria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMentoria3ActionPerformed(evt);
            }
        });

        jBInscreveDevBootcamp.setText("Inscrever dev em bootcamp");
        jBInscreveDevBootcamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscreveDevBootcampActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanelLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBInscreveDevBootcamp, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBMentoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBCriarbootcamp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBMentoria2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jBVerCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBMentoria3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCurso)
                    .addComponent(jBVerCurso))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMentoria)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jBCriarbootcamp))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMentoria2)
                    .addComponent(jBMentoria3))
                .addGap(18, 18, 18)
                .addComponent(jBInscreveDevBootcamp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jBCriarbootcamp.getAccessibleContext().setAccessibleName("");

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

    private void jBCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCursoActionPerformed
        // TODO add your handling code here:
        FCurso dialog1 = new FCurso(new javax.swing.JFrame(), true);
        dialog1.setLocationRelativeTo(null);
        dialog1.setVisible(true);

    }//GEN-LAST:event_jBCursoActionPerformed

    private void jBVerCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerCursoActionPerformed
        
        ListaCursos exibe = new ListaCursos(new javax.swing.JFrame(), true);
        exibe.setLocationRelativeTo(null);
        exibe.setVisible(true);
    }//GEN-LAST:event_jBVerCursoActionPerformed

    private void jBMentoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMentoria2ActionPerformed
        FDev exibe = new FDev(new javax.swing.JFrame(), true);
        exibe.setLocationRelativeTo(null);
        exibe.setVisible(true);
    }//GEN-LAST:event_jBMentoria2ActionPerformed

    private void jBMentoria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMentoria3ActionPerformed
        ListaDevs exibe = new ListaDevs(new javax.swing.JFrame(), true);
        exibe.setLocationRelativeTo(null);
        exibe.setVisible(true);
    }//GEN-LAST:event_jBMentoria3ActionPerformed

    private void jBMentoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMentoriaActionPerformed
        // TODO add your handling code here:
        FMentoria mentoria = new FMentoria(new javax.swing.JFrame(), true);
        mentoria.setLocationRelativeTo(null);
        mentoria.setVisible(true);
    }//GEN-LAST:event_jBMentoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaMentorias exibeMenrorias = new ListaMentorias(new javax.swing.JFrame(), true);
        exibeMenrorias.setLocationRelativeTo(null);
        exibeMenrorias.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ListaBootcamps exibeBootcamps = new ListaBootcamps(this, rootPaneCheckingEnabled);
        exibeBootcamps.setLocationRelativeTo(null);
        exibeBootcamps.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBCriarbootcampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarbootcampActionPerformed
        FBootcamp bootcamp = new FBootcamp(new javax.swing.JFrame(), true);
        bootcamp.setLocationRelativeTo(null);
        bootcamp.setVisible(true);
    }//GEN-LAST:event_jBCriarbootcampActionPerformed

    private void jBInscreveDevBootcampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscreveDevBootcampActionPerformed
        FInscreveDevBootcamp inscreveDevBootcamp = new FInscreveDevBootcamp(this, rootPaneCheckingEnabled);
        inscreveDevBootcamp.setLocationRelativeTo(null);
        inscreveDevBootcamp.setVisible(true);
    }//GEN-LAST:event_jBInscreveDevBootcampActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Menu().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCriarbootcamp;
    private javax.swing.JButton jBCurso;
    private javax.swing.JButton jBInscreveDevBootcamp;
    private javax.swing.JButton jBMentoria;
    private javax.swing.JButton jBMentoria2;
    private javax.swing.JButton jBMentoria3;
    private javax.swing.JButton jBVerCurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPanelLogo;
    // End of variables declaration//GEN-END:variables
}
