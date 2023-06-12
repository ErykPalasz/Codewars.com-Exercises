# unittests for sumof3or5(n):

import unittest

from ..src.multiples_of_3_or_5 import sumof3or5


class TestSumof3or5(unittest.TestCase):
    def test_sumof3or5(self):
        self.assertEqual(sumof3or5(10), 23)
        self.assertEqual(sumof3or5(1000), 233168)
