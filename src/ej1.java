public class ej1 {

    public static void main(String[] args) {
        System.out.println("Hellow world!");
        
        
        long startTime = System.nanoTime();
        long result = powTwo0(0);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println("powTwo0(0) = " + duration/1000000+"ms");

        startTime = System.nanoTime();
        result = powTwo0(10);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo0(10) = "+ duration/1000000+"ms");


        startTime = System.nanoTime();
        result = powTwo0(20);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo0(20) = "+ duration/1000000+"ms");


        startTime = System.nanoTime();
        result = powTwo0(30);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo0(30) = "+ duration/1000000+"ms");

        startTime = System.nanoTime();
        result = powTwo1(0);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo1(0) = "+ duration/1000000+"ms");

        startTime = System.nanoTime();
        result = powTwo1(10);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo1(10) = "+ duration/1000000+"ms");

        startTime = System.nanoTime();
        result = powTwo1(20);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo0(20) = "+ duration/1000000+"ms");

        startTime = System.nanoTime();
        result = powTwo1(30);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo0(30) = "+ duration/1000000+"ms");


        startTime = System.nanoTime();
        result = powTwo1(31);
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("powTwo0(31) = "+ duration/1000000+"ms");


    
    }

    public static long powTwo0(long n){
        if (n==0){
            return 1;
        }else{
            return powTwo0(n-1) + powTwo0(n-1);
        }
    }

    public static long powTwo1(long n){
        if (n == 0){
            return 1;
        }else{
            return 2*powTwo1(n-1);
        }
    }


}
