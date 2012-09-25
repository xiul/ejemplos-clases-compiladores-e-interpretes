import java_cup.runtime.Symbol;

%%

%cup
%state INCOMMENT
%notunix
%full

%%
"/*"			{  yybegin(INCOMMENT); 	}
<INCOMMENT>.*"*/" { /*ignorar*/ yybegin(YYINITIAL); }
	
PROGRAMA		{ return new Symbol(sym.PROGRAMA); }
FINVAR		{ return new Symbol(sym.FINVAR); }
VAR			{ return new Symbol(sym.VAR); }
FIN			{ return new Symbol(sym.FIN); }
","			{ return new Symbol(sym.COMA); }
":"			{ return new Symbol(sym.DOSPUNTOS); }
";"			{ return new Symbol(sym.PUNTOYCOMA); }
real			{ return new Symbol(sym.TIPOREAL); }
entero		{ return new Symbol(sym.TIPOENTERO); }

[\r\n\t ]+    	{ /*ignoro blancos*/ }
"/" 			{ return new Symbol(sym.DIVI); }
"(" 			{ return new Symbol(sym.PARENTIZQ); }
")" 			{ return new Symbol(sym.PARENTDER); }
"^" 			{ return new Symbol(sym.POTENCIA); }
"+" 			{ return new Symbol(sym.SUMA); }
"*" 			{ return new Symbol(sym.MULTI); }
"=" 			{ return new Symbol(sym.IGUAL); }
"-" 			{ return new Symbol(sym.RESTA); }
[0-9]+		{ return new Symbol(sym.NUMEROENTERO,new Integer(yytext())); }
[0-9]+"."[0-9]+ { return new Symbol(sym.NUMEROREAL,new Float(yytext())); }
[a-zA-Z]+		{ return new Symbol(sym.ID,new String(yytext())); }

