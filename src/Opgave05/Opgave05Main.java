package Opgave05;

import java.util.Base64;

public class Opgave05Main {
    public static int sfd(int a, int b) {
        if (b<=a && b%a==0){
            return a;
        }
        if (a<b){
            return sfd(b,a);
        }
        else {
            return sfd(b,a%b);
        }
    }
}
