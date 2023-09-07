package com.mystream;
import java.util.stream.*;

import java.util.stream.Stream;
class PrimeNumberGenerator {
    private int current = 2;

    public boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int check() {
        while (true) {
            if (isPrime(current)) {
                int prime = current;
                current++;
                return prime;
            }
            current++;
        }
    }
}


public class primeNumberStream {
    public static void main(String[] args) {
        Stream<Integer> primeStream = Stream.generate(new PrimeNumberGenerator()::check);

        primeStream.limit(10).forEach(System.out::println);
    }
}

