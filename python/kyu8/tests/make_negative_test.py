import unittest

from ..src.make_negative import make_negative


class TestMakeNegative(unittest.TestCase):
    def test_positive_integer(self):
        self.assertEqual(make_negative(5), -5)

    def test_negative_integer(self):
        self.assertEqual(make_negative(-5), -5)

    def test_zero(self):
        self.assertEqual(make_negative(0), 0)

    def test_positive_float(self):
        self.assertEqual(make_negative(3.14), -3.14)

    def test_negative_float(self):
        self.assertEqual(make_negative(-3.14), -3.14)


if __name__ == "__main__":
    unittest.main()
