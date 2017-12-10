/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

/**
 *
 * @author OK
 */
public class Neural_Networks {

	/**
	 * @param args the command line arguments
	 */
	@SuppressWarnings("empty-statement")
	public static void main(String[] args) {
		// TODO code application logic here
		int y[][]={{0,1},{2,3}};
		/*y[0][0]=2;
		y[0][1]=2;
		y[1][0]=2;
		y[1][1]=2;
		*/
		
		int x,j;
		for (x=0;x<2; x++){
			for (j=0; j<2; j++){
				System.out.println(y[x][j]);		
			}
			
		}
	}
	
	
}
