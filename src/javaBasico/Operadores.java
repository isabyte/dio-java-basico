package javaBasico;

public class Operadores {

	public static void main(String[] args) {
		/* OPERADOR TERNÁRIO 
		 * forma resumida para definir uma condição e escolher
		 * um dentre dois valores; uma condição IF escrita
		 * em uma única linha, representado pelos símbolos
		 * ```?:```*/
		
		int a, b;
		
		a = 5;
		b = 6;
		
		// se a operação booleana retornar true, o resultado recebe verdadeiro
		// se retornar false, o resultado recebe falso
		String resultado = a==b ? "verdadeiro" : "falso";
		
		System.out.println(resultado);
		
		/* OPERADORES RELACIONAIS */
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2; // false
		
		System.out.println(simNao);
		
		// quando tratamos de objetos ou textos, utilizamos o método equals
		// equals compara o conteúdo dos objetos
		
		String nomeUm = "Isabela";
		String nomeDois = new String("Isabela");
		
		System.out.println(nomeUm.equals(nomeDois)); // true
		

	}

}
