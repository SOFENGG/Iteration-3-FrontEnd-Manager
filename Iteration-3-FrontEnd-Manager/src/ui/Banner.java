package ui;

import final_values.Values;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class Banner extends Pane {
	
	protected VBox bannerDetails;
		protected Label bannerTitle;
		protected HBox bannerContents;
			protected VBox leftSection;
			protected VBox middleSection;		
			protected VBox rightSection;
				
	public Banner() {
		setId("Banner");
		initBanner();
		//setStyle("-fx-border-radius: 10; -fx-border-color: #000000;");
	}
	
	private void initBanner() {
		/* Banner Details Initialization */
		bannerDetails = new VBox(Values.BANNER_DETAILS_ITEM_SPACING);
		
		/* Banner Title Initialization (No Set Text) */
		bannerTitle = new Label();
		bannerTitle.setPadding(new Insets(Values.BANNER_TITLE_TOP_PADDING, Values.BANNER_TITLE_RIGHT_PADDING, Values.BANNER_TITLE_BOTTOM_PADDING, Values.BANNER_TITLE_LEFT_PADDING));
		
		/* Banner Contents Initialization */
		bannerContents = new HBox(Values.BANNER_CONTENTS_ITEM_SPACING);
		bannerContents.setPadding(new Insets(Values.BANNER_CONTENTS_TOP_PADDING, Values.BANNER_CONTENTS_RIGHT_PADDING, Values.BANNER_CONTENTS_BOTTOM_PADDING, Values.BANNER_CONTENTS_LEFT_PADDING));
		
		/* Banner Contents Sections Initialization */
			leftSection = new VBox(Values.LEFT_SPACING);
			
			middleSection = new VBox(Values.MIDDLE_SPACING);
			
			rightSection = new VBox(Values.RIGHT_ITEM_SPACING);
		
		/* Assembly */
		bannerContents.getChildren().addAll(leftSection, middleSection, rightSection);
		
		bannerDetails.getChildren().addAll(bannerTitle, bannerContents);
		
		getChildren().add(bannerDetails);
	}
	
	

}
