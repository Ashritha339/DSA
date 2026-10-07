class Solution {
    public int minMaxGame(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }

        while(al.size()>1){
            al2.clear();

            for(int i=0;i<al.size();i+=4){

                if(i<al.size()){
                    if(i+1<al.size()){
                        al2.add(Math.min(al.get(i),al.get(i+1)));
                    }
                    else{
                        al2.add(al.get(i));
                    }
                }

                if(i+2<al.size()){
                    if(i+3<al.size()){
                        al2.add(Math.max(al.get(i+2),al.get(i+3)));
                    }
                    else{
                        al2.add(al.get(i+2));
                    }
                }
            }

            al.clear();

            for(int i=0;i<al2.size();i++){
                al.add(al2.get(i));
            }
        }

        return al.get(0);
    }
}