public class linear_search {
    public static boolean linearSearch(int[] arr, int x){

        for(int i : arr){
            if(i==x){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int[] arr = {4,2,9,45,10,6};
        int ele = 10;
        boolean res = linearSearch(arr,ele);

        if(res){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }
    }
}
