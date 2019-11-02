package Ficha4;

public class TesteCircularArrayQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueADT<Integer> queue1 = new CircularArrayQueue<>();
		queue1.enqueue(16);
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.enqueue(15);
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.enqueue(22);
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.dequeue();
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.dequeue();
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.dequeue();
		System.out.println("Size: " + queue1.size());
		System.out.println("Head: " + queue1.first());
		queue1.dequeue();
	}
}

/*
 * Exercicio 3.
 * 
 * Contrariamente ao que foi necessário adaptar no exercicio 1, neste exercicio nao tive de utilizar apontadores adicionais para além do head e tail, tambem tive de 
 * alterar a forma como o head se movia no array ao contrário do que foi programado no exercicio 1, bem como tambem a implementacao foi feita diretamente utilizando
 * posicoes de um array.
 * Foi tambem necessário incluir um tamanho inicial de array para começar a desenvolver ou entao criar um default size para o array e foi tambem necessário introduzir
 * a funcao de aumento do tamanho do array de forma automática.
 * Tambem incluiu a ter em atencao de como foi necessário fazer com que os elementos dessem a volta
*/
