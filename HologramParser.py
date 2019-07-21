# Generated from Hologram.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write(".\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2")
        buf.write("\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3\3\3\3\3\5\3\31\n\3\3\4")
        buf.write("\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5$\n\5\3\6\3\6\3\6")
        buf.write("\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2-\2\22")
        buf.write("\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b#\3\2\2\2\n%\3\2\2")
        buf.write("\2\f)\3\2\2\2\16\17\7\3\2\2\17\20\7\17\2\2\20\23\5\4\3")
        buf.write("\2\21\23\7\2\2\3\22\16\3\2\2\2\22\21\3\2\2\2\23\3\3\2")
        buf.write("\2\2\24\25\7\4\2\2\25\31\5\6\4\2\26\27\7\5\2\2\27\31\5")
        buf.write("\f\7\2\30\24\3\2\2\2\30\26\3\2\2\2\31\5\3\2\2\2\32\33")
        buf.write("\7\6\2\2\33\34\7\b\2\2\34\35\5\b\5\2\35\7\3\2\2\2\36$")
        buf.write("\7\n\2\2\37$\7\13\2\2 $\7\f\2\2!$\7\r\2\2\"$\5\n\6\2#")
        buf.write("\36\3\2\2\2#\37\3\2\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2")
        buf.write("$\t\3\2\2\2%&\7\b\2\2&\'\7\b\2\2\'(\7\b\2\2(\13\3\2\2")
        buf.write("\2)*\7\7\2\2*+\7\b\2\2+,\5\b\5\2,\r\3\2\2\2\5\22\30#")
        return buf.getvalue()


class HologramParser ( Parser ):

    grammarFileName = "Hologram.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'amarillo'", "'rojo'", "'blanco'", "'azul'" ]

    symbolicNames = [ "<INVALID>", "NEW", "D3", "D2", "SOLIDO", "FIGURA", 
                      "NUM", "ARISTA", "AMARILLO", "ROJO", "BLANCO", "AZUL", 
                      "ESPACIO", "ID" ]

    RULE_inicio = 0
    RULE_holograma = 1
    RULE_solido = 2
    RULE_color = 3
    RULE_rgb = 4
    RULE_figura = 5

    ruleNames =  [ "inicio", "holograma", "solido", "color", "rgb", "figura" ]

    EOF = Token.EOF
    NEW=1
    D3=2
    D2=3
    SOLIDO=4
    FIGURA=5
    NUM=6
    ARISTA=7
    AMARILLO=8
    ROJO=9
    BLANCO=10
    AZUL=11
    ESPACIO=12
    ID=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class InicioContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEW(self):
            return self.getToken(HologramParser.NEW, 0)

        def ID(self):
            return self.getToken(HologramParser.ID, 0)

        def holograma(self):
            return self.getTypedRuleContext(HologramParser.HologramaContext,0)


        def EOF(self):
            return self.getToken(HologramParser.EOF, 0)

        def getRuleIndex(self):
            return HologramParser.RULE_inicio

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInicio" ):
                listener.enterInicio(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInicio" ):
                listener.exitInicio(self)




    def inicio(self):

        localctx = HologramParser.InicioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_inicio)
        try:
            self.state = 16
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [HologramParser.NEW]:
                self.enterOuterAlt(localctx, 1)
                self.state = 12
                self.match(HologramParser.NEW)
                self.state = 13
                self.match(HologramParser.ID)
                self.state = 14
                self.holograma()
                pass
            elif token in [HologramParser.EOF]:
                self.enterOuterAlt(localctx, 2)
                self.state = 15
                self.match(HologramParser.EOF)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HologramaContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def D3(self):
            return self.getToken(HologramParser.D3, 0)

        def solido(self):
            return self.getTypedRuleContext(HologramParser.SolidoContext,0)


        def D2(self):
            return self.getToken(HologramParser.D2, 0)

        def figura(self):
            return self.getTypedRuleContext(HologramParser.FiguraContext,0)


        def getRuleIndex(self):
            return HologramParser.RULE_holograma

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHolograma" ):
                listener.enterHolograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHolograma" ):
                listener.exitHolograma(self)




    def holograma(self):

        localctx = HologramParser.HologramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_holograma)
        try:
            self.state = 22
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [HologramParser.D3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 18
                self.match(HologramParser.D3)
                self.state = 19
                self.solido()
                pass
            elif token in [HologramParser.D2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 20
                self.match(HologramParser.D2)
                self.state = 21
                self.figura()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SolidoContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SOLIDO(self):
            return self.getToken(HologramParser.SOLIDO, 0)

        def NUM(self):
            return self.getToken(HologramParser.NUM, 0)

        def color(self):
            return self.getTypedRuleContext(HologramParser.ColorContext,0)


        def getRuleIndex(self):
            return HologramParser.RULE_solido

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSolido" ):
                listener.enterSolido(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSolido" ):
                listener.exitSolido(self)




    def solido(self):

        localctx = HologramParser.SolidoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_solido)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.match(HologramParser.SOLIDO)
            self.state = 25
            self.match(HologramParser.NUM)
            self.state = 26
            self.color()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColorContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AMARILLO(self):
            return self.getToken(HologramParser.AMARILLO, 0)

        def ROJO(self):
            return self.getToken(HologramParser.ROJO, 0)

        def BLANCO(self):
            return self.getToken(HologramParser.BLANCO, 0)

        def AZUL(self):
            return self.getToken(HologramParser.AZUL, 0)

        def rgb(self):
            return self.getTypedRuleContext(HologramParser.RgbContext,0)


        def getRuleIndex(self):
            return HologramParser.RULE_color

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterColor" ):
                listener.enterColor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitColor" ):
                listener.exitColor(self)




    def color(self):

        localctx = HologramParser.ColorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_color)
        try:
            self.state = 33
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [HologramParser.AMARILLO]:
                self.enterOuterAlt(localctx, 1)
                self.state = 28
                self.match(HologramParser.AMARILLO)
                pass
            elif token in [HologramParser.ROJO]:
                self.enterOuterAlt(localctx, 2)
                self.state = 29
                self.match(HologramParser.ROJO)
                pass
            elif token in [HologramParser.BLANCO]:
                self.enterOuterAlt(localctx, 3)
                self.state = 30
                self.match(HologramParser.BLANCO)
                pass
            elif token in [HologramParser.AZUL]:
                self.enterOuterAlt(localctx, 4)
                self.state = 31
                self.match(HologramParser.AZUL)
                pass
            elif token in [HologramParser.NUM]:
                self.enterOuterAlt(localctx, 5)
                self.state = 32
                self.rgb()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RgbContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(HologramParser.NUM)
            else:
                return self.getToken(HologramParser.NUM, i)

        def getRuleIndex(self):
            return HologramParser.RULE_rgb

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRgb" ):
                listener.enterRgb(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRgb" ):
                listener.exitRgb(self)




    def rgb(self):

        localctx = HologramParser.RgbContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_rgb)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(HologramParser.NUM)
            self.state = 36
            self.match(HologramParser.NUM)
            self.state = 37
            self.match(HologramParser.NUM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FiguraContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FIGURA(self):
            return self.getToken(HologramParser.FIGURA, 0)

        def NUM(self):
            return self.getToken(HologramParser.NUM, 0)

        def color(self):
            return self.getTypedRuleContext(HologramParser.ColorContext,0)


        def getRuleIndex(self):
            return HologramParser.RULE_figura

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFigura" ):
                listener.enterFigura(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFigura" ):
                listener.exitFigura(self)




    def figura(self):

        localctx = HologramParser.FiguraContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_figura)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            self.match(HologramParser.FIGURA)
            self.state = 40
            self.match(HologramParser.NUM)
            self.state = 41
            self.color()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





