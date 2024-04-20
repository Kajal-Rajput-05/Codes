
class LQ2 {
    public static void main(String[] args){
        int upperStars = 9; 
        int rows = 4;
        int spaces = 0;
        int stars = 2 * rows - 1;
        for (int i = 1; i <= upperStars; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars || i == rows){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}