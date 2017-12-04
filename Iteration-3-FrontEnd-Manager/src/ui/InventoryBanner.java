package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InventoryBanner extends Banner{
	
		private TextField itemCodeField;
		private TextField ItemDescriptionField;
		
		private TextField supplierField;
		private TextField unitPriceField;
		
		private TextField requisitionerField;	
		private Button editConfirm;
		
		
	public InventoryBanner() {
		super();
		initInventoryBanner();
	}
	
	private void initInventoryBanner() {
		
		/* Banner Title */
		bannerTitle.setText(Values.BANNER_INVENTORY);
		
		initInventoryEdit();
		
		/* Assembly of previously specified components*/
		//inventoryBanner.getChildren().addAll(InvBannerName, inventoryEdit);
	}

	private void initInventoryEdit() {		
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
		//UpperEditBox.getChildren().addAll(UEBCombos[0], UEBCombos[1], UEBCombos[2]);
		
		/*Upper part of the Item Editer*/
		//LowerEditBox = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		
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
		//LowerEditBox.getChildren().addAll(LEBCombos[0], LEBCombos[1], editConfirm);
		
		
		/* Assembly of previously specified components*/
		//inventoryEdit.getChildren().addAll(UpperEditBox, LowerEditBox);
		
		rightSection.setSpacing(30);;
		
		/* Assembly */
		leftSection.getChildren().addAll(UEBCombos[0], LEBCombos[0]);
		middleSection.getChildren().addAll(UEBCombos[1], LEBCombos[1]);
		rightSection.getChildren().addAll(UEBCombos[2], editConfirm);
	
	}
}
