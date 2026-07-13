class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Float>arthi=new HashMap<>();
        int fleet=position.length;
        for(int i=0;i<position.length;i++)
        {
            float time= (float)(target-position[i])/speed[i];
            arthi.put(position[i],time);

        }
        Arrays.sort(position);
        int i=position.length-1;
        while(i>0)
        {
            float c=arthi.get(position[i]);
            i--;
            while(i>=0&&c>=(float)arthi.get(position[i]))
            {
                fleet--;
                i--;
            }
        }
        return fleet;
        
    }
}
