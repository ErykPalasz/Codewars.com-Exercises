# unittest for spin_words():

import unittest

from ..src.spin_words import spin_words


class TestSpinWords(unittest.TestCase):
    def test_spin_words(self):
        self.assertEqual(spin_words("Hey fellow warriors"), "Hey wollef sroirraw")
        self.assertEqual(spin_words("This is a test"), "This is a test")
        self.assertEqual(spin_words("This is another test"), "This is rehtona test")

    def test_long_sentence(self):
        self.assertEqual(
            spin_words(
                "Just will string more Spaces in a will string passed or more that Write Write like consist but of more but spaces"
            ),
            "Just will gnirts more secapS in a will gnirts dessap or more that etirW etirW like tsisnoc but of more but secaps",
        )
