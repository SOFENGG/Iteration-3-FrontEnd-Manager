package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InventoryBanner extends Banner{
	
	private VBox inventoryBanner;
		private Label InvBannerName = new Label("Item Details: ");
		private VBox inventoryEdit;
			private HBox UpperEditBox;
				private TextField itemCodeField;
				private TextField supplierField;
				private TextField requisitionerField;
			private HBox LowerEditBox;	
				private TextField ItemDescriptionField;
				private TextField unitPriceField;
				private Button editConfirm;
	
	public InventoryBanner() {
		initInventoryBanner();
		getChildren().add(inventoryBanner);
	}
	
	private void initInventoryBanner() {
		/* Inventory Banner Initialization */
		inventoryBanner = new VBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		inventoryBanner.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		inventoryBanner.setPadding(new Insets(10, 0, 0, 0));
		
		initInventoryEdit();
		
		/* Assembly of previously specified components*/
		inventoryBanner.getChildren().addAll(InvBannerName, inventoryEdit);
	}

	private void initInventoryEdit() {
		/* Inventory Edit Initialization */
		inventoryEdit = new VBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		inventoryEdit.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		inventoryEdit.setPadding(new Insets(10, 10, 10, 10));
		
		/*Upper part of the Item Editer*/
		UpperEditBox = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		
		/*Contains the label and textfield combinations for upper box*/
		VBox[] UEBCombos = new VBox[3];
		
		/*item Code Combination*/
		UEBCombos[0] = new VBox();
		itemCodeField = new TextField();
		UEBCombos[0].getChildren().addAll(new Label("Item Code:"), itemCodeField);
		
		/*Supplier Combination*/
		UEBCombos[1] = new VBox();
		supplierField = new TextField();
		UEBCombos[1].getChildren().addAll(new Label("Supplier:"), supplierField);
		
		/*Requisitioner Combination*/
		UEBCombos[2] = new VBox();
		requisitionerField = new TextField();
		UEBCombos[2].getChildren().addAll(new Label("Requisitioner:"), requisitionerField);
		
		/* Assembly of UpperBox*/
		UpperEditBox.getChildren().addAll(UEBCombos[0], UEBCombos[1], UEBCombos[2]);
		
		/*Upper part of the Item Editer*/
		LowerEditBox = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		
		/*Contains the label and textfield combinations for lower combination*/
		VBox[] LEBCombos = new VBox[2];
		
		/*item descritption Combination*/
		LEBCombos[0] = new VBox();
		ItemDescriptionField = new TextField();
		LEBCombos[0].getChildren().addAll(new Label("Item Description:"), ItemDescriptionField);
		
		/*Unit price Combination*/
		LEBCombos[1] = new VBox();
		unitPriceField = new TextField();
		LEBCombos[1].getChildren().addAll(new Label("Unit Price:"), unitPriceField);
		
		/*Edit Button initialization*/
		editConfirm = new Button("Confirm Edit");
		
		/* Assembly of LowerBox*/
		LowerEditBox.getChildren().addAll(LEBCombos[0], LEBCombos[1], editConfirm);
		
		
		/* Assembly of previously specified components*/
		inventoryEdit.getChildren().addAll(UpperEditBox, LowerEditBox);
	}
}
