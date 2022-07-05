/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author simon
 */
public class Interfaz extends javax.swing.JFrame {
    String aux = "";
    HashTable hs = new HashTable();
    HashTable hs2 = new HashTable(aux);
    HashTable hs3 = new HashTable(aux);
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        keyWordList.removeAllItems();
        authorList.removeAllItems();
        resumenlist.removeAllItems();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregarresumen = new javax.swing.JButton();
        analizar = new javax.swing.JButton();
        buscarpalabraclave = new javax.swing.JButton();
        buscarautor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        volveragregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputResumen = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        volveranalizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboResumenes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        analisisderesumen = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        volverbuscarpalabraclave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        keyWordList = new javax.swing.JComboBox<>();
        buscar1 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputResumen2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        volverbuscarautor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        authorList = new javax.swing.JComboBox<>();
        buscar2 = new javax.swing.JToggleButton();
        resumenlist = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        outputResumen3 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        show = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 51));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SOUTH LIBRARY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agregue su resumen y navegue por las diferentes pestañas");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 90));

        agregarresumen.setBackground(new java.awt.Color(255, 204, 51));
        agregarresumen.setForeground(new java.awt.Color(0, 0, 0));
        agregarresumen.setText("AGREGAR RESUMEN ");
        agregarresumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarresumenActionPerformed(evt);
            }
        });
        jPanel2.add(agregarresumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, 40));

        analizar.setBackground(new java.awt.Color(255, 204, 51));
        analizar.setForeground(new java.awt.Color(0, 0, 0));
        analizar.setText("ANALIZAR RESUMEN ");
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });
        jPanel2.add(analizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, 40));

        buscarpalabraclave.setBackground(new java.awt.Color(255, 204, 51));
        buscarpalabraclave.setForeground(new java.awt.Color(0, 0, 0));
        buscarpalabraclave.setText("BUSCAR POR P.CLAVE");
        buscarpalabraclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpalabraclaveActionPerformed(evt);
            }
        });
        jPanel2.add(buscarpalabraclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 40));

        buscarautor.setBackground(new java.awt.Color(255, 204, 51));
        buscarautor.setForeground(new java.awt.Color(0, 0, 0));
        buscarautor.setText("BUSCAR POR AUTOR");
        buscarautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarautorActionPerformed(evt);
            }
        });
        jPanel2.add(buscarautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 100, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Open-folder-search-icon.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 520, 510));

        jTabbedPane1.addTab("INICIO", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volveragregar.setBackground(new java.awt.Color(255, 204, 51));
        volveragregar.setForeground(new java.awt.Color(0, 0, 0));
        volveragregar.setText("VOLVER");
        volveragregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volveragregarActionPerformed(evt);
            }
        });
        jPanel3.add(volveragregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addresumen_1.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        seleccionar.setBackground(new java.awt.Color(255, 204, 51));
        seleccionar.setForeground(new java.awt.Color(0, 0, 0));
        seleccionar.setText("SELECCIONAR");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        jPanel3.add(seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 150, 60));

        outputResumen.setColumns(20);
        outputResumen.setRows(5);
        outputResumen.setFocusable(false);
        jScrollPane1.setViewportView(outputResumen);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 310, 310));

        jTabbedPane1.addTab("ADD RESUMEN", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volveranalizar.setBackground(new java.awt.Color(255, 204, 51));
        volveranalizar.setForeground(new java.awt.Color(0, 0, 0));
        volveranalizar.setText("VOLVER");
        volveranalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volveranalizarActionPerformed(evt);
            }
        });
        jPanel4.add(volveranalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 100, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document-search-flat.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        cboResumenes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboResumenesItemStateChanged(evt);
            }
        });
        cboResumenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboResumenesActionPerformed(evt);
            }
        });
        jPanel4.add(cboResumenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 350, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Lista de resumenes ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        analisisderesumen.setColumns(20);
        analisisderesumen.setRows(5);
        jScrollPane2.setViewportView(analisisderesumen);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 460, 390));

        jTabbedPane1.addTab("ANALIZAR RESUMEN", jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverbuscarpalabraclave.setBackground(new java.awt.Color(255, 204, 51));
        volverbuscarpalabraclave.setForeground(new java.awt.Color(0, 0, 0));
        volverbuscarpalabraclave.setText("VOLVER");
        volverbuscarpalabraclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverbuscarpalabraclaveActionPerformed(evt);
            }
        });
        jPanel5.add(volverbuscarpalabraclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/keyword.png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        keyWordList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        keyWordList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyWordListActionPerformed(evt);
            }
        });
        jPanel5.add(keyWordList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 52, 270, 40));

        buscar1.setText("Buscar");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        jPanel5.add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        outputResumen2.setColumns(20);
        outputResumen2.setRows(5);
        outputResumen2.setFocusable(false);
        jScrollPane3.setViewportView(outputResumen2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 310, 310));

        jLabel10.setBackground(new java.awt.Color(255, 204, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Palabras claves:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jTabbedPane1.addTab("BUSCAR P.CLAVE", jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverbuscarautor.setBackground(new java.awt.Color(255, 204, 51));
        volverbuscarautor.setForeground(new java.awt.Color(0, 0, 0));
        volverbuscarautor.setText("VOLVER");
        volverbuscarautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverbuscarautorActionPerformed(evt);
            }
        });
        jPanel6.add(volverbuscarautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document-search-icon_2.png"))); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        authorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        authorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorListActionPerformed(evt);
            }
        });
        jPanel6.add(authorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 270, 40));

        buscar2.setText("Buscar");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        jPanel6.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        resumenlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        resumenlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenlistActionPerformed(evt);
            }
        });
        jPanel6.add(resumenlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 270, 40));

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Autores:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        outputResumen3.setColumns(20);
        outputResumen3.setRows(5);
        outputResumen3.setFocusable(false);
        jScrollPane4.setViewportView(outputResumen3);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 340, 280));

        jLabel11.setBackground(new java.awt.Color(255, 204, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Resúmenes del autor seleccionado:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel6.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 172, 70, 30));

        jTabbedPane1.addTab("BUSCAR P.AUTOR", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarpalabraclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpalabraclaveActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_buscarpalabraclaveActionPerformed

    private void buscarautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarautorActionPerformed
         jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_buscarautorActionPerformed

    private void agregarresumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarresumenActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_agregarresumenActionPerformed

    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
         jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_analizarActionPerformed

    private void volveragregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volveragregarActionPerformed
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_volveragregarActionPerformed

    private void volverbuscarautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverbuscarautorActionPerformed
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_volverbuscarautorActionPerformed

    private void volverbuscarpalabraclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverbuscarpalabraclaveActionPerformed
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_volverbuscarpalabraclaveActionPerformed

    private void volveranalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volveranalizarActionPerformed
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_volveranalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
    *
    * @author ERodríguez
    * @version 27/06/2022
    */
    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
       
        File archivo = fc.getSelectedFile();
        
        String filename = archivo.getPath();
        
        try{
            if((archivo.getName()).contains(".txt"))
            {
                Resumen resumen = new Resumen(filename);  

                if(hs.getNumElementos() != 0)
                {                

                    if(hs.buscar(resumen.getTitulo()) == null){
                        hs.insertar(resumen);
                        
                        Nodo nodito = resumen.getPalabraClave().getPfirst();
                        for (int i = 0; i < resumen.getPalabraClave().getTamanho(); i++) 
                        {
                            keywordArr k = new keywordArr(String.valueOf(nodito.getData()), resumen.getTitulo());
                            hs2.insertar2(k);
                            nodito = nodito.getPnext();
                        }
                        
                        outputResumen.setText(resumen.getTitulo() + "\n" + "\n" +"-Autores:" + "\n" + resumen.getAutor().ObtenerInfo() + "\n" + "\n"  +"-Resumen:" + "\n"+ resumen.getCuerpo() + "\n" + "\n" + "-Palabras claves:" + "\n" + resumen.getPalabraClave().ObtenerInfo());
                        cboResumenes.addItem(resumen.getTitulo());

                        
                        Nodo key = resumen.getPalabraClave().getPfirst();
                        for (int i = 0; i < resumen.getPalabraClave().getTamanho() ; i++) 
                        {
                            keyWordList.addItem(key.getData().toString());
                            key = key.getPnext();
                        }
                        Nodo autorsito = resumen.getAutor().getPfirst();
                        boolean test = true;
                        for (int i = 0; i < resumen.getAutor().getTamanho() ; i++)
                        {
                           Object a = autorsito.getData();
                           String b = String.valueOf(a).replaceAll("\\p{Punct}", " ");
                           test = true;
                            for (int j = 0; j < authorList.getItemCount(); j++) 
                            {
                                if((b.trim()).equals((authorList.getItemAt(j)).trim()))
                                {
                                    test = false;  
                                }
                            }
                            if(test == true)
                            {
                                authorList.addItem(b);
                            }
                            autorsito = autorsito.getPnext();
                        }
                        Nodo a = resumen.getAutor().getPfirst();
                        for (int i = 0; i < resumen.getAutor().getTamanho(); i++) 
                        {
                        if(hs3.buscar2(String.valueOf(a.getData()).replaceAll("\\p{Punct}", " "))==null)
                        {
                        keywordArr m = new keywordArr(String.valueOf(a.getData()).replaceAll("\\p{Punct}", " "));
                        Nodo n = new Nodo(resumen.getTitulo());
                        (m.getTitulos()).addAtEnd(n);
                        hs3.insertar2(m);
                        a = a.getPnext();
                        }
                        else 
                        {
                           keywordArr m = hs3.buscar2(String.valueOf(a.getData()).replaceAll("\\p{Punct}", " "));
                           Nodo n = new Nodo(resumen.getTitulo());
                           (m.getTitulos()).addAtEnd(n);
                           hs3.insertar2(m);
                           a = a.getPnext();
                        }
                        }

                    }else{
                        JOptionPane.showMessageDialog(null, "Error, no se puede insertar el mismo resumen dos veces.");
                    }

                }
                else{

                    hs.insertar(resumen);


                    outputResumen.setText(resumen.getTitulo() + "\n" + "\n" +"-Autores:" + "\n" + resumen.getAutor().ObtenerInfo() + "\n" + "\n"  +"-Resumen:" + "\n"+ resumen.getCuerpo() + "\n" + "\n" + "-Palabras claves:" + "\n" + resumen.getPalabraClave().ObtenerInfo());
                    cboResumenes.addItem(resumen.getTitulo());
                    
                    Nodo key = resumen.getPalabraClave().getPfirst();
                    for (int i = 0; i < resumen.getPalabraClave().getTamanho() ; i++) 
                    {
                        keyWordList.addItem(key.getData().toString());
                        key = key.getPnext();
                        
                    }
                    Nodo autorsito = resumen.getAutor().getPfirst(); 
                    for (int i = 0; i < resumen.getAutor().getTamanho() ; i++) 
                    {
                        authorList.addItem(autorsito.getData().toString().replaceAll("\\p{Punct}", " "));
                        autorsito = autorsito.getPnext();                       
                    }
                    
                    Nodo a = resumen.getAutor().getPfirst();
                        for (int i = 0; i < resumen.getAutor().getTamanho(); i++) 
                        {
                        keywordArr m = new keywordArr(String.valueOf(a.getData()).replaceAll("\\p{Punct}", " "));
                        
                        Nodo n = new Nodo(resumen.getTitulo());
                        (m.getTitulos()).addAtEnd(n);
                        hs3.insertar2(m);
                        a = a.getPnext();
                        }
                        
                    Nodo nodito = resumen.getPalabraClave().getPfirst();
                    for (int i = 0; i < resumen.getPalabraClave().getTamanho(); i++) 
                    {
                        keywordArr k = new keywordArr(String.valueOf(nodito.getData()), resumen.getTitulo());
                        hs2.insertar2(k);
                        nodito = nodito.getPnext();
                    }
                    
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Tipo de archivo inválido, ingrese un archivo de texto.");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo inválido.");
        }

    }//GEN-LAST:event_seleccionarActionPerformed


    private void authorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorListActionPerformed

    private void cboResumenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboResumenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboResumenesActionPerformed

    @SuppressWarnings("empty-statement")
    private void cboResumenesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboResumenesItemStateChanged
        String titresumen = (String) cboResumenes.getSelectedItem();
        Resumen clave = hs.buscar(titresumen);
        Lista listakey = clave.getPalabraClave();
        

        if (titresumen == clave.getTitulo()){
        String texto = clave.getCuerpo().toLowerCase();
        String textof = texto.replaceAll("\\p{Punct}", "");
        //Esto nos sirve para validar si tienen la palabra al inicio y final se cuenten
        String textomodify = "@prueba@ " + textof + " @prueba@";
        String palabrasclaves="";
        Nodo temp = listakey.getPfirst();
        for (int i = 0; i< listakey.getTamanho(); i++ ){ 
            int cont = 0;   
//            System.out.println(listakey.getNodo(i).getData()); 
            String palabraclave = (String) listakey.getNodo(i).getData();
            String palabrafinal = palabraclave.toLowerCase().replaceAll("\\p{Punct}", "");
            String[] textosplit = textomodify.split(palabrafinal+" ");
            cont = textosplit.length -1; 
            palabrasclaves += temp.getData() +  ":" + " " + "se repite" +" "+ cont+" "+ "veces"+"\n";
            temp = listakey.proximoNodo(temp);
        }
        analisisderesumen.setText("Nombre del trabajo: "+ clave.getTitulo()+"\n" + "\n"+"Autores: "+ "\n" + clave.getAutor().ObtenerInfo()+ "\n"+"Las palabras claves son: "+"\n"+palabrasclaves);
           
        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos no se puede mostrar el analisis de este resumen");
        }
    }//GEN-LAST:event_cboResumenesItemStateChanged

    private void resumenlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resumenlistActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        // TODO add your handling code here:
        resumenlist.removeAllItems();
        outputResumen3.setText("");
        keywordArr autor = hs3.buscar2(String.valueOf(authorList.getSelectedItem()));
        Nodo a = autor.getTitulos().getPfirst();
        for (int i = 0; i < autor.getTitulos().getTamanho() ; i++)
        {
            resumenlist.addItem(String.valueOf(a.getData()));
            a = a.getPnext();  
        }       
    }//GEN-LAST:event_buscar2ActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        // TODO add your handling code here:
        keywordArr palabra = hs2.buscar2(String.valueOf(keyWordList.getSelectedItem()));
        Resumen resumen = hs.buscar(palabra.getTitulo());
        outputResumen2.setText(resumen.getTitulo() + "\n" + "\n" +"-Autores:" + "\n" + resumen.getAutor().ObtenerInfo() + "\n" + "\n"  +"-Resumen:" + "\n"+ resumen.getCuerpo() + "\n" + "\n" + "-Palabras claves:" + "\n" + resumen.getPalabraClave().ObtenerInfo());
                        
    }//GEN-LAST:event_buscar1ActionPerformed

    private void keyWordListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyWordListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyWordListActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        Resumen resumen = hs.buscar(String.valueOf(resumenlist.getSelectedItem()));
        outputResumen3.setText(resumen.getTitulo() + "\n" + "\n" +"-Autores:" + "\n" + resumen.getAutor().ObtenerInfo() + "\n" + "\n"  +"-Resumen:" + "\n"+ resumen.getCuerpo() + "\n" + "\n" + "-Palabras claves:" + "\n" + resumen.getPalabraClave().ObtenerInfo());                
    }//GEN-LAST:event_showActionPerformed


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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarresumen;
    private javax.swing.JTextArea analisisderesumen;
    private javax.swing.JButton analizar;
    private javax.swing.JComboBox<String> authorList;
    private javax.swing.JToggleButton buscar1;
    private javax.swing.JToggleButton buscar2;
    private javax.swing.JButton buscarautor;
    private javax.swing.JButton buscarpalabraclave;
    private javax.swing.JComboBox<String> cboResumenes;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> keyWordList;
    private javax.swing.JTextArea outputResumen;
    private javax.swing.JTextArea outputResumen2;
    private javax.swing.JTextArea outputResumen3;
    private javax.swing.JComboBox<String> resumenlist;
    private javax.swing.JButton seleccionar;
    private javax.swing.JToggleButton show;
    private javax.swing.JButton volveragregar;
    private javax.swing.JButton volveranalizar;
    private javax.swing.JButton volverbuscarautor;
    private javax.swing.JButton volverbuscarpalabraclave;
    // End of variables declaration//GEN-END:variables
}
