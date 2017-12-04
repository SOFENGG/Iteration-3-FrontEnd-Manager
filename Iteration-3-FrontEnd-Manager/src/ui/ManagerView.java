package ui;


import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import ui_factories.BannerFactory;

public class ManagerView extends BorderPane {
		
	/* Node Variables */
		private HBox topBox;
			private Rectangle logo;
			private Banner banner;
		private HBox midBox;
			private VBox navMenu;
				private Button transactionBtn = new Button("Transactions");
				private Button purchaseOrdBtn = new Button("Purchase Orders");
				private Button salesReportBtn = new Button("Sales Reports");
				private Button inventoryBtn = new Button("Inventory");
				private Button custDebtsBtn = new Button("Customers / Debts");
				private Button suppliersBtn = new Button("Suppliers");
			private View paneView;

	public ManagerView() {
		initPane();
		initNavMenuHandlers();
	}
	
	private void initPane() {
		setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		initTop();
		initMid();
	}
	
	/* Initializes the Functionality of the Button on the Nav Menu */
	private void initNavMenuHandlers() {
		/* Transaction Button */
		transactionBtn.setOnAction(e -> {
			reinitBanner(00);
		});
		
		/* Purchase Orders Button */
		purchaseOrdBtn.setOnAction(e -> {
			
		});
		
		/* Sales Reports Button */
		salesReportBtn.setOnAction(e -> {
			reinitBanner(00);
		});
		
		/* Inventory Button */
		inventoryBtn.setOnAction(e -> {
			
		});
		
		/* Customers / Debts Buttons */
		custDebtsBtn.setOnAction(e -> {
			reinitBanner(01);
		});
		
		/* Suppliers Button */
		suppliersBtn.setOnAction(e -> {
			
		});
	}
	
	private void reinitBanner(int bannerKey) {
		topBox.getChildren().remove(banner);
		banner = BannerFactory.getBanner(bannerKey);
		topBox.getChildren().add(banner);
		HBox.setHgrow(banner, Priority.ALWAYS);
	}
	
	private void initTop() {
		
		/* Top Box Initialization */
		topBox = new HBox(Values.TOP_BOX_ITEM_SPACING);
		topBox.setPadding(new Insets(Values.TOP_BOX_TOP_PADDING, Values.TOP_BOX_RIGHT_PADDING, Values.TOP_BOX_BOTTOM_PADDING, Values.TOP_BOX_LEFT_PADDING));
		//topBox.setId("");
		/* Logo Initialization */
		logo = new Rectangle(Values.LOGO_WIDTH, Values.LOGO_HEIGHT);
		
		/* Banner Initialization */
		banner = new DateBanner();
		
		/* Assembly of Logo and Banner in Top Box */
		topBox.getChildren().addAll(logo, banner);
		HBox.setHgrow(banner, Priority.ALWAYS); // Extends the banner node horizontally until it fits the entire screen relative to it's other nodes and the padding
		HBox.setHgrow(logo, Priority.SOMETIMES);
		setTop(topBox);
	}
	
	private void initMid() {
		
		/* Mid Box Initialization */
		midBox = new HBox(Values.MID_BOX_ITEM_SPACING);
		midBox.setPadding(new Insets(Values.MID_BOX_TOP_PADDING, Values.MID_BOX_RIGHT_PADDING, Values.MID_BOX_BOTTOM_PADDING, Values.MID_BOX_LEFT_PADDING));
		
		/* Nav Menu Initialization */
		navMenu = new VBox(Values.NAV_MENU_ITEM_SPACING);
		navMenu.setPrefWidth(Values.NAV_MENU_PREF_WIDTH);
		navMenu.getChildren().addAll(transactionBtn, purchaseOrdBtn, salesReportBtn, inventoryBtn, custDebtsBtn, suppliersBtn);
		navMenu.getChildren().forEach(node -> {
			Button button = (Button) node;
			button.setPrefWidth(navMenu.getPrefWidth());
		});
		
		/* Pane View Initialization */
		paneView  = new View();
		paneView.updatePaneView();
		
		/* Assembly of Nav Menu and Pane View into MidBox */
		midBox.getChildren().addAll(navMenu, paneView);
		HBox.setHgrow(paneView, Priority.ALWAYS);
		setCenter(midBox);
	}
	
	
	/* This function is for the Back End Developers */
	private TableColumn<Object, ?> fillColumns() {
		
		return null;
	}
}
