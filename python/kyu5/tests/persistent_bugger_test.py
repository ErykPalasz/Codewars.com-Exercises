# unittests for persistent_bugger.py

import unittest

from ..src.persistent_bugger import persistence


class TestPersistentBugger(unittest.TestCase):
    def test_basic(self):
        self.assertEquals(persistence(39), 3)
        self.assertEquals(persistence(4), 0)
        self.assertEquals(persistence(25), 2)
        self.assertEquals(persistence(999), 4)
