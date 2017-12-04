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
			protected VBox outerLeftSection;
			protected VBox innerLeftSection;		
			protected VBox innerRightSection;
			protected VBox outerRightSection;
				
	public Banner() {
		setId("Banner");
		initBanner();
		//setStyle("-fx-border-radius: 10; -fx-border-color: #000000;");
	}
	
	private void initBanner() {
		bannerDetails = new VBox(Values.BANNER_DETAILS_ITEM_SPACING);
		
		bannerTitle = new Label();
		bannerTitle.setPadding(new Insets(Values.BANNER_TITLE_TOP_PADDING, Values.BANNER_TITLE_RIGHT_PADDING, Values.BANNER_TITLE_BOTTOM_PADDING, Values.BANNER_TITLE_LEFT_PADDING));
		
		bannerContents = new HBox(Values.BANNER_CONTENTS_ITEM_SPACING);
		bannerContents.setPadding(new Insets(Values.BANNER_CONTENTS_TOP_PADDING, Values.BANNER_CONTENTS_RIGHT_PADDING, Values.BANNER_CONTENTS_BOTTOM_PADDING, Values.BANNER_CONTENTS_LEFT_PADDING));
		
			outerLeftSection = new VBox(Values.OUTER_LEFT_ITEM_SPACING);
			
			innerLeftSection = new VBox(Values.INNER_LEFT_ITEM_SPACING);
			
			innerRightSection = new VBox(Values.INNER_RIGHT_ITEM_SPACING);
			
			outerRightSection = new VBox(Values.OUTER_RIGHT_ITEM_SPACING);	
			
		bannerContents.getChildren().addAll(outerLeftSection, innerLeftSection, innerRightSection, outerRightSection);
		
		bannerDetails.getChildren().addAll(bannerTitle, bannerContents);
		
		getChildren().add(bannerDetails);
	}
	
	

}
