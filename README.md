number problems 





Sunny Number
Duck Number
Buzz Number
Peterson Number
Disarium Number
Harshad (Niven) Number
Perfect Number
Abundant Number
Deficient Number
Prime Number
Twin Prime Numbers
Emirp Number
Intermediate
Fibonacci Series
Factorial
GCD (HCF)
LCM
Check Co-prime Numbers
Count Digits
Sum of Digits
Product of Digits
Largest Digit
Smallest Digit
Sum of Even Digits
Sum of Odd Digits
Count Even Digits
Count Odd Digits
Frequency of Each Digit
Remove Duplicate Digits
Rotate Digits
Swap First and Last Digit
Binary to Decimal
Decimal to Binary
Advanced
Perfect Square
Perfect Cube
Power of Two
Power of Three
Power using Recursion
Check if Number is a Fibonacci Number
Catalan Number
Pascal Triangle
Sieve of Eratosthenes
Generate Prime Numbers in Range
Prime Factorization
Count Trailing Zeros in Factorial
Find Missing Number
Find Unique Number using XOR
Count Set Bits
Reverse Bits
Decimal to Octal
Decimal to Hexadecimal
Binary Addition
Roman Number Conversion
Pattern-Based Number Problems
Print Multiplication Table
Number Pyramid
Floyd's Triangle
Pascal Triangle
Diamond Number Pattern
Hollow Number Pattern
Butterfly Pattern
Palindrome Number Pattern







   1
  1 1
 1 2 1
1 3 3 1
Sieve of EratosthenesAn ancient, highly efficient algorithm used to find all prime numbers up to a given limit.Example: Finding all primes up to 10 by crossing out multiples of 2, 3, etc., leaving 2, 3, 5, 7.Generate Prime Numbers in RangeFinding all prime numbers strictly between a start and end range.Example: Primes between 10 and 20 are 11, 13, 17, 19.Prime FactorizationFinding the prime numbers that multiply together to make the original number.Example: Prime factorization of 12 is $2 \times 2 \times 3$ (or $2^2 \times 3$).Count Trailing Zeros in FactorialCounting the number of consecutive zeros at the end of $N!$ without computing the entire large factorial.Example: $5! = 120$ (has 1 trailing zero).Find Missing NumberFinding a single missing number from an array containing consecutive integers from $1$ to $N$.Example: Given array [1, 2, 4, 5] (where $N=5$), the missing number is 3.Find Unique Number using XORGiven an array where every element appears twice except for one, finding that unique element using the XOR operator ($x \oplus x = 0$).Example: In [2, 3, 2, 4, 3], $2 \oplus 2$ and $3 \oplus 3$ cancel out, leaving 4.Count Set BitsCounting the number of 1s in the binary representation of an integer.Example: $13$ (binary $1101$) has 3 set bits.Reverse BitsReversing the binary digits of an integer.Example: In an 8-bit space, $13$ ($00001101$) reversed becomes $176$ ($10110000$).Decimal to OctalConverting a base-10 number to base-8.Example: $10_{10}$ becomes $12_8$ ($1 \times 8^1 + 2 \times 8^0$).Decimal to HexadecimalConverting a base-10 number to base-16.Example: $26_{10}$ becomes $1\text{A}_{16}$ ($1 \times 16^1 + 10 \times 16^0$).Binary AdditionAdding two binary numbers together.Example: $101_2 + 011_2$ ($5 + 3$) $=$ $1000_2$ ($8$).Roman Number ConversionConverting an integer to Roman numerals.Example: 1994 converts to MCMXCIV.4. Pattern-Based ProblemsPrint Multiplication TablePrinting the multiples of a number from 1 to 10.Example (Table of 3):Plaintext3 x 1 = 3
3 x 2 = 6
...
3 x 10 = 30
Number PyramidPrinting numbers in a centered pyramid structure.Example:Plaintext   1
  2 2
 3 3 3
Floyd's TriangleA right-angled triangle filled with consecutive numbers starting from 1.Example:Plaintext1
2 3
4 5 6
7 8 9 10
Pascal Triangle PatternSimilar to the Pascal triangle concept, formatted neatly as a printed block of numbers.Example:Plaintext   1
  1 1
 1 2 1
Diamond Number PatternA diamond-shaped pattern printed using numbers.Example:Plaintext 
  1
 121
12321
 121
  1
Hollow Number PatternA square or rectangular grid where numbers are only printed on the boundaries, leaving the center hollow.Example:Plaintext1 2 3 4               1 2 3 4
1     4
1     4
1 2 3 4
1 2 3 4    
1     4
1 2 3 4
Butterfly PatternA symmetric butterfly-like visual layout printed with numbers and blank spaces.Example:Plaintext1      1
12    21
123  321
12344321
Palindrome Number PatternEach row reads the same forwards and backwards.Example:Plaintext    1
   212
  32123
 4321234







Sunny NumberA number is a Sunny number if the number next to it ($N + 1$) is a perfect square.Example: 8 is a Sunny number because $8 + 1 = 9$, and 9 is a perfect square ($3 \times 3$)..


Duck Number
A number that contains at least one zero in it, but the zero should not be at the very beginning of the number.

Example: 302 and 1024 are Duck numbers. 054 is not.

Buzz Number
A number that either ends with the digit 7 or is completely divisible by 7.

Example: 27 (ends with 7) and 28 (divisible by 7) are Buzz numbers.

eterson NumberA number is a Peterson number if the sum of the factorials of each of its digits is equal to the number itself.Example: 145 is a Peterson number because $1! + 4! + 5! = 1 + 24 + 120 = 145$.


Disarium NumberA number is a Disarium number if the sum of its digits raised to the power of their respective positions is equal to the number itself.Example: 89 is a Disarium number because $8^1 + 9^2 = 8 + 81 = 89$.


Harshad (Niven) NumberA number that is completely divisible by the sum of its own digits.Example: 18 is a Harshad number because the sum of its digits is $1 + 8 = 9$, and 18 is divisible by 9 ($18 \div 9 = 2$).


bundant NumberA number for which the sum of its proper divisors is greater than the number itself.Example: 12 is an Abundant number because its proper divisors are 1, 2, 3, 4, and 6. Their sum is $1 + 2 + 3 + 4 + 6 = 16$, which is greater than 12.


Deficient NumberA number for which the sum of its proper divisors is less than the number itself.Example: 8 is a Deficient number because its proper divisors are 1, 2, and 4. Their sum is $1 + 2 + 4 = 7$, which is less than 8.

Twin Prime Numbers
A pair of prime numbers that have a difference of exactly 2.

Example: (11, 13) or (5, 7) are pairs of Twin Prime numbers.




Emirp Number
A prime number that results in a different prime number when its digits are reversed.

Example: 13 is a prime number, and its reverse, 31, is also a prime number.

Check Co-prime NumbersTwo numbers are co-prime (or relatively prime) if their only common divisor is 1.Example: 8 and 15 are co-prime because the factors of 8 are $\{1, 2, 4, 8\}$ and the factors of 15 are $\{1, 3, 5, 15\}$. Their only shared factor is 1.



Largest Digit
Finding the highest single digit within a number.

Example: In the number 3947, the largest digit is 9.

Smallest Digit
Finding the lowest single digit within a number.

Example: In the number 5829, the smallest digit is 2.


Frequency of Each Digit
Counting how many times each individual digit appears in a number.

Example: In the number 112333, the frequency is: 1 appears 2 times, 2 appears 1 time, and 3 appears 3 times.

Remove Duplicate Digits
Keeping only the first occurrence of each digit in a number and removing any repeating copies.

Example: Transforming 1223441 into 1234.



Rotate Digits
Shifting the digits of a number to the left or right, where digits falling off one end are added to the other.

Example: Rotating 1234 to the right by 1 position gives 4123.

Swap First and Last Digit
Exchanging the positions of the very first digit and the very last digit of a number.

Example: Transforming the number 5239 into 9235.


Binary to DecimalConverting a base-2 number (using only 0s and 1s) into a standard base-10 number.Example: The binary number 1011 converts to decimal 11 ($1\times8 + 0\times4 + 1\times2 + 1\times1$).
Decimal to BinaryConverting a standard
base-10 number into a base-2 number (0s and 1s).Example: The decimal number 13 converts to binary 1101.


Perfect SquareA number that can be expressed as the product of an integer with itself.Example: 25 is a perfect square because $5 \times 5 = 25$.


Perfect CubeA number that can be expressed as the product of an integer multiplied by itself three times.Example: 27 is a perfect cube because $3 \times 3 \times 3 = 27$.




ower of TwoChecking if a number can be expressed as $2^x$, where $x$ is an integer.Example: 16 is a power of two ($2^4$). 12 is not.

Power of ThreeChecking if a number can be expressed as $3^x$, where $x$ is an integer.Example: 81 is a power of three ($3^4$). 20 is not.


Power using RecursionCalculating $A^B$ by having a function call itself repeatedly until the exponent drops to 0.Example: Calculating $2^3$ steps through: $2 \times (2^2) \rightarrow 2 \times 2 \times (2^1) \rightarrow 2 \times 2 \times 2 \times (2^0) = 8$.


Check if Number is a Fibonacci NumberVerifying if a given number belongs to the standard Fibonacci sequence.Example: 8 is a Fibonacci number. 9 is not.




Catalan NumberA sequence of natural numbers that occur in various counting problems (like finding the number of unique binary search trees with $N$ keys). The formula is $C_n = \frac{1}{n+1}\binom{2n}{n}$.Example: The first few Catalan numbers are 1, 1, 2, 5, 14, 42.



ieve of Eratosthenes
An ancient, highly efficient algorithm used to find all prime numbers up to a specified limit.

Example: To find primes up to 10, you list numbers 2 to 10, cross out multiples of 2 (4,6,8,10), cross out multiples of 3 (9), leaving the primes: 2, 3, 5, 7.

Generate Prime Numbers in RangeFinding and printing all the prime numbers that fall between a starting number $A$ and an ending number $B$.Example: The prime numbers in the range [10, 20] are 11, 13, 17, 19.







Count Trailing Zeros in FactorialFinding how many zeros are at the very end of a factorial value without calculating the entire massive number.Example: $5! = 120$, so the number of trailing zeros is 1.

Find Missing NumberGiven an array containing $N-1$ distinct integers in the range of 1 to $N$, find the one number that is missing.Example: In the list [1, 2, 4, 5], the missing number is 3.


ind Unique Number using XORGiven an array where every element appears twice except for one, find that single unique element using the XOR bitwise operator ($A \oplus A = 0$).Example: In the array [4, 1, 2, 1, 2], XORing all elements cancels out the duplicates, leaving 4.


Count Set Bits
Counting how many bits are set to 1 in the binary representation of a number.

Example: The decimal number 7 is 111 in binary, so it has 3 set bits.




Reverse Bits
Reversing the binary digits of a given integer (often evaluated based on a fixed bit length like 32-bit).

Example: Reversing the 4-bit binary number 1100 (12) gives 0011 (3).

Decimal to Octal
Converting a standard base-10 number into a base-8 number (using digits 0-7).

Example: The decimal number 16 converts to octal 20.

Decimal to Hexadecimal
Converting a standard base-10 number into a base-16 number (using digits 0-9 and letters A-F).



Example: The decimal number 26 converts to hexadecimal 1A.



Binary AdditionAdding two binary numbers together using base-2 addition rules ($1+1 = 10$).Example: 101 (5) + 011 (3) = 1000 (8).


Roman Number ConversionConverting standard numbers into Roman numeral symbols (I, V, X, L, C, D, M) or vice versa.Example: The decimal number 9 converts to IX.


