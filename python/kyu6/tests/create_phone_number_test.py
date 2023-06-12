# unittests for create_phone_number:

import unittest

from ..src.create_phone_number import create_phone_number


class TestCreatePhoneNumber(unittest.TestCase):
    def test_create_phone_number(self):
        self.assertEqual(
            create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]), "(123) 456-7890"
        )

    def test_all_ones(self):
        self.assertEqual(
            create_phone_number([1, 1, 1, 1, 1, 1, 1, 1, 1, 1]), "(111) 111-1111"
        )


if __name__ == "__main__":
    unittest.main()
