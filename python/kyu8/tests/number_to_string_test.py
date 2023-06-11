from ..number_to_string import number_to_string


import unittest


class TestNumberToString(unittest.TestCase):
    def test_zero(self):
        self.assertEqual(number_to_string(0), "0")

    def test_positive(self):
        self.assertEqual(number_to_string(123), "123")

    def test_negative(self):
        self.assertEqual(number_to_string(-123), "-123")


if __name__ == "__main__":
    unittest.main()
