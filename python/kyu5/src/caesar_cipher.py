_letters = "abcdefghijklmnopqrstuvwxyz"
_capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


def rot13(message):
    result = ""
    for letter in message:
        if letter in _letters:
            result += _letters[((_letters.index(letter) + 13) % 26)]
        elif letter in _capitals:
            result += _capitals[((_capitals.index(letter) + 13) % 26)]
        else:
            result += letter
    return result
