def main():
    tipe_byte = 127
    tipe_short = 32000
    tipe_int = 100000
    tipe_long = 10000000000
    tipe_float = 10.5
    tipe_double = 12345.6789
    tipe_char = 'A'
    tipe_boolean = True
    tipe_string = "Ini adalah String di Python"

    print("===== Tipe Data Primitif =====")
    print(f"byte (simulasi): {tipe_byte}")
    print(f"short (simulasi): {tipe_short}")
    print(f"int: {tipe_int}")
    print(f"long (simulasi): {tipe_long}")
    print(f"float: {tipe_float}")
    print(f"double (simulasi): {tipe_double}")
    print(f"char: {tipe_char}")
    print(f"boolean: {tipe_boolean}")

    print("\n===== Tipe Data Referensi =====")
    print(f"String: {tipe_string}")

    print("\n===== Ukuran Tipe Data (simulasi bit) =====")
    print("byte: 8")
    print("short: 16")
    print("int: 32 atau lebih")
    print("long: 64 atau lebih")
    print("float: 32")
    print("double: 64")
    print("char: 16")


if __name__ == "__main__":
    main()
