package ui;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import ui_factories.BannerFactory;
import ui_factories.ViewFactory;

public class ManagerView extends BorderPane {
		
	/* Node Variables */
		private HeaderPane headerPane;
		private NavMenuPane navMenu;
		private static HBox midBox;
			private View paneView;
			private static Banner banner;
		
		
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
			reinitView(00);
			reinitBanner(00);
		});
		
		/* Purchase Orders Button */
		navMenu.getPurchaseOrdBtn().setOnAction(e -> {
			reinitView(04);
			reinitBanner(05);
		});
		
		/* Sales Reports Button */
		navMenu.getSalesReportBtn().setOnAction(e -> {
			reinitView(05);
			reinitBanner(06);
		});
		
		/* Inventory Button */
		navMenu.getInventoryBtn().setOnAction(e -> {
			reinitView(02);
			reinitBanner(03);	
		});
		
		/* Customers / Debts Buttons */
		navMenu.getCustDebtsBtn().setOnAction(e -> {
			reinitView(01);
			reinitBanner(01);
		});
		
		/* Suppliers Button */
		navMenu.getSuppliersBtn().setOnAction(e -> {
			reinitView(03);
			reinitBanner(04);
		});
	}
	
	private void reinitView(int viewKey) {
		midBox.getChildren().remove(paneView);
		paneView = ViewFactory.getView(viewKey);
		midBox.getChildren().add(paneView);
		HBox.setHgrow(paneView, Priority.ALWAYS);
	}
	
	protected static void reinitBanner(int bannerKey) {
		midBox.getChildren().remove(banner);
		banner = BannerFactory.getBanner(bannerKey);
		midBox.getChildren().add(banner);
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
		banner = BannerFactory.getBanner(00);
		
		/* Pane View Initialization */
		paneView  = ViewFactory.getView(00);
		
		/* Assembly of Nav Menu and Pane View into MidBox */
		midBox.getChildren().addAll(paneView, banner);
		HBox.setHgrow(paneView, Priority.ALWAYS);
		setCenter(midBox);
	}
	
	protected void setBanner(int code) {
		reinitBanner(code);
	}
}
