# unittests for caesar_cipher.py

import unittest

from ..src.caesar_cipher import rot13


class TestCaesarCipher(unittest.TestCase):
    def test_rot13_single_chars(self):
        self.assertEqual(rot13("A"), "N")
        self.assertEqual(rot13("B"), "O")
        self.assertEqual(rot13("C"), "P")
        self.assertEqual(rot13("D"), "Q")
        self.assertEqual(rot13("E"), "R")
        self.assertEqual(rot13("F"), "S")
        self.assertEqual(rot13("G"), "T")
        self.assertEqual(rot13("H"), "U")
        self.assertEqual(rot13("I"), "V")
        self.assertEqual(rot13("J"), "W")
        self.assertEqual(rot13("K"), "X")
        self.assertEqual(rot13("L"), "Y")
        self.assertEqual(rot13("M"), "Z")
        self.assertEqual(rot13("N"), "A")
        self.assertEqual(rot13("O"), "B")
        self.assertEqual(rot13("P"), "C")
        self.assertEqual(rot13("Q"), "D")
        self.assertEqual(rot13("R"), "E")

    def test_rot13_string(self):
        self.assertEqual(rot13("test"), "grfg")
        self.assertEqual(rot13("Test"), "Grfg")
        self.assertEqual(rot13("aA bB zZ 1234 *!?%"), "nN oO mM 1234 *!?%")
