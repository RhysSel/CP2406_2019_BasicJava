package week8;

public class PhoneCallArray {
    public static void main(String[] args) {
        int i;
        PhoneCall[] calls = new PhoneCall[10];
        calls[0] = new IncomingPhoneCall("23423424");
        calls[1] = new OutgoingPhoneCall("32423424", 4);
        calls[2] = new IncomingPhoneCall("34223434");
        calls[3] = new OutgoingPhoneCall("40534145", 10);
        calls[4] = new IncomingPhoneCall("54506512");
        calls[5] = new OutgoingPhoneCall("65563722", 30);
        calls[6] = new IncomingPhoneCall("13454857");
        calls[7] = new OutgoingPhoneCall("23442343", 3);
        calls[8] = new IncomingPhoneCall("21321332");
        calls[9] = new OutgoingPhoneCall("95454354", 5);
        for (i = 0; i < calls.length; ++i)
            calls[i].getInfo();
    }
}