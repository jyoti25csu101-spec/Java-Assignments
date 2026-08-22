public class ArrayTransformation {

    static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] arr = new int[values.length];

        for (int i = values.length - 1; i >= 0; i--) {
            arr[values.length - 1 - i] = values[i];
        }

        return arr;
    }
    static int removeValue(int[] values, int target){
        int write=0;
        for(int read=0;read<values.length;read++){
            if(values[read]!=target){
                values[write]=values[read];
                write++;
            }

        }
        return write;
    }
     static int[] runningSum(int[] values){
        int[] arr1=new int[values.length];
        int total=0;
        for(int i=0;i<arr1.length;i++){
            total+=values[i];
            arr1[i]=total;
        }
        return arr1;
     }

}

