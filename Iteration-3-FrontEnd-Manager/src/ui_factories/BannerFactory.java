package ui_factories;

import ui.Banner;
import ui.CustomerBanner;
import ui.DateBanner;
import ui.FilterBanner;
import ui.InventoryBanner;
import ui.SupplierBanner;
import ui.PurchaseOrderBanner;

public class BannerFactory {
	
	private final static int BANNER_DATE_CODE = 00;
	private final static int BANNER_CUSTOMER_CODE = 01;
	private final static int BANNER_FILTER_CODE = 02;
	private final static int BANNER_INVENTORY_CODE = 03;
	private final static int BANNER_SUPPLIER_CODE = 04;
	private final static int BANNER_PURCHASE_ORDER_CODE = 05;
	
	public static Banner getBanner(int code) {
		
		switch(code) {
		case BANNER_DATE_CODE:
			return new DateBanner();
		case BANNER_CUSTOMER_CODE:
			return new CustomerBanner();
		case BANNER_FILTER_CODE:
			return new FilterBanner();
		case BANNER_INVENTORY_CODE:
			return new InventoryBanner();
		case BANNER_SUPPLIER_CODE:
			return new SupplierBanner();
		case BANNER_PURCHASE_ORDER_CODE:
			return new PurchaseOrderBanner();
		default:
			return new Banner();
		
		}
		
	}
	
}
