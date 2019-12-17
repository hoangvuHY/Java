package Oppa9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class closestNumber {
    public static void closestNumbers(int[] arr) {
        sort(arr);
        int temp = arr[1] - arr[0];
        ArrayList<Integer> ars = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] <= temp) {
                if (arr[i] - arr[i - 1] < temp) {
                    ars.clear();
                }
                temp = arr[i] - arr[i - 1];
                ars.add(arr[i-1]);
                ars.add(arr[i]);
            }
        }
        for (int i : ars){
            System.out.print(i+ " ");
        }
    }

    private boolean less(int v, int m) {
        return (v < m ? true : false);
    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static void sort(int[] arr) {
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        closestNumbers(arr);
    }
}
