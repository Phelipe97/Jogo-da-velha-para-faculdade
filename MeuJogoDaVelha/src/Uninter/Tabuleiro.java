package Uninter;

public class Tabuleiro {
	public String posiçoes[][] = new String [3][3];
	public int Jogadas;
	private String marcaDoVencedor;
	
	public Tabuleiro() {
		super();
		this.Jogadas = 0;
		posiçãoInicial();
		this.marcaDoVencedor ="";
	}
	
	private void posiçãoInicial() {//começa as posiçoes
		 for(int i = 0; i < 3; i++){
	            for(int j = 0; j < 3; j++){
	                this.posiçoes[i][j] = " ";
	            }
	        }
	    }
	
	private void reiniciar(){

	    for(int i = 0; i < 30; i++){
	        System.out.println();
	    }
	    System.out.println("JOGO DA VELHA");
	    System.out.println("X - Eu | O - COMPUTADOR");
	}
	
	public void mostrar(){
	       reiniciar(); 
	       
	      
	       for(int i = 0; i < 3; i++){
	            for(int j = 0; j < 3; j++){
	                System.out.print(this.posiçoes[i][j]);
	                if(j<2){
	                    System.out.print("|");
	                }
	                
	            }
	            if(i<2){
	                System.out.println("\n-|-|-");
	            }
	        }
	        System.out.println("\n");
	
	}
        
	
	
	public boolean verificarVitoria(){// vai verificar todos os tipos de vitorias possiveis
	       
	        if(Jogadas < 5){
	            return false;
	        }
	        
	        if(posiçoes[0][0].equals(posiçoes[1][1])&& posiçoes[1][1].equals(posiçoes[2][2]) && !(posiçoes[1][1].equals(" "))){
	            this.marcaDoVencedor = posiçoes[0][0];
	            return true;
	        }
	        if(posiçoes[2][0].equals(posiçoes[1][1]) && posiçoes[1][1].equals(posiçoes[0][2]) && !(posiçoes[1][1].equals(" "))){
	            this.marcaDoVencedor = posiçoes[2][0];
	            return true;
	            
	        }
	        
	        for(int i = 0; i < 3; i++){
	            
	            if(posiçoes[i][0].equals(posiçoes[i][1]) && posiçoes[i][1].equals(posiçoes[i][2]) && !(posiçoes[i][1].equals(" "))){
	                this.marcaDoVencedor = posiçoes[i][0];
	                return true;
	            }
	            
	            if(posiçoes[0][i].equals(posiçoes[1][i]) && posiçoes[1][i].equals(posiçoes[2][i]) && !(posiçoes[1][i].equals(" "))){
	                this.marcaDoVencedor = posiçoes[0][i];
	                return true;
	            }
	            
	        }
	        return false;
	    }
	
	public String status(){//mostra como ta a partida
        
        boolean Vitoria = verificarVitoria();
        if(Vitoria == false && Jogadas == 9){
            return "EMPATE";
        }else if(Vitoria == false){
            return "INCOMPLETO";
        }else{
            if(this.marcaDoVencedor == "X"){
                return "JOGADOR VENCE";
            }else{
                return "COMPUTADOR VENCE";
            }
        }
    }
    
	}


