package Ficha10;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBinarySearchTree<Integer> l1 = new LinkedBinarySearchTree<>();
		ArrayBinarySearchTree<Integer> l2 = new ArrayBinarySearchTree<>();
		l1.addElement(15);
		l1.addElement(10);
		l1.addElement(30);
		l1.addElement(5);
		l1.addElement(12);
		l1.addElement(20);
		l1.addElement(35);
		l1.addElement(25);
		l1.addElement(32);
		System.out.println("Tamanho inicial da arvore: " + l1.size());
		System.out.println("Elemento mais pequeno removido: " + l1.removeMin().toString());
		System.out.println("Tamanho da arvore: " + l1.size());
		System.out.println("Maior elemento removido: " + l1.removeMax().toString());
		System.out.println("Tamanho da arvore: " + l1.size());
		System.out.println("Menor elemento na arvore: " + l1.findMin());
		System.out.println("Maior elemento na arvore: " + l1.findMax());
		
		
		System.out.println("\n\nTamanho inicial da arvore: " + l2.size());
		l2.addElement(1);
		l2.addElement(2);
		l2.addElement(3);
		l2.addElement(5);
		l2.addElement(4);
		System.out.println("Tamanho da arvore: " + l2.size());
		//l2.removeElement(2);
		//l2.removeElement(2);
		System.out.println("Tamanho da arvore: " + l2.size());
		System.out.println("Menor valor da arvore: " + l2.findMin());
		System.out.println("Maior valor da arvore: " + l2.findMax());
	}
}
