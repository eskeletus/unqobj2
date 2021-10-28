package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public void addNumber(int num) {
		lista.add(num);
	}
	
	public int getEvenOcurrences() {
		return this.getMODOcurrencesOfNumber(2);	
	}
	
	public int getOddOcurrences() {
		return lista.size()-this.getEvenOcurrences();
	}
	
	public int getMODOcurrencesOfNumber(int num) {
		int cantidad_multiplos = 0;
		
		for (int i : lista) {
			if (i%num == 0) {
				cantidad_multiplos += 1;
			}
		}		
		return cantidad_multiplos;
	}
	
	public ArrayList<Integer> disassembleNumber(int num) {
		ArrayList<Integer> disassembled_numbers = new ArrayList<Integer>();
		
		int temp = num;
		
		while (temp>0) {
			disassembled_numbers.add(0, temp % 10);
			temp /= 10;
		}
		
		return disassembled_numbers;
	}
	
	public ArrayList<ArrayList<Integer>> disassembleList() {
		ArrayList<ArrayList<Integer>> disassembled_list = new ArrayList<ArrayList<Integer>>();
		
		for (int i : lista) {
			disassembled_list.add(this.disassembleNumber(i));
		}
		
		return disassembled_list;
	}
	
	public void getNumberWithMoreEvenDigits(ArrayList<ArrayList<Integer>> arrays_of_numbers) {
		// WIP
		int index = 1;
		int cantidad_pares = 0;
		for (ArrayList<Integer> i : arrays_of_numbers) {
			cantidad_pares = this.getEvenOcurrences();
		}
	}
	
}
