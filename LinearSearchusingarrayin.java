public class LinearSearch{
    public static int LinearSearch(int[]arr,int key){
        for(int i= 0;i<arr.length;i++){
            if (arr[i] == key){
                return 1;
        }
    }
    return -1;
}

{
    int[] a1 = {10,20,30,40,50,60,70};
    
    int key = 50;
    System.out.println(key +" is found at index "  +  LinearSearch(a1, key) );
}
}