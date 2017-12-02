package ui;

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
	
		private HBox filterOptions;
			private ComboBox<String> searchColumns;
			private TextField searchField;
			private Button searchButton;
			private Button filterButton;
		private Table tableView;
		private HBox actionButtons;
			
	public View() {
		setId("View");
		//setStyle("-fx-border-color: #000000;"); 
	}
	
	public void updatePaneView() {
		initFilterOptions();
		initTableView();
		initActionButtons();
		
		setTop(filterOptions);
		setCenter(tableView);
	}
	
	private void initActionButtons() {
			
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
		filterOptions.getChildren().addAll(searchColumns, searchField, searchButton, filterButton);
	}
	
	/* This function is for the Back End Developers */
	private ObservableList<String> fillComboBox() {
		ObservableList<String> list = FXCollections.observableArrayList();
		
		/* Test Cases */
			list.addAll("Item Code", "Description");
		
		return list;
	}

}
