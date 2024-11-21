import * as CryptoJS from 'crypto-js';

// Event listener for generating the password
document.getElementById('generate-btn')?.addEventListener('click', generatePassword);

// Event listener for copying the password
document.getElementById('copy-btn')?.addEventListener('click', copyPassword);

function generatePassword() {
  // Retrieve input values
  const website = (document.getElementById('website') as HTMLInputElement).value;
  const birthday = (document.getElementById('birthday') as HTMLInputElement).value;
  const username = (document.getElementById('username') as HTMLInputElement).value;
  const seed = (document.getElementById('seed') as HTMLInputElement).value;
  const length = parseInt((document.getElementById('length') as HTMLInputElement).value) || 16;
  const includeUppercase = (document.getElementById('include-uppercase') as HTMLInputElement).checked;
  const includeNumbers = (document.getElementById('include-numbers') as HTMLInputElement).checked;
  const includeSpecial = (document.getElementById('include-special') as HTMLInputElement).checked;

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

function hashToPassword(
  hash: string,
  length: number,
  includeUppercase: boolean,
  includeNumbers: boolean,
  includeSpecial: boolean
): string {
  // Character sets
  let chars = 'abcdefghijklmnopqrstuvwxyz';
  if (includeUppercase) chars += 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
  if (includeNumbers) chars += '0123456789';
  if (includeSpecial) chars += '!@#$%^&*()-_=+[]{}|;:",.<>?/`~';

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
    navigator.clipboard.writeText(passwordElement.textContent).then(
      () => {
        alert('Password copied to clipboard!');
      },
      (err) => {
        alert('Failed to copy password: ' + err);
      }
    );
  }
}