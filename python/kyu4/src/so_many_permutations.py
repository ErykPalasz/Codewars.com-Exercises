import itertools


def permutations(s: str) -> list[str]:
    return sorted({"".join(p) for p in itertools.permutations(s)})
