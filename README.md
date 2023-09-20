# Car Insurance Premium Calculator (Java)

This is a Java program that calculates the effective insurance premium for cars based on their details and insurance type.

## Features

- Accepts car details such as car model, car type, car cost price, and insurance type as command line options.
- Calculates insurance premium based on car type:
  - Hatchback: 5% of car cost price
  - Sedan: 8% of car cost price
  - SUV: 10% of car cost price
- Adjusts premium if insurance type is "Premium" by increasing it by 20% of the value calculated from the car type.
- Allows input for multiple cars one after the other.
- Exception handling for input validation.
- Developed using Java 8.


## Example

Here's an example of how to calculate the insurance premium for a sedan car with a cost price of ₹1,000,000 and a Premium insurance type:

```Input
java CarInsuranceCalculator -model ToyotaCamry -type Sedan -price 1000000 -insuranceType Premium
```

Output:
```
Car Model: ToyotaCamry
Car Price: ₹1,000,000
Total Insurance Premium: ₹96,000
```
