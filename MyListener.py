import sys
from antlr4 import *
from HologramParser import HologramParser
from HologramListener import HologramListener


class MyListener(HologramListener):
    def __init__(self, output):
        self.output = output
        self.output.write('# Datos basicos de los hologramas')

    def enterInicio(self, ctx:HologramParser.InicioContext):
        self.output.write('nombre_programa = \''+ctx.ID().getText()+'\'')

    def enterSolido(self, ctx:HologramParser.SolidoContext):
        solid = ctx.SOLIDO().getText().lower()
        self.output.write(solid + '= true')
        if solid == 'cubo':
            self.output.write('piramide = false')
        else:
            self.output.write('cubo = false')
            self.output.write('tamano ='+ctx.NUM().getText())

    def enterColor(self, ctx:HologramParser.ColorContext):
        color = ctx.getText()
        if color == 'amarillo':
            self.output.write()




