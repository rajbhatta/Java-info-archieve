package noreturn.type;

public class NexusRunner {
    public static void main(String[] args){

        ApplePhone applePhone=() -> "This is for test";
        applePhone.purchase();

    }

}
