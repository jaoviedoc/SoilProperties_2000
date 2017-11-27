package Frames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Emiaj
 */
public class Generalidades extends javax.swing.JFrame {

    /**
     * Creates new form Generalidades
     */
    ConexionBD con = new ConexionBD();
    java.sql.Connection cn = con.conexion();
    int i=0;
    
    public Generalidades(){
        initComponents();
        this.setLocationRelativeTo(null);
        Fecha_Hora();
        TFId_Chequeo.setEnabled(false);
        TFIdGeneralidades.setEnabled(false);
        

    }

    /**
     *
     */
    
    public void bloquear(){
            TFIdGeneralidades.setEnabled(false);
            TFId_Chequeo.setEnabled(false);
            CBPaisaje.setEnabled(false);
            CBTipoDeRelieve.setEnabled(false);
            CBFormaDeTerreno.setEnabled(false);
            CBMaterialParental.setEnabled(false);
            CBMicrorelieve.setEnabled(false);
            TFGradienteDeLaPendiente.setEnabled(false);;
            CBLongitudDeLaPendiente.setEnabled(false);
            CBFormaDeLaPendiente.setEnabled(false);
            CBPisoTérmico.setEnabled(false);
            CBProvinciaDeHumedad.setEnabled(false);
            CBRegimenDeTemperatura.setEnabled(false);
            CBRegimenDeHumedad.setEnabled(false);
            
            CBDrenajeInterno.setEnabled(false);
            CBDrenajeExterno.setEnabled(false);
            CBDrenajeNatural.setEnabled(false);
            
            TFVegetacionNatural.setEnabled(false);
            CBUsoActual.setEnabled(false);
            TFLimitacionUso.setEnabled(false);
    }
    
    
    public void Consulta() throws SQLException {
        
        String sql2 = "SELECT Id_Generalidades,Id_Chequeo,Paisaje,Tipo_Relieve,Forma_Terreno,Material_Parental,"
                + "Microrelieve,Gradiente_Pendiente,Longitud_Pendiente,Forma_Pendiente,"
                + "Piso_Termico,Provincia_Humedad,Regimen_Temperatura,Regimen_Humedad,Clase_Tipo_Erosion,"
                + "Frecuencia_Erosion,Porcentaje_Afloramiento_Rocoso,Tipo_Pedregosidad_Superficial,"
                + "Clase_Pedregosidad_Superficial,Porcentaje_Pedregosidad_Superficial,Drenaje_Interno,Drenaje_Externo,"
                + "Drenaje_Natural,Frecuencia_Inundacion,Duracion_Inundacion,Frecuencia_Encharcamiento,"
                + "Duracion_Encharcamiento,Naturaleza_Nivel_Freatico,Profundidad_Nivel_Fratico,Clase_Limitacion,"
                + "Profundidad_Limitacion,Ancho_Grietas,Profundidad_Grietas,Volumen_Plintita,Fase_Plintita,"
                + "Evidencia_Sales,Vegetacion_Natural,Uso_Actual,Limitacion_Uso"
                + " FROM generalidades WHERE Id_Chequeo = '"+TFId_Chequeo.getText()+"'" ;
        Statement st;
        st = (Statement) cn.createStatement();
        ResultSet rs = st.executeQuery(sql2);
        
        while(rs.next()){
            TFIdGeneralidades.setText(rs.getString("Id_Generalidades"));
            TFId_Chequeo.setText(rs.getString("Id_Chequeo"));
            CBPaisaje.setSelectedItem(rs.getString("Paisaje"));
            CBTipoDeRelieve.setSelectedItem(rs.getString("Tipo_Relieve"));
            CBFormaDeTerreno.setSelectedItem(rs.getString("Forma_Terreno"));
            CBMaterialParental.setSelectedItem(rs.getString("Material_Parental"));
            CBMicrorelieve.setSelectedItem(rs.getString("Microrelieve"));
            TFGradienteDeLaPendiente.setText(rs.getString("Gradiente_Pendiente"));
            CBLongitudDeLaPendiente.setSelectedItem(rs.getString("Longitud_Pendiente"));
            CBFormaDeLaPendiente.setSelectedItem(rs.getString("Forma_Pendiente"));
            CBPisoTérmico.setSelectedItem(rs.getString("Piso_Termico"));
            CBProvinciaDeHumedad.setSelectedItem(rs.getString("Provincia_Humedad"));
            CBRegimenDeTemperatura.setSelectedItem(rs.getString("Regimen_Temperatura"));
            CBRegimenDeHumedad.setSelectedItem(rs.getString("Regimen_Humedad"));
            
            CBDrenajeInterno.setSelectedItem(rs.getString("Drenaje_Interno"));
            CBDrenajeExterno.setSelectedItem(rs.getString("Drenaje_Externo"));
            CBDrenajeNatural.setSelectedItem(rs.getString("Drenaje_Natural"));
            
            TFVegetacionNatural.setText(rs.getString("Vegetacion_Natural"));
            CBUsoActual.setSelectedItem(rs.getString("Uso_Actual"));
            TFLimitacionUso.setText(rs.getString("Limitacion_Uso"));
            
            
        }
        bloquear();
    }
   
    public void Fecha_Hora(){
        Calendar cal = Calendar.getInstance();
        TFIdGeneralidades.setText(cal.get(Calendar.DATE) + "/" 
                + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR) + " " 
                +cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) +":"+cal.get(Calendar.SECOND));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Erosion = new javax.swing.ButtonGroup();
        AfloramientoRocoso = new javax.swing.ButtonGroup();
        PedregosidadSuperficial = new javax.swing.ButtonGroup();
        Inundaciones = new javax.swing.ButtonGroup();
        Encharcamientos = new javax.swing.ButtonGroup();
        Nivel_Freatico = new javax.swing.ButtonGroup();
        Limitacion_Profundidad = new javax.swing.ButtonGroup();
        Grietas = new javax.swing.ButtonGroup();
        Plintita = new javax.swing.ButtonGroup();
        Sales = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBPaisaje = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFGradienteDeLaPendiente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CBLongitudDeLaPendiente = new javax.swing.JComboBox<>();
        CBFormaDeLaPendiente = new javax.swing.JComboBox<>();
        CBPisoTérmico = new javax.swing.JComboBox<>();
        CBProvinciaDeHumedad = new javax.swing.JComboBox<>();
        CBRegimenDeTemperatura = new javax.swing.JComboBox<>();
        CBRegimenDeHumedad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CBDrenajeNatural = new javax.swing.JComboBox<>();
        CBTipoDeRelieve = new javax.swing.JComboBox<>();
        CBFormaDeTerreno = new javax.swing.JComboBox<>();
        CBMaterialParental = new javax.swing.JComboBox<>();
        CBMicrorelieve = new javax.swing.JComboBox<>();
        CBDrenajeInterno = new javax.swing.JComboBox<>();
        CBDrenajeExterno = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TFIdGeneralidades = new javax.swing.JTextField();
        TFId_Chequeo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        BGuardar = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        TFVegetacionNatural = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        CBUsoActual = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        TFLimitacionUso = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();

        jLabel61.setText("jLabel61");

        jLabel62.setText("jLabel62");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Generalidades");

        CBPaisaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Montaña", "Altillanura", "Planicie", "Lomerío", "Piedemonte" }));

        jLabel2.setText("Tipo de relieve");

        jLabel3.setText("Forma de terreno");

        jLabel4.setText("Material parental");

        jLabel5.setText("Microrelieve ");

        TFGradienteDeLaPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFGradienteDeLaPendienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Gradiente de la pendiente");

        CBLongitudDeLaPendiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Corta < 50 metros", "Media 50 - 100 metros", "Larga 100 - 300 metros", "Muy larga > 300 metros" }));

        CBFormaDeLaPendiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Recta", "Convexa", "Cóncava", "Compleja", "Irregular" }));

        CBPisoTérmico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cálido", "Templado", "Frío", "Páramo bajo", "Páramo alto" }));

        CBProvinciaDeHumedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Desértico", "Árido", "Semiárido", "Semihúmedo", "Húmedo", "Superhúmedo" }));

        CBRegimenDeTemperatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Gélico", "Cryico", "Frígido", "Mésico", "Térmico", "Hipertérmico", "Isofrígido", "Isomésico", "Isotérmico", "Isohipertérmico" }));

        CBRegimenDeHumedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Acuico", "Aridico y tórrido", "Údico", "Ústico", "Xérico" }));

        jLabel8.setText("Piso térmico");

        jLabel9.setText("Provincia de Humedad");

        jLabel10.setText("Forma de la Pendiente");

        jLabel11.setText("Longitud de la Pendiente");

        jLabel12.setText("Regimen Temperatura");

        jLabel13.setText("Regimen Humedad");

        jLabel14.setText("Paisaje");

        jLabel15.setText("¿Erosion?");

        Erosion.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("No");

        Erosion.add(jRadioButton2);
        jRadioButton2.setText("Si");

        jLabel16.setText("¿Afloramiento Rocoso ?");

        AfloramientoRocoso.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("No");

        AfloramientoRocoso.add(jRadioButton4);
        jRadioButton4.setText("Si");

        jLabel17.setText("¿Pedregosidad Superficial ?");

        PedregosidadSuperficial.add(jRadioButton5);
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("No");

        PedregosidadSuperficial.add(jRadioButton6);
        jRadioButton6.setText("Si");

        jLabel18.setText("Drenaje Interno");

        jLabel19.setText("Drenaje Externo");

        jLabel20.setText("Drenaje Natural");

        CBDrenajeNatural.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Muy Pobre", "Pobre", "Imperfecto", "Moderado", "Bien Drenado", "Moderadamente Excesivo", "Excesivamente Drenado" }));

        CBTipoDeRelieve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Abanico", "Terraza", "Fila" }));

        CBFormaDeTerreno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cima", "Ladera", "Ápice", "Bajo", "Estero", "Escarpe", "Vega", "Falda", "Inclinada", "Terraza Media", "Plano de terraza", "Banco", "Parte superior", "Ladera estructural", "Ladera superior", "Ladera parte media", "Transición ladera" }));

        CBMaterialParental.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Aluviones", "Areniscas ", "Arcillas aluviales", "Arcillolitas", "Coluviones", "Cenizas", "Conglomerados", "Arenas", "Depósitos Superficiales", "Cantos, Gravas y Gravillas", "Turbas", "Sedimentos aluviales finos", "Sedimentos Mixtos", "Depositos aluviales gruesos", "Depositos piroclásticos", "No identificados", " ", " " }));

        CBMicrorelieve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Sin identificar", "Escarceos ", "Gilgai", "Hormigueros", "Microdepresiones", "Zurales o tatucos", "Termiteros", "Arenas móviles", "Plano", " " }));

        CBDrenajeInterno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Muy lento", "Lento", "Moderado", "Rápido", "Muy rápido" }));

        CBDrenajeExterno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Muy lento", "Lento", "Moderado", "Rápido", "Muy rápido" }));

        jLabel21.setText("¿Inundaciones?");

        Inundaciones.add(jRadioButton7);
        jRadioButton7.setSelected(true);
        jRadioButton7.setText("No");

        Inundaciones.add(jRadioButton8);
        jRadioButton8.setText("Si");

        jLabel22.setText("¿Encharcamientos?");

        jLabel23.setText("¿Nivel freático?");

        jLabel24.setText("<html>¿Limitación en <br>profundidad efectiva?</html>");
        jLabel24.setToolTipText("");

        jLabel25.setText("¿Grietas?");

        jLabel26.setText("¿Plintita?");

        jLabel27.setText("Uso actual");

        jLabel28.setText("Id Chequeo");

        jLabel29.setText("Id Generalidades");

        Encharcamientos.add(jRadioButton9);
        jRadioButton9.setSelected(true);
        jRadioButton9.setText("No");

        Encharcamientos.add(jRadioButton10);
        jRadioButton10.setText("Si");

        Nivel_Freatico.add(jRadioButton11);
        jRadioButton11.setSelected(true);
        jRadioButton11.setText("No");

        Nivel_Freatico.add(jRadioButton12);
        jRadioButton12.setText("Si");

        Limitacion_Profundidad.add(jRadioButton13);
        jRadioButton13.setSelected(true);
        jRadioButton13.setText("No");

        Grietas.add(jRadioButton14);
        jRadioButton14.setSelected(true);
        jRadioButton14.setText("No");

        Plintita.add(jRadioButton15);
        jRadioButton15.setSelected(true);
        jRadioButton15.setText("No");

        Limitacion_Profundidad.add(jRadioButton16);
        jRadioButton16.setText("Si");

        Grietas.add(jRadioButton17);
        jRadioButton17.setText("Si");

        Plintita.add(jRadioButton18);
        jRadioButton18.setText("Si");

        jLabel30.setText("¿Sales?");

        Sales.add(jRadioButton19);
        jRadioButton19.setSelected(true);
        jRadioButton19.setText("No");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        Sales.add(jRadioButton20);
        jRadioButton20.setText("Si");

        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel31.setToolTipText("<html>Paisaje: Porción de espacio tridimensional constituida por <br>una repetición de\ntipos de relieve idénticos o por una <br>asociación de tipos de relieve diferentes. </html>");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel33.setToolTipText("<html>\nMaterial parental: Masa sin consolidar sobre el cual se desarrolla el perfil <br>\nde suelo; incluye el material \"in situ\" o roca y material transportado\n</html>");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel34.setToolTipText("<html>Relieve: Configuración de una superficie con distintos niveles <br>o partes que más o\nmenos sobresalen.</html>");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel35.setToolTipText("<html>\nMicro – relieve: Abarca el conjunto de pequeñas diferencias del relieve local,<br>\nproporcionadas por irregularidades de la superficie cuyas diferencias de altura son<br>\ntan pequeñas que no pueden ser representadas en la escala corriente de un mapa.\n</html>");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel36.setToolTipText("<html>\nLongitud de la pendiente – Distancia horizontal que <br>\nabarca la pendiente. identificada.\n</html>\n");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel37.setToolTipText("<html>\nGradiente de la pendiente - Grado de inclinación del terreno\n</html>");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel38.setToolTipText("<html>\nForma de la pendiente –Disposición en la que se encuentra la pendiente.\n</html>");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel39.setToolTipText("<html>\nProvincia de humedad - Resultado de la división entre precipitación anual y<br>\ntemperatura media anual\n</html>");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel40.setToolTipText("<html>\nPiso térmico- Clase de relieve que presenta determinadas<br>\ncondiciones climáticas en su territorio.\n</html>");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel41.setToolTipText("<html>\nRégimen de temperatura – Establece el valor de la T° relativamente constante y la<br>\nprofundidad a la cual se presenta.\n</html>");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel42.setToolTipText("<html>\nRégimen de humedad - Número de días (acumulados) en que la sección <br>\ncontrol del suelo se encuentra seca o húmeda.\n</html>");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel43.setToolTipText("<html>\nErosión – Pérdida físico–mecánica reflejada en un desgaste del suelo.\n</html>");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel44.setToolTipText("<html>\nPedregosidad superficial – Cantidad de piedras de más de 25cm de diámetro sobre el suelo.\n</html>");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel45.setToolTipText("<html>\nAfloramiento rocoso – Áreas en donde la superficie del suelo está constituida por<br>\ncapas de rocas expuestas\n</html>\n");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel46.setToolTipText("<html>\nDrenaje interno – Circulación del agua a través del perfil del suelo.\n</html>\n");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel47.setToolTipText("<html>\nDrenaje externo – Evacuación progresiva de aguas de escurrimiento<br>\nsuperficialmente.\n</html>");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel48.setToolTipText("Drenaje natural – Velocidad relativa con que el agua se mueve por el suelo.");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel49.setToolTipText("Encharcamientos – Formación de charcos.");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel50.setToolTipText("<html>\nNivel freático - Lámina de agua libre que satura transitoria o permanentemente<br>\ntodos los poros del suelo en una sección determinada.\n</html>");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel51.setToolTipText("<html>\nInundaciones - Ocupación por parte del agua en zonas que habitualmente están<br>\nlibres de esta\n</html>");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel52.setToolTipText("<html>\nLimitación en profundidad efectiva – Limitación que impide la penetración de las<br>\nraíces en el suelo\n</html>\n");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel53.setToolTipText("Grietas - Abertura larga y estrecha producto de la separación superficial del suelo.");
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel54.setToolTipText("<html>\nSales – Suelos con alto contenido de sales solubles que <br>\nafectan desarrollo de cultivos.\n</html>");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel55.setToolTipText("Plintita – Arcilla que contiene compuestos de hierro cuyo color es rojo ladrillo.");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel56.setToolTipText("<html>\nVegetación natural – Cobertura de plantas que crecen <br>\nespontáneamente sobre la superficie.\n</html>");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });

        jLabel57.setText("Vegetacion Natural");

        CBUsoActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Agrícola", "Pecuario", "Acuícola", "Forestal", "Agroforestal", "Conservación", "Bosque Intervenido", "Pastos no Manejados ", "Ganadería", "Ganadería Extensiva", "Ganadería Semi - Extensiva", "Bosque intervenido no comercial", "Bosque protector" }));

        jLabel58.setText("Limitacion de Uso");

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel59.setToolTipText("Uso actual – Actividad para la que está destinada actualmente el suelo.");
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info-147927_1280_1.png"))); // NOI18N
        jLabel60.setToolTipText("Limitante de uso – Restricción que no permite realizar la correcta función del suelo.");
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel30)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel21)
                            .addComponent(jLabel6)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel3))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBFormaDeTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBPaisaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TFId_Chequeo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFIdGeneralidades, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBTipoDeRelieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBRegimenDeHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBRegimenDeTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBProvinciaDeHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel58))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFVegetacionNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel56))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBDrenajeNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBDrenajeExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBDrenajeInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton7)
                                            .addComponent(jRadioButton9)
                                            .addComponent(jRadioButton11)
                                            .addComponent(jRadioButton13)
                                            .addComponent(jRadioButton14)
                                            .addComponent(jRadioButton15)
                                            .addComponent(jRadioButton19))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton12)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton16)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton18)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel55))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton20)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel54))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBMaterialParental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBLongitudDeLaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBFormaDeLaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBMicrorelieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFGradienteDeLaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jRadioButton17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel53))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBPisoTérmico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFLimitacionUso, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel60))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBUsoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel59))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(BGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFId_Chequeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(TFIdGeneralidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(CBPaisaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBTipoDeRelieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(CBFormaDeTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CBMaterialParental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(CBMicrorelieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TFGradienteDeLaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(CBLongitudDeLaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(CBFormaDeLaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(CBPisoTérmico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel9)
                                                .addComponent(CBProvinciaDeHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel12)
                                                .addComponent(CBRegimenDeTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel13)
                                                .addComponent(CBRegimenDeHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton2)))
                                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jRadioButton3)
                                        .addComponent(jRadioButton4))
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jRadioButton5)
                                        .addComponent(jRadioButton6))
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(CBDrenajeInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(CBDrenajeExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(CBDrenajeNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton7)
                        .addComponent(jRadioButton8))
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jRadioButton9)
                                .addComponent(jRadioButton10))
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton12)))
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton13)
                                .addComponent(jRadioButton16)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jRadioButton14)
                        .addComponent(jRadioButton17))
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jRadioButton15)
                        .addComponent(jRadioButton18))
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(jRadioButton19)
                        .addComponent(jRadioButton20))
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel58)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(TFVegetacionNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBUsoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFLimitacionUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60))
                        .addGap(39, 39, 39)
                        .addComponent(BGuardar)
                        .addGap(41, 41, 41))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void TFGradienteDeLaPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFGradienteDeLaPendienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFGradienteDeLaPendienteActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        // TODO add your handling code here:

        try {
            PreparedStatement pps;
            pps = cn.prepareStatement("INSERT INTO generalidades(Id_Generalidades,Id_Chequeo,Paisaje,Tipo_Relieve,Forma_Terreno,"
                    + "Material_Parental,Microrelieve,Gradiente_Pendiente,Longitud_Pendiente,Forma_Pendiente,"
                    + "Piso_Termico,Provincia_Humedad,Regimen_Temperatura,Regimen_Humedad,Clase_Tipo_Erosion,"
                    + "Frecuencia_Erosion,Porcentaje_Afloramiento_Rocoso,Tipo_Pedregosidad_Superficial,"
                    + "Clase_Pedregosidad_Superficial,Porcentaje_Pedregosidad_Superficial,Drenaje_Interno,Drenaje_Externo,"
                    + "Drenaje_Natural,Frecuencia_Inundacion,Duracion_Inundacion,Frecuencia_Encharcamiento,"
                    + "Duracion_Encharcamiento,Naturaleza_Nivel_Freatico,Profundidad_Nivel_Fratico,Clase_Limitacion,"
                    + "Profundidad_Limitacion,Ancho_Grietas,Profundidad_Grietas,Volumen_Plintita,Fase_Plintita,"
                    + "Evidencia_Sales,Vegetacion_Natural,Uso_Actual,Limitacion_Uso) "
                    + "VALUES (?,?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,"
                    + "?,?,?,?,"
                    + "?,?,?,?,"
                    + "?,?,?,?,"
                    + "?,?,?,?,?,"
                    + "?,?,?,?)");
            pps.setString(1,TFIdGeneralidades.getText());
            pps.setString(2,TFId_Chequeo.getText());
            pps.setString(3,CBPaisaje.getSelectedItem().toString());
            pps.setString(4,CBTipoDeRelieve.getSelectedItem().toString());
            pps.setString(5,CBFormaDeTerreno.getSelectedItem().toString());
            pps.setString(6,CBMaterialParental.getSelectedItem().toString());
            pps.setString(7,CBMicrorelieve.getSelectedItem().toString());
            pps.setString(8,TFGradienteDeLaPendiente.getText());
            pps.setString(9,CBLongitudDeLaPendiente.getSelectedItem().toString());
            pps.setString(10,CBFormaDeLaPendiente.getSelectedItem().toString());
            pps.setString(11,CBPisoTérmico.getSelectedItem().toString());
            pps.setString(12,CBProvinciaDeHumedad.getSelectedItem().toString());
            pps.setString(13,CBRegimenDeTemperatura.getSelectedItem().toString());
            pps.setString(14,CBRegimenDeHumedad.getSelectedItem().toString());
            pps.setString(15,"NO");
            pps.setString(16,"NO");
            pps.setString(17,"NO");
            pps.setString(18,"NO");
            pps.setString(19,"NO");
            pps.setString(20,"NO");
            pps.setString(21,CBDrenajeInterno.getSelectedItem().toString());
            pps.setString(22,CBDrenajeExterno.getSelectedItem().toString());
            pps.setString(23,CBDrenajeNatural.getSelectedItem().toString());
            pps.setString(24,"NO");
            pps.setString(25,"NO");
            pps.setString(26,"NO");
            pps.setString(27,"NO");
            pps.setString(28,"NO");
            pps.setString(29,"NO");
            pps.setString(30,"NO");     //Limitacion_Profundidad.getSelection().toString());
            pps.setString(31,"NO");
            pps.setString(32,"NO");
            pps.setString(33,"NO");
            pps.setString(34,"NO");
            pps.setString(35,"NO");
            pps.setString(36,"NO");
            pps.setString(37,TFVegetacionNatural.getText());
            pps.setString(38,CBUsoActual.getSelectedItem().toString());
            pps.setString(39,TFLimitacionUso.getText());

            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            
            Horizontes pp = new Horizontes();
            pp.setVisible(true);
            
            this.dispose();
            Horizontes.jLabel66.setText(jLabel7.getText());

        } catch (SQLException ex) {
            Logger.getLogger(Chequeo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,"holi\npor\naqui");
        JOptionPane.showMessageDialog(null,"Porción de espacio tridimensional constituida por una repetición de\n" +
                "tipos de relieve idénticos o por una asociación de tipos de relieve diferentes."+
                "\n\nMontaña - Elevación natural del terreno de diverso origen con topografía escarpada o\n" +
                "empinada, tiene desniveles mayores de 300 m e importantes disecciones. Más extensa y alta\n" +
                "que una colina y forma parte de una cordillera.\n" +
                "\nAltillanura – Altiplano, meseta situada a gran altitud.\n" +
                "\nPlanicie - Gran extensión de terreno que no presenta fuertes desniveles (Google)\n" +
                "\nLomerío – Superficie disectada de lomas y/o colinas, donde las cimas están\n" +
                "aproximadamente al mismo nivel\n" +
                "\nPiedemonte – Superficie inclinada situada al pie de las vertientes de montaña. Definido\n" +
                "básicamente por su posición intermedia entre la montaña y la planicie.","Paisaje",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Configuración de una superficie con distintos niveles o partes que más o\n" +
                "menos sobresalen.\n" +
                "\nAbanico - Superficie de configuración semi-radial formada por acumulación de materiales\n" +
                "explayados al pie de una vertiente, la pendiente es suave y paralela a su eje.\n" +
                "\nTerraza - Superficie plana y alta de antigua acumulación aluvial, limitada por un escarpe\n" +
                "vertical o por un talud de sedimentación.\n" +
                "\nFila - Cresta montañosa longitudinal de flancos abruptos excavados por valles estrechos.","Tipo de Relieve",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Masa sin consolidar sobre el cual se desarrolla el perfil de suelo;\n" +
                "incluye el material \"in situ\" o roca y material transportado","Material parental",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Abarca el conjunto de pequeñas diferencias del relieve local,\n" +
                "proporcionadas por irregularidades de la superficie cuyas diferencias de altura son\n" +
                "tan pequeñas que no pueden ser representadas en la escala corriente de un mapa.","Micro – relieve",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Grado de inclinación del terreno",
                "Gradiente de la Pendiente",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Distancia horizontal que abarca la pendiente.\n" +
                "identificada.","Longitud de la pendiente",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Disposición en la que se encuentra la pendiente.",
                "Forma de la pendiente",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        String var="http://google.com/";
        JOptionPane.showMessageDialog(null,"Clase de relieve que presenta determinadas condiciones climáticas en\n" +
                "su territorio.\n" +
                "\nPiso Térmico Cálido: localizado entre 0 y 1.000 m, con valores superiores a 24°C y\n" +
                "un margen de altitud en el límite superior hasta 400 m, según sea las características\n" +
                "locales.\n" +
                "\nPiso Térmico Templado: Comprende altitudes situadas entre 1.000 y 2.000 m, con\n" +
                "temperaturas mayores o iguales a 17,5°C y con un margen de amplitud en sus\n" +
                "límites superiores e inferior de 500 m.\n" +
                "\nPiso Térmico Frio: se localiza entre 2.000 y 3.000 m de altitud, con temperaturas no\n" +
                "inferiores a 12°C y un margen en sus límites altitudinales superior e inferior de 400m.\n" +
                "\nPiso Térmico Paramuno: corresponde a las áreas situadas sobre los 3.000 m de\n" +
                "altitud y bajo el límite de las nieves perpetuas. Con el propósito de detallar más las\n" +
                "condiciones climáticas se subdivide en dos zonas de paramo:" +
                "     \nParamo Bajo, de mayor temperatura, con altitud que oscila entre 3.200 y 3.700 m " +
                "     \n          y que se caracteriza por estar en el intervalo de los 7 a los 12°C." +
                "     \nParamo Alto, de los 3.700 m a los 4.200, aproximadamente. \n\n",
                "Piso térmico",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Resultado de la división entre precipitación anual y\n" +
                "temperatura media anual","Provincia de humedad",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Establece el valor de la T° relativamente constante y la\n" +
                "profundidad a la cual se presenta.","Régimen de temperatura",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Número de días (acumulados) en que la sección control del\n" +
                "suelo se encuentra seca o húmeda.","Régimen de humedad",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Pérdida físico–mecánica reflejada en un desgaste del suelo.",
                "Erosión",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Áreas en donde la superficie del suelo está constituida por\n" +
                "capas de rocas expuestas","Afloramiento rocoso",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Cantidad de piedras de más de 25cm de diámetro sobre el suelo.",
                "Pedregosidad superficial",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Circulación del agua a través del perfil del suelo.",
                "Drenaje interno",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Evacuación progresiva de aguas de escurrimiento\n" +
                "superficialmente.", "Drenaje externo",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Velocidad relativa con que el agua se mueve por el suelo.",
                "Drenaje natural",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Ocupación por parte del agua en zonas que habitualmente están\n" +
                "libres de esta","Inundaciones",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Formación de charcos.","Encharcamientos",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Lámina de agua libre que satura transitoria o permanentemente\n" +
                "todos los poros del suelo en una sección determinada.","Nivel freático",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Limitación que impide la penetración de las\n" +
                "raíces en el suelo","Limitación en profundidad efectiva",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Abertura larga y estrecha producto de la separación superficial del suelo.",
                "Grietas",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Arcilla que contiene compuestos de hierro cuyo color es rojo ladrillo.",
                "Plintita",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Sales – Suelos con alto contenido de sales solubles que\n" +
                "afectan desarrollo de cultivos.","Sales",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Cobertura de plantas que crecen\n" +
                "espontáneamente sobre la superficie.","Vegetación natural",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Actividad para la que está destinada actualmente el suelo.",
                "Uso actual",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Restricción que no permite realizar la correcta función del suelo.",
                "Limitante de uso",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

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
            java.util.logging.Logger.getLogger(Generalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AfloramientoRocoso;
    private javax.swing.JButton BGuardar;
    private javax.swing.JComboBox<String> CBDrenajeExterno;
    private javax.swing.JComboBox<String> CBDrenajeInterno;
    private javax.swing.JComboBox<String> CBDrenajeNatural;
    private javax.swing.JComboBox<String> CBFormaDeLaPendiente;
    private javax.swing.JComboBox<String> CBFormaDeTerreno;
    private javax.swing.JComboBox<String> CBLongitudDeLaPendiente;
    private javax.swing.JComboBox<String> CBMaterialParental;
    private javax.swing.JComboBox<String> CBMicrorelieve;
    private javax.swing.JComboBox<String> CBPaisaje;
    private javax.swing.JComboBox<String> CBPisoTérmico;
    private javax.swing.JComboBox<String> CBProvinciaDeHumedad;
    private javax.swing.JComboBox<String> CBRegimenDeHumedad;
    private javax.swing.JComboBox<String> CBRegimenDeTemperatura;
    private javax.swing.JComboBox<String> CBTipoDeRelieve;
    private javax.swing.JComboBox<String> CBUsoActual;
    private javax.swing.ButtonGroup Encharcamientos;
    private javax.swing.ButtonGroup Erosion;
    private javax.swing.ButtonGroup Grietas;
    private javax.swing.ButtonGroup Inundaciones;
    private javax.swing.ButtonGroup Limitacion_Profundidad;
    private javax.swing.ButtonGroup Nivel_Freatico;
    private javax.swing.ButtonGroup PedregosidadSuperficial;
    private javax.swing.ButtonGroup Plintita;
    private javax.swing.ButtonGroup Sales;
    private javax.swing.JTextField TFGradienteDeLaPendiente;
    private javax.swing.JTextField TFIdGeneralidades;
    public static javax.swing.JTextField TFId_Chequeo;
    private javax.swing.JTextField TFLimitacionUso;
    private javax.swing.JTextField TFVegetacionNatural;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    public static javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
