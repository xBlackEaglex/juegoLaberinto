/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegolaberinto;

import java.awt.event.KeyEvent;

import java.applet.AudioClip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




/**
 *
 * @author blackeagle
 */
public class juego3 extends javax.swing.JFrame {
    
    int mov = 10;
    String comp;
    int posx = 0;
    int posy = 0;
    int music = 0;
    


    /**
     * Creates new form juego
     */
    public juego3() {
        initComponents();
        this.setLocationRelativeTo(null);
        sonidoFondo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        perro = new javax.swing.JLabel();
        perro1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zombie.gif"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        perro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/armas.png"))); // NOI18N
        getContentPane().add(perro, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 70, 50));

        perro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/armas.png"))); // NOI18N
        getContentPane().add(perro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 70, 50));

        back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laberinto2.png"))); // NOI18N
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        
        
        // der y izq
        
        comp = KeyEvent.getKeyText(evt.getKeyCode());
        
        if ((posx>=0 && posx<=750) && (posy>=0 && posy<=0)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=750){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=0){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
            
        if ((posx == 750) && (posy == 0)) {

            sonidoPerder();
            posx = 0;
            posy = 0;
            icon.setLocation(posx, posy);

        }
        }
        
        
        //arr y abaj
        
        if ((posx>=0 && posx<=0) && (posy>=0 && posy<=490)){
            if (comp.equalsIgnoreCase("Abajo")){
                if(posy!=490){
                    posy += mov;
                    posx += 0;
                    icon.setLocation(posx, posy);
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Arriba")){
            if(posy!=0){
                posy -= mov;
                posx += 0;
                icon.setLocation(posx, posy);
            }
        }
        }
        
        
        // fila final
        
        if ((posx>=0 && posx<=690) && (posy==490)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=690){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=0){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
        }
        
        //  fila final columna 3
        
        if ((posx==110) && (posy>=400 && posy<=490)){
            if (comp.equalsIgnoreCase("Abajo")){
                if(posy!=490){
                    posy += mov;
                    posx += 0;
                    icon.setLocation(posx, posy);
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Arriba")){
            if(posy!=400){
                posy -= mov;
                posx += 0;
                icon.setLocation(posx, posy);
            }
        }
        }
        
        // fila 5 columna 2
        
        if ((posx>=110 && posx<=700) && (posy==400)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=700){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=110){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
        }
        
        // fila 5 columna 5
        
        if ((posx==700) && (posy>=300 && posy<=400)){
            if (comp.equalsIgnoreCase("Abajo")){
                if(posy!=400){
                    posy += mov;
                    posx += 0;
                    icon.setLocation(posx, posy);
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Arriba")){
            if(posy!=300){
                posy -= mov;
                posx += 0;
                icon.setLocation(posx, posy);
            }
        }
        }
        
        // fila 4 columna 2
        
        if ((posx>=200 && posx<=700) && (posy==300)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=700){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=200){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
            
        if ((posx == 200) && (posy == 300)) {

            sonidoPerder();
            posx = 0;
            posy = 0;
            icon.setLocation(posx, posy);

        }
        }
        
        // fila 2 columna 2
        
        if ((posx>=0 && posx<=180) && (posy==100)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=180){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=0){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
        }
        
        // fila 3 columna 2
        
        if ((posx>=0 && posx<=180) && (posy==200)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=180){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=0){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
        }
        
        
        // fila 2 columna 2
        
        if ((posx==180) && (posy>=100 && posy<=290)){
            if (comp.equalsIgnoreCase("Abajo")){
                if(posy!=290){
                    posy += mov;
                    posx += 0;
                    icon.setLocation(posx, posy);
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Arriba")){
            if(posy!=100){
                posy -= mov;
                posx += 0;
                icon.setLocation(posx, posy);
            }
        }
        if ((posx == 180) && (posy == 270)) {

            sonidoPerder();
            posx = 0;
            posy = 0;
            icon.setLocation(posx, posy);

        }
        }
        
        
        // fila 2 columna 4
        
        if ((posx==420) && (posy>=0 && posy<=100)){
            if (comp.equalsIgnoreCase("Abajo")){
                if(posy!=100){
                    posy += mov;
                    posx += 0;
                    icon.setLocation(posx, posy);
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Arriba")){
            if(posy!=0){
                posy -= mov;
                posx += 0;
                icon.setLocation(posx, posy);
            }
        }
        }
        
        // fila 2 columna 3
        
        if ((posx>=300 && posx<=750) && (posy==100)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=750){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=300){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
        }
        
        // fila 2 columna 3
        
        if ((posx==300) && (posy>=100 && posy<=200)){
            if (comp.equalsIgnoreCase("Abajo")){
                if(posy!=200){
                    posy += mov;
                    posx += 0;
                    icon.setLocation(posx, posy);
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Arriba")){
            if(posy!=100){
                posy -= mov;
                posx += 0;
                icon.setLocation(posx, posy);
            }
        }
        }
        
        // fila 3 columna 3
        
        if ((posx>=300 && posx<=820) && (posy==200)){
            if (comp.equalsIgnoreCase("Derecha")){
                if(posx!=820){
                    posx += mov;
                    posy -= 0;
                    icon.setLocation(posx, posy);
                    derecha();
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Izquierda")){
            if(posx!=300){
                posx -= mov;
                posy -= 0;
                icon.setLocation(posx, posy);
                izquierda();
            }
        }
        }
        
        // final
        
        if ((posx==820) && (posy>=200 && posy<=490)){
            if (comp.equalsIgnoreCase("Abajo")){
                if(posy!=490){
                    posy += mov;
                    posx += 0;
                    icon.setLocation(posx, posy);
                }
        }
        
        
        else if (comp.equalsIgnoreCase("Arriba")){
            if(posy!=200){
                posy -= mov;
                posx += 0;
                icon.setLocation(posx, posy);
            }
        }
        if ((posx == 820) && (posy == 470)) {

            sonidoGanar();
            mensaje();
            menu();
            posx = 0;
            posy = 0;
            icon.setLocation(posx, posy);

        }
        }
        
     
        
        
        
        
        
        
        
    }//GEN-LAST:event_formKeyPressed

    public void sonidoFondo () {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/audio/zombie.wav"));
        
        if (music == 0){
           sonido.loop(); 
           music = 1;
        }
        else {
            sonido.stop();
        }
        
    }
    
     
    public void sonidoGanar () {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/audio/grito.wav"));
        sonido.play();
    }
    
    public void sonidoPerder () {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/audio/disparo.wav"));
        sonido.play();
    }
    
    
    public void mensaje (){
        Icon ico = new ImageIcon(getClass().getResource("/img/fiesta.png"));
        JOptionPane.showMessageDialog(null,"Filicidades","Ganaste",JOptionPane.PLAIN_MESSAGE, ico);
        sonidoFondo();
    }
    
        public void izquierda (){
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/img/zombie2.gif"));
        icon.setIcon(icono);
    }
    
        public void derecha (){
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/img/zombie.gif"));
        icon.setIcon(icono);
    }
        
        public void menu (){
            
        menu ob = new menu();
        
        
        ob.setVisible(true);
            
        dispose(); 
    } 
    
    
    
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
            java.util.logging.Logger.getLogger(juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel perro;
    private javax.swing.JLabel perro1;
    // End of variables declaration//GEN-END:variables
}
