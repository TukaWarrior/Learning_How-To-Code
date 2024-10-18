"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (k !== "default" && Object.prototype.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
const CryptoJS = __importStar(require("crypto-js"));
// Event listener for generating the password
document.getElementById('generate-btn')?.addEventListener('click', generatePassword);
// Event listener for copying the password
document.getElementById('copy-btn')?.addEventListener('click', copyPassword);
function generatePassword() {
    // Retrieve input values
    const website = document.getElementById('website').value;
    const birthday = document.getElementById('birthday').value;
    const username = document.getElementById('username').value;
    const seed = document.getElementById('seed').value;
    const length = parseInt(document.getElementById('length').value) || 16;
    const includeUppercase = document.getElementById('include-uppercase').checked;
    const includeNumbers = document.getElementById('include-numbers').checked;
    const includeSpecial = document.getElementById('include-special').checked;
    // Input validation
    if (!website || !birthday || !username || !seed) {
        alert('Please fill in all required fields.');
        return;
    }
    // Concatenate inputs and hash them
    const data = website + birthday + username;
    const dataHash = CryptoJS.SHA256(data).toString();
    const seedHash = CryptoJS.SHA256(seed).toString();
    const combinedHash = CryptoJS.SHA256(dataHash + seedHash).toString();
    // Generate password
    const password = hashToPassword(combinedHash, length, includeUppercase, includeNumbers, includeSpecial);
    // Display the password
    const passwordElement = document.getElementById('generated-password');
    if (passwordElement) {
        passwordElement.textContent = password;
    }
}
function hashToPassword(hash, length, includeUppercase, includeNumbers, includeSpecial) {
    // Character sets
    let chars = 'abcdefghijklmnopqrstuvwxyz';
    if (includeUppercase)
        chars += 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    if (includeNumbers)
        chars += '0123456789';
    if (includeSpecial)
        chars += '!@#$%^&*()-_=+[]{}|;:",.<>?/`~';
    let password = '';
    const charsLength = chars.length;
    for (let i = 0; i < length; i++) {
        // Use two characters from the hash to get a more uniform distribution
        const chunk = hash.substr((i * 2) % hash.length, 2);
        const index = parseInt(chunk, 16) % charsLength;
        password += chars.charAt(index);
    }
    return password;
}
function copyPassword() {
    const passwordElement = document.getElementById('generated-password');
    if (passwordElement && passwordElement.textContent) {
        navigator.clipboard.writeText(passwordElement.textContent).then(() => {
            alert('Password copied to clipboard!');
        }, (err) => {
            alert('Failed to copy password: ' + err);
        });
    }
}
//# sourceMappingURL=app.js.map