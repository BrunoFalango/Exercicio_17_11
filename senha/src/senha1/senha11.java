package senha1;

public class senha11 {

	public static void main(String[] args) {
		
		int senha, senhaValida = 1234;
		   System.out.print("Digite sua senha: ");
	    scanf("%d", senha);
	    while(senha != senhaValida){
	      System.out.print("Senha invalida!\n\nDigite sua senha: ");
	    scanf("%d", senha);
	    }
	    System.out.print("Acesso permitido!\n");

	}

}
