package Ficha1; //Parte 1

public class TwoTypePairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar o TwoTypePair com os elementos. Ou entao podemos declara-los null se quisermos.
		TwoTypePair <Integer , Integer> ttp1 = new TwoTypePair<Integer, Integer>(null,null);
		System.out.println(ttp1.getFirst());
		System.out.println(ttp1.getSecond());
		
		//Muda-se o first e second usando as funcoes.
		
		ttp1.setFirst(3);
		ttp1.setSecond(4);
		System.out.println(ttp1.getFirst());
		System.out.println(ttp1.getSecond());
		
		System.out.println(ttp1.toString());
		
		TwoTypePair <String , String> ttp2 = new TwoTypePair<String , String>("Três" , "Quatro");
		TwoTypePair <Integer , Integer> ttp3 = new TwoTypePair<Integer , Integer>(3,4);
		
		//Se os objetos possuirem elementos iguais entao o equals() retorna true caso contrario retorna falso.
		
		System.out.println(ttp1.equals(ttp2));
		System.out.println(ttp1.equals(ttp3));
	}
}
