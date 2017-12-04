package ui;

import final_values.Values;
import javafx.scene.control.Label;

public class FilterBanner extends Banner {
	
	/* Outer Left Section */
	private Label dateYearTitleLbl;
	private Label dateYearFilterLbl;
	
	/* Inner Left Section */
	private Label weekTitleLbl;
	private Label weekFilterLbl;
	
	/* Inner Right Section */
	private Label orderTitleLbl;
	private Label orderFilterLbl;
	
	public FilterBanner() {
		super();
		initFilterBanner();
	}
	
	private void initFilterBanner() {
		/* Banner Title */
		bannerTitle.setText(Values.BANNER_FILTER);
		
		dateYearTitleLbl = new Label();
		dateYearTitleLbl.setText(Values.DATE_YEAR);
		
		weekTitleLbl = new Label();
		weekTitleLbl.setText(Values.WEEK);
		
		orderTitleLbl = new Label();
		orderTitleLbl.setText(Values.ORDER);
		
		initFilterLabels();
		
		leftSection.getChildren().addAll(dateYearTitleLbl, dateYearFilterLbl);
		
		middleSection.getChildren().addAll(weekTitleLbl, weekFilterLbl);
		
		rightSection.getChildren().addAll(orderTitleLbl, orderFilterLbl);
		
	}
	
	/* For Back End Developers */
	private void initFilterLabels() {
		
		String dateYear, week, order;
		
		/* Test Cases */
		dateYear = "01/11/2017 - 08/11/2017";
		week = "All Week";
		order = "Ascending - By Transaction #";
		
		dateYearFilterLbl =  new Label(dateYear);
		weekFilterLbl = new Label(week);
		orderFilterLbl = new Label(order);
		
	}
	
}
