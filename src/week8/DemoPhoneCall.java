package week8;

public class DemoPhoneCall {
    public static void main(String[] args) {
        IncomingPhoneCall inCall = new IncomingPhoneCall("2132131");
        OutgoingPhoneCall outCall = new OutgoingPhoneCall("21321312", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}