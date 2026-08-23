import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {2, 4, 6, 8, 6, 9, 4};

        ArrayStatistics as = new ArrayStatistics();

        int total = as.sum(arr);
        System.out.println("sum of array is " + total);

        double av = as.average(arr);
        System.out.println("average of array is " + av);

        int m = as.minimum(arr);
        System.out.println("minimum of array is " + m);

        int ma = as.maximum(arr);
        System.out.println("maximum of array is " + ma);

        int c = as.countEven(arr);
        System.out.println("even count of array is " + c);

        as.printSignCounts(arr);
        System.out.println("sign count analysis complete");

        int[] values = {1, 4, 2, 3, 7, 4, 8, 5};
        int target = 4;

        LinearSearchToolKit l = new LinearSearchToolKit();

        boolean cont = l.contains(values, target);
        System.out.println("target value is found in array " + cont);

        int first=l.firstIndexOf(values,target);
        System.out.println("target first index in array " + first);

        int second=l.lastIndexOf(values,target);
        System.out.println("target last index in array "+second);
        

        ArrayTransformation A = new ArrayTransformation();

        A.reverseInPlace(values);
        System.out.println("Reversed array: " + Arrays.toString(values));

        int[] copy = A.reversedCopy(values);
        System.out.println("Reversed new array is: "+ Arrays.toString(copy));

        int removeTarget = 9;

        int remove = A.removeValue(values, removeTarget);
        System.out.println("length after removal: " + remove);

        int[] sums = A.runningSum(values);
        System.out.println("Running sum is: " + Arrays.toString(sums));

       int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] firstmatrix={
            {1,2},
            {2,1}
        };
        int[][] secondmatrix={
            {1,3},
            {3,5}
        };

        MatrixOperation mat = new MatrixOperation();

        int[] rs = mat.rowSums(matrix);
        System.out.println("row sum : " + Arrays.toString(rs));

        int[] cs = mat.columnSums(matrix);
        System.out.println("column sum : " + Arrays.toString(cs));

         int[][] ad = mat.add(firstmatrix, secondmatrix);
        System.out.println("addition of matrix is " + Arrays.deepToString(ad));

        int [][] trans=mat.transpose(matrix);
        System.out.println("transpose of matrix is "+Arrays.deepToString(trans));

        int[][] mult=mat.multiply(firstmatrix, secondmatrix);
        System.out.println("matrix multiplication is "+Arrays.deepToString(mult));
        mat.printMatrix(matrix);


ArrayConstructionProblems acp = new ArrayConstructionProblems();

String[] operations = {"--X", "X++", "X++"};

int[] nums = {0, 2, 1, 1, 5, 3, 4};

int f = acp.finalValueAfterOperations(operations);
System.out.println("Final value after operation: " + f);

int[] ba = acp.buildArray(nums);
System.out.println("Permutation of array is: " + Arrays.toString(ba));

int[] con = acp.getConcatenation(nums);
System.out.println("Concatenation of array is " + Arrays.toString(con));

int[] rus = acp.runningSum(nums);
System.out.println("Running sum of array is " + Arrays.toString(rus));

int[][] accounts={{2,3,8},{9,9,7},{1,1,2}};
int val=1;
ArrayPointersProblems app=new ArrayPointersProblems();
int maxw=app.maximumWealth(accounts);
System.out.println("maximum wealth of customer is "+maxw);
int rem=app.removeElement(nums, val);
System.out.println("array after removing val "+rem);


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = sc.nextInt();

        if (position < 0 || position > 31) {

            System.out.println("Invalid bit position");

        } else {

            System.out.println("1. Check bit");
            System.out.println("2. Set bit");
            System.out.println("3. Clear bit");
            System.out.println("4. Toggle bit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            System.out.println("Before decimal: " + number);
            System.out.println("Before binary: " +
                    BitMaskUtility.toBinary32(number));

            if (choice == 1) {

                boolean result =
                        BitMaskUtility.isBitSet(number, position);

                System.out.println("Bit is set: " + result);

            } else if (choice == 2) {

                int result =
                        BitMaskUtility.setBit(number, position);

                System.out.println("After decimal: " + result);
                System.out.println("After binary: " +
                        BitMaskUtility.toBinary32(result));

            } else if (choice == 3) {

                int result =
                        BitMaskUtility.clearBit(number, position);

                System.out.println("After decimal: " + result);
                System.out.println("After binary: " +
                        BitMaskUtility.toBinary32(result));

            } else if (choice == 4) {

                int result =
                        BitMaskUtility.toggleBit(number, position);

                System.out.println("After decimal: " + result);
                System.out.println("After binary: " +
                        BitMaskUtility.toBinary32(result));

            } else {

                System.out.println("Invalid choice");
            }
        }

        sc.close();


    }
}

        

    

     
        





        

