# unittests for is_a_number_prime.py

import unittest

from ..src.is_a_number_prime import is_prime


class TestIsPrime(unittest.TestCase):
    def test_is_prime(self):
        self.assertTrue(is_prime(2))
        self.assertTrue(is_prime(3))
        self.assertTrue(is_prime(5))
        self.assertTrue(is_prime(7))
        self.assertTrue(is_prime(11))
        self.assertTrue(is_prime(13))
        self.assertTrue(is_prime(17))
        self.assertTrue(is_prime(173))

    def test_is_not_prime(self):
        self.assertFalse(is_prime(1))
        self.assertFalse(is_prime(4))
        self.assertFalse(is_prime(6))
        self.assertFalse(is_prime(8))
        self.assertFalse(is_prime(9))
        self.assertFalse(is_prime(10))
        self.assertFalse(is_prime(12))
        self.assertFalse(is_prime(14))

    def test_is_prime_big_number(self):
        self.assertTrue(is_prime(489133282872437279))

    def test_is_not_prime_big_number(self):
        self.assertFalse(is_prime(489133282872437277))
