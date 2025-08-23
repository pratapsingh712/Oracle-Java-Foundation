package arrays;

public class ThreeDArray {

    public static void main(String[] args) {

        int [][][] nums = new int[2][3][3];

        //------------------------------------->Initialize & Assign values to 3-D array
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i][j].length;k++){
                    nums[i][j][k] = (int)(Math.random()*100);
                }
            }
        }


        //------------------------------------->Printing the 3-D array
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i][j].length;k++){
                    System.out.print(nums[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
