package main;

import java.util.ResourceBundle;

public class SysExeEx3 {

    public static void main(String[] args) {
        System.out.println(getUserText(ValidationCode.VALUE_TOO_SHORT));
    }

    public static String getUserText(ErrorCode errorCode) {
        if (errorCode == null) {
            return null;
        }
        String key = errorCode.getClass().getSimpleName() + "__" + errorCode;
        ResourceBundle bundle = ResourceBundle.getBundle("com.northconcepts.exception.example.exceptions");
        return bundle.getString(key);
    }

}