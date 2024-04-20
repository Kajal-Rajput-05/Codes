
class LQ12{            
    public static void main(String[] args){
			for (int i = 0; i <= 5; i++) { 
				int n = 65; 
			for (int j = 5; j > i; j--){
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++){
				System.out.print((char) (n + k) + " ");
			}
			System.out.println();
		}
	}
}