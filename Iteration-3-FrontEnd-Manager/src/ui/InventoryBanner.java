package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InventoryBanner extends Banner{
	

	/* Outer Left Section */
	private TextField itemCodeField;
	private TextField ItemDescriptionField;
	
	/* Inner Left Section */
	private TextField supplierField;
	private TextField unitPriceField;
	
	/* Inner Right Section */
	private TextField requisitionerField;	
	private Button editConfirm;

		
		
	public InventoryBanner() {
		super();
		updateToInventoryBanner();
	}
	
	private void updateToInventoryBanner() {
		/* Banner Title */
		bannerTitle.setText(Values.BANNER_INVENTORY);
		initInventoryEdit();
	}

	private void initInventoryEdit() {	
		/*Contains the label and textfield combinations for left box*/
		VBox[] leftCombos = new VBox[2];
		
		/*item Code Combination*/
		leftCombos[0] = new VBox();
		itemCodeField = new TextField();
		
		leftCombos[0].getChildren().addAll(new Label("Item Code:"), itemCodeField);

		
		/*item descritption Combination*/
		leftCombos[1] = new VBox();
		ItemDescriptionField = new TextField();
		leftCombos[1].getChildren().addAll(new Label("Item Description:"), ItemDescriptionField);
		
		/*Contains the label and textfield combinations for middle box*/
		VBox[] middleCombos = new VBox[2];
		
		/*Supplier Combination*/
		middleCombos[0] = new VBox();
		supplierField = new TextField();
		middleCombos[0].getChildren().addAll(new Label("Supplier:"), supplierField);
		
		/*Unit price Combination*/
		middleCombos[1] = new VBox();
		unitPriceField = new TextField();
		middleCombos[1].getChildren().addAll(new Label("Unit Price:"), unitPriceField);
		
		/*Contains the label and textfield combinations for right box*/
		VBox rightCombos = new VBox();
		
		/*Requisitioner Combination*/
		rightCombos = new VBox();
		requisitionerField = new TextField();
		rightCombos.getChildren().addAll(new Label("Requisitioner:"), requisitionerField);
		
		/*Edit Button initialization*/
		editConfirm = new Button("Confirm Edit");
		
		rightSection.setSpacing(30);;
		
		/* Assembly */
		leftSection.getChildren().addAll(leftCombos[0], leftCombos[1]);
		middleSection.getChildren().addAll(middleCombos[0], middleCombos[1]);
		rightSection.getChildren().addAll(rightCombos, editConfirm);
	
	}
}
