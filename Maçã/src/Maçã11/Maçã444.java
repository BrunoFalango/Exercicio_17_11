package Ma��11;

import java.util.Scanner;

public class Ma��444 {
	 double lado, area, altura;
     int lados;

     Scanner ler = new Scanner (System.in);

     System.out.println("Digite a quantidade de lados: ");
     lados = ler.nextInt();

     if (lados < 3) {
         System.out.println("N�o � um pol�gono!");
     }
     if (lados > 5) {
         System.out.println("Pol�gono n�o identificado");
     }

     System.out.println("Digite a medida (em cm) dos lados: ");
     lado = ler.nextDouble();

     if (lados == 3) {
         System.out.println("Digite o valor da altura: ");
         altura = ler.nextDouble();

         area = (lados * altura)/2;
         System.out.println("� um tri�ngulo e sua �rea �: " + area +" cm�");
     }
     if (lados == 4) {
         area = lado * lado;
         System.out.println("� um quadrado e sua �rea �: " + area +" cm�");
     }
     if (lados == 5) {
         System.out.println("� um pent�gono");
     }
 }
}