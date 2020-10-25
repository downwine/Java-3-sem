package ru.downwine._10_TenthLab;

import java.util.Scanner;


public class Main {

    public static int task4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) return 1;
            else return 0;
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++)
            res += task4(len + 1, sum + i, k, s);
        return res;
    }

    public static int task5(int n) {
        n = n / 10;
        if (n == 0) return 1;
        return (1 + task5(n));
    }

    public static boolean task6(int n, int i) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % i == 0) return false;
        else if (i < n / 2)
            return task6(n, i + 1);
        else return true;
    }

    public static void task7(int n, int i) {
        if (i > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
            task7(n / i, i);
        } else task7(n, ++i);
    }

    public static int task9(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return task9(a, b - 1) + task9(a - 1, b - 1);
    }

    public static int task10(int n, int i) {
        return (n == 0) ? i : task10(n / 10, i * 10 + n % 10);
    }

    public static void task11() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) != '0') && (s.charAt(i + 1) != '0'))
                if (s.charAt(i) == '1') res++;
        }
        System.out.println("Result = " + res);
    }

    public static void task12() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '1') || (s.charAt(i) == '3') || (s.charAt(i) == '5')
                    || (s.charAt(i) == '7') || (s.charAt(i) == '9')) {
                res += s.charAt(i);
            }
            System.out.println("Result = " + res);
        }
    }

    public static void task13() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if((i % 2 != 0) && (!((i == s.length()-1) && (s.charAt(i) == '0')))) {
                res += s.charAt(i);
            }
        }
        System.out.println("Result = " + res);
    }

    public static int task14(int n) {
        if (n == 0) return 0;
        task14(n / 10);
        System.out.print(n % 10 + " ");
        return 0;
    }

    public static int task15(int n) {
        if (n == 0) return 0;
        System.out.print(n % 10 + " ");
        task15(n / 10);
        return 0;
    }

    public static int task16(int res) {
        Scanner in = new Scanner(System.in);
        int n, max = 0;
        n = in.nextInt();
        while (n != 0) {
            if (n > max) {
                max = n;
                res = 1;
            }
            else if (n == max)
                res++;
            n = in.nextInt();
        }
        return res;
    }

    public static int task17(int max) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n != 0) {
            n = in.nextInt();
            if (n > max)
                max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Ввведите номер задания, для завершения программы введите 0: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();
        while (task != 0) {
            switch (task) {
                case 1: {
                    int n = in.nextInt();
                    int k = 0;
                    int[] array = new int[n * n];
                    for (int i = 1; i < n + 1; i++)
                        for (int j = 0; j < i; j++) {
                            array[k] = i;
                            k++;
                        }
                    for (int i = 0; i < n; i++)
                        System.out.print(array[i] + " ");
                    break;
                }
                case 2: {
                    int n = in.nextInt();
                    for (int i = 1; i < n + 1; i++)
                        System.out.print(i + " ");
                    break;
                }
                case 3: {
                    int A = in.nextInt();
                    int B = in.nextInt();
                    if (A < B)
                        for (int i = A; i < B + 1; i++)
                            System.out.print(i + " ");
                    else
                        for (int i = B; i < A + 1; i++)
                            System.out.print(i + " ");
                    break;
                }
                case 4: {
                    int k = in.nextInt();
                    int s = in.nextInt();
                    System.out.println("Result = " + task4(0, 0, k, s));
                    break;
                }
                case 5: {
                    int n = in.nextInt();
                    System.out.println("Result = " + task5(n));
                    break;
                }
                case 6: {
                    int n = in.nextInt();
                    if (task6(n, 2)) System.out.println("YES");
                    else System.out.println("NO");
                    break;
                }
                case 7: {
                    int n = in.nextInt();
                    task7(n, 2);
                    break;
                }
                case 8: {
                    String s = in.next();
                    String s1 = new StringBuilder(s).reverse().toString();
                    if (s.equals(s1)) System.out.println("YES");
                    else System.out.println("NO");
                    break;
                }
                case 9: {
                    int a = in.nextInt();
                    int b = in.nextInt();
                    System.out.println("Result = " + task9(a, b));
                    break;
                }
                case 10: {
                    int n = in.nextInt();
                    System.out.println("Result = " + task10(n, 0));
                    break;
                }
                case 11: {
                    task11();
                    break;
                }
                case 12: {
                    task12();
                    break;
                }
                case 13: {
                    task13();
                    break;
                }
                case 14: {
                    int n = in.nextInt();
                    task14(n);
                    break;
                }
                case 15: {
                    int n = in.nextInt();
                    task15(n);
                    break;
                }
                case 16: {
                    int res = 0;
                    System.out.println("Result = " + task16(res));
                    break;
                }
                case 17: {
                    int max = 0;
                    System.out.println("Result = " + task17(max));
                    break;
                }
            }
            System.out.println();
            System.out.println("Ввведите номер задания, для завершения программы введите 0: ");
            task = in.nextInt();
        }
    }
}
