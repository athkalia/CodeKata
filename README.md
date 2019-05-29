# CodeKata

The task is to implement code for a supermarket scanner that scans items in one
at a time and calculates the total price of your basket after you're done
scanning.

The items codes are individual letters of the alphabet (A, B, C, and so on).
Our goods are priced individually. In addition, there are special deals on
some combinations of products.

For example, item ‘A’ might cost 50 pence individually, but we have a special
offer: buy three ‘A’s and they'll cost you £1.30. In fact this week's prices
are:

## Product prices

Prices per 1 item:

| Item | Price |
| ---- | ----- |
| `A`  | 50    |
| `B`  | 30    |
| `C`  | 20    |
| `D`  | 15    |

## Special deals

Prices per a complete set of items:

| Items           | Price |
| --------------- | ----- |
| `A` + `A` + `A` | 130   |
| `B` + `B`       | 45    |