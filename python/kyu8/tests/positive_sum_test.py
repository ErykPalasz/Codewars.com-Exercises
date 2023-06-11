import unittest

from ..positive_sum import positive_sum


class TestPositiveSum(unittest.TestCase):
    def test_empty_array(self):
        self.assertEqual(positive_sum([]), 0)

    def test_only_negative_numbers(self):
        self.assertEqual(positive_sum([-1, -2, -3]), 0)

    def test_only_positive_numbers(self):
        self.assertEqual(positive_sum([1, 2, 3]), 6)

    def test_mixed_numbers(self):
        self.assertEqual(positive_sum([-1, 2, 3, -4, 5]), 10)

    def test_only_zeroes(self):
        self.assertEqual(positive_sum([0, 0, 0]), 0)


if __name__ == "__main__":
    unittest.main()
