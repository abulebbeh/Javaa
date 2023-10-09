public class CountByFives{
    public static void main(String[] args){
        final int START = 5;
        final int STOP = 500;

        for(int number = START; number <= STOP; number += START){
            if(number % 10 == 0){
                System.out.println(number);
            }
            else{
                System.out.print(number + " ");
            }
        }
    }
}
