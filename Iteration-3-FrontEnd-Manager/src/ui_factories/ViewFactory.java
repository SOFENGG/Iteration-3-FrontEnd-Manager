package ui_factories;

import ui.TransactionView;
import ui.View;
import ui.CustomerView;
import ui.InventoryView;
import ui.SupplierView;
import ui.PurchaseOrderView;
import ui.SalesReportView;

public class ViewFactory {
	
	private final static int TRANSACTION_CODE = 00;
	private final static int CUSTOMER_CODE = 01;
	private final static int INVENTORY_CODE = 02;
	private final static int SUPPLIER_CODE = 03;
	private final static int PURCHASE_ORDER_CODE = 04;
	private final static int SALES_REPORT_CODE = 05;
	
	public static View getView(int code) {
		switch(code) {
		case TRANSACTION_CODE:
			return new TransactionView();
		case CUSTOMER_CODE:
			return new CustomerView();
		case INVENTORY_CODE:
			return new InventoryView();
		case SUPPLIER_CODE:
			return new SupplierView();
		case PURCHASE_ORDER_CODE:
			return new PurchaseOrderView();
		case SALES_REPORT_CODE:
			return new SalesReportView();
		default:
			return new TransactionView();
		}
	}
}
