package Vista;
import lopquiz.LoPQuiz;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 *
 * @author Mario Kazemu Payan, Oscar Shaitan Tigreros
 */
public class Ventana extends javax.swing.JFrame {
    
    LoPQuiz LoPQuiz = new LoPQuiz();
    private final String[] categoriaArray ={"E-sport", "Items", "Juego", "Lore", "Comunidad"};
    private int categoriaRandom = 0;
    private int pregunta = 0;
    private String preguntaTexto = "";
    private String respuestaTexto = "";
    Random r = new Random(System.currentTimeMillis()); 
    
    public Ventana() {
        initComponents();
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoP Quiz");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(600, 600, 1800, 2000));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanel1.setNextFocusableComponent(jPanel1);
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton_2A.png"))); // NOI18N
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton_2_rolloverA.png")));//NOI18N
        jButton1.setText("Mostrar Pregunta");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 20, 310, 120);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton_3A.png"))); // NOI18N
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton_3_rolloverA.png")));//NOI18N
        jButton2.setText("Mostrar Respuesta");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(690, 290, 360, 120);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.orange);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Categoria...");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 40, 170, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton_1A.png"))); // NOI18N
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton_1_rolloverA.png")));//NOI18N
        //jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton_1A.png")));
        jButton4.setText("jButton4");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(50, 10, 310, 130);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.orange);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Pregunta?");
        jLabel2.setAutoscrolls(true);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(jLabel2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 130, 900, 120);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Respuesta");
        jScrollPane2.setViewportView(jLabel3);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(80, 460, 880, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOP OPPPP.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel4.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel4.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1030, 610);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel3.setText(""+respuestaTexto);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel5.setText("Categoria...");
        jLabel2.setText(preguntaTexto);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel2.setText("¿Pregunta?");
        jLabel3.setText("Respuesta");     
        
        categoriaRandom = r.nextInt(5);  
                
        jLabel5.setText(""+categoriaArray[categoriaRandom]);
        pregunta = 0;
        if(categoriaRandom == 0){
                        
            pregunta = r.nextInt(LoPQuiz.getPreguntasEsportSize());
            
            preguntaTexto = ""+LoPQuiz.getPreguntaEsport(pregunta);
            respuestaTexto = ""+LoPQuiz.getRespuestaEsport(pregunta);             
        }
        if(categoriaRandom == 1){
            
            pregunta = r.nextInt(LoPQuiz.getPreguntasItemsSize());
            jLabel5.setText(""+categoriaArray[categoriaRandom]);
            preguntaTexto = ""+LoPQuiz.getPreguntaItems(pregunta);
            respuestaTexto = ""+LoPQuiz.getRespuestaItems(pregunta);
        }
        if(categoriaRandom == 2){
            pregunta = r.nextInt(LoPQuiz.getPreguntasJuegoSize());
            jLabel5.setText(""+categoriaArray[categoriaRandom]);
            preguntaTexto = ""+LoPQuiz.getPreguntaJuego(pregunta);
            respuestaTexto = ""+LoPQuiz.getRespuestaJuego(pregunta);            
        }
        if(categoriaRandom == 3){
            pregunta = r.nextInt(LoPQuiz.getPreguntasLoreSize());
            jLabel5.setText(""+categoriaArray[categoriaRandom]);
            preguntaTexto = ""+LoPQuiz.getPreguntaLore(pregunta);
            respuestaTexto = ""+LoPQuiz.getRespuestaLore(pregunta);
        }
        if(categoriaRandom == 4){
            pregunta = r.nextInt(LoPQuiz.getPreguntasComunidadSize());
            jLabel5.setText(""+categoriaArray[categoriaRandom]);
            preguntaTexto = ""+LoPQuiz.getPreguntaComunidad(pregunta);
            respuestaTexto = ""+LoPQuiz.getRespuestaComunidad(pregunta);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * @param args the command line arguments
     * 
     */  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
