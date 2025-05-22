import unittest
import numpy as np
import imgal_python

class TestStatistics(unittest.TestCase):
    def test_sum_integers(self):
        # Test with integer array
        data = [2, 5, 10, 23]
        result = imgal_python.statistics.sum(data)
        self.assertEqual(result, 40)

    def test_sum_floats(self):
        # Test with float array
        data = [1.5, 2.5, 3.5, 4.5]
        result = imgal_python.statistics.sum(data)
        self.assertEqual(result, 12.0)

    def test_sum_empty(self):
        # Test with empty array
        data = []
        result = imgal_python.statistics.sum(data)
        self.assertEqual(result, 0.0)

    def test_sum_negative(self):
        # Test with negative numbers
        data = [-1, -2, -3, -4]
        result = imgal_python.statistics.sum(data)
        self.assertEqual(result, -10)

if __name__ == '__main__':
    unittest.main() 