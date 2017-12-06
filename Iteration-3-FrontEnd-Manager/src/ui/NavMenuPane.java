package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class NavMenuPane extends BorderPane{
	
	private VBox navMenu;
		private Button transactionBtn;
		private Button purchaseOrdBtn;
		private Button salesReportBtn;
		private Button inventoryBtn;
		private Button custDebtsBtn;
		private Button suppliersBtn;
		
	public NavMenuPane() {
		setId("NavMenu");
		setPrefWidth(225);
		initNavMenu();
		//setWidth(500);
	}
	
	public void initNavMenu(){
		/* Nav Menu Initialization */
		navMenu = new VBox(Values.NAV_MENU_ITEM_SPACING);
		navMenu.setPrefWidth(Values.NAV_MENU_PREF_WIDTH);
		navMenu.setPadding(new Insets(Values.NAV_MENU_TOP_PADDING, Values.NAV_MENU_RIGHT_PADDING, Values.NAV_MENU_BOTTOM_PADDING, Values.NAV_MENU_LEFT_PADDING));
		
		/* Button Initialization */
		transactionBtn = new Button("Transactions");
		purchaseOrdBtn  = new Button("Purchase Orders");
		salesReportBtn  = new Button("Sales Reports");
		inventoryBtn  = new Button("Inventory");
		custDebtsBtn  = new Button("Customers / Debts");
		suppliersBtn = new Button("Suppliers");
		
		/* Assembly */
		navMenu.getChildren().addAll(transactionBtn, purchaseOrdBtn, salesReportBtn, inventoryBtn, custDebtsBtn, suppliersBtn);
		navMenu.getChildren().forEach(node -> {
			Button button = (Button) node;
			button.setPrefWidth(navMenu.getPrefWidth());
		});
		
		setCenter(navMenu);
		
		
	}

	public Button getTransactionBtn() {
		return transactionBtn;
	}

	public Button getPurchaseOrdBtn() {
		return purchaseOrdBtn;
	}

	public Button getSalesReportBtn() {
		return salesReportBtn;
	}

	public Button getInventoryBtn() {
		return inventoryBtn;
	}

	public Button getCustDebtsBtn() {
		return custDebtsBtn;
	}

	public Button getSuppliersBtn() {
		return suppliersBtn;
	}

}
