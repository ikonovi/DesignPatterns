package _9_Strategy.example1;

import java.io.File;

import _9_Strategy.example1.AuthStrategy;

@SuppressWarnings("unused")
public class FileAuth implements AuthStrategy {

	private File file;

	public FileAuth(File file) {
		this.file = file;
	}

	@Override
	public boolean checkLogin(String name, String password) {
		System.out.println("Checking with file...");
		return checkFromFile();
	}

	private boolean checkFromFile() {
		// считывание из файла данных

		return true;
	}

}
