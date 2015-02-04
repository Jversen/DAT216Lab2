package recipesearch;

import se.chalmers.ait.dat215.lab2.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class RecipeSearchView extends javax.swing.JFrame {
    
    
    RecipeController reciCon = new RecipeController();
    ArrayList<JButton> reciButtons = new ArrayList<JButton>();
    int maxTime;
    int maxPrice;
    String kitchenItem;
    String ingredientItem;
    String difficultyItem;
    ImageIcon recipeImg = new ImageIcon("recipe1.jpg");
    
    /**
     * Creates new form ExampleApplicationView
     */
    public RecipeSearchView() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        SearchPanel = new javax.swing.JPanel();
        kitchenLabel = new javax.swing.JLabel();
        maxTimeLabel = new javax.swing.JLabel();
        kitchenList = new javax.swing.JComboBox();
        ingredientLabel = new javax.swing.JLabel();
        ingredientList = new javax.swing.JComboBox();
        difficultyLabel = new javax.swing.JLabel();
        difficultyList = new javax.swing.JComboBox();
        maxPriceLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        maxTimeSlider = new javax.swing.JSlider();
        maxPriceSpinner = new javax.swing.JSpinner();
        resultsAndRecipePanel = new javax.swing.JPanel();
        resultsPanel = new javax.swing.JPanel();
        recipePanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("recipesearch/resources/RecipeSearch"); // NOI18N
        setTitle(bundle.getString("Application.title")); // NOI18N
        setName("applicationFrame"); // NOI18N

        kitchenLabel.setText("Kök");

        maxTimeLabel.setText("Maxtid");

        kitchenList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Sverige", "Grekland", "Indien", "Asien", "Afrika", "Frankrike" }));
        kitchenList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitchenListActionPerformed(evt);
            }
        });

        ingredientLabel.setText("Huvudingrediens");

        ingredientList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Kött", "Fisk", "Kyckling", "Vegetarisk" }));

        difficultyLabel.setText("Svårighetsgrad");

        difficultyList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Lätt", "Mellan", "Svår" }));

        maxPriceLabel.setText("Maxpris");

        searchButton.setText("Sök");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        maxTimeSlider.setMajorTickSpacing(20);
        maxTimeSlider.setMaximum(150);
        maxTimeSlider.setMinimum(10);
        maxTimeSlider.setMinorTickSpacing(10);
        maxTimeSlider.setPaintLabels(true);
        maxTimeSlider.setPaintTicks(true);
        maxTimeSlider.setSnapToTicks(true);

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(maxTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(kitchenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(kitchenList, 0, 285, Short.MAX_VALUE)
                        .addComponent(ingredientLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(ingredientList, 0, 285, Short.MAX_VALUE)
                        .addComponent(difficultyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(difficultyList, 0, 285, Short.MAX_VALUE)
                        .addComponent(maxPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(maxTimeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(maxPriceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kitchenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kitchenList, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingredientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingredientList, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(difficultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(difficultyList, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(maxPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxPriceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(maxTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3513, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(SearchPanel);

        resultsAndRecipePanel.setPreferredSize(new java.awt.Dimension(400, 50));
        resultsAndRecipePanel.setLayout(new java.awt.CardLayout());

        resultsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resultsPanel.setLayout(new java.awt.GridLayout(50, 1, 0, 5));
        resultsAndRecipePanel.add(resultsPanel, "card2");

        javax.swing.GroupLayout recipePanelLayout = new javax.swing.GroupLayout(recipePanel);
        recipePanel.setLayout(recipePanelLayout);
        recipePanelLayout.setHorizontalGroup(
            recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        recipePanelLayout.setVerticalGroup(
            recipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4195, Short.MAX_VALUE)
        );

        resultsAndRecipePanel.add(recipePanel, "card3");

        jSplitPane1.setRightComponent(resultsAndRecipePanel);

        java.util.ResourceBundle bundle1 = java.util.ResourceBundle.getBundle("recipesearch/resources/RecipeSearchView"); // NOI18N
        fileMenu.setText(bundle1.getString("fileMenu.text")); // NOI18N

        exitMenuItem.setText(bundle1.getString("exitApplicationMenuItem.text")); // NOI18N
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText(bundle1.getString("helpMenu.text")); // NOI18N

        aboutMenuItem.setText(bundle1.getString("aboutMenuItem.text")); // NOI18N
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        new RecipeSearchAboutBox(this).setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    
    private void kitchenListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitchenListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitchenListActionPerformed



    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        /////////////////////////////////////////////////////////////////////
//        try{
//            maxTime = Integer.parseInt(maxTimeField.getText());
//        }catch(NumberFormatException e){
//            maxTime = 0;
//        }
        
        maxPrice = (Integer) maxPriceSpinner.getValue();
        maxTime = maxTimeSlider.getValue();
       
        /////////////////////////////////////////////////////////////////////
        if(kitchenList.getSelectedItem().toString().equals("")){
            kitchenItem = null;
        }else{
            kitchenItem = kitchenList.getSelectedItem().toString();
        }
        
        if(ingredientList.getSelectedItem().toString().equals("")){
            ingredientItem = null;
        }else{
            ingredientItem = ingredientList.getSelectedItem().toString();
        }
        
        if(difficultyList.getSelectedItem().toString().equals("")){
            difficultyItem = null;
        }else{
            difficultyItem = difficultyList.getSelectedItem().toString();
        }
        /////////////////////////////////////////////////////////////////////
        reciCon.doSearch(difficultyItem, maxTime,
            kitchenItem, maxPrice, ingredientItem);
        
        reciButtons.clear();
        resultsPanel.removeAll();
        
        for(int i = 0; i< reciCon.recipes.size(); i++){
            if(reciCon.recipes.get(i).getMatch() > 49){
                JButton b = (new JButton(reciCon.recipes.get(i).getName() + " " + 
                        reciCon.recipes.get(i).getCuisine() + " " + 
                        reciCon.recipes.get(i).getMainIngredient() + " " + 
                        reciCon.recipes.get(i).getDifficulty()));
                b.setIcon(recipeImg);
               
                reciButtons.add(i, b);
                
                resultsPanel.add(reciButtons.get(i));
            }
        }
        validate();
        System.out.println(difficultyItem);
        System.out.println(maxTime);
        System.out.println(kitchenItem);
        System.out.println(maxPrice);
        System.out.println(ingredientItem);
        
    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JComboBox difficultyList;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel ingredientLabel;
    private javax.swing.JComboBox ingredientList;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel kitchenLabel;
    private javax.swing.JComboBox kitchenList;
    private javax.swing.JLabel maxPriceLabel;
    private javax.swing.JSpinner maxPriceSpinner;
    private javax.swing.JLabel maxTimeLabel;
    private javax.swing.JSlider maxTimeSlider;
    private javax.swing.JPanel recipePanel;
    private javax.swing.JPanel resultsAndRecipePanel;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}