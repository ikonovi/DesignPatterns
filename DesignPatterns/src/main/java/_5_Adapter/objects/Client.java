package _5_Adapter.objects;

import java.util.ArrayList;
import java.util.List;

import _5_Adapter.adapter.PageListPrinter;
import _5_Adapter.adapter.PrinterAdapter;

// Client

// клиент, который хочет печатать сразу разный текст много раз
// 	он работает с адаптером, а не с принтером напрямую.
public class Client {

	public static void main(String... args) {
		
		List<String> list = new ArrayList<>();
		list.add("text1");
		list.add("text2");
		list.add("text3");

		// Client refers to Adapter
		PageListPrinter printerAdapter = new PrinterAdapter();
		printerAdapter.print(list);
		
		
	}

}
