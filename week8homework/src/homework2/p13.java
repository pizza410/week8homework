package homework2;

public class p13 {
    public static void main(String[] args) {
        p13 dc=new p13();
        boolean b1=dc.hasShared(12,23);
        System.out.println(b1);
    }
    public boolean hasShared(int number1,int number2){
        if((number1<10 || number1>99) || (number2<10 || number2>99)){
            return false;
        }
        int[] e1=new int[10];
        int[] e2=new int[10];
        int i=0;
        while(number1>0){
            int digit=number1%10;
            e1[i++]=digit;
            number1=number1/10;
        }
        int j=0;
        while(number2>0){
            int digit=number2%10;
            e2[j++]=digit;
            number2=number2/10;
        }
        for(int k=0;k<i;k++){
            for(int l=0;l<j;l++) {
                if (e1[k] == e2[l]) {
                    return true;
                }
            }
        }
        return false;
    }
}
