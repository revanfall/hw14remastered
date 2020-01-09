class Sorting{


    //сортировка вставкой
   static int[] insertSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return  arr;
    }
    //интерполяционный поиск
    static int interpolationSearch(int[] arr,int x){
       insertSort(arr);
        int low=0;
        int high=arr.length-1;
        while (low<=high && x>=arr[low] && x<=arr[high]){
            if (high==low){
                if(arr[low]==x)
                    return 0;
                return -1;
            }
            int positon=low+(((high-low)/(arr[high]-arr[low]))*(x-arr[low]));
            if(arr[positon]==x)
                return positon;
            if(arr[positon]<x)
                low=positon+1;
            else high=positon-1;
        }
        return -1;
    }
}
