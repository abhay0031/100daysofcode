class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int a=0;
        int b=0;
        int start=0;

        for(int i=0;i<gas.length;i++){

            b+=gas[i]-cost[i];

            if(b<0){

                a+=b;
                b=0;
                start=i+1;
            }
        }
          if(a + b >= 0) {
        return start; 
    } else {
        return -1; 
    }


        
    }
}