package ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class PurchaseOrderView extends View{
	
	private Button addItemBtn;
	private Button removeItemBtn;
	private Button clearAllBtn;
	
	public PurchaseOrderView() {
		super();
		addUniqueToViewNodes();
		setUniqueToViewTableAndFilter();
	}
	
	private void addUniqueToViewNodes() {
		
		/* This View has buttons under the table */
		/* Button Initialization */
		addItemBtn = new Button("Add Item");
		
		removeItemBtn = new Button("Remove Item");
		
		clearAllBtn = new Button("Clear All");
		
		/* Assembly */
		actionButtons.getChildren().addAll(addItemBtn, removeItemBtn, clearAllBtn);
		
		actionButtons.setPrefHeight(30);
	}
	
	/* For the Back End Developers */
	/* This function will set the values inside the searchColumns ComboBox
	 * and the Columns for the Table unique to this View only
	 */
	private void setUniqueToViewTableAndFilter() {
		searchColumns.setItems(fillComboBox());
		//tableView.getColumns().setAll(fillColumns());
	}
	

	/* This function is for the Back End Developers */
	private ObservableList<String> fillComboBox() {
		ObservableList<String> list = FXCollections.observableArrayList();
		
		/* Test Cases */
			list.addAll("Item Code", "Description");
		
		return list;
	}
	
	
	/* This function is for the Back End Developers */
	private TableColumn<Object, ?> fillColumns() {
		
		return null;
	}
	
}