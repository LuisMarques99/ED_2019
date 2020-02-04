package Ficha1; //Parte 1

public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair <Integer> p1 = new Pair<Integer> (1, 2);
		p1.setFirst(3);
		p1.setSecond(4);
		System.out.println(p1.max());
	}
}
