class L1_01Code {
    // Given a varaible named year
    // break each digit of year into d1 d2 d3 d4 from left to right
    public static void main(String... args) {
        int year = 1987;
        int number = year;
        int d1, d2, d3, d4;
        d1 = d2 = d3 = d4 = 0;

        d1 = number / 1000;
        number = number % 1000;
        d2 = number / 100;
        number = number % 100;
        d3 = number / 10;
        d4 = number % 10;

        System.out.println(year + " = " + d1 + " " + d2 + " " + d3 + " " + d4);
    }
}