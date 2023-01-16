import java.sql.SQLOutput;

public class Landline implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean power;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging=false;
        power=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public void powerOn() {
        this.power=true;
    }

    @Override
    public void callNo(String no) {
    if(power==true){

        System.out.println("You are dialing "+no);
    }
    else {
        System.out.println("LandLine device is Off");
    }
    }

    @Override
    public void receiveCall(String no) {
    if(power==true && no.equals(myPhoneNo)){
        this.isRinging=true;
        System.out.println("hey "+myPhoneNo+" you are receiving a call");
    }
    else{
        System.out.println("Call not received either off or no. is wrong");
    }
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call answered ");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
