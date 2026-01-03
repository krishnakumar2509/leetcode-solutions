class Solution {
    public boolean isPalindrome(int x) {
        int z=x;
        int a=x;
        int temp=x;
        int count=0;
        if (x < 0) return false;

        while(temp!=0){
            count++;
            temp/=10;
        }
        int[] arr=new int[count];
        int[] ori=new int[count];
        //original
        for(int k=count-1;k>=0;k--){
            ori[k]=a%10;
            a=a/10;
        }

        //reverse array
        for(int i=0;i<count;i++){
            arr[i]=z%10;
            z=z/10;
        }
        for(int i=0;i<count;i++){
            if((arr[i]!=ori[i])){
                return false;
            }
           
        }return true;
    }
}