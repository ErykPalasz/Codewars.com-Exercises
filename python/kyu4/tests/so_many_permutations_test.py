# unittests for so_many_permutations.py

import unittest

from ..src.so_many_permutations import permutations


class TestPermutations(unittest.TestCase):
    def test_empty(self):
        self.assertEqual(permutations(""), sorted([""]))

    def test_single_letter(self):
        self.assertEqual(permutations("a"), sorted(["a"]))

    def test_two_letter(self):
        self.assertEqual(permutations("ab"), sorted(["ab", "ba"]))

    def test_permutations(self):
        self.assertEqual(
            permutations("aabb"),
            sorted(["aabb", "abab", "abba", "baab", "baba", "bbaa"]),
        )
