public class purchase {
    public static void main(String[] args) {
        int amount = 100 ;
        double discount=amount;
        if(amount>=500){
            System.out.println("You will get free delivery");
            if(amount>=1000){
                System.out.println("You will also get 10% discount");
                discount = amount - amount * 0.1;
                System.out.println("Ther discounted amount is"+discount);
            }
        }
        else if (amount <500){
            System.out.println("Extra 50rs delivary charge will added. The final amount will be "+ (amount+50));
        }

    }

}
