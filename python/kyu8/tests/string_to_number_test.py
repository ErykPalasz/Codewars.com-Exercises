import unittest

from ..src.string_to_number import string_to_number


class TestStringToNumber(unittest.TestCase):
    def test_positive_integer(self):
        self.assertEqual(string_to_number("123"), 123)

    def test_negative_integer(self):
        self.assertEqual(string_to_number("-456"), -456)

    def test_zero(self):
        self.assertEqual(string_to_number("0"), 0)

    def test_max_positive_integer(self):
        self.assertEqual(string_to_number("2147483647"), 2147483647)

    def test_min_negative_integer(self):
        self.assertEqual(string_to_number("-2147483648"), -2147483648)

    def test_non_integer_string(self):
        with self.assertRaises(ValueError):
            string_to_number("12.3")

    def test_alphabetic_string(self):
        with self.assertRaises(ValueError):
            string_to_number("abc")


if __name__ == "__main__":
    unittest.main()
