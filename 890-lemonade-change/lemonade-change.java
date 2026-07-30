class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ch5=0;
        int ch10=0;
        int ch20=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                ch5++;
            }
            else if(bills[i]==10){
                if(ch5>0)
                {ch5--;
                ch10++;}
                else return false;
            }
            else if(bills[i]==20){
                if(ch5>0 && ch10>0){
                    ch5--;
                    ch10--;
                }
                else if(ch5>=3){
                    ch5-=3;
                }
                else return false;
            }
        }
        return true;

    }
}