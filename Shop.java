import java.util.*;

/**
 * Shop
 */
public class Shop {
    // Shopping cart class
    public static void main(String[] args) {
        System.out.println("Shopping cart");
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        // String[] prod1;
        // int[] price1;
        // int[] GST1;
        // int[] quatity1;
        // initialise the basket
        String[] prod = { "leather", "cig", "umbrella", "honey" };
        int[] price = { 1110, 900, 200, 100 };
        int[] GST = { 18, 12, 28, 2 };
        int[] quatity = { 1, 4, 3, 2 };
        int[] newprice = {};
        // set maximum element
        int max = Integer.MIN_VALUE;
        // create new array for storing data
        int newp[] = new int[price.length];
        // perform operation
        for (int i = 0; i < price.length; i++) {
            newp[i] = price[i] * GST[i] * quatity[i] / 100;
            // adding discount
            // if (price[i] > 500) {
            // newprice[i] = price[i] * 5 / 100;
            // }
        }

        maximum_sum(newp, max, prod);

        // get from baskcet

        int sum = 0;

        // final sum

        for (int i = 0; i < newp.length; i++) {
            sum += newp[i];
        }
        System.out.println("Amount to be paid is " + sum);

    }

    public static void maximum_sum(int[] newp, int max, String[] prod) {
        int j = 0, k = 0;
        while (j <= newp.length) {
            // finding maximum or highest gst amount
            if (newp[j] > max) {
                max = newp[j];
                // index of maximum product
                k = j;
            }
        }

        System.out.println("Maximum GST is " + max);
        System.out.println("The product is " + prod[k]);
    }

}