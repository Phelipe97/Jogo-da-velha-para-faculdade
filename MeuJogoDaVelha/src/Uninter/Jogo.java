package Uninter;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
    
    Jogador jogador = new Jogador();
    ComputadorA pc1 = new ComputadorA();
    ComputadorB pc2 = new ComputadorB();
    ComputadorB pc3 = new ComputadorB();
    
    while(true){
        Tabuleiro tab = new Tabuleiro();
        int nivel = menu();//inicia com a escolha do nivel
        boolean vitoriaJogador;
        
       
        do{
            
            if(tab.Jogadas == 9){
                break;
            }
            String x,y; 
            x = y = "";
            tab.mostrar();
            
            do{//escolha as posiçoes da jogada tanto linha como coluna
                System.out.print("Escolha linha: "); x = teclado.next();
                System.out.print("Escolha coluna: "); y  = teclado.next();
            }while(!(jogador.jogar(tab.posiçoes, x, y)));
            tab.Jogadas++;
            
           
            vitoriaJogador = tab.verificarVitoria();
            if(!(vitoriaJogador)){
                
                switch(nivel){
                case 1:
                    pc1.jogar(tab.posiçoes);
                    break;
                case 2:
                    pc2.jogar(tab.posiçoes);
                    break;
                case 3:
                    pc3.jogar(tab.posiçoes);
                    break;
                }
                tab.Jogadas++;
            }
            
            
        }while(!(tab.verificarVitoria()));
        
        //exibindo o resultado e peguntando se quer jogar novamente
        tab.mostrar();
        System.out.println(tab.status());
        System.out.println("Digite qualquer coisa e pressione enter para jogar novamente");
        teclado.next();
        
    }    
    }
 

public static int menu(){
   
    Scanner teclado = new Scanner(System.in);
    int nivel = 0;
    
   
    while(true){
        try{
            System.out.print("\nEscolha o nível (1-3): ");
            nivel = Integer.parseInt(teclado.next());
            switch(nivel){
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    System.out.println("O Nível selecionado é inválido");
            }
            
        }catch(Exception e){
                System.out.println("Dados inválidos");
        }
    }
}

}

