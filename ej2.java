public class ej2{
   private static final int MAX_LIST = 100;
    private int item[];
    private int numItems;

    public static void main(String[] args){
        ej2 a = new ej2();
        a.item = new int[]{1,2,3,4,5,6,7};
        a.numItems = 7;
        System.out.println(a.buscar(3));
    }

    public ej2(){
        item = new int[MAX_LIST];
        numItems = 0;
    }

    public Integer buscar(int x){
    if (item[numItems - 1] == x){
        return item[numItems-1];
    }else{
        return java.util.Arrays.binarySearch(item, 0, numItems, x);
    
    }
  }

}