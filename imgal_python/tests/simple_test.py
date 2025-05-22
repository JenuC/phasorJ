import imgal_python

# Print available modules
print("Available modules:")
print(dir(imgal_python))

# Try to import and use the sum function
try:
    from imgal_python.statistics import sum
    print("\nSuccessfully imported sum function")
    
    # Test the function
    test_data = [1, 2, 3, 4]
    result = sum(test_data)
    print(f"Sum of {test_data} = {result}")
    
except ImportError as e:
    print(f"\nError importing sum: {e}")
    
    # Alternative approach
    try:
        # Try to access through the module hierarchy
        result = imgal_python.statistics.sum([1, 2, 3, 4])
        print(f"Alternative approach: Sum of [1, 2, 3, 4] = {result}")
    except Exception as e:
        print(f"Alternative approach failed: {e}") 