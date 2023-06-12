import unittest

from ..src.smash_words import smash


class TestSmash(unittest.TestCase):
    def test_empty_list(self):
        self.assertEqual(smash([]), "")

    def test_single_word(self):
        self.assertEqual(smash(["hello"]), "hello")

    def test_multiple_words(self):
        self.assertEqual(smash(["hello", "world"]), "hello world")

    def test_words_with_spaces(self):
        self.assertEqual(smash(["hello  ", " world"]), "hello    world")

    def test_numbers(self):
        self.assertEqual(smash(["1", "2", "3"]), "1 2 3")
        self.assertEqual(smash(["1", "2", "3", "4"]), "1 2 3 4")

    def test_words_with_empty_string(self):
        self.assertEqual(smash(["hello", "", "world"]), "hello  world")


if __name__ == "__main__":
    unittest.main()
