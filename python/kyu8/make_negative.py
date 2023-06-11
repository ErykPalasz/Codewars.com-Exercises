def make_negative(number):
    """
    Takes in a number and returns its negation.
    The number can be negative already, in which case no change is required.
    Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
    :param number: an integer or a float
    :return: a negative version of the input number
    """
    return -number if number > 0 else number
