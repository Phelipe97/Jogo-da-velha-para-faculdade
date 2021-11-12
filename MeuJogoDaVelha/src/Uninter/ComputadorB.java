package Uninter;

import java.util.Random;

public class ComputadorB extends Computador{
//nivel interemediario e aleatorio
		Random numeroAleatorio = new Random();
	    
	    @Override
	    public void jogar(String[][] mapa) {
	        
	        int x,y;
	        while(true){
	            x = numeroAleatorio.nextInt(3);
	            y = numeroAleatorio.nextInt(3);
	            if(mapa[x][y].equals(" ")){
	                mapa[x][y] = "O";
	                return;
	            }
	            
	        }
	    }

	}
	


