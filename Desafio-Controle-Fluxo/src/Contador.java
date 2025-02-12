import java.util.Locale;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    System.out.println("O sistema de contagem irá te retornar, de forma decrescente e numero a numero, o resultado da diferença entre os parâmetros definidos por você");
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

    try {

        contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException e) {
      System.out.println("O primeiro parâmetro não pode ser maior que o segundo");
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if(parametroUm > parametroDois)
      throw new ParametrosInvalidosException();
     
    int contagem = parametroDois - parametroUm;

    for (int i = contagem; i > 0; i--) {
      
      System.out.println("Imprimindo o número: " + i);
    }
  }
  


}
