package com.company;
import java.util.*;
public class Main
{
    static boolean isJolly(int a[], int n)
    {
        boolean []diffSet = new boolean[n];
        for (int i = 0; i < n - 1 ; i++)
        {
            int d = Math.abs(a[i] - a[i + 1]);
            if (d == 0 || d > n - 1 ||
                    diffSet[d] == true)
                return false;
            diffSet[d] = true;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0;i<n;++i)
            a[i] = sc.nextInt();
        if(isJolly(a, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
