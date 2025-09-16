class BankAccount:
    def __init__(self, int_rate, balance):
        self.int_rate = int_rate
        self.balance = balance

    def deposit(self, amount):
        self.balance +=amount
        return self
        
        
    def withdraw(self, amount):
        self.balance -= amount
        
        print("$",self.balance)

        if self.balance <0:
            self.balance = self.balance - 5
            print("Insufficient funds: Charging a $5 fee")
        return self

    def display_account_info(self ):
        print("balance: $", self.balance)
        
        

    def yield_interest(self):
        self.balance = self.balance +(self.balance * self.int_rate)
        print("balance yield from interest: $", self.balance)
        
    
    #@classmethod ####to change the name of the bank
    def all_banks_info(self):
        print(f"The interest rate is {self.int_rate}" )
        print(f"The balance is {self.balance} ")

Account1 = BankAccount(.2, 100)
Account2 = BankAccount(.1, 40)

Account1.deposit(25).deposit(25).deposit(25).withdraw(10)
print(Account1.display_account_info()) # balance: $165

Account1.yield_interest()
print(Account1.display_account_info()) # balance yield from interest: $198

Account2.deposit(10).deposit(10).withdraw(20).withdraw(20).withdraw(20).withdraw(20)
print(Account2.display_account_info())

Account1.all_banks_info()