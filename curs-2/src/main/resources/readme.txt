Build ATM Console Application

- Flow:
    - The user is required to login by entering an Account number and the PIN for that account
    - If the Account is found then the user can perform 4 actions:
        - View my balance -> the balance of the account is diplayed
        - Deposit -> the user is asked to enter an amount, and that amount is added to the balance of the account
        - Withdrawal -> the user is asked to select an amount from a list, and if the Cash Dispenser has enough bills
          and the balance supports it, the money is withdrawn
        - Exit -> the user is logged-out and the next user is required to login
    - If the Account is not found, then the user is notified and asked to try again

- Use Cases:
    - An ATM uses a Screen to display messages and a Keypad for the interaction
    - An ATM uses a BankDatabase which contains the Accounts
    - An Account has an account number and is protected by a PIN
    - An account has a balance on which you can apply credit or debit transactions
    - An ATM supports three types of Transactions: Balance Inquiry, Cash Deposit and Cash Withdrawal
    - An ATM uses a Cash Dispenser to withdraw money
    - The Cash Dispenser has a limited amount of 20$ bills, and can only dispense these kind of bills
    - The number of bills in a Cash Dispenser is not increased when a Deposit Transaction is made
    - An ATM allows a user to perform a Transaction only if the user is authenticated wit his account number and pin
    - The Balance Inquiry transaction should display on the screen the Balance of the account on which the user is authenticated
    - The Withdrawal transaction should give the user the possibility to withdraw 20$, 40$, 60$, 100$, 200$ from the account on which the use is authenticated
    - The Deposit transaction should give the user the possibility to credit the account on which the user is authenticated with an amount, thus increasing it's balance
    - The Keypad gives you the user input
    - The Screen can display a message, including formatted amounts