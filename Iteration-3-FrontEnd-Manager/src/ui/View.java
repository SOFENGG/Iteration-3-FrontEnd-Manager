package ui;

import final_values.Values;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public abstract class View extends BorderPane{
	
		private HBox filterOptions;
			protected ComboBox<String> searchColumns;
			private TextField searchField;
			private Button searchButton;
			private Button filterButton;
		protected Table tableView;
		protected HBox actionButtons;
			
	public View() {
		setId("View");
		updatePaneView();
	}
	
	public void updatePaneView() {
		initFilterOptions();
		initTableView();
		initActionButtons();
		
		setTop(filterOptions);
		setAlignment(filterOptions, Pos.CENTER_RIGHT);
		setCenter(tableView);
		setBottom(actionButtons);
	}
	

	private void initActionButtons() {
		actionButtons = new HBox(10);
		setAlignment(actionButtons, Pos.CENTER);
		setMargin(actionButtons, new Insets(5, 0, 5, 10));
	}
	
	
	private void initTableView() {
		 tableView = new Table();
		 //tableView.getColumns().setAll(fillColumns());
	}

	private void initFilterOptions() {
		
		/* Filter Options Initialization */
		filterOptions = new HBox(Values.FILTER_OPTIONS_ITEM_SPACING);
		filterOptions.setPrefHeight(Values.FILTER_OPTIONS_PREF_HEIGHT);
		filterOptions.setPadding(new Insets(10, 0, 0, 0));
		
		/* Search Columns Initialization */
		searchColumns = new ComboBox<String>();
		
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
	
	protected void addFilterButton() {
		filterOptions.getChildren().add(filterButton);
	}
}
