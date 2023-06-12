# unittests for hero.py

import unittest

from ..src.hero import hero


class TestHero(unittest.TestCase):
    def test_enough_bullets(self):
        self.assertTrue(hero(6, 3))

    def test_not_enough_bullets(self):
        self.assertFalse(hero(2, 5))

    def test_equal_bullets_and_dragons(self):
        self.assertTrue(hero(0, 0))

    def test_extra_bullets(self):
        self.assertTrue(hero(7, 3))

    def test_no_dragons(self):
        self.assertTrue(hero(1, 0))


if __name__ == "__main__":
    unittest.main()
