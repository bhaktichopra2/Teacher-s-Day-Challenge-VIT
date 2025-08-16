# Horseshoes

This program helps Valera the Horse determine the minimum number of horseshoes he needs to buy so that all four horseshoes he wears to a party have different colors.

## Problem Description

Valera owns four horseshoes, each of some color (represented as integers). Since it is fashionable to wear four horseshoes of **different colors**, Valera wants to buy the fewest additional horseshoes necessary to ensure he has four distinct colors.

The store sells horseshoes of any color, and Valera has enough money to buy any number of horseshoes, but he wants to minimize his spending by buying the fewest.

---

## Approach

- Use a `HashSet` to store the unique colors from the four input horseshoes.
- The size of this set gives the count of distinct colors Valera already has.
- The minimum number to buy is therefore:  
  
  4 - {number_of_unique_colors}


