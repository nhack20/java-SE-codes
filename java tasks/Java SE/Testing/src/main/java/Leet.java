public class Leet {
    public static void main(String[] args) {
        int  nums[] = {-4,-1,0,3,10};
        int []result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]*=nums[i];


        }
        System.out.println(result);
    }
}
