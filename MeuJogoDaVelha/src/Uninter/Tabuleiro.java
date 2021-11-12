package Uninter;

public class Tabuleiro {
	public String posi�oes[][] = new String [3][3];
	public int Jogadas;
	private String marcaDoVencedor;
	
	public Tabuleiro() {
		super();
		this.Jogadas = 0;
		posi��oInicial();
		this.marcaDoVencedor ="";
	}
	
	private void posi��oInicial() {//come�a as posi�oes
		 for(int i = 0; i < 3; i++){
	            for(int j = 0; j < 3; j++){
	                this.posi�oes[i][j] = " ";
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
	                System.out.print(this.posi�oes[i][j]);
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
	        
	        if(posi�oes[0][0].equals(posi�oes[1][1])&& posi�oes[1][1].equals(posi�oes[2][2]) && !(posi�oes[1][1].equals(" "))){
	            this.marcaDoVencedor = posi�oes[0][0];
	            return true;
	        }
	        if(posi�oes[2][0].equals(posi�oes[1][1]) && posi�oes[1][1].equals(posi�oes[0][2]) && !(posi�oes[1][1].equals(" "))){
	            this.marcaDoVencedor = posi�oes[2][0];
	            return true;
	            
	        }
	        
	        for(int i = 0; i < 3; i++){
	            
	            if(posi�oes[i][0].equals(posi�oes[i][1]) && posi�oes[i][1].equals(posi�oes[i][2]) && !(posi�oes[i][1].equals(" "))){
	                this.marcaDoVencedor = posi�oes[i][0];
	                return true;
	            }
	            
	            if(posi�oes[0][i].equals(posi�oes[1][i]) && posi�oes[1][i].equals(posi�oes[2][i]) && !(posi�oes[1][i].equals(" "))){
	                this.marcaDoVencedor = posi�oes[0][i];
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


