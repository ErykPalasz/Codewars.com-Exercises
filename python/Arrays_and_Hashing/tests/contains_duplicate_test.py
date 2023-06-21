# unittests for contains_duplicate.py

import unittest

from ..src.contains_duplicate import Solution


class TestContainsDuplicate(unittest.TestCase):
    def test_contains_duplicate(self):
        s = Solution()
        self.assertTrue(s.containsDuplicate([1, 2, 3, 1]))
        self.assertFalse(s.containsDuplicate([1, 2, 3, 4]))


class TestContainsNearbyDuplicate(unittest.TestCase):
    def test_simple_true(self):
        s = Solution()
        self.assertTrue(s.containsNearbyDuplicate([1, 2, 3, 1], 3))
        self.assertTrue(s.containsNearbyDuplicate([1, 0, 1, 1], 1))

    def test_picky_true(self):
        s = Solution()
        self.assertTrue(s.containsNearbyDuplicate([99, 99], 2))

    def test_simple_false(self):
        s = Solution()
        self.assertFalse(s.containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2))
