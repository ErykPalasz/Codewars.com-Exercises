import string


def spin_words(sentence: string) -> string:
    # words = sentence.split()
    # for word in words:
    #     if len(word) >= 5:
    #         words[words.index(word)] = word[::-1]
    # return " ".join(words)

    return " ".join(
        [word[::-1] if len(word) >= 5 else word for word in sentence.split()]
    )
