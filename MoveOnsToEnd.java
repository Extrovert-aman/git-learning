public class MoveOnsToEnd {
    public static void main(String[] args){
        int[] arr ={1,0,1,2,4,1,3,1};
        moveOnesToEnd(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void moveOnesToEnd(int[] arr){
        int index =0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=1){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=1;
        }
    }
}
