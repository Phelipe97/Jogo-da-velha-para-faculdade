package Uninter;

public class ComputadorA extends Computador{
	 //nivel facil marca somente espaços na horizontal
	@Override
	public void jogar(String[][] mapa) {
		for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(mapa[i][j].equals(" ")){
                    mapa[i][j] = "O";
                    return;
                }
            }
        }
    }
		
}

	

