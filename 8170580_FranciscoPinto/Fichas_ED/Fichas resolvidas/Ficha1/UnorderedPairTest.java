package Ficha1; //Parte 1

public class UnorderedPairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pair<Integer> p1 = new UnorderedPair<>(4, 5);
        Pair<Integer> p2 = new UnorderedPair<>(5, 4);
        
        System.out.println(p1.equals(p2));
	}
}
