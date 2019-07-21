grammar Hologram;

inicio: NEW ID holograma | EOF;

holograma: D3 solido| D2 figura;

solido: SOLIDO NUM color;

color: AMARILLO | ROJO | BLANCO| AZUL | rgb;

rgb: NUM NUM NUM;

figura: FIGURA NUM color;









NEW: 'NEW' | 'new';
D3: '3d' | '3D';
D2: '2D' | '2d';
SOLIDO : 'cubo' | 'CUBO' | 'PIRAMIDE' | 'piramide';
FIGURA : 'CUADRADO' | 'cuadrado' | 'rectangulo' | 'RECTANGULO' | 'CIRCULO' | 'circulo';
NUM: [0-9]+;
ARISTA: [0-9]+;
AMARILLO: 'amarillo';
ROJO: 'rojo';
BLANCO: 'blanco';
AZUL: 'azul';
ESPACIO: [ \t\r\n]+ -> skip ;

ID: [a-zA-Z]+;
