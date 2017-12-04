package ui_factories;

import ui.Banner;
import ui.CustomerBanner;
import ui.DateBanner;
import ui.FilterBanner;

public class BannerFactory {
	
	private final static int BANNER_DATE_CODE = 00;
	private final static int BANNER_CUSTOMER_CODE = 01;
	private final static int BANNER_FILTER_CODE = 02;
	
	public static Banner getBanner(int code) {
		
		switch(code) {
		case BANNER_DATE_CODE:
			return new DateBanner();
		case BANNER_CUSTOMER_CODE:
			return new CustomerBanner();
		case BANNER_FILTER_CODE:
			return new FilterBanner();
		default:
			return new Banner();
		
		}
		
	}
	
}
