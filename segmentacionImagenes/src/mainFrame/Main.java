/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainFrame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author DELL
 */
public class Main extends javax.swing.JFrame {

    private BufferedImage imagen;
    private File seleccion;
    private String origen;
    private ImageIcon icono;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagenBN = new javax.swing.JLabel();
        lblImagenOriginal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));

        lblImagenBN.setMinimumSize(new java.awt.Dimension(650, 300));
        lblImagenBN.setPreferredSize(new java.awt.Dimension(650, 300));

        lblImagenOriginal.setMinimumSize(new java.awt.Dimension(650, 300));
        lblImagenOriginal.setPreferredSize(new java.awt.Dimension(650, 300));

        jLabel3.setFont(new java.awt.Font("Indivisa Text Sans", 1, 14)); // NOI18N
        jLabel3.setText("Imagen Original/Imagen en Blanco y Negro");

        jButton1.setText("Importar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aplicar Segmentación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Indivisa Text Sans", 1, 14)); // NOI18N
        jLabel4.setText("Segmentación de Imagenes");

        jLabel5.setFont(new java.awt.Font("Indivisa Text Sans", 1, 14)); // NOI18N
        jLabel5.setText("Imagen Original/Imagen con RGB");

        jButton3.setText("Restablecer Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Aplicar Segmentación");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagenBN, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagenOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(726, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(93, 93, 93)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImagenOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImagenBN, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(jLabel5)
                    .addContainerGap(515, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JFileChooser jFileChooser1 = new JFileChooser();
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP ", "jpg", "gif", "bmp", "png");
        jFileChooser1.setFileFilter(filtroImagen);
        jFileChooser1.showOpenDialog(this);

        seleccion = jFileChooser1.getSelectedFile();

        if (seleccion != null) {
            origen = seleccion.getPath();

            ImageIcon icon = new ImageIcon(new ImageIcon(origen).getImage().getScaledInstance(588, 338, Image.SCALE_DEFAULT));
            this.icono = icon;
            Image image = icon.getImage();
            this.imagen = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D bGr = imagen.createGraphics();
            bGr.drawImage(image, 0, 0, null);
            bGr.dispose();
            this.lblImagenOriginal.setIcon(icon);
            this.lblImagenBN.setIcon(icon);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (imagen != null) {
            BufferedImage imagrgb = imagen;
            for (int i = 0; i < imagen.getWidth(); i++) {
                for (int j = 0; j < imagen.getHeight(); j++) {
                    Integer rgb = imagen.getRGB(i, j);
                    Color im = new Color(rgb);
                    int red = im.getRed();
                    int green = im.getGreen();
                    int blue = im.getBlue();
                    if (isRojo(red, green, blue) || isAzul(red, green, blue) || isVerde(red, green, blue)) {

                        imagrgb.setRGB(i, j, im.getRGB());
                    } else {
                        imagrgb.setRGB(i, j, Color.WHITE.getRGB());
                    }
                }
            }
            lblImagenOriginal.setIcon(new ImageIcon(imagrgb));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private Boolean isRojo(Integer red, Integer green, Integer blue) {
        return green == 0 && blue == 0 && (red >= 200 && red <= 255);
    }

    private Boolean isVerde(Integer red, Integer green, Integer blue) {
        return red == 0 && blue == 0 && (green >= 200 && green <= 255);
    }

    private Boolean isAzul(Integer red, Integer green, Integer blue) {
        return green == 0 && red == 0 && (blue >= 200 && blue <= 255);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (imagen != null) {
            Image temp = icono.getImage();
            this.imagen = new BufferedImage(temp.getWidth(null), temp.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D bGr = imagen.createGraphics();
            bGr.drawImage(temp, 0, 0, null);
            bGr.dispose();
            this.lblImagenOriginal.setIcon(icono);
            this.lblImagenBN.setIcon(icono);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (imagen != null) {
            BufferedImage bn = imagen;
            for (int i = 0; i < imagen.getWidth(); i++) {
                for (int j = 0; j < imagen.getHeight(); j++) {
                    Integer rgb = imagen.getRGB(i, j);
                    Color im = new Color(rgb);
                    int red = im.getRed();
                    int green = im.getGreen();
                    int blue = im.getBlue();
                    if (isRojo(red, green, blue) || isAzul(red, green, blue) || isVerde(red, green, blue)) {
                        bn.setRGB(i, j, Color.WHITE.getRGB());

                    } else {
                        bn.setRGB(i, j, Color.BLACK.getRGB());

                    }
                }
            }
            lblImagenBN.setIcon(new ImageIcon(bn));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblImagenBN;
    private javax.swing.JLabel lblImagenOriginal;
    // End of variables declaration//GEN-END:variables
}
