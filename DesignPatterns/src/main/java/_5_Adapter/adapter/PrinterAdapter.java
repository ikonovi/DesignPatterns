package _5_Adapter.adapter;

import java.util.List;

import _5_Adapter.objects.Printer;

// Adapter

// адаптер, который совмещает желание клиента и возможности принтера
// мотодом композиции - Printer включён в класс как поле.
public class PrinterAdapter implements PageListPrinter{

	// Adaptee
    private Printer printer = new Printer();
    
    // Адаптер адаптирует поведение принтера под интерфэйс понятный клиенту.
    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);            
        }
    }
 
}
