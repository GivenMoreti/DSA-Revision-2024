public class BinarySearch2D {
    public static void main(String[] args) {

        int[][] arr = {
                { 2, 4, 5 },
                { 6, 16, 21 },
                { 8, 18, 89 }
        };

    }

    public static int binSearch2D(int [][] arr, int target){
        
        int low = arr[0][0];
        int high = arr.length - 1;
        for(int i = 0 ; i< arr.length;i++){
            for (int j = 0 ; j< arr[i].length;i++){
                

                while(low <= high){

                    int middle = low + (high - low)/2;
                    if(target == arr[0][middle]){
                        return middle;
                    }
                    else if( target < arr[0][middle]){
                        high = middle - 1;
                    }
                }
            }
        }
       
        
        
        
        return -1;
    }
}
