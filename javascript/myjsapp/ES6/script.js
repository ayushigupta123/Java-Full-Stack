//create an arrow function to calculate simpleintrest
const calculateSimpleInterest = (principal, rate, time) => (principal * rate * time) / 100;

const principalAmount = 1000;
const annualInterestRate = 5;
const timeInYears = 2; 

const interestAmount = calculateSimpleInterest(principalAmount, annualInterestRate, timeInYears);

console.log(`Simple Interest: ${interestAmount}`);

//Destructure the given array:
const numbers = [12, 23, 11, 19, 55];

const [first, second, ...rest] = numbers;

console.log(`First Number: ${first}`);
console.log(`Second Number: ${second}`);
console.log(`Rest of the Numbers: ${rest}`);

//Destructure the given object
const customer = {
    "customerName": "Erric Sans",
    "age": "23",
    "address": "23 old baker street",
    "available_for_call": true
  };
  
  const { customerName, age, address, available_for_call } = customer;
  
  console.log(`Customer Name: ${customerName}`);
  console.log(`Age: ${age}`);
  console.log(`Address: ${address}`);
  console.log(`Available for Call: ${available_for_call}`);
  console.log("__________________________________")

  /*
  Observe details below 

  Item----->class  
     itemId
     itemName
     price
     quantity 


#create a class Item with above attributes 

 create a seperate asynchronous function that can return item instance 
  #if the instance passed has price <100 async function should throw error ,else should return Item object 
*/

class Item {
    constructor(itemId, itemName, price, quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

async function createItemInstance(itemId, itemName, price, quantity) {
    if (price < 100) {
        throw new Error("Price must be greater than or equal to 100");
    }

    return new Item(itemId, itemName, price, quantity);
}

// Example usage
async function example() {
    try {
        const itemInstance = await createItemInstance(1, "Coffee", 109, 10);
        console.log("Item Instance:", itemInstance);
    } catch (error) {
        console.error("Error:", error.message);
    }
}

example();


  

  


