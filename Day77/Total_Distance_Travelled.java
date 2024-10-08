class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int maxDist=0;

        while(mainTank>=5 && additionalTank>0){

            maxDist+=50;
            mainTank=(mainTank-5)+1;
            additionalTank--;
        }
        maxDist+=mainTank*10;
        return maxDist;
        
    }
}