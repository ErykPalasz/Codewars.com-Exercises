def sum_strings(x: str, y: str) -> str:
    # this solution feels bad, but im to stupid for a "smart" one

    # i want lx to be the longer of the two strings
    lx, ly = (list(y), list(x)) if len(x) < len(y) else (list(x), list(y))

    # match length of ly with lx
    ly = ["0"] * (len(lx) - len(ly)) + ly

    # add leading 0 in case
    lx = ["0"] + lx

    # primary school way of adding numbers
    for i in range(1, len(ly) + 1):
        addition = int(lx[-i]) + int(ly[-i])
        if addition < 10:
            lx[-i] = str(addition)
        else:
            lx[-i] = str(addition - 10)
            lx[-(i + 1)] = str(int(lx[-(i + 1)]) + 1)

    # remove leading 0
    while lx[0] == "0" and len(lx) > 1:
        lx = lx[1:]

    return "0" if lx == [] else "".join(lx)
