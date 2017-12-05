package ui;

import final_values.Values;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PurchaseOrderBanner extends Banner {
	
	/* Outer Left Section */
	private TextField supplierNameField;
	private TextField supplierAddressField;
	
	/* Inner Left Section */
	private TextField invoiceField;
	private TextField documentTitleField;
	
	/* Inner Right Section */
	private TextField requisitionerField;	
	private Button supplierConfirm;
	
	public PurchaseOrderBanner() {
		super();
		updateToPurchaseOrders();
	}

	private void updateToPurchaseOrders() {
		/* Banner Title */
		bannerTitle.setText(Values.BANNER_PURCHASE_ORDER);
		initPurchaseOrders();
	}

	private void initPurchaseOrders() {
		/*Contains the label and textfield combinations for left box*/
		VBox[] leftCombos = new VBox[2];
		
		/*item Code Combination*/
		leftCombos[0] = new VBox();
		supplierNameField = new TextField();
		leftCombos[0].getChildren().addAll(new Label("Supplier Name::"), supplierNameField);
		
		/*item descritption Combination*/
		leftCombos[1] = new VBox();
		supplierAddressField = new TextField();
		leftCombos[1].getChildren().addAll(new Label("Supplier Address:"), supplierAddressField);
		
		/*Contains the label and textfield combinations for middle box*/
		VBox[] middleCombos = new VBox[2];
		
		/*Supplier Combination*/
		middleCombos[0] = new VBox();
		invoiceField = new TextField();
		middleCombos[0].getChildren().addAll(new Label("Invoice No:"), invoiceField);
		
		/*Unit price Combination*/
		middleCombos[1] = new VBox();
		documentTitleField = new TextField();
		middleCombos[1].getChildren().addAll(new Label("Document Title:"), documentTitleField);
		
		/*Contains the label and textfield combinations for right box*/
		VBox rightCombos = new VBox();
		
		/*Requisitioner Combination*/
		rightCombos = new VBox();
		requisitionerField = new TextField();
		rightCombos.getChildren().addAll(new Label("Requisitioner: "), requisitionerField);
		
		/*Edit Button initialization*/
		supplierConfirm = new Button("Suppliers");
		
		rightSection.setSpacing(30);;
		
		/* Assembly */
		leftSection.getChildren().addAll(leftCombos[0], leftCombos[1]);
		middleSection.getChildren().addAll(middleCombos[0], middleCombos[1]);
		rightSection.getChildren().addAll(rightCombos, supplierConfirm);
	
	}

}
