package _5_Adapter.adapter;

import java.util.List;

// Target

// интерфейс для печати списка текстов. 
// Этот интерфэйс понимает клиент.
public interface PageListPrinter {

	void print(List<String> list);

}
