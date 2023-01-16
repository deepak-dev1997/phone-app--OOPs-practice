public interface Phone {
    void powerOn();
    void callNo(String no);
    void receiveCall(String no);
    boolean answerCall();
    boolean isRinging();
}
