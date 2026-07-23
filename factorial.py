# Python program to find factorial of a number
num = input("Enter a number: ")
fac = 1
num = (int) (num)
for i in range(1, num+1):
  fac = fac*i
print(f"Factorial is: {fac}")
