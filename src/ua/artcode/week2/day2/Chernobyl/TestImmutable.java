package ua.artcode.week2.day2.Chernobyl;






public class TestImmutable {
    public static void main(String[] args) {
        String some = "abs";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            some += i;
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time of concat is %d", end - start);
        StringBuilder sb = new StringBuilder();
        long st = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long en= System.currentTimeMillis();
        System.out.printf("\nTime of string builder is %d", en - st);
    }
}