# Custom PRNG Algorithm in Java

## Description
This project implements a novel Pseudo Random Number Generator (PRNG)
without using Java's built-in Random or Math.random().

The algorithm combines:
- Linear Congruential Generator (LCG)
- Bitwise scrambling
- Absolute-value normalization

## Mathematical Model

Xₙ₊₁ = (a × Xₙ + c) mod m

Enhanced by:
X = X ^ (X << 13)
X = X ^ (X >> 7)
X = X ^ (X << 17)

## Features
- Static methods
- Method overloading
- Generates:
  - int
  - int in range
  - double
  - float
  - mixed Number

## Usage

```java
int x = CustomPRNG.randomInt();
double d = CustomPRNG.randomDouble();
float f = CustomPRNG.randomFloat();
Number m = CustomPRNG.randomMixed();
