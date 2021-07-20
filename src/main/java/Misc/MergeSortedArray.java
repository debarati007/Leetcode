package Misc;

public class MergeSortedArray {
    public static void main(String args[]) {
        int a[] = new int[]{1,2,3,0,0,0};
        int b[] = new int[]{2,5,6};
        merge(a,3,b,3);
//        for(int i=a.length-1;i>0;i--){
//
//                a[i]=a[i-1];
//
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

//        [-1,0,0,3,3,3,0,0,0]
//        6
//                [1,2,2]
//        3

    }
    //bruteforce. Here size of nums1=m+n.
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0,j=0;
        while(n>0){
            if(nums1[i]<=nums2[j] && i<m){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                for(int t=nums1.length-1;t>i;t--){
                    nums1[t]=nums1[t-1];
                }
                nums1[i]=nums2[j];
                j++;
                i++;
                m++;
                n--;
            }
            else{
                for(int x=j;x<nums2.length;x++){
                    nums1[i++]=nums2[j++];
                    n--;
                }
            }

        }
    }
    // optimized approach with extra space.
    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        int i=0,j=0;
        int k=0;
        int[] nums3=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                nums3[k++]=nums1[i++];
            }
            else{
                nums3[k++]=nums2[j++];
            }
        }

        while(i<m){
            nums3[k++]=nums1[i++];
        }
        while(j<n){
            nums3[k++]=nums2[j++];
        }
        for( i=0;i<k;i++){
            nums1[i]=nums3[i];
        }

    }
    //optimized
    //GAP algorith based on 2 pointers.
    //distance between 2 pointers initially ceil(m+n/2). Afterwards,initial gap/2 till we reach 1.
    //TC= nlogn . Aux space=o(n)

    public void merge3(int[] arr1, int m, int[] arr2, int n) {
        int z=0;
        for(int i=m;i<m+n;i++) // Inserting elements of arr2 at ending of arr1
            arr1[i]=arr2[z++];

        //*Taking gap=m as till that elements are already sorted*
        for(int gap=m;gap>=1;gap/=2){
            for(int j=gap;j<m+n;j++){
                int k=j-gap;
                while(k>=0 && arr1[k+gap]<arr1[k]){
                    swap(arr1,k+gap,k);
                    k=k-gap;}
            }
        }
    }
    public void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }


}
