import sys
from antlr4 import *
from HologramLexer import HologramLexer
from HologramParser import HologramParser


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = HologramLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = HologramParser(stream)
    tree = parser.expression()


if __name__ == '__main__':
    main()