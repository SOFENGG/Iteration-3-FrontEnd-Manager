package ui;

import java.util.ArrayList;

import final_values.Values;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class View extends BorderPane{
	
	private ArrayList<Button> actionButtonsMap;
	
		private HBox filterOptions;
			private ComboBox<String> searchColumns;
			private TextField searchField;
			private Button searchButton;
			private Button filterButton;
		private Table tableView;
		private HBox actionButtons;
		
		private HBox inventoryOptions;
			private ComboBox<String> invSearchColumns;
			private TextField invSearchField;
			private Button invSearchButton;
		private Table invetoryTable;
		
		private HBox supplierOptions;
			private ComboBox<String> supSearchColumns;
			private TextField supSearchField;
			private Button supSearchButton;
		private Table supplierTable;
			
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
	}
	

	private void initActionButtons() {
		actionButtons = new HBox(10);
		
	}

	public void updatePaneViewToInvetory(){
		initInventoryOptions();
		initInventoryTable();
		initInvActionButtons();
		
		setTop(inventoryOptions);
		setCenter(invetoryTable);
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
	
	private void removeFilterButton() {
		filterOptions.getChildren().remove(filterButton);
	}
	
	private void initActionButtons() {
		
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

}
