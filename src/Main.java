public class Main {
    public static void main(String[] args) {
        Landline l1=new Landline("123123");
        Landline l2 =new Landline("321321");

        l1.callNo("321321");
        l2.receiveCall("321321");
        System.out.println(l2.answerCall());




    }
}