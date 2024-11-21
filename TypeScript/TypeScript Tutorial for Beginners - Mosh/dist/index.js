"use strict";
let sales = 123_456_789; //Numbers can be separated with underscores_ for better visibility.
let course = 'TypeScript';
let is_published = true;
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
let numbers = [1, 2, 3];
let moreNumbers = [];
moreNumbers[0] = 1;
moreNumbers[1] = 2;
moreNumbers[2] = 3;
moreNumbers.forEach(n => n.toString);
// Tuple
// 1, 'Luca'
let user = [1, ' Luca'];
console.log(user[0].valueOf);
// user.push(1); // Do not push more values to a tuple. Also, do not use much values in tuples, as it makes the code hard to read. 
// Enums
// Enums define constants
const small = 1;
const medium = 2;
const large = 3;
// Use Pascal naming convention
var Size;
(function (Size) {
    Size[Size["Small"] = 0] = "Small";
    Size[Size["Medium"] = 1] = "Medium";
    Size[Size["Large"] = 2] = "Large";
})(Size || (Size = {}));
;
;
// Define the enum as constant, to improve and optimize generated javascript code. 
let mySize = Size.Medium;
console.log(mySize);
// Always anotate the return type in a function (): number.
function calculateTax(income, taxYear) {
    // let x: number; // Creates a warning because never used. Requires configuration in tsconfig.json.
    if (taxYear < 2022) {
        return income * 1.2;
    }
    return income * 1.3;
}
calculateTax(10_000, 2022);
// Passing less arguments, not all arguments
function calculateTax2(income, taxYear) {
    if ((taxYear || 2022) < 2022) { // Looks bad. Better give it a default value.
        return income * 1.2;
    }
    return income * 1.3;
}
calculateTax2(10_000);
// Passing less arguments, not all arguments. Giving it a default value
function calculateTax3(income, taxYear = 2022) {
    if (taxYear < 2022) { // Looks bad. Better give it a default value.
        return income * 1.2;
    }
    return income * 1.3;
}
calculateTax3(10_000);
// Objects
let employee = { id: 1, name: 'Luca', retire: (date) => { console.log(date); } };
let employee2 = {
    id: 1,
    name: 'Luca',
    retire: (date) => { console.log(date); }
};
// Union Type
// More than one type.
function kgToLbs(weight) {
    // Narrowing the type.
    if (typeof weight === 'number') {
        return weight * 2.2;
    }
    else {
        return parseInt(weight) * 2.2;
    }
}
kgToLbs(10);
kgToLbs('10kg');
let textBox = {
    drag: () => { },
    resize: () => { }
};
// Literal types
// Limit the values you can assign to a variable. 
// Literal (exact, specific)
let quantity = 100;
let quantity2 = 100;
// Nullable Types
// Can be null.
function greet(name) {
    { // if name is truthy (meaning it has a value)
        console.log(name.toUpperCase());
    }
}
// greet(null); // Wouild create an error becaue it is null.
function greet2(name) {
    if (name) { // if name is truthy (meaning it has a value)
        console.log(name.toUpperCase());
    }
    else {
        console.log('Hola!');
    }
}
greet2(null);
function getCustomer(id) {
    return id === 0 ? null : { birthday: new Date() };
}
let customer = getCustomer(0);
// console.log(customer.birthday);
// Compilation error because customer can be null.
// do this
if (customer !== null) {
    console.log(customer.birthday);
}
// The problem with multiple variables
function getCustomer2(id) {
    return id === 0 ? null : { birthday: new Date() };
}
if (customer !== null && customer !== undefined) {
    console.log(customer.birthday);
}
// Solve it like this.
let customerA = getCustomer(0);
// Optional property access operator. 
// Gets executed only if not null or undefined. 
console.log(customer?.birthday);
function getCustomer3(id) {
    return id === 0 ? null : { birthday: new Date() };
}
let customerB = getCustomer(1);
// Only gets executed if customer is not null or undefined and birthday of customer is not null or undefined. 
console.log(customer?.birthday?.getFullYear);
// Optional element access operator
// If this element is not null or undefined. 
// customers?.[0]
// Optional call
let log1 = null;
// Will crash because log1 is null.
// log1('a');
// Execute only if log1 is not null.
log1?.('a');
//# sourceMappingURL=index.js.map