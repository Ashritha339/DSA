class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int visit[]=new int[rooms.size()];
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        visit[0]=1;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int i:rooms.get(curr)){
                if(visit[i]!=1){
                    q.offer(i);
                    visit[i]=1;
                }
            }
            
        }
        for(int i:visit){
            if(i==0)return false;
        }
        return true;
    }
}