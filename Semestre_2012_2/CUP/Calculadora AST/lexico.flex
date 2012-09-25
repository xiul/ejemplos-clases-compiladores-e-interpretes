import java_cup.runtime.Symbol;
%%
%cup
%class Scanner

%eofval{
    return new java_cup.runtime.Symbol(sym.EOF);
%eofval}
%%
"=" { return new java_cup.runtime.Symbol(sym.RESULTADO); }
"+" { return new java_cup.runtime.Symbol(sym.SUMA); }
"-" { return new java_cup.runtime.Symbol(sym.RESTA); }
"/" { return new java_cup.runtime.Symbol(sym.DIVISION); }
"*" { return new java_cup.runtime.Symbol(sym.MULTIPLICACION); }
"^" { return new java_cup.runtime.Symbol(sym.POTENCIA); }
"(" { return new java_cup.runtime.Symbol(sym.LPARENT); }
")" { return new java_cup.runtime.Symbol(sym.RPARENT); }
[0-9]+ { return new java_cup.runtime.Symbol(sym.ENTERO, new Integer(yytext())); }
[ \t\r\n\f] { /* Ignorar Espacios en Blanco. */ }
. { System.err.println("Caracter Ilegal: "+yytext()); }
