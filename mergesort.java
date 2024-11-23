
import java.util.Arrays;

class mergesort{
    public static void main(String[] args) {
        int[] arr={5,4,3,1,8,9};
      mergesort1(0, arr.length-1, arr);
      System.out.println(Arrays.toString(arr));
    }
    public static void mergesort1(int s, int e , int[] nums){
        if(s==e){
            return;
        }
        int mid=s+(e-s)/2;
        mergesort1(s, mid, nums);
        mergesort1(mid+1, e, nums);
        merge(s,mid,e,nums);

    }
    public static void merge(int s,int m, int e, int[] nums){
int[] ans=new int[e-s+1];
int i=s;
int j=m+1;
int k=0;
while(i<=m && j<=e){
    if(nums[i]<nums[j]){
        ans[k]=nums[i];
        i++;
    }else{
        ans[k]=nums[j++];
    }
    k++;
}
while(i<=m){
    ans[k++]=nums[i];
    i++;
}
while(j<=e){
    ans[k++]=nums[j];
    j++;
}
for(int l=0;l<ans.length;l++){
    nums[s+l]=ans[l];
}

    } 
}