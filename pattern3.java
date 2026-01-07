public class pattern3 {
    public static void main (String args[]){
        int i,j;
        for (i=1; i<=4; i++){
            for(j=1; j<5; j++){
                if(i==j)
                    System.out.print('$');
                else
                    System.out.print(". ");
            }
            System.out.println( );
        }
    }
}

