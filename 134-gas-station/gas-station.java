class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,tank=0,start=0;
        for(int i=0;i<gas.length;i++)
        {
            total+=gas[i]-cost[i];//gas available overall
            tank+=gas[i]-cost[i];//current gas in tank
            if(tank<0)//gas finished
            {
                start=i+1;//cannot start from current station
                tank=0;//reset tank to 0
            }
        }
        if (total<0)//if the in the station gas is less than 0
        return -1;
        
        return start;
    }
}