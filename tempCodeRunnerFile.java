class pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {         
            for (int j = 1; j > i; j++) {      
                if(j==4-i){
                    System.out.print(" ");
                }
                else
                    System.out.print("x");
                
            }
            System.out.println();              
        }
    }
}
