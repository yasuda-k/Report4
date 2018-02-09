package jp.ac.uryukyu.ie.e165712;

public class main {
    public static void main(String[] args){
        String str = null;
        try {
            System.out.printf("%d\n", str.length());
        }
        catch(NullPointerException e){
            System.out.printf("例外: NullPointerException が発生しました。\n");
            System.out.printf("%s\n",e.getMessage());
        }
    }
}
