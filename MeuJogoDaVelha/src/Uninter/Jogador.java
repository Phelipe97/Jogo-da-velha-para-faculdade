package Uninter;

public class Jogador {
	 public boolean jogar(String mapa[][], String horizontal, String vertical){
		//verifica se a posi��o est� ocupada e se n�o estiver, marca o "X" de jogador 
	        try{
	            
	            int x = Integer.parseInt(horizontal);
	            int y = Integer.parseInt(vertical);
	            if (mapa[x-1][y-1].equals(" ")){
	                mapa[x-1][y-1] = "X";
	                return true;
	            }else{
	                
	                System.out.println("Posi��o j� ocupada");
	                return false;
	            }
	        }catch(Exception e){
	            System.out.println("Valor inv�lido");
	            return false;
	        }
	                    
	    }

}
