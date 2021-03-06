/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.bean.Resultado;
import model.bean.Exame;
import model.dao.DoencaDAO;
import model.dao.ResultadoDAO;
import model.dao.ExameDAO;

/**
 *
 * @author William
 */
public class Exames extends javax.swing.JFrame {

    /**
     * Creates new form Exames
     */
    public Exames() {
        initComponents();
        readJTableE();
        readJTableD();     
        readJTableP(); 
        elementsEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        positivo = new javax.swing.JButton();
        negativo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        examesTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        doencasTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultadoTable = new javax.swing.JTable();
        salvar = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        positivo.setText(">>>>");
        positivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positivoActionPerformed(evt);
            }
        });

        negativo.setText("<<<<");
        negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativoActionPerformed(evt);
            }
        });

        examesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Exame ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        examesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                examesTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(examesTable);
        if (examesTable.getColumnModel().getColumnCount() > 0) {
            examesTable.getColumnModel().getColumn(0).setResizable(false);
            examesTable.getColumnModel().getColumn(1).setResizable(false);
        }

        doencasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Doencas"
            }
        ));
        doencasTable.setToolTipText("");
        doencasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doencasTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(doencasTable);
        if (doencasTable.getColumnModel().getColumnCount() > 0) {
            doencasTable.getColumnModel().getColumn(0).setResizable(false);
        }

        resultadoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Negativo", "Positivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultadoTable.setToolTipText("");
        resultadoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resultadoTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(resultadoTable);
        if (resultadoTable.getColumnModel().getColumnCount() > 0) {
            resultadoTable.getColumnModel().getColumn(0).setResizable(false);
        }

        salvar.setText("SALVAR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(negativo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(positivo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negativo)
                    .addComponent(positivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ResultadoDAO rdao = new ResultadoDAO();  
    DoencaDAO ddao = new DoencaDAO();      
    ExameDAO exdao = new ExameDAO(); 
    private int doencaCont = 0;
    private String resultados[][] = null;       
    String doencaoCurrent = null;
    
    public int currentIdExame () { 
        int id = 0;
         try {
            id = Integer.parseInt(String.valueOf(examesTable.getModel().getValueAt(examesTable.getSelectedRow(),0)));  
            System.out.println(examesTable.getModel().getValueAt(examesTable.getSelectedRow(),0));
         } catch (Exception ex) {
             System.out.println(ex);
         }
         return id ; 
    }
    
    private void readJTableE() {
        DefaultTableModel modelo = (DefaultTableModel) examesTable.getModel();
        modelo.setNumRows(0);          
        for (Exame d : exdao.read()) {
            modelo.addRow(new Object[]{ 
                d.getIdExame(),
                d.getNome()
            });
        }    
    }
    

    private void readJTableP() {
        DefaultTableModel modelo = (DefaultTableModel) resultadoTable.getModel();
        modelo.setNumRows(0);     
        int i =0;
        int next =0;
        i=0;        
        String doenca = "";
        boolean equalDoenca = false;
        String resultadosExames[][] = new String[doencaCont][2];
        for (Resultado d : rdao.read(currentIdExame())) {    
            resultadosExames[i][0] = d.getNomeDoenca(); 
            resultadosExames[i][1] = String.valueOf(d.getResultado());                
            i++;
        } 
        i=0;
        for (Resultado d : rdao.read()) {  

                try {
                    if (resultadosExames[next][0].equals(d.getNomeDoenca())) {  
                        if (resultadosExames[next][1].equals("1")) {
                            resultados[i][1]=resultadosExames[next][0];
                        } else  {
                            resultados[i][0]=resultadosExames[next][0];
                        }
                        next++;
                    }
                } catch (Exception ex) {
                    resultados[i][0]=null;
                    resultados[i][0]=null; 
                }
            i++;
        }
        next=0;
        i = 0; 
        for (Resultado d : rdao.read()) {
            modelo.addRow(new Object[]{   
                resultados[i][0],
                resultados[i][1]
            });   
            System.out.println(resultados[i][0]+" | "+resultados[i][0]);
            i++;
        }     
        i = 0;
    } 
    
    private void readJTableD() {
        DefaultTableModel modelo = (DefaultTableModel) doencasTable.getModel();    
        modelo.setNumRows(0);
        modelo.setNumRows(0);        
        this.doencaCont=0;
        for (Resultado d : rdao.read()) {
            modelo.addRow(new Object[]{ 
                d.getNomeDoenca()
            });  
            this.doencaCont++;
        }                 
        resultados = new String[doencaCont][2];          
    }     
    
    private void salvar () {
        String[][] resultadoExame = new String[doencaCont][2];
        int next = 0;
        for (int l = 0;l<doencaCont;l++) {
            for (int c = 0;c<2;c++){ 
                if(resultadoTable.getModel().getValueAt(l,c)!= null) {
                    resultadoExame[next][0] = ""+c; 
                    resultadoExame[next][1] = ""+ddao.readId(String.valueOf( resultadoTable.getModel().getValueAt(l,c) ) ) ;                     
                    next++; 
                }
            }
        }   
        System.out.print("Coluna : \n");
        for (int b=0;b<doencaCont;b++) {
            System.out.println(resultadoExame[b][0]+" | "+resultadoExame[b][1]);
        }             
        System.out.print("Fim Coluna : \n");
        rdao.salvar(currentIdExame (),resultadoExame,next);
        elementsEnabled(false);
        examesTable.clearSelection();
        readJTableD();
        readJTableP();        
    }
    
    private void elementsEnabled (boolean b) {
        resultadoTable.clearSelection();   
        doencasTable.clearSelection();        
        salvar.setEnabled(b);
        positivo.setEnabled(b);
        negativo.setEnabled(b);        
    } 

    private void addDoenca () { 
        try {
            if ( resultadoTable.getModel().getValueAt(doencasTable.getSelectedRow(),0) == null && resultadoTable.getModel().getValueAt(doencasTable.getSelectedRow(),1) == null ) {
                resultadoTable.getModel().setValueAt(doencasTable.getModel().getValueAt(doencasTable.getSelectedRow(),0),doencasTable.getSelectedRow(),0);
            }

        } catch (Exception ex) {
            System.out.println("Wololo");
            System.out.println(ex);
        }       
    }  
    
    private void positivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positivoActionPerformed
        try {
            if (resultadoTable.getModel().getValueAt(resultadoTable.getSelectedRow(),0) != null) {
                resultadoTable.getModel().setValueAt(resultadoTable.getModel().getValueAt(resultadoTable.getSelectedRow(),0),resultadoTable.getSelectedRow(),1);
                resultadoTable.getModel().setValueAt(null,resultadoTable.getSelectedRow(),0); 
            }
        } catch (Exception Ex) {
            System.out.println("Nenhuma célula selecionada!");
        }
        addDoenca();
    }//GEN-LAST:event_positivoActionPerformed

    private void negativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativoActionPerformed
        try {
            resultadoTable.getModel().setValueAt(resultadoTable.getModel().getValueAt(resultadoTable.getSelectedRow(),1),resultadoTable.getSelectedRow(),0);
            resultadoTable.getModel().setValueAt(null,resultadoTable.getSelectedRow(),1); 
        } catch (Exception Ex) {
            System.out.println("Nenhuma célula selecionada!");
        }
    }//GEN-LAST:event_negativoActionPerformed

    private void examesTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examesTableMousePressed
        readJTableD();
        readJTableP();     
        elementsEnabled(true);
    }//GEN-LAST:event_examesTableMousePressed

    private void resultadoTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadoTableMousePressed
        doencasTable.setColumnSelectionInterval(0,0);
        doencasTable.setRowSelectionInterval(resultadoTable.getSelectedRow(),resultadoTable.getSelectedRow());
    }//GEN-LAST:event_resultadoTableMousePressed

    private void doencasTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doencasTableMousePressed
        resultadoTable.setColumnSelectionInterval(0,1);
        resultadoTable.setRowSelectionInterval(doencasTable.getSelectedRow(),doencasTable.getSelectedRow());
    }//GEN-LAST:event_doencasTableMousePressed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        salvar ();
    }//GEN-LAST:event_salvarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doencasTable;
    private javax.swing.JTable examesTable;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton negativo;
    private javax.swing.JButton positivo;
    private javax.swing.JTable resultadoTable;
    private javax.swing.JToggleButton salvar;
    // End of variables declaration//GEN-END:variables
}
