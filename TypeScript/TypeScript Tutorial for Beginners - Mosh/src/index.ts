let sales: number = 123_456_789; //Numbers can be separated with underscores_ for better visibility.
let course: string = 'TypeScript';
let is_published: boolean = true;
let level; // Variables don't need to have a declaired type. The compiler will automatically figure out the type, or set the type to "any". 
// Avoid using the any type if possible. 


// This below is bad practice:
// This causes a problem because document is any.
// function render(document) {
//     console.log(document);
// }
// It can be fixed like this, but this defeats the purpose of using typescript and leads to errors. 
// function render(document: any) {
//     console.log(document);
// }

// Arrays
let numbers: number[] = [1, 2, 3];
let moreNumbers: number[] = [];
moreNumbers[0] = 1;
moreNumbers[1] = 2;
moreNumbers[2] = 3;
moreNumbers.forEach(n => n.toString);

// Tuple
// 1, 'Luca'
let user: [number, string] = [1, ' Luca'];
console.log(user[0].valueOf);

// user.push(1); // Do not push more values to a tuple. Also, do not use much values in tuples, as it makes the code hard to read. 

// Enums
// Enums define constants
const small = 1;
const medium = 2;
const large = 3;
// Use Pascal naming convention
enum Size {Small, Medium, Large};
// By default, Small = 0, Medium = 1, LArge = 2, and so on.
const enum Size1 {Small = 1 , Medium = 2, Large = 3};
// Define the enum as constant, to improve and optimize generated javascript code. 

let mySize: Size = Size.Medium;
console.log(mySize);


// Always anotate the return type in a function (): number.
function calculateTax(income: number, taxYear: number): number {
    // let x: number; // Creates a warning because never used. Requires configuration in tsconfig.json.
    if (taxYear < 2022) {
        return income * 1.2;
    }
    return income * 1.3;
}

calculateTax(10_000, 2022);

// Passing less arguments, not all arguments
function calculateTax2(income: number, taxYear?: number): number {
    if ((taxYear || 2022) < 2022) { // Looks bad. Better give it a default value.
        return income * 1.2;
    }
    return income * 1.3;
}
calculateTax2(10_000);

// Passing less arguments, not all arguments. Giving it a default value
function calculateTax3(income: number, taxYear: number = 2022): number {
    if (taxYear < 2022) { // Looks bad. Better give it a default value.
        return income * 1.2;
    }
    return income * 1.3;
}
calculateTax3(10_000);


// Objects
let employee:  {
    readonly id: number; 
    name: string;
    retire: (date: Date) => void; // Add a function to an object.
} = {id: 1, name: 'Luca', retire: (date: Date) => {console.log(date)}};
// employee.name = 'Luca';
// This was not the best way to work with objects. 


// Type Aliases
// DRY Don't repeat yourself.
type Employee =  {
    readonly id: number; 
    name: string;
    retire: (date: Date) => void;
}

let employee2: Employee = {
 id: 1, 
 name: 'Luca', 
 retire: (date: Date) => {console.log(date)}
};


// Union Type
// More than one type.

function kgToLbs(weight: number | string) {
    // Narrowing the type.
    if (typeof weight === 'number') {
        return weight * 2.2;
    } else {
        return parseInt(weight) * 2.2;
    }
}

kgToLbs(10);
kgToLbs('10kg');


// Intersection type
// Multiple types at the same time.
// let weight: number & string; // Bad example

type Draggable = {
    drag: () => void;
}

type Rezizable = {
    resize: () => void;
}

type UIWidget = Draggable & Rezizable;

let textBox: UIWidget = {
    drag: () => {},
    resize: () => {}
}

// Literal types
// Limit the values you can assign to a variable. 
// Literal (exact, specific)
let quantity: 50 | 100 = 100;
type Quantity = 50 | 100;

let quantity2: Quantity = 100;

type Metric = 'cm' | 'm';

// Nullable Types
// Can be null.

function greet(name: string) {{// if name is truthy (meaning it has a value)
    console.log(name.toUpperCase());
    }
}
// greet(null); // Wouild create an error becaue it is null.

function greet2(name: string | null | undefined) {
    if (name) { // if name is truthy (meaning it has a value)
    console.log(name.toUpperCase());
    } else {
        console.log('Hola!');
    }
}
greet2(null);
// We can now pass string, null or undefined.


// Optional Chaining
type Customer = {
    birthday: Date
};

function getCustomer(id: number): Customer | null {
    return id === 0 ? null : {birthday: new Date()};
}

let customer = getCustomer(0);
// console.log(customer.birthday);
// Compilation error because customer can be null.

// do this
if (customer !== null) {
    console.log(customer.birthday); 
}

// The problem with multiple variables

function getCustomer2(id: number): Customer | null | undefined {
    return id === 0 ? null : {birthday: new Date()};
}
if (customer !== null && customer !== undefined) {
    console.log(customer.birthday); 
}

// Solve it like this.
let customerA = getCustomer(0);
// Optional property access operator. 
// Gets executed only if not null or undefined. 
console.log(customer?.birthday);


type CustomerB = {
    birthday?: Date
};
function getCustomer3(id: number): CustomerB | null | undefined {
    return id === 0 ? null : {birthday: new Date()};
}
let customerB = getCustomer(1);
// Only gets executed if customer is not null or undefined and birthday of customer is not null or undefined. 
console.log(customer?.birthday?.getFullYear);

// Optional element access operator
// If this element is not null or undefined. 
// customers?.[0]

// Optional call
let log1: any = null;
// Will crash because log1 is null.
// log1('a');
// Execute only if log1 is not null.
log1?.('a');
