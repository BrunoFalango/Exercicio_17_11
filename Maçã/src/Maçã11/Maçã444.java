package Maçã11;

import java.util.Scanner;

public class Maçã444 {
	 double lado, area, altura;
     int lados;

     Scanner ler = new Scanner (System.in);

     System.out.println("Digite a quantidade de lados: ");
     lados = ler.nextInt();

     if (lados < 3) {
         System.out.println("Não é um polígono!");
     }
     if (lados > 5) {
         System.out.println("Polígono não identificado");
     }

     System.out.println("Digite a medida (em cm) dos lados: ");
     lado = ler.nextDouble();

     if (lados == 3) {
         System.out.println("Digite o valor da altura: ");
         altura = ler.nextDouble();

         area = (lados * altura)/2;
         System.out.println("É um triângulo e sua área é: " + area +" cm²");
     }
     if (lados == 4) {
         area = lado * lado;
         System.out.println("É um quadrado e sua área é: " + area +" cm²");
     }
     if (lados == 5) {
         System.out.println("É um pentágono");
     }
 }
}