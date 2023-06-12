from ..src.csv_columns import csv_columns, to2darray, tocsv

import unittest


class TestCsvColumns(unittest.TestCase):
    def test_case_1(self):
        self.assertEqual(csv_columns("1,2\n3,4\n5,6", [5, 6, 7]), "")

    def test_case_2(self):
        self.assertEqual(csv_columns("1,2,3\n4,5,6", [0, 1]), "1,2\n4,5")

    def test_case_3(self):
        self.assertEqual(
            csv_columns("a,b,c,d,e\n1,2,3,4,5\nf,g,h,i,j", [1, 3, 5, 7]),
            "b,d\n2,4\ng,i",
        )

    def test_case_4(self):
        self.assertEqual(csv_columns("1\n2\n3\n4\n5", [0, 1]), "1\n2\n3\n4\n5")

    def test_case_5(self):
        self.assertEqual(csv_columns("1\n2\n3\n4\n5", [1]), "")


class TestConverters(unittest.TestCase):
    def test_to2darray(self):
        self.assertEqual(
            to2darray("1,2,3\n4,5,6\n7,8,9\n10,11,12"),
            [["1", "2", "3"], ["4", "5", "6"], ["7", "8", "9"], ["10", "11", "12"]],
        )

    def test_tocsv(self):
        self.assertEqual(
            tocsv(
                [["1", "2", "3"], ["4", "5", "6"], ["7", "8", "9"], ["10", "11", "12"]]
            ),
            "1,2,3\n4,5,6\n7,8,9\n10,11,12",
        )
