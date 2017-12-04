package ui;

import final_values.Values;
import javafx.scene.control.Label;

public class DateBanner extends Banner {
	
	private Label todaysDateLbl;
	
	public DateBanner() {
		super();
		initDateBanner();
	}
	
	private void initDateBanner() {
		
		/* Banner Title */
		bannerTitle.setText(Values.BANNER_DATE);
		
		todaysDateLbl = new Label();
		todaysDateLbl.setText(setTodaysDateLbl());
		
		leftSection.getChildren().addAll(todaysDateLbl);
			
	}
	
	/* For Back End Developers */
	private String setTodaysDateLbl() {
		
		String todaysDate;
		
		/* Test Case */
		todaysDate = "November 11, 2017 - 5:40 pm	Saturday";
		
		return todaysDate;
	}
}
