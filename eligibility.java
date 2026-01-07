public class eligibility {
    public static void main(String[] args) {
        boolean deg = true;
        int workexp = 3;
        boolean com = true;
        if(deg == true){
            if(workexp >= 2){
                if(com == true){
                    System.out.println("You are eligible for the job");
                }
                else{
                    System.out.println("Not eligible");
                }
            }
            else{
            System.out.println("Not eligible");
            }
        }
        else{
            System.out.println("Not eligible");
        }
        
    }
}
