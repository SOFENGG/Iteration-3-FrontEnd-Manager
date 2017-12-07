package ui;

import java.util.ArrayList;

import final_values.Values;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends BorderPane{
	
	private ArrayList<Button> actionButtonsMap;
	
		private HBox filterOptions;
			private ComboBox<String> searchColumns;
			private TextField searchField;
			private Button searchButton;
			private Button filterButton;
		private Table tableView;
		private HBox actionButtons;
		
		/*Inventory View*/
		private HBox inventoryOptions;
			private ComboBox<String> invSearchColumns;
			private TextField invSearchField;
			private Button invSearchButton;
		private Table invetoryTable;
		
		/*Supplier View*/
		private HBox supplierOptions;
			private ComboBox<String> supSearchColumns;
			private TextField supSearchField;
			private Button supSearchButton;
		private Table supplierTable;
		
		/*Purchase Order*/
		private HBox purchaseOrderOptions;
			private ComboBox<String> purSearchColumns;
			private TextField purSearchField;
			private Button purSearchButton;
		private Table purchaseOrderTable;
		private HBox purchaseOrderButtons;
			private Button addItemButton;
			private Button removeItemButton;
			private Button clearAllButton;
			private Button confirmOrder; 
			
		/*Sales Report*/
		private HBox salesOrderOptions;
			private ComboBox<String> saleSearchColumns;
			private TextField saleSearchField;
			private Button saleSearchButton;
		private Table salseOrderTable;
		private HBox salesOrderButtons;
			private Button createReportButton;
			private Button reportDetailsButton;
		
		/*Customer / Debt*/
		private HBox customerOptions;
			private ComboBox<String> custSearchColumns;
			private TextField custSearchField;
			private Button custSearchButton;
		private Table customerTable;
			
	public View() {
		setId("View");
	}
	
	public void updatePaneView() {
		initFilterOptions();
		addFilterButton();
		initTableView();
		initActionButtons();
		
		setTop(filterOptions);
		setCenter(tableView);
		setBottom(null);
	}
	

	private void initActionButtons() {
		actionButtons = new HBox(10);
		
	}
	
	public void updatePaneViewToCustomerDebt(){
		initCustomerOptions();
		initCustomerTable();
		
		setTop(customerOptions);
		setCenter(customerTable);
		setBottom(null);
	}
	
	private void initCustomerOptions() {
		/* customer order Options Initialization */
		customerOptions = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		customerOptions.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		customerOptions.setPadding(new Insets(10, 0, 0, 0));
		
		/* customer order Columns Initialization */
		custSearchColumns = new ComboBox<String>();
		custSearchColumns.setItems(fillSalesOrderComboBox());
		
		/* customer order Field Initialization */
		custSearchField = new TextField();
		custSearchField.setMinWidth(Values.SEARCH_FIELD_WIDTH);
		
		/* customer order Button Initialization */
		custSearchButton = new Button("SEARCH");
		
		/* Assembly of previously specified components*/
		customerOptions.getChildren().addAll(custSearchColumns, custSearchField, custSearchButton);
		
	}

	private void initCustomerTable() {
		customerTable = new Table();
	}

	public void updatePaneViewToSalesReport(){
		initSalesOrderOptions();
		initSalesOrderTable();
		initSalesOrderButtons();
		
		setTop(salesOrderOptions);
		setCenter(salseOrderTable);
		setBottom(salesOrderButtons);
	}
	
	private void initSalesOrderOptions() {
		/* sales order Options Initialization */
		salesOrderOptions = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		salesOrderOptions.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		salesOrderOptions.setPadding(new Insets(10, 0, 0, 0));
		
		/* sales order Columns Initialization */
		saleSearchColumns = new ComboBox<String>();
		saleSearchColumns.setItems(fillSalesOrderComboBox());
		
		/* sales order Field Initialization */
		saleSearchField = new TextField();
		saleSearchField.setMinWidth(Values.SEARCH_FIELD_WIDTH);
		
		/* sales order Button Initialization */
		saleSearchButton = new Button("SEARCH");
		
		/* Assembly of previously specified components*/
		salesOrderOptions.getChildren().addAll(saleSearchColumns, saleSearchField, saleSearchButton);
		
	}

	private void initSalesOrderTable() {
		salseOrderTable = new Table();
		
	}

	private void initSalesOrderButtons() {
		/* sales order buttons Initialization */
		salesOrderButtons = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		salesOrderButtons.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		salesOrderButtons.setPadding(new Insets(10, 0, 0, 0));
		
		/* create report button Initialization */
		createReportButton = new Button("Create Report");
		
		/* create report button Initialization */
		reportDetailsButton = new Button("Report Details");
		
		/* Assembly of previously specified components*/
		salesOrderButtons.getChildren().addAll(createReportButton, reportDetailsButton);
		
	}

	public void updatePaneViewToPurchaseOrder(){
		initPurchaseOrderOptions();
		initPurchaseOrderTable();
		initPurchaseOrderButtons();
		
		setTop(purchaseOrderOptions);
		setCenter(purchaseOrderTable);
		setBottom(purchaseOrderButtons);
	}
	
	private void initPurchaseOrderTable(){
		/*initialization of table view for purchase order*/
		purchaseOrderTable = new Table();
	}

	private void initPurchaseOrderOptions() {
		/* purchase order Options Initialization */
		purchaseOrderOptions = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		purchaseOrderOptions.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		purchaseOrderOptions.setPadding(new Insets(10, 0, 0, 0));
		
		/* purchase order Columns Initialization */
		purSearchColumns = new ComboBox<String>();
		purSearchColumns.setItems(fillComboBox());
		
		/* purchase order Field Initialization */
		purSearchField = new TextField();
		purSearchField.setMinWidth(Values.SEARCH_FIELD_WIDTH);
		
		/* purchase order Button Initialization */
		purSearchButton = new Button("SEARCH");
		
		/* Assembly of previously specified components*/
		purchaseOrderOptions.getChildren().addAll(purSearchColumns, purSearchField, purSearchButton);
		
	}
	
	private void initPurchaseOrderButtons() {
		/* purchase order buttons Initialization */
		purchaseOrderButtons = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		purchaseOrderButtons.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		purchaseOrderButtons.setPadding(new Insets(10, 0, 0, 0));
		
		/* add button Initialization */
		addItemButton = new Button("Add Item +");
		addItemButton.setOnMouseClicked(e -> {
			AddItemPopup ap = new AddItemPopup(Values.ADD_ITEM_POPUP_TITLE);
			ap.show();
		});
		
		/* remove button Initialization */
		removeItemButton = new Button("Remove Item -");
		
		/* clear button Initialization */
		clearAllButton = new Button("Clear All");
		
		/* clear button Initialization */
		confirmOrder = new Button("Confirm");
		
		/* Assembly of previously specified components*/
		purchaseOrderButtons.getChildren().addAll(addItemButton, removeItemButton, clearAllButton, confirmOrder);
		
	}
	

	public void updatePaneViewToInvetory(){
		initInventoryOptions();
		initInventoryTable();
		initInvActionButtons();
		
		setTop(inventoryOptions);
		setCenter(invetoryTable);
		setBottom(null);
	}


	private void initInventoryOptions() {
		/* Inventory Search Options Initialization */
		inventoryOptions = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		inventoryOptions.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		inventoryOptions.setPadding(new Insets(10, 0, 0, 0));
		
		/* Inventory Search Columns Initialization */
		invSearchColumns = new ComboBox<String>();
		invSearchColumns.setItems(fillInventoryComboBox());
		
		/* Inventory Search Field Initialization */
		invSearchField = new TextField();
		invSearchField.setMinWidth(Values.SEARCH_FIELD_WIDTH);
		
		/* Inventory Search Button Initialization */
		invSearchButton = new Button("SEARCH");
		
		/* Assembly of previously specified components*/
		inventoryOptions.getChildren().addAll(invSearchColumns, invSearchField, invSearchButton);
	}
	
	private void initInventoryTable() {
		invetoryTable = new Table();
	}
	
	private void initInvActionButtons() {
		
	}
	
	public void updatePaneViewToSupplier(){
		initSupplierOptions();
		initSupplierTable();
		initSupActionButtons();
		
		setTop(supplierOptions);
		setCenter(supplierTable);
		setBottom(null);
	}
	
	private void initSupplierOptions() {
		/* Supplier Search Options Initialization */
		supplierOptions = new HBox(Values.INVENTORY_OPTIONS_ITEM_SPACING);
		supplierOptions.setPrefHeight(Values.INVENTORY_OPTIONS_PREF_HEIGHT);
		supplierOptions.setPadding(new Insets(10, 0, 0, 0));
		
		/* Supplier Search Columns Initialization */
		supSearchColumns = new ComboBox<String>();
		supSearchColumns.setItems(fillSupplierComboBox());
		
		/* Supplier Search Field Initialization */
		supSearchField = new TextField();
		supSearchField.setMinWidth(Values.SEARCH_FIELD_WIDTH);
		
		/* Supplier Search Button Initialization */
		supSearchButton = new Button("SEARCH");
		
		/* Assembly of previously specified components*/
		supplierOptions.getChildren().addAll(supSearchColumns, supSearchField, supSearchButton);
	}

	private void initSupplierTable() {
		supplierTable = new Table();
	}
	
	private void initSupActionButtons() {
		// TODO Auto-generated method stub
		
	}
	
	
	private void initTableView() {
		 tableView = new Table();
		// tableView.getColumns().setAll(fillColumns());
	}

	private void initFilterOptions() {
		
		/* Filter Options Initialization */
		filterOptions = new HBox(Values.FILTER_OPTIONS_ITEM_SPACING);
		filterOptions.setPrefHeight(Values.FILTER_OPTIONS_PREF_HEIGHT);
		filterOptions.setPadding(new Insets(10, 0, 0, 0));
		
		/* Search Columns Initialization */
		searchColumns = new ComboBox<String>();
		searchColumns.setItems(fillComboBox());
		
		/* Search Field Initialization */
		searchField = new TextField();
		searchField.setMinWidth(Values.SEARCH_FIELD_WIDTH);
		
		/* Search Button Initialization */
		searchButton = new Button("SEARCH"); // To be replaced with the magnifying Icon
		
		/* Filter Button Initialization */
		filterButton = new Button("O " + "Filter"); // the O character to be replaced with the filter icon
		
		/* Assembly of Search Columns, Search Field, Search Button and Filter Button into Filter Options */
		filterOptions.getChildren().addAll(searchColumns, searchField, searchButton);
	}
	
	private void addFilterButton() {
		filterOptions.getChildren().add(filterButton);
	}
	
	@SuppressWarnings("unused")
	private void removeFilterButton() {
		filterOptions.getChildren().remove(filterButton);
	}
	
	/* This function is for the Back End Developers */
	private ObservableList<String> fillComboBox() {
		ObservableList<String> list = FXCollections.observableArrayList();
		
		/* Test Cases */
			list.addAll("Item Code", "Description");
		
		return list;
	}
	
	/* This function is for the Back End Developers */
	private ObservableList<String> fillInventoryComboBox() {
		ObservableList<String> list = FXCollections.observableArrayList();
		
		/* Test Cases */
			list.addAll("Item Code", "Description", "Supplier");
		
		return list;
	}
	
	/* This function is for the Back End Developers */
	private ObservableList<String> fillSupplierComboBox() {
		ObservableList<String> list = FXCollections.observableArrayList();
		
		/* Test Cases */
			list.addAll("Supplier Code", "Name", "Contact Person");
		
		return list;
	}
	
	/* This function is for the Back End Developers */
	private ObservableList<String> fillSalesOrderComboBox() {
		ObservableList<String> list = FXCollections.observableArrayList();
		
		/* Test Cases */
			list.addAll("Report Num", "Date Created");
		
		return list;
	}
	
	
	/* This function is for the Back End Developers */
	private TableColumn<Object, ?> fillColumns() {
		
		return null;
	}
}
