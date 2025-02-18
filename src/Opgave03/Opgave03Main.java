package Opgave03;

import java.util.ArrayList;

public class Opgave03Main {

    public static int power(int n, int p) {

        if (Math.pow(n,p)==1){
            return 1;
        }
        return power(n,p-1) * n;
    }
}
