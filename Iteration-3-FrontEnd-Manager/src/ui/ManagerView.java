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
		private HeaderPane headerPane;
		private NavMenuPane navMenu;
		private HBox midBox;
			private View paneView;
			private Banner banner;
		
		
	/* boolean */
		private boolean navMenuShown = false;

	public ManagerView() {
		initPane();
		initNavMenuHandlers();
		initHeaderPaneHandlers();
	}
	
	private void initPane() {
		setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		 navMenu = new NavMenuPane();
		initTop();
		initMid();
	}
	
	/* Initializes the Functionality of the Button on the Nav Menu */
	private void initNavMenuHandlers() {
		/* Transaction Button */
		navMenu.getTransactionBtn().setOnAction(e -> {
			reinitBanner(00);
		});
		
		/* Purchase Orders Button */
		navMenu.getPurchaseOrdBtn().setOnAction(e -> {
			paneView.updatePaneViewToPurchaseOrder();
			reinitBanner(05);
		});
		
		/* Sales Reports Button */
		navMenu.getSalesReportBtn().setOnAction(e -> {
			paneView.updatePaneViewToSalesReport();
			reinitBanner(00);
		});
		
		/* Inventory Button */
		navMenu.getInventoryBtn().setOnAction(e -> {
			paneView.updatePaneViewToInvetory();
			reinitBanner(03);	
		});
		
		/* Customers / Debts Buttons */
		navMenu.getCustDebtsBtn().setOnAction(e -> {
			paneView.updatePaneViewToCustomerDebt();
			reinitBanner(01);
		});
		
		/* Suppliers Button */
		navMenu.getSuppliersBtn().setOnAction(e -> {
			paneView.updatePaneViewToSupplier();
			reinitBanner(04);
			System.out.println(banner.widthProperty().getValue());
		});
	}
	
	private void reinitBanner(int bannerKey) {
		midBox.getChildren().remove(banner);
		banner = BannerFactory.getBanner(bannerKey);
		midBox.getChildren().add(banner);
		//HBox.setHgrow(banner, Priority.ALWAYS);
	}
	
	private void initHeaderPaneHandlers() {
		headerPane.getShowNavMenuBtn().setOnAction(e -> {
			if (!navMenuShown) {
				setLeft(navMenu);
				navMenuShown = !navMenuShown;
			} else {
				setLeft(null);
				navMenuShown = !navMenuShown;
			}
		});
	}
	
	private void initTop() {
		
		/* Header Pane Initialization */
		headerPane = new HeaderPane();
		
		/* Setting to Main Pane */
		setTop(headerPane);
	}
	
	private void initMid() {
		
		/* Mid Box Initialization */
		midBox = new HBox();
		//midBox.setPadding(new Insets(Values.MID_BOX_TOP_PADDING, Values.MID_BOX_RIGHT_PADDING, Values.MID_BOX_BOTTOM_PADDING, Values.MID_BOX_LEFT_PADDING));
		
		/* Banner Initialization */
		banner = new DateBanner();
		
		/* Pane View Initialization */
		paneView  = new View();
		paneView.updatePaneView();
		
		/* Assembly of Nav Menu and Pane View into MidBox */
		midBox.getChildren().addAll(paneView, banner);
		HBox.setHgrow(paneView, Priority.ALWAYS);
		setCenter(midBox);
	}
}
