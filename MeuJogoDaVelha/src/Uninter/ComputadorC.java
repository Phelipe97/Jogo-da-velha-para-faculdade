package Uninter;

import java.util.Random;

public class ComputadorC extends Computador{
//nivel dificil a maquina sempre te bloqueia 
	Random numeroAleatorio = new Random();

	@Override
	public void jogar(String[][] mapa) {
		for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(mapa[i][j].equals("X")){
                	//verifica as horizontais
                    try{
                        if(mapa[i+1][j].equals(" ")){
                            mapa[i+1][j] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    try{
                        if(mapa[i-1][j].equals(" ")){
                            mapa[i-1][j] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    
                    try{
                        if(mapa[i][j+1].equals(" ")){
                            mapa[i][j+1] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                    //verifica as verticais
                    try{
                        if(mapa[i][j-1].equals(" ")){
                            mapa[i][j-1] = "O";
                            return;
                        }
                    }catch(Exception e){
                        
                    }
                        
                     
                    
                }
            }
        }
        int x;
        while(true){
            x = numeroAleatorio.nextInt(3);
            for(int j = 0; j < 3; j++){
                if(mapa[x][j].equals(" ")){
                    mapa[x][j] = "O";
                    return;
                }
            }
        }
    }

	}
	


