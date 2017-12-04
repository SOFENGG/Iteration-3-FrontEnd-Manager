package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SupplierBanner extends Banner{
	
	/* Outer Left Section */
	private TextField supplierCodeField;
	private TextField supplierNameField;
	private TextField contactPersonField;
	
	/* Inner Left Section */
	private TextField contactNumberField;
	private TextField taxIdField;
	
	/* Inner Right Section */
	private Button addConfirm;
				
	public SupplierBanner(){
		super();
		updateToSupplierBanner();
	}

	private void updateToSupplierBanner() {
		/* Banner Title */
		bannerTitle.setText(Values.BANNER_SUPPLIER);
		initSupplierAdd();
	}

	private void initSupplierAdd() {
		/*Contains the label and textfield combinations for left box*/
		VBox[] leftCombos = new VBox[2];
		
		/*item Code Combination*/
		leftCombos[0] = new VBox();
		supplierCodeField = new TextField();
		leftCombos[0].getChildren().addAll(new Label("Supplier Code:"), supplierCodeField);
		
		/*item descritption Combination*/
		leftCombos[1] = new VBox();
		contactNumberField = new TextField();
		leftCombos[1].getChildren().addAll(new Label("Contact Number:"), contactNumberField);
		
		/*Contains the label and textfield combinations for middle box*/
		VBox[] middleCombos = new VBox[2];
		
		/*Supplier Combination*/
		middleCombos[0] = new VBox();
		supplierNameField = new TextField();
		middleCombos[0].getChildren().addAll(new Label("Name:"), supplierNameField);
		
		/*Unit price Combination*/
		middleCombos[1] = new VBox();
		taxIdField = new TextField();
		middleCombos[1].getChildren().addAll(new Label("tax ID:"), taxIdField);
		
		/*Contains the label and textfield combinations for right box*/
		VBox rightCombos = new VBox();

		/*Requisitioner Combination*/
		rightCombos = new VBox();
		contactPersonField = new TextField();
		rightCombos.getChildren().addAll(new Label("Contact Person:"), contactPersonField);
		
		/*Edit Button initialization*/
		addConfirm = new Button("Confirm Edit");
		
		rightSection.setSpacing(30);
		
		
		/* Assembly */
		leftSection.getChildren().addAll(leftCombos[0], leftCombos[1]);
		middleSection.getChildren().addAll(middleCombos[0], middleCombos[1]);
		rightSection.getChildren().addAll(rightCombos, addConfirm);
	
	}
}
