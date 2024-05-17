def main():
    import sys
    input = sys.stdin.read
    
    # Read the entire input as a single string
    data = input().strip()
    
    # Split the input string into a list of strings
    numbers = data.split()
    
    sum_numbers = 0
    count = 0
    
    for num in numbers:
        number = int(num)
        
        if number == -1:
            break
        
        sum_numbers += number
        count += 1
    
    if count == 0:
        print("No numbers were entered.")
    else:
        mean = sum_numbers / count
        print(f"Sum of the given {count} numbers is : {sum_numbers}")
        print(f"Mean of the given {count} numbers is : {mean:.2f}")

if __name__ == "__main__":
    main()
