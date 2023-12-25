package net.sayurinana.common.utils;

public class S {

    private static final long serialVersionUID = 1L;

    public S() {
        ;
    }

    public static String timeddd(Integer h1, Integer m1, Integer s1, Integer h2, Integer m2, Integer s2){
        if(h1>h2) {
            return "-1";
        }
            else if(h1==h2 && m1>m2) {
                return "-1";
            }
                else if(m1==m2 && s1>s2) {
                    return "-1";
                }
        Integer h, m, s;
        //if(s1)
        return "1";
    }
}
