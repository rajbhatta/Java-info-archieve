package onereturn.type;

public class NexusRunner {
    public static void main(String[] args){

        ApplePhone applePhone= new ApplePhone() {
            @Override
            public int purchase(int cost, int quantity) {
                return cost*quantity;
            }
        };

        int finalCost=applePhone.purchase(30,40);

        System.out.println(finalCost);

    }

}
