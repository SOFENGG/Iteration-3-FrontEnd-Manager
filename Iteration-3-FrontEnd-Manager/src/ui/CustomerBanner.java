package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class CustomerBanner extends Banner {
	
	/* Outer Left Section */
	private Label custNameLbl;
	private TextField custNameField;
	private Label custAddressLbl;
	private TextField custAddressField;
	
	/* Inner Left Section */
	private Label debtLimitLbl;
	private TextField debtLimitField;
	
	/* Inner Right Section */
	private Button addCustomerBtn;
	
	public CustomerBanner() {
		super();
		updateToCustomerDebts();
		initButtonHandlers();
	}
	
	/* For Back End Developers */
	private void initButtonHandlers() {
		addCustomerBtn.setOnAction(e -> {
			/* Add Customer Button */
			
		});
		
	}
	
	private void updateToCustomerDebts() {
		
		/* Banner Title */
		bannerTitle.setText(Values.BANNER_CUSTOMER);
		
		/* Outer Left Section */
		
			custNameLbl = new Label("Customer Name:");
			
			custNameField = new TextField();
			
			custAddressLbl = new Label("Customer Address:");
			
			custAddressField = new TextField();
			
			leftSection.getChildren().addAll(custNameLbl, custNameField, custAddressLbl, custAddressField);
		
		/* Inner Left Section */
			debtLimitLbl = new Label("Debt Limit:");
			
			debtLimitField = new TextField();
			
			middleSection.getChildren().addAll(debtLimitLbl, debtLimitField);
		
		/* Inner Right Section */
		
		rightSection.setPadding(new Insets(Values.RIGHT_TOP_PADDING, Values.RIGHT_RIGHT_PADDING, Values.RIGHT_BOTTOM_PADDING, Values.RIGHT_LEFT_PADDING));

		
			addCustomerBtn = new Button("Add Customer");
			
			rightSection.getChildren().addAll(addCustomerBtn);
		
		
	}
	
}
