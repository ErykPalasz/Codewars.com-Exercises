def csv_columns(csv: str, indices: list[int]) -> str:
    # indices are called in ascending order, and they can't repeat themselves
    indices = sorted(set(indices))
    array = to2darray(csv)
    return tocsv([[row[i] for i in indices if i < len(row)] for row in array])


def to2darray(csv: str) -> list[list]:
    rows = csv.split("\n")
    collumns = [row.split(",") for row in rows]
    return [list(row) for row in collumns]


def tocsv(array: list[list]) -> str:
    # empty rows need to be skipped in the output to mitigate "\n\n\n\n" output
    non_empty_rows = [row for row in array if any(cell != "" for cell in row)]
    rows = [",".join([str(cell) for cell in row]) for row in non_empty_rows]
    return "\n".join(rows)
