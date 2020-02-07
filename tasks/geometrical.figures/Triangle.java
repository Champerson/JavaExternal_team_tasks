
public class Triangle {
	
	private int sideLength;
	
	
	public Triangle(int sideLength) {
		this.sideLength = sideLength;
	}


	public void drawEmptyTriangle() {
		for(int i = 0; i < sideLength; i++ ){
			for(int j = sideLength - 1 + i; j >= 0; j--) {
				if(j - i <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
	}
	
}
