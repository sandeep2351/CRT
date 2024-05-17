def is_valid(num):
    # Check if sum of digits is a multiple of 3, has only two digits, and is a multiple of 5
    return sum(int(digit) for digit in str(num)) % 3 == 0 and 10 <= num <= 99 and num % 5 == 0

def find_maximum(num1, num2):
    max_number = -1
    for num in range(num1, num2 + 1):
        if is_valid(num):
            max_number = max(max_number, num)
    return max_number

def main():
    # Read input
    num1 = int(input().strip())
    num2 = int(input().strip())

    # Check if num1 is less than num2
    if num1 >= num2:
        print(-1)
        return

    # Find and print the maximum valid number
    result = find_maximum(num1, num2)
    print(result)

if __name__ == "__main__":
    main()
