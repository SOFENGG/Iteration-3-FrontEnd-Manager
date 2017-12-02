package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SupplierBanner extends Banner{
	
	private VBox supplierBanner;
		private Label supBannerName = new Label("Add Supplier: ");
		private VBox supplierAdd;
			private HBox UpperAddBox;
				private TextField supplierCodeField;
				private TextField supplierNameField;
				private TextField contactPersonField;
			private HBox LowerAddBox;
				private TextField contactNumberField;
				private TextField taxIdField;
				private Button addConfirm;
				
	public SupplierBanner(){
		initSupplierBanner();
		getChildren().add(supplierBanner);
	}

	private void initSupplierBanner() {
		/* Inventory Banner Initialization */
		supplierBanner = new VBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		supplierBanner.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		supplierBanner.setPadding(new Insets(10, 0, 0, 0));
		
		initSupplierAdd();
		
		/* Assembly of previously specified components*/
		supplierBanner.getChildren().addAll(supBannerName, supplierAdd);
	}

	private void initSupplierAdd() {
		/* Supplier Add Initialization */
		supplierAdd = new VBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		supplierAdd.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		supplierAdd.setPadding(new Insets(10, 10, 10, 10));
		
		/*Upper part of the Supplier Add*/
		UpperAddBox = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		
		/*Contains the label and textfield combinations for upper box*/
		VBox[] UADCombos = new VBox[3];
		
		/*item Code Combination*/
		UADCombos[0] = new VBox();
		supplierCodeField = new TextField();
		UADCombos[0].getChildren().addAll(new Label("Supplier Code:"), supplierCodeField);
		
		/*Supplier Combination*/
		UADCombos[1] = new VBox();
		supplierNameField = new TextField();
		UADCombos[1].getChildren().addAll(new Label("Name:"), supplierNameField);
	
		/*Requisitioner Combination*/
		UADCombos[2] = new VBox();
		contactPersonField = new TextField();
		UADCombos[2].getChildren().addAll(new Label("Contact Person:"), contactPersonField);
		
		/* Assembly of UpperBox*/
		UpperAddBox.getChildren().addAll(UADCombos[0], UADCombos[1], UADCombos[2]);
		
		/*Upper part of the Item Editer*/
		LowerAddBox = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		
		/*Contains the label and textfield combinations for lower combination*/
		VBox[] LADCombos = new VBox[2];
		
		/*item descritption Combination*/
		LADCombos[0] = new VBox();
		contactNumberField = new TextField();
		LADCombos[0].getChildren().addAll(new Label("Contact Number:"), contactNumberField);
		
		/*Unit price Combination*/
		LADCombos[1] = new VBox();
		taxIdField = new TextField();
		LADCombos[1].getChildren().addAll(new Label("tax ID:"), taxIdField);
		
		/*Edit Button initialization*/
		addConfirm = new Button("Confirm Edit");
		
		/* Assembly of LowerBox*/
		LowerAddBox.getChildren().addAll(LADCombos[0], LADCombos[1], addConfirm);
		
		
		/* Assembly of previously specified components*/
		supplierAdd.getChildren().addAll(UpperAddBox, LowerAddBox);
	
		
	}
}
