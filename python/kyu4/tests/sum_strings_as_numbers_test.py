# unittests for sum_strings_as_numbers.py

import unittest

from ..src.sum_strings_as_numbers import sum_strings


class TestSumStringsAsNumbers(unittest.TestCase):
    def test_empty_strings(self):
        self.assertEqual(sum_strings("", ""), "0")
        self.assertEqual(sum_strings("0", ""), "0")
        self.assertEqual(sum_strings("1", ""), "1")

    def test_uneven_strings(self):
        self.assertEqual(sum_strings("111", "2"), "113")

    def test_one_digit(self):
        self.assertEqual(sum_strings("1", "1"), "2")
        self.assertEqual(sum_strings("1", "2"), "3")
        self.assertEqual(sum_strings("2", "1"), "3")

    def test_three_digit(self):
        self.assertEqual(sum_strings("123", "123"), "246")
        self.assertEqual(sum_strings("437", "483"), "920")
        self.assertEqual(sum_strings("789", "153"), "942")

    def test_big_number(self):
        self.assertEqual(sum_strings("123456789", "987654321"), "1111111110")
        self.assertEqual(
            sum_strings("539248734982093", "324987349883710"), "864236084865803"
        )

    def test_all_nines(self):
        self.assertEqual(sum_strings("99999999999", "1"), "100000000000")

    def test_all_zeros(self):
        self.assertEqual(sum_strings("000000000", "00000000000"), "0")
