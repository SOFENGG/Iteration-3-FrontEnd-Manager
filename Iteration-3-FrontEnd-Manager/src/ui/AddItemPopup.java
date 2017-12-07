package ui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class AddItemPopup extends Popup {
	
	private VBox layout;
		private HBox searchHBox;
			private ComboBox<String> filterComboBox;
			private TextField searchTextField;
			private Button searchButton;
		private HBox buttonsHBox;
			private Button newItemButton;
			private Label qty;
			private Spinner qtySpinner;
			private Button addButton;
		private Table itemTable;

	public AddItemPopup(String title) {
		super(title);
		
		initScene();
		initHandlers();

		setScene(layout);
	}
	
	public void initScene() {
		layout = new VBox (10);
		layout.setId("Popup");
		
			searchHBox = new HBox (20);
			searchHBox.setAlignment(Pos.CENTER);
			
				filterComboBox = new ComboBox<String> ();
				filterComboBox.getStyleClass().add("ComboBox");
				filterComboBox.getItems().add("ID");
				filterComboBox.getItems().add("Name");
				
				filterComboBox.getSelectionModel ().selectFirst ();
				
				searchTextField = new TextField ();
				searchTextField.setId ("TextField");
				
				searchButton = new Button ();
				searchButton.getStyleClass ().add("SearchButton");
				searchButton.setMinSize(40, 40);
					
			searchHBox.getChildren().addAll(filterComboBox, searchTextField, searchButton);
			
			buttonsHBox = new HBox (20);
			buttonsHBox.setAlignment(Pos.CENTER);
			
				newItemButton = new Button("New Item");
				
				qty = new Label("Quantity:");
				
				qtySpinner = new Spinner();
				
				addButton = new Button("Add Item");
				
			buttonsHBox.getChildren().addAll(newItemButton, qty, qtySpinner, addButton);
			
			itemTable = new Table();
			
		layout.getChildren().addAll(searchHBox, itemTable, buttonsHBox);
			
		VBox.setVgrow (layout, Priority.ALWAYS);	
		
	}
	
	// BACKEND STUFF
	private void initHandlers() {
		
	}
}
