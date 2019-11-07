package main;


public class SysExeEx {

    public static void main(String[] args) {
        try {
            throw new SystemException(PaymentCode.CREDIT_CARD_EXPIRED);
        } catch (SystemException e) {
            if (e.getErrorCode() == PaymentCode.CREDIT_CARD_EXPIRED) {
                System.out.println("Credit card expired");
            }
        }
    }
}