import inspect
import sys


try:
    import imgal_python
    print("Successfully imported imgal_python module")
    
    # List all attributes of the module
    print("\nDirect attributes of imgal_python:")
    for attr in dir(imgal_python):
        if not attr.startswith("__"):
            print(f"- {attr}")
            
            # Try to get the attribute
            try:
                attr_value = getattr(imgal_python, attr)
                if inspect.ismodule(attr_value):
                    print(f"  Submodule: {attr}")
                    # List attributes of submodule
                    for sub_attr in dir(attr_value):
                        if not sub_attr.startswith("__"):
                            print(f"    - {sub_attr}")
                elif callable(attr_value):
                    print(f"  Function: {attr}")
            except Exception as e:
                print(f"  Error getting attribute: {e}")
                
except ImportError as e:
    print(f"Error importing imgal_python: {e}")
    
# Try to see if we can find where imgal_python is installed
print("\nPython path:")
for path in sys.path:
    print(f"- {path}") 