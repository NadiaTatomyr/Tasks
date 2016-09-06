import java.util.Arrays;

/**
 * Created by 1 on 06.09.2016.
 */
    public class Task_1 {

        public static void main(String[] args) {
            //Task_1_1
            int res = 12*4/3+158*2;
            System.out.println("Task_1_1. Result equals to "+res);

            //Task_1_2
            byte a = 14;
            res = a/20*9+a*(29-a*2+a/3);
            System.out.println("Task_1_2. Result equals to "+res);

            //Task_1_3
            int q, w;
            q = 46;
            w = 4;
            res = q / w;
            int rest = q % w;
            System.out.println("Task_1_3. Result equals to " + q + " / " + w + " = " + res + " and " + rest + " in rest");

        //Task_2

            //Task_2_1
            int n;
            n = 48;
            res = (n/10) + (n%10);
            System.out.println("Task_2_1. Result equals to "+res);

            //Task_2_2
            n = 123;
            System.out.println("Task_2_2. Result equals to "+((n%10)+((n/10)%10)+((n/100)%10)));

            //Task_2_3
            n = 56;
            res = (n/10) + (n%10);
            System.out.println("Task_2_3. Result equals to "+res);

            //Task_2_4
            double d = 3345.65;
            System.out.println("Task_2_4. Result equals to "+ Math.round(d));

            //Task2.5 = Task2.4

        //Task_3

            //Task_3_1
            n = 26;
            if(n%2 == 0){
                System.out.println("Task_3_1. Result equals to Even");
            }
            else{
                System.out.println("Task_3_1. Result equals to Odd");
            }

            //Task_3_2
            double x = 8.9;
            double y = 11.1;
            if(Math.abs(10 - x) >  Math.abs(10 - y)){
                System.out.println("Task_3_2. Result equals to " + y);
            }
            else if (Math.abs(10 - x) <  Math.abs(10 - y)){
                System.out.println("Task_3_2. Result equals to " + x);
            }
            else{
                System.out.println("Task_3_2. Result equals to The Distance from "+x+" is the same as from " + y);
            }

            //Task_3_3
            n = (int)(Math.random()*900+100);
            if ((n%10) >= ((n/10)%10)&&((n%10) >= (n/100)%10)){
                System.out.println("Task_3_3. Result equals to Number " + n + " and highest digit is " + (n%10));
            }
            else if((((n/10)%10)>=(n%10))&&(((n/10)%10) >= (n/100)%10)){
                System.out.println("Task_3_3. Result equals to Number " + n + " and highest digit is " + ((n/10)%10));
            }
            else {
                System.out.println("Task_3_3. Result equals to Number " + n + " and highest digit is " + ((n/100)%10));
            }

            //Task_3_4
            int min = 5;
            int max = 155;
            int range = (max - min) + 1;
            int number = (int)(Math.random() * range) + min;
            if(number>25 && number<100) {
                System.out.println("Task_3_4. Result equals to The number " + number + " is in the interval(25,100)");
            }
            else{
                System.out.println("Task_3_4. Result equals to The number "+number+" is not in the interval(25,100)");
            }

            //Task_3_5
            int b,c,f;
            b = -1;
            c = 20;
            f = 4;
            System.out.println("Task_3_5. Result equals to Variables b, c, f equals to " + b + ", " +c+ ", " +f);
            int array[] = {b, c, f};
            Arrays.sort(array);
            System.out.println("Task_3_5. Result equals to Sorted list is "+ Arrays.toString(array));

            //Task_3_6
            min = 0;
            max = 28800;
            range = (max - min) + 1;
            number = (int)(Math.random() * range) + min;
            System.out.println("Task_3_6. Result equals to Amount of sec till the end of working day " + number);
            if (number/3600 < 1){
                System.out.println("Task_3_6. Result equals to It is less than 1 hour till the end of working day ");
            }
            else{
                System.out.println("Task_3_6. Result equals to "+number/3600+" hours till the end of working day ");
            }




        }
}
